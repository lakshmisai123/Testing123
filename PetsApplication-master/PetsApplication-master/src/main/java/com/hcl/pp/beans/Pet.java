package com.hcl.pp.beans;

public class Pet {
	private int id;
	private String petName;
	private int petAge;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public int getPetAge() {
		return petAge;
	}
	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}
	public String getPetPlace() {
		return petPlace;
	}
	public void setPetPlace(String petPlace) {
		this.petPlace = petPlace;
	}
	public int getPetOwnerID() {
		return petOwnerID;
	}
	public void setPetOwnerID(int petOwnerID) {
		this.petOwnerID = petOwnerID;
	}
	private String petPlace;
	private int petOwnerID;

}
