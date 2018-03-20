package com.abhi.spring.springCore.dependencyCheck.requiredExample;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Prescription {
	
	
	private int id;
	private String patientName;
	private List<String> mediciences;
	
	public int getId() {
		return id;
	}
	
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public List<String> getMediciences() {
		return mediciences;
	}
	public void setMediciences(List<String> mediciences) {
		this.mediciences = mediciences;
	}

	@Override
	public String toString() {
		return "Prescription [id=" + id + ", patientName=" + patientName + ", mediciences=" + mediciences + "]";
	}

}
