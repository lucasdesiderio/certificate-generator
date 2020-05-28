package br.com.dsd.generators.certificate;

import java.io.IOException;

public class TesteGerarCertificado {
	
	public static void main(String[] args) throws IOException {
		CertificateGenerator gen = new CertificateGenerator();
		gen.readLoadFile();
	}
}
