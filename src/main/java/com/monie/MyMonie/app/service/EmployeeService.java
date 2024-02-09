package com.monie.MyMonie.app.service;

import com.monie.MyMonie.app.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);
    List<EmployeeDto>getAllEmployee();
    EmployeeDto updateEmployee(Long Id,EmployeeDto updatedEmployee);
    Void deleteEmployee(Long employeeId);

}
