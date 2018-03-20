package com.abhi.spring.springCore.beanScopes;

public class Marks {
	private float maths;
	private float physics;
	private float chemistry;
	
	public float getMaths() {
		return maths;
	}
	public void setMaths(float maths) {
		this.maths = maths;
	}
	public float getPhysics() {
		return physics;
	}
	public void setPhysics(float physics) {
		this.physics = physics;
	}
	public float getChemistry() {
		return chemistry;
	}
	public void setChemistry(float chemistry) {
		this.chemistry = chemistry;
	}
	
	@Override
	public String toString() {
		return "Marks [maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry + "]";
	}
	
}
