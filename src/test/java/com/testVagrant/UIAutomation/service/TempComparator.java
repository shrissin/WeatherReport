package com.testVagrant.UIAutomation.service;

import java.util.Comparator;

import com.testVagrant.APIAutomation.beans.WeatherOutput;
import com.testVagrant.APIAutomation.setUp.BaseTest;

public class TempComparator implements Comparator<WeatherOutput> {

	public int compare(WeatherOutput weatherOutputAPI, WeatherOutput weatherOutputUI) {
		int tempCompare = weatherOutputAPI.getTemp().compareTo(weatherOutputUI.getTemp());

		return tempCompare;
	}

}
