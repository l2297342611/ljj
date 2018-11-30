package com.neusoft.lj.service;

import java.util.List;

import com.neusoft.lj.dao.Employee_Impl;
import com.neusoft.lj.entity.Employee_Entity;

public class Employee_Service {
	
	Employee_Impl eImpl = new Employee_Impl();

	public int insertEmployee(Employee_Entity entity){
		return eImpl.insertEmployee(entity);
	}
	
	public int del_Employee(int id){
		return eImpl.deleteEmployee(id);
	}
	
	public int updateEmployee(Employee_Entity entity){
		return eImpl.updateEmployee(entity);
	}
	
	public List<Employee_Entity> selectAllEmployee(Employee_Entity entity){
		return eImpl.selectAllEmployee(entity);
	}
	
	public Employee_Entity findEmployee(int id){
		return eImpl.findEmployee(id);
	}
	
	public Employee_Entity logIn(Employee_Entity entity) {
		return eImpl.logIn(entity);
	}

	public Employee_Entity findEmployee(String account){ return eImpl.findEmployee(account); }
	
}
