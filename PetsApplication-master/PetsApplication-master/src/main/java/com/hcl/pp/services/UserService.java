package com.hcl.pp.services;

import java.util.List;

import com.hcl.pp.beans.Pet;
import com.hcl.pp.beans.User;

public interface UserService {

	public String addUsers(User user);
	public String buyPets(int petId,int userId);
	public List<Pet> myPets(int userId);
	
}
