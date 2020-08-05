package com.testVagrant.APIAutomation.setUp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

public class BaseTest {

	public static Properties config = new Properties();
	private FileInputStream fis;
	public WebDriver weatherDriver;
	
	@BeforeSuite
	public void setUp() {

		try {
			fis = new FileInputStream(".\\src\\test\\resources\\properties\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			config.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RestAssured.baseURI = config.getProperty("baseURI");
		RestAssured.basePath = config.getProperty("basePath");	
		initializeDriver();
	}

	public WebDriver initializeDriver() {

		String browserName = config.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Documents//chromedriver.exe");
			weatherDriver = new ChromeDriver();
		}

		weatherDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		return weatherDriver;
	}
}
