package com.abhi.spring.springCore.collectonIntegration.propertiesCollection;

import java.util.Properties;

public class CountriesAndLauguages {
	private Properties countryAndLanguages;

	public Properties getCountryAndLanguages() {
		return countryAndLanguages;
	}

	public void setCountryAndLanguages(Properties countryAndLanguages) {
		this.countryAndLanguages = countryAndLanguages;
	}

	@Override
	public String toString() {
		return "CountriesAndLauguages [countryAndLanguages=" + countryAndLanguages + "]";
	}
	
	
}
