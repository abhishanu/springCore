package com.abhi.spring.springCore.refType;

public class Marks {
	private double physics;
	private double maths;
	private double chemistry;
	
	public double getPhysics() {
		return physics;
	}
	public void setPhysics(double physics) {
		this.physics = physics;
	}
	public double getMaths() {
		return maths;
	}
	public void setMaths(double maths) {
		this.maths = maths;
	}
	public double getChemistry() {
		return chemistry;
	}
	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}
	@Override
	public String toString() {
		return "Marks [physics=" + physics + ", maths=" + maths + ", chemistry=" + chemistry + "]";
	}
}
