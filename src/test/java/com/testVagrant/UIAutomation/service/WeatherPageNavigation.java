package com.testVagrant.UIAutomation.service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.testVagrant.APIAutomation.beans.WeatherOutput;
import com.testVagrant.APIAutomation.setUp.BaseTest;
import com.testVagrant.UIAutomation.pageObjects.NDTVLandingPage;
import com.testVagrant.UIAutomation.pageObjects.NDTVWeatherPage;

public class WeatherPageNavigation extends BaseTest {

	public static WeatherOutput weatherPageNavigation(WebDriver weatherDriver) {
		try {
			weatherDriver.get(config.getProperty("website"));
			weatherDriver.manage().window().maximize();
			Thread.sleep(5000);
			NDTVLandingPage nl = new NDTVLandingPage(weatherDriver);
			nl.dismissNotification().click();
			nl.expandMenuOption().click();
			Thread.sleep(2000);
			nl.getWeatherPage().click();
			Thread.sleep(2000);

			NDTVWeatherPage nw = new NDTVWeatherPage(weatherDriver);
			String cities = config.getProperty("cities");
			nw.pinYourCity().sendKeys(cities.split(",")[0]);
			WebElement checkbox = nw.findCheckbox();
			if (!checkbox.isSelected())
				checkbox.click();
			nw.findCityInTheMap().click();

			System.out.println(nw.findPopUpContentOfCity().getText());
			String weatherReport = nw.findPopUpContentOfCity().getText();
			String tempString = weatherReport.split("\n")[5];
			String humidityString = weatherReport.split("\n")[3];
			int tempIndex = weatherReport.indexOf("Temp in Fahrenheit:");
			int humidityIndex = weatherReport.indexOf("Humidity:");
			double temp = Double.valueOf(tempString.valueOf((tempIndex) + 1));
			Integer humidity = Integer.valueOf(humidityString.valueOf(humidityIndex) + 1);

			return new WeatherOutput(temp, humidity);

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
