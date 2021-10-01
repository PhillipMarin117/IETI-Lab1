package edu.escuelaing.ieti.microservices.dto;

import java.util.Date;

public class UserDto {
    private String name;
    private String lastName;
    private String email;
    private String createdAt;

    public UserDto(String name, String lastName, String email, String createdAt) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String  createdAt) {
        this.createdAt = createdAt;
    }
}
