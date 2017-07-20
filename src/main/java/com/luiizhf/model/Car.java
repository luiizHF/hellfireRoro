package com.luiizhf.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Car {
	@NotNull
	@Size(min=2, max = 15)
	private String marca;
	
	@NotNull
	@Size(min=2, max = 15)
	private String modelo;
	
	@NotNull
	@Min(0)
	@Max(4)
	private int type;
	
	@NotNull
	@Min(2000)
	private int year;
	public Car(String marca, String modelo, int type, int year) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.type = type;
		this.year = year;
	}
	
	public Car(){}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car [marca=" + marca + ", modelo=" + modelo + ", type=" + type + ", year=" + year + "]";
	}
	
		
}
