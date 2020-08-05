package com.testVagrant.APIAutomation.beans;

public class Main {

	private Double temp;
	private Integer pressure;
	private Integer humidity;
	private Double temp_min;
	private Double temp_max;

	public Double getTemp() {
		return temp;
	}

	public void setTemp(Double temp) {
		this.temp = temp;
	}

	public Integer getPressure() {
		return pressure;
	}

	public void setPressure(Integer pressure) {
		this.pressure = pressure;
	}

	public Integer getHumidity() {
		return humidity;
	}

	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}

	public Double getTempMin() {
		return temp_min;
	}

	public void setTempMin(Double tempMin) {
		this.temp_min = tempMin;
	}

	public Double getTempMax() {
		return temp_max;
	}

	public void setTempMax(Double tempMax) {
		this.temp_max = tempMax;
	}

	@Override
	public String toString() {
		return "ClassPojo [temp = " + temp + ", tempMin = " + temp_min + ", humidity = " + humidity + ", pressure = "
				+ pressure + ", tempMax = " + temp_max + "]";
	}
}
