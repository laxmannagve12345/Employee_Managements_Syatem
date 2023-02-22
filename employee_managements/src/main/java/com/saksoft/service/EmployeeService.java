package com.saksoft.service;

import java.util.List;

import com.saksoft.model.Employee;

public interface EmployeeService {

	Employee saveData(Employee ee);

	List<Employee> getAllData();

	void deletedata(int eid);

	Employee update(Integer eid);

	Employee getsingleEmp(int eid);

	

}
