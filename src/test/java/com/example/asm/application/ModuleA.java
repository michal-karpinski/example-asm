package com.example.asm.application;

import java.beans.Transient;

import javax.annotation.Resource;

@Resource
public class ModuleA {
	
	@Transient
	public void testMethod() {
	}
}
