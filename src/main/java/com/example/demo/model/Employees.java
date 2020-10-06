package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.datetime.standard.DateTimeContext;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email;
    private String password;
    private String name;
    private String surname;
    private String image;
    private String birthDate;
    private String contact;
    private String address;
    private long educationId;
    private double salary;
    private double originalSalary;// DSMF
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
    private boolean status;

    @OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
    private Set<XUsers> usersSet;

}
