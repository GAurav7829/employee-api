package com.ezio.springdatarest.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ezio.springdatarest.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
