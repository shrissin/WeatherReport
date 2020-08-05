package com.testVagrant.APIAutomation.beans;

public class WeatherOutput {
	private Double temp;
	private Integer humidity;

	public WeatherOutput(Double temp, Integer humidity) {
		super();
		this.temp = temp;
		this.humidity = humidity;
	}

	public Double getTemp() {
		return temp;
	}

	public void setTemp(Double temp) {
		this.temp = temp;
	}

	public Integer getHumidity() {
		return humidity;
	}

	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}
}
