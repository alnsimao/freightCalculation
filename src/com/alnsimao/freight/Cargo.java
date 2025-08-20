package com.alnsimao.freight;

public class Cargo {
	private String description;
	private double mass;

	Cargo(String description, double mass) {
		this.setDescription(description);
		this.setMass(mass);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}
	
}
