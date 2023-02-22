package com.saksoft.service;

import java.util.List;
import java.util.Optional;

import com.saksoft.model.Employee;

public interface EmployeeService {

	Employee saveData(Employee ee);

	List<Employee> getAllData();

	void deletedata(int eid);

	Employee update(Integer eid);

	Optional<Employee>  getsingleEmp(int eid);

	

}
