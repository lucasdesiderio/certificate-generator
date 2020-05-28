package br.com.dsd.generators.certificate;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.ImageIO;

public class CertificateGenerator {
	
	public void readLoadFile() throws IOException {		
		try (BufferedReader csvReader = new BufferedReader(new FileReader(CertificateConfig.PATH_FILE_LOAD))) {
			String row;
			while ((row = csvReader.readLine()) != null) {
				String[] data = row.split(";");
				generate(data, CertificateConfig.OUTPUT_FORMAT);
			}
		}
	}
	
	public void generate(String[] data, String outputFormat) throws IOException {
		File background = new File(CertificateConfig.PATH_FILE_IMG);
		BufferedImage image = ImageIO.read(background);
		Graphics g = image.getGraphics();
		g.setFont(g.getFont().deriveFont(CertificateConfig.FONT_SIZE));
		g.setColor(CertificateConfig.COLOR);

		Integer espacoNome = data[0].length() * CertificateConfig.CHAR_WIDTH;
		Integer inicioNome = CertificateConfig.POSITION_X_NAME_CENTER - (espacoNome / 2);
		g.drawString(data[0], inicioNome, CertificateConfig.POSITION_Y_NAME);
		g.drawString(data[1], CertificateConfig.POSITION_X_HOURS_CENTER, CertificateConfig.POSITION_Y_HOURS);
		g.dispose();
		ImageIO.write(image, outputFormat, new File(patternOutputFileName(data[0], outputFormat)));
	}
	
	private String patternOutputFileName(String filename, String outputFormat) {
		return filename
				.replace(" ", "_")
				.concat(".")
				.concat(outputFormat);
	}
}
