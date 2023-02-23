package com.saksoft.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saksoft.model.Employee;
import com.saksoft.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeservice;
	
	@PostMapping("/")
	public ResponseEntity<Employee> saveData(@RequestBody Employee ee){
		Employee e=employeeservice.saveData(ee);
		return new ResponseEntity<Employee>(e,HttpStatus.CREATED);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Employee>>getAll(){
		List<Employee>list=employeeservice.getAllData();
		return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);

	}
	
	@GetMapping("/singleemp/{eid}")
	public  ResponseEntity<Optional<Employee>> getsingleemployee(@PathVariable int eid){
		Optional<Employee> empp=employeeservice.getsingleEmp(eid);
		return new ResponseEntity<Optional<Employee>>(empp,HttpStatus.OK);
	}
	
	@DeleteMapping("/deletedata/{eid}")
	public ResponseEntity<String> deletedata(@PathVariable int eid){
		employeeservice.deletedata(eid);
		return new ResponseEntity<String>("data deleted succussfully",HttpStatus.NO_CONTENT);
	}
	
	
	@PutMapping("/update/{eid}")
	public ResponseEntity<Employee>update(@PathVariable Integer eid,@RequestBody Employee e){
		Employee es=employeeservice.update(eid);
		employeeservice.saveData(e);
		return new ResponseEntity<Employee>(es,HttpStatus.OK);
	}
}
