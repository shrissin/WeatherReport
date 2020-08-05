package com.testVagrant.UIAutomation.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NDTVWeatherPage {
	public WebDriver weatherDriver;

	public NDTVWeatherPage(WebDriver weatherDriver) {
		super();
		this.weatherDriver = weatherDriver;
	}

	public WebElement pinYourCity() {
		return weatherDriver.findElement(By.xpath("//div[@class='searchContainer'] //input[@class='searchBox']"));
	}

	public WebElement findCheckbox() {
		return weatherDriver.findElement(By.xpath("//div[@class='message'] //input[@id='New Delhi']"));
	}

	public WebElement findCityInTheMap() {
		return weatherDriver.findElement(By.xpath("//div[@title='New Delhi']"));
	}

	public WebElement findPopUpContentOfCity() {
		return weatherDriver.findElement(By.xpath("//div[@class='leaflet-popup-content']"));
	}

}
