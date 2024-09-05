package com.javaguides.ems_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;


@NoArgsConstructor

@Entity
@Table(name="employees")
@Data
public class Employee{
   @Autowired
   public Employee(Long id,String firstName,String lastName,String email){
       this.id=id;
       this.firstName=firstName;
       this.lastName=lastName;
       this.email=email;

   }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;



    @Column(name="first_name",nullable=false)
    private String firstName;



    @Column(name="last_name",nullable=false)
    private String lastName;
    @Column(name="email_id",unique = true,nullable=false)
    private String email;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
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
