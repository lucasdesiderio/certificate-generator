package br.com.dsd.generators.certificate;

import java.awt.Color;

public class CertificateConfig {
	
	private CertificateConfig() { }
	
	public static final Integer POSITION_X_NAME_CENTER = 712;
	public static final Integer POSITION_Y_NAME = 340;
	public static final Integer POSITION_X_HOURS_CENTER = 840;
	public static final Integer POSITION_Y_HOURS = 455;
	public static final Integer CHAR_WIDTH = 15;
	public static final String PATH_FILE_IMG = System.getProperty("user.home") + "\\Downloads\\certificado.jpg";
	public static final String PATH_FILE_LOAD = System.getProperty("user.home") + "\\Downloads\\load.csv";
	public static final Color COLOR = Color.BLACK;
	public static final Float FONT_SIZE = 24f;
	public static final String OUTPUT_FORMAT = "png";
}
