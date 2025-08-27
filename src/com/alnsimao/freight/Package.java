package com.alnsimao.freight;

import java.util.List;

public class Package {
	private String id;
	private Address address;
	private String notes;
	private List<Cargo> listCargo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public List<Cargo> getListCargo() {
		return listCargo;
	}

	public void setListCargo(List<Cargo> listCargo) {
		this.listCargo = listCargo;
	}

	public void addCargo(Cargo cargo) {
		listCargo.add(cargo);
	}

	public void removeCargo(Cargo cargo) {
		listCargo.remove(cargo);
	}

	public void displayCargo() {

		/*
		 * for(Cargo c : this.listCargo) { System.out.println("-- Cargo Description: "+
		 * c.getDescription()); System.out.println("-- Cargo Mass: " +c.getMass()); }
		 */
		
		this.listCargo.stream().filter(cargo -> cargo.getMass() > 5).forEach(cargo -> {
			System.out.println("Cargo: "+cargo.getDescription());
		});
	}

}
