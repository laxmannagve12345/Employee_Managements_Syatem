package com.saksoft.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saksoft.model.Employee;
import com.saksoft.repository.EmployeeRepository;
import com.saksoft.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeerepository;
	
	@Override
	
	public Employee saveData(Employee ee) {
		Employee ss=employeerepository.save(ee);
		return ss;
	}

	@Override
	public List<Employee> getAllData() {
		List<Employee>a=employeerepository.findAll();
		return a;
	}

	@Override
	public void deletedata(int eid) {
		employeerepository.deleteById(eid);
		
	}

	@Override
	public Employee update(Integer eid) {
		Employee es=employeerepository.findByEid(eid);
		return es;
	}

	@Override
	public Employee getsingleEmp(int eid) {
		
		
		employeerepository.findById(eid);
				
				return null;
	}
	

}
