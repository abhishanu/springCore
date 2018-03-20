package com.abhi.dateComparison;

public class DateMain {

	public static void main(String[] args) {
		
		System.out.println("Command Line aggument:: "+args[0]);
		System.out.println("Util date:"+UtilDate.getUtilDate());
		System.out.println("SQL date:"+SqlDate.getSqlDate());

	}

}
