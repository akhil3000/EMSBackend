package com.javaguides.ems_backend.controller;

import com.javaguides.ems_backend.dto.EmployeeDto;
import com.javaguides.ems_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
   private EmployeeService employeeService;

   //Build Add Employee REST API
    @PostMapping
   public ResponseEntity<EmployeeDto> createEmployee(EmployeeDto employeeDto){
    EmployeeDto savedEmployee=employeeService.createEmployee(employeeDto);
    return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
   }

}
