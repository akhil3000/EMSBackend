package com.javaguides.ems_backend.service.impl;

import com.javaguides.ems_backend.dto.EmployeeDto;
import com.javaguides.ems_backend.entity.Employee;
import com.javaguides.ems_backend.mapper.EmployeeMapper;
import com.javaguides.ems_backend.repository.EmployeeRepository;
import com.javaguides.ems_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImp implements EmployeeService {
     private EmployeeRepository employeeRepoistory;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto){
        Employee employee= EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee=employeeRepoistory.save(employee);

       return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
