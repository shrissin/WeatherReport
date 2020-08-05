package com.testVagrant.APIAutomation.beans;

public class Weather {

	private Main main;
	private Integer id;
	private String name;
	private Integer cod;

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}
	
	@Override
	public String toString() {
		return "Weather [main=" + main + ", id=" + id + ", name=" + name + ", cod=" + cod + "]";
	}

}
