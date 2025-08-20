package com.alnsimao.freight;

public class Address {
 private String streetName;
 private int number;
 

 public Address(String streetName, int number) {
	 this.number = number;
	 this.streetName = streetName;
 }


public String getStreetName() {
	return streetName;
}


public void setStreetName(String streetName) {
	this.streetName = streetName;
}


public int getNumber() {
	return number;
}


public void setNumber(int number) {
	this.number = number;
}
}
