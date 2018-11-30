package com.neusoft.lj.dao;


import com.neusoft.lj.entity.Users;
import com.neusoft.lj.utils.ConnectionFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsersDaoImpl extends ConnectionFactory implements IUsersDao {
//注册
	@Override
	public int insertUsers(Users users) {
		String sql = "insert into userinfo values(uid,?,?,?,?,?,?,?,?,?) ";
		Object[] objects = new Object[]{
		                              users.getUname(),
		                              users.getIsenable(),
		                              users.getBirth(),
		                              users.getAccount(),
		                              users.getPassword(),
		                              users.getMail(),
		                              users.getPhone(),
				users.getCode(),
				users.getRegisterTime()
		} ;
		return this.executeUpdate(sql, objects);
	}
//根据id删除相应用户
	@Override
	public int deleteUsers(int id) {
		String sql = "delete  from userinfo where uid=? ";
		Object[] objects = new Object[]{
		                             id
		} ;
		return this.executeUpdate(sql, objects);
	}
//更新用户信息
	@Override
	public int updateUsers(Users users) {
		String sql = "update userinfo set uname = ? , isenable = ?, birth = ?,account = ?,password = ?,mail = ?,phone = ?,code = ?,registerTime = ? where uid=? ";
		Object[] objects = new Object[]{
				users.getUname(),
				users.getIsenable(),
				users.getBirth(),
				users.getAccount(),
				users.getPassword(),
				users.getMail(),
				users.getPhone(),
				users.getCode(),
				users.getRegisterTime(),
                users.getUid()
                
} ;     
		return this.executeUpdate(sql, objects);
	}
//查找所有用户
	@Override
	public List<Users> selectAllUsers() {
		String sql = "select * from userinfo";
		Object[] objects = new Object[]{};
		return this.executeQurey(sql, objects);
	}
//登录
	public Users logIn(Users users) {
		
		String sql = "select * from userinfo where account =? and password =? and isenable = 1";
		Object[] objects = new Object[]{
				users.getAccount(),users.getPassword()
		};
		List<Users> list= this.executeQurey(sql, objects);
		if(list.isEmpty()){
			return null;
		}else{
			return list.get(0);
		}
		
	}
//根据id查找对应用户
	public Users findUser(int id){
		String sql = "select * from userinfo where uid = ?";
		Object[] objects = new Object[]{
				id
		};
		List<Users> list= this.executeQurey(sql, objects);
		if(list.isEmpty()){
			return null;
		}else{
			return list.get(0);
		}
	}

	//根据姓名查找对应用户
	public Users findUser(String account){
		String sql = "select * from userinfo where account = ?";
		Object[] objects = new Object[]{
				account
		};
		List<Users> list= this.executeQurey(sql, objects);
		if(list.isEmpty()){
			return null;
		}else{
			return list.get(0);
		}
	}
	//rs转换为集合
	@Override
	public List<Users> rsToList(ResultSet rs) {
		List<Users> list =new ArrayList<>();
	    try {
			while(rs.next()){
				Users users = new Users();
				users.setUid(rs.getInt("uid"));
				users.setUname(rs.getString("uname"));
				users.setIsenable(rs.getInt("isenable"));
				users.setPhone(rs.getString("birth"));
				users.setAccount(rs.getString("account"));
				users.setPassword(rs.getString("password"));
				users.setMail(rs.getString("mail"));
				users.setPhone(rs.getString("phone"));
				users.setCode(rs.getString("code"));
				users.setRegisterTime(rs.getString("registerTime"));
				 list.add(users);
				 
			}return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
