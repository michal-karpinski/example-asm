package com.example.asm;

import java.io.FileInputStream;
import java.io.IOException;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;

public class AnnotationScanner extends ClassVisitor {
	AnnotationScanner() {
		super(Opcodes.ASM6);
	}

	public AnnotationVisitor visitAnnotation(String desc, boolean visible) {
		System.out.println(desc);
		return super.visitAnnotation(desc, visible);
	}

	public void scanAnnotations(String filePath) throws IOException {
		ClassReader cr = new ClassReader(new FileInputStream(filePath));
		cr.accept(this, 0);
	}
}
