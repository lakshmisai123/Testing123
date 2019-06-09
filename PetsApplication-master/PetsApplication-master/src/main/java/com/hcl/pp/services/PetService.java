package com.hcl.pp.services;

import java.util.List;

import com.hcl.pp.beans.Pet;

public interface PetService {
	
	public String addPets(Pet pet);
	
	public List<Pet> petDetails();


}
