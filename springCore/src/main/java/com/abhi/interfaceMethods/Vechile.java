package com.abhi.interfaceMethods;

public interface Vechile {
	//By default var will final public static
	int vechileNo=100;
	
	default int applyBreak(){
        System.out.println("Break applying");
        return vechileNo;
    }
}
