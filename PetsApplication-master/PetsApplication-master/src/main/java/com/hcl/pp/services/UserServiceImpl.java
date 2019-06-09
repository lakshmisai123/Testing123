package com.hcl.pp.services;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.pp.beans.Pet;
import com.hcl.pp.beans.User;
import com.hcl.pp.models.UserModel;
import com.hcl.pp.models.PetModel;
import com.hcl.pp.repositories.PetRepository;
import com.hcl.pp.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepo;
	@Autowired
	PetRepository petRepository;
	UserModel userModel = null;
	
	public String addUsers(User user) {
		userModel = new UserModel();
		BeanUtils.copyProperties(user, userModel);
		userRepo.save(userModel);
		return "User added Succcessfully";
	}
		@Override
		public String buyPets(int petId,int userId) {
			PetModel petModel = new PetModel();
			petModel = petRepository.findById(petId).get();
			userModel = userRepo.findById(userId).orElse(null);
			if(userModel == null) {
				return "Please add user before purchasing any pet";
			}
			if(petModel.getPetOwnerID() ==0 ) {
				petModel.setPetOwnerID(userId);
				petRepository.save(petModel);
				return "Pet bought successfully";
							
			}	else {	
			return ("Unable to buy pet for user : "+ userId);	
			}
			
		}	
		@SuppressWarnings("unchecked")
		@Override
		public List<Pet> myPets(int userId) {
			List<PetModel> petModelList = null;
			List<PetModel> petModelListFinal = null;
			List<Pet> petsDtolist = null;
			petModelList = petRepository.findAllByCustomerId(userId);
			return petsDtolist;
			
		}

}
