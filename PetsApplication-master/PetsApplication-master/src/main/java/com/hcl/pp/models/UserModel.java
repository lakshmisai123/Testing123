package com.hcl.pp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PET_USER")
public class UserModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="USER_NAME")
	private String userName;
	@Column(name="USER_PASSWD")
	private String userPwd;
	
	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public PetModel getPetModel() {
		return petModel;
	}

	public void setPetModel(PetModel petModel) {
		this.petModel = petModel;
	}

	@OneToOne
    @JoinColumn(name = "ID")
	private PetModel petModel;
}
