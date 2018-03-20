package com.abhi.interfaceMethods;

public class InterfaceMain {

	public static void main(String[] args) {
		Vechile vechile=new InterfaceImplementation();
		
		InterfaceImplementation interfaceImplementation = new InterfaceImplementation();
		
		int applyBreak = vechile.applyBreak();
		
		System.out.println("Vechile No::"+applyBreak);
		
		System.out.println("interfaceImplementation vechile no::"+interfaceImplementation.getVechileNo());

	}

}
