package com.testVagrant.UIAutomation.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NDTVLandingPage {
	public WebDriver weatherDriver;

	public NDTVLandingPage(WebDriver weatherDriver) {
		super();
		this.weatherDriver = weatherDriver;
	}

	public WebElement expandMenuOption() {
		return weatherDriver.findElement(By.cssSelector("a#h_sub_menu"));
	}

	public WebElement getWeatherPage() {
		return weatherDriver.findElement(
				By.cssSelector("a[href='https://social.ndtv.com/static/Weather/report/?pfrom=home-topsubnavigation']"));
	}

	public WebElement dismissNotification() {
		return weatherDriver.findElement(By.xpath("//div[@class='noti_btnwrap'] //a[@class='notnow']"));
	}
}
