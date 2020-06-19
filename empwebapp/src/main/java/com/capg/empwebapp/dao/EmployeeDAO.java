package com.capg.empwebapp.dao;

import java.util.List;

import com.capg.empwebapp.bean.Employee;

public interface EmployeeDAO {
	Employee login(String email, String password);
	boolean addEmployee(Employee employee);
	List<Employee> viewEmployee();
	boolean deleteEmployee(int id);
	boolean updateEmployee(Employee employee);

}
