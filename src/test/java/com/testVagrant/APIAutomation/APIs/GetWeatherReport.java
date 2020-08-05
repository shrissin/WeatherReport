package com.testVagrant.APIAutomation.APIs;

import static io.restassured.RestAssured.given;

import org.testng.Assert;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.testVagrant.APIAutomation.beans.Weather;
import com.testVagrant.APIAutomation.beans.WeatherOutput;

import io.restassured.response.Response;

public class GetWeatherReport {

	public static WeatherOutput getWeatherReportByCityName(String cityName, String accessToken, String baseUri,
			String basePath) {

		String city = cityName.split(",")[0];
		Response apiResponse = given().baseUri(baseUri).basePath(basePath).queryParam("q", city)
				.queryParam("appid", accessToken).get();

		System.out.println(apiResponse.statusCode());
		Assert.assertEquals(apiResponse.statusCode(), 200);

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonParser jp = new JsonParser();
		JsonElement je = jp.parse(apiResponse.prettyPrint());
		Weather weather = gson.fromJson(je, Weather.class);
		System.out.println(weather.getMain());

		return new WeatherOutput(weather.getMain().getTemp(), weather.getMain().getHumidity());
	}

}
