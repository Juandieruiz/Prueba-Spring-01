package com.example.demo.domain;

public class Car {

	private Long idLong;
	private String manufacturer;
	private String model;
	private Double ccDouble;
	private Integer doors;

	public Car() {
	}

	public Car(Long idLong, String manufacturerString, String model, Double ccDouble, Integer doors) {
		super();
		this.idLong = idLong;
		this.manufacturer = manufacturerString;
		this.model = model;
		this.ccDouble = ccDouble;
		this.doors = doors;
	}

	public Long getIdLong() {
		return idLong;
	}

	public void setIdLong(Long idLong) {
		this.idLong = idLong;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getCcDouble() {
		return ccDouble;
	}

	public void setCcDouble(Double ccDouble) {
		this.ccDouble = ccDouble;
	}

	public Integer getDoors() {
		return doors;
	}

	public void setDoors(Integer doors) {
		this.doors = doors;
	}

	@Override
	public String toString() {
		return "Car [idLong=" + idLong + ", manufacturer=" + manufacturer + ", model=" + model + ", ccDouble="
				+ ccDouble + ", doors=" + doors + "]";
	}

}
