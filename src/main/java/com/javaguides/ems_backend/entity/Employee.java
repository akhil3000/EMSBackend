package com.javaguides.ems_backend.entity;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employees")
@Data

public class Employee {



    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;



    @Column(name="first_name",nullable=false)
    private String firstName;



    @Column(name="last_name",nullable=false)
    private String lastName;
    @Column(name="email_id",nullable=false,unique=true)
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public Long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
