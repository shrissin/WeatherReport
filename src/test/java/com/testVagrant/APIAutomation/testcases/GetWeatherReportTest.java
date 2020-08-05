package com.testVagrant.APIAutomation.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testVagrant.APIAutomation.APIs.GetWeatherReport;
import com.testVagrant.APIAutomation.beans.WeatherOutput;
import com.testVagrant.APIAutomation.setUp.BaseTest;
import com.testVagrant.UIAutomation.service.HumidityComparator;
import com.testVagrant.UIAutomation.service.TempComparator;
import com.testVagrant.UIAutomation.service.WeatherPageNavigation;

public class GetWeatherReportTest extends BaseTest {

	@Test
	public void checkGetWeatherReport() {

		WeatherOutput weatherOutputUI = WeatherPageNavigation.weatherPageNavigation(weatherDriver);

		String token = config.getProperty("appid");
		String cities = config.getProperty("cities");
		String baseURI = config.getProperty("baseURI");
		String basePath = config.getProperty("basePath");
		WeatherOutput weatherOutputAPI = GetWeatherReport.getWeatherReportByCityName(cities, token, baseURI, basePath);

		TempComparator wcc = new TempComparator();
		int tempCompare = wcc.compare(weatherOutputAPI, weatherOutputUI);

		int tempVariance = Integer.parseInt(config.getProperty("tempVariance"));

		HumidityComparator hcc = new HumidityComparator();
		int humidityComapre = hcc.compare(weatherOutputAPI, weatherOutputUI);

		int humidityVariance = Integer.parseInt(config.getProperty("humidityVariance"));

		boolean result = false;

		if (tempCompare < tempVariance && humidityComapre < humidityVariance) {
			result = true;
			Assert.assertEquals(result, true);
		} else {
			Assert.assertEquals(result, true);
		}
	}
}
