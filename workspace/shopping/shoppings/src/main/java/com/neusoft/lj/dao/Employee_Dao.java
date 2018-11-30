package com.neusoft.lj.dao;

import java.util.List;

import com.neusoft.lj.entity.Employee_Entity;


public interface Employee_Dao {

	int  insertEmployee(Employee_Entity entity);
	int deleteEmployee(int id);
	int updateEmployee(Employee_Entity entity);
	List<Employee_Entity> selectAllEmployee(Employee_Entity entity);
	Employee_Entity findEmployee(int id);
}
