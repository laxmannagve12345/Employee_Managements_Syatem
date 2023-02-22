package com.saksoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saksoft.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{


	Employee findByEid(Integer eid);

}
