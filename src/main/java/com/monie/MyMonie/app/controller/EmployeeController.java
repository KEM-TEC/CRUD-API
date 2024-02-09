package com.monie.MyMonie.app.controller;

import com.monie.MyMonie.app.dto.EmployeeDto;
import com.monie.MyMonie.app.entity.Employee;
import com.monie.MyMonie.app.repository.EmployeeRepository;
import com.monie.MyMonie.app.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;
    @PostMapping()
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee=employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee,HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId){
        EmployeeDto employeeDto=employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(employeeDto);
    }
    @GetMapping
    public ResponseEntity<List<EmployeeDto>>getAllEmployee(){
        List<EmployeeDto>employees=employeeService.getAllEmployee();
        return ResponseEntity.ok(employees);

    }@PutMapping("{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") Long employeeId,@RequestBody EmployeeDto updatedEmployee){
        EmployeeDto employeeDto=employeeService.updateEmployee(employeeId,updatedEmployee);
        return ResponseEntity.ok(employeeDto);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(Long employeeId){
        employeeService.deleteEmployee(employeeId);
       return ResponseEntity.ok("Employee deleted successfully");
    }
}
