package com.aasurihome.springbean;

public class Address {
	
	private String city;
	private String street;
	private int number;
	private int zip;
	
	public Address(String city, String street, int number, int zip) {
		this.city = city;
		this.street = street;
		this.number = number;
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}
}
