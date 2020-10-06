package com.example.demo.payload.request;

import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Validated
@Getter
@Setter
public class RegisterRequest {

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 8)
    private String password;

    @NotBlank
    private String name;

    @NotBlank
    private String surname;

    @NotBlank
    private String image;

    @NotBlank
    private String birthDate;

    @NotBlank
    @Size(min = 9)
    private String contact;

    @NotBlank
    private String address;

    @NotBlank
    private double salary;

    @NotBlank
    private double originalSalary;// DSMF

    @NotBlank
    private LocalDateTime createdAt;

    @NotBlank
    private LocalDateTime updatedAt;

    @NotBlank
    private LocalDateTime deletedAt;
}
