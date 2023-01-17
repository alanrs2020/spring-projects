package net.samplejava.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.samplejava.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
