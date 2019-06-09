package com.hcl.pp.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.pp.beans.Pet;
import com.hcl.pp.models.PetModel;
import com.hcl.pp.repositories.PetRepository;

@Service
public class PetServiceImpl<T> implements PetService{
	@Autowired
	PetRepository petRepository;
	PetModel petModel = null;

	//List<PetModel> petsmodel = null;
	
	public String addPets(Pet pet) {
		petModel = new PetModel();
		BeanUtils.copyProperties(pet, petModel);
		petRepository.save(petModel);
		return "Pet added successfully";	
	}

	

	@SuppressWarnings("unchecked")
	@Override
	public List<Pet> petDetails() {
		List<T> petslist = null;
		List<Pet> petsDtolist = null;
		petslist = (List<T>) petRepository.findAll();
		petsDtolist = (List<Pet>) petslist;
		return petsDtolist;
	}

	
	
}
