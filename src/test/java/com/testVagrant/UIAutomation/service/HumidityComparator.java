package com.testVagrant.UIAutomation.service;

import java.util.Comparator;

import com.testVagrant.APIAutomation.beans.WeatherOutput;
import com.testVagrant.APIAutomation.setUp.BaseTest;

public class HumidityComparator implements Comparator<WeatherOutput> {

	public int compare(WeatherOutput weatherOutputAPI, WeatherOutput weatherOutputUI) {
		int humidityCompare = weatherOutputAPI.getHumidity().compareTo(weatherOutputUI.getHumidity());
		
		return humidityCompare;
	}

}
