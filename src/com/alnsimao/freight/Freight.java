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

	public void removePackage(Package packages) {
		this.packages.remove(packages);
	}

	public void displayPackages() {
		for (Package p : this.packages) {
			System.out.println("Package ID: " + p.getId());
			System.out.println("Package notes: " + p.getNotes());

		}

	}
	public void calculateFreightValue() {
		double totalMass = 0.0;
		for(Package p : this.packages) {
			for (Cargo c : p.getListCargo()) {
				totalMass += c.getMass();
			}
		}
	    System.out.println("Calculated Total Mass: " + totalMass);
	    double calculatedValue = this.distance * totalMass * 0.5;
	    this.value = calculatedValue;
	}

}
