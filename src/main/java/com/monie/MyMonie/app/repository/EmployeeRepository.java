package com.monie.MyMonie.app.repository;

import com.monie.MyMonie.app.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{
}
