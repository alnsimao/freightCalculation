package com.alnsimao.freight;

import java.util.List;

public class Freight {
	private Address address;
	private double value;
	private double distance;
	private List<Package> packages;
	
	
	public double getValue() {
		return value;
	}


	public double getDistance() {
		return distance;
	}


	public void setDistance(double distance) {
		this.distance = distance;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void addPackage(Package packages) {
		 this.packages.add(packages);
	}
	
}
