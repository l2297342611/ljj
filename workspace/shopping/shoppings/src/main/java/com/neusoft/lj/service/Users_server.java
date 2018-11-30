package com.neusoft.lj.service;



import com.neusoft.lj.dao.UsersDaoImpl;
import com.neusoft.lj.entity.Users;

import java.util.List;

public class Users_server {
	
	UsersDaoImpl usersDaoImpl = new UsersDaoImpl();
	
	public Users logIn(Users users){
		return usersDaoImpl.logIn(users);
	}
	
	public  int  inset_User(Users users){ return  usersDaoImpl.insertUsers(users); }
	
	public int deleteUser(int id){
		return usersDaoImpl.deleteUsers(id);
	}
	
	public int updateUser(Users users){
		return usersDaoImpl.updateUsers(users);
	}
	
	public List<Users> findAllUser(){
		return usersDaoImpl.selectAllUsers();
	}
	
	public Users findUser(int id){
		return usersDaoImpl.findUser(id);
	}

	public Users findUser(String account) {return usersDaoImpl.findUser(account); }
}
