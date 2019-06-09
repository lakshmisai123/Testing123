package com.hcl.pp.models;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="PETS")
public class PetModel {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 @Column(name="ID")
 private int id;
 @Column(name="PET_NAME")
 private String petName;
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

public UserModel getUserModel() {
	return userModel;
}

public void setUserModel(UserModel userModel) {
	this.userModel = userModel;
}

 @Column(name="PET_AGE")
 private int petAge;
 @Column(name="PET_PLACE")
 private String petPlace;
 @Column(name="PET_OWNERID")
 private int petOwnerID;
 
 @OneToOne(fetch = FetchType.EAGER,mappedBy="petModel",cascade = CascadeType.ALL)
 private UserModel userModel;
 	
}
