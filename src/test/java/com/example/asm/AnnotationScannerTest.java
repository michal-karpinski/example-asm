package com.example.asm;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnnotationScannerTest {

	@Test
	public void testName() throws Exception {
		AnnotationScanner annotationScanner = new AnnotationScanner();
		annotationScanner.scanAnnotations("target/test-classes/com/example/asm/application/ModuleA.class");
	}
}
