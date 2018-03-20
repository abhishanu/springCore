package com.abhi.spring.springCore.refType;

public class Student {
	private String name;
	private Marks marks;
	private double percentage;
	
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	public double nettPercentage(){
	
		return (marks.getChemistry()+marks.getMaths()+marks.getPhysics())/3;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
