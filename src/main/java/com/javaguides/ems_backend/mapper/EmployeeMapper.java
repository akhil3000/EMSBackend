package com.javaguides.ems_backend.mapper;

import com.javaguides.ems_backend.dto.EmployeeDto;
import com.javaguides.ems_backend.entity.Employee;
import org.antlr.v4.runtime.misc.NotNull;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(@NotNull Employee employee){
        return new EmployeeDto(
          employee.getId(),
          employee.getFirstName(),
          employee.getLastName(),
          employee.getEmail()


        );


    }


    public static Employee mapToEmployee(@NotNull EmployeeDto employeeDto)
    {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()

        );

    }
}
