package com.pdfGenerator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.pdfGenerator.utility.pdfGenerator;

@SpringBootTest
class PdfGeneratorApplicationTests {

	@Test
	void contextLoads() {
		
		pdfGenerator pdf =new pdfGenerator();
		pdf.writeUsingText();
	}

}
