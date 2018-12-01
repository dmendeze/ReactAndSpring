package com.reactAndSpring.tutorial;

import com.reactAndSpring.tutorial.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
