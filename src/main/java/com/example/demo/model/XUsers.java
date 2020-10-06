package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class XUsers {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
    private String permissions;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id",nullable = false)
    private Employees employee;


    @OneToOne
    @JoinColumn(name = "role_id",referencedColumnName = "role_id")
    private Roles roles;



}
