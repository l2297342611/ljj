package com.neusoft.lj.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.neusoft.lj.entity.Employee_Entity;
import com.neusoft.lj.utils.ConnectionFactory;

public class Employee_Impl extends ConnectionFactory<Employee_Entity> implements Employee_Dao{

	@Override
	public int insertEmployee(Employee_Entity entity) {
		// TODO Auto-generated method stub
		String sql = "insert into employeeinfo values(empno,?,?,?,?,?,?,?) ";
		Object[] objects = new Object[]{
				entity.getEname(),
				entity.getPhone(),
				entity.getAccount(),
				entity.getPassword(),
				entity.getIsadmin(),
				entity.getIsenable(),
				entity.getJob()
		} ;
		return this.executeUpdate(sql, objects);
	}

	@Override
	public int deleteEmployee(int id) {
		// TODO Auto-generated method stub
		String sql = "delete  from employeeinfo where empno=? ";
		Object[] objects = new Object[]{
		                             id
		} ;
		return this.executeUpdate(sql, objects);
	}

	@Override
	public int updateEmployee(Employee_Entity entity) {
		// TODO Auto-generated method stub
		String sql = "update employeeinfo set ename = ?, phone = ?,account = ?,password = ?,isadmin = ?,isenable = ? , job = ? where empno=? ";
		Object[] objects = new Object[]{
				entity.getEname(),
				entity.getPhone(),
				entity.getAccount(),
				entity.getPassword(),
				entity.getIsadmin(),
				entity.getIsenable(),
				entity.getJob(),
				entity.getEmpno()
} ;     
		return this.executeUpdate(sql, objects);
	}

	@Override
	public List<Employee_Entity> selectAllEmployee(Employee_Entity entity) {
		// TODO Auto-generated method stub
		String sql = "select * from employeeinfo";
		return this.executeQurey(sql, null);
	}

	public Employee_Entity logIn(Employee_Entity entity) {
		String sql = "select * from employeeinfo where account =? and password =?";
		Object[] objects = new Object[]{
				entity.getAccount(),entity.getPassword()
		};
		List<Employee_Entity> list= this.executeQurey(sql, objects);
		if(list.isEmpty()){
			return null;
		}else{
			return list.get(0);
		}
		
	}
	
	public Employee_Entity findEmployee(int id){
		String sql = "select * from employeeinfo where empno = ?";
		Object[] objects = new Object[]{
				id
		};
		List<Employee_Entity> list= this.executeQurey(sql, objects);
		if(list.isEmpty()){
			return null;
		}else{
			return list.get(0);
		}
	}

	public Employee_Entity findEmployee(String account){
		String sql = "select * from employeeinfo where account = ?";
		Object[] objects = new Object[]{
				account
		};
		List<Employee_Entity> list= this.executeQurey(sql, objects);
		if(list.isEmpty()){
			return null;
		}else{
			return list.get(0);
		}
	}
	@Override
	public List<Employee_Entity> rsToList(ResultSet rs) {
		// TODO Auto-generated method stub
		List<Employee_Entity> list =new ArrayList<>();
	    try {
			while(rs.next()){
				Employee_Entity entity = new Employee_Entity();
				entity.setEmpno(rs.getInt("empno"));
				entity.setEname(rs.getString("ename"));
				entity.setJob(rs.getInt("job"));
				entity.setPhone(rs.getString("phone"));
				entity.setAccount(rs.getString("account"));
				entity.setPassword(rs.getString("password"));
				entity.setIsadmin(rs.getString("isadmin"));
				entity.setIsenable(rs.getString("isenable"));
				 list.add(entity);
				 
			}return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	
}
