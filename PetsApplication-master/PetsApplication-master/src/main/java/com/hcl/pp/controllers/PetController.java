package com.hcl.pp.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.pp.beans.Pet;
import com.hcl.pp.services.PetService;

@RestController
@RequestMapping("/pets")
public class PetController {
		@Autowired
	    PetService petService;
		
		@PostMapping("/addPet")
		public ResponseEntity<String> addPets(@RequestBody Pet pet){
		String message= petService.addPets(pet);
		return new ResponseEntity<String>(message, HttpStatus.CREATED);
		}

		@GetMapping("/petDetails")
		public List<Pet> getAllPets(){
			List<Pet> petsList = null;
			petsList = petService.petDetails();
			
			return petsList;
		}
		
	
	}

	


