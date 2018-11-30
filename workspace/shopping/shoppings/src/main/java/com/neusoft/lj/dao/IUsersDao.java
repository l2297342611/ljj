package com.neusoft.lj.dao;


import com.neusoft.lj.entity.Users;

import java.util.List;

public interface IUsersDao {

	int  insertUsers(Users users);
	int deleteUsers(int id);
	int updateUsers(Users users);
	List<Users> selectAllUsers();
}
