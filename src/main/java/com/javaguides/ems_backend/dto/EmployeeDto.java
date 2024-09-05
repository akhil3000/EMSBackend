package com.javaguides.ems_backend.dto;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@NoArgsConstructor

@Data

public class EmployeeDto {

    private Long id;



    private String firstName;
    private String lastName;
    private String email;
    @Autowired
    public EmployeeDto(Long id,String firstName,String lastName,String email){
       this.id=id;
       this.firstName=firstName;
       this.lastName=lastName;
       this.email=email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
