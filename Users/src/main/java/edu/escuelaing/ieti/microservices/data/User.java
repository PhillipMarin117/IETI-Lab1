package edu.escuelaing.ieti.microservices.data;

import edu.escuelaing.ieti.microservices.dto.UserDto;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.UUID;

public class User {
    private String id;
    private String name;
    private String email;
    private String lastName;
    private java.util.Date createdAt;

    public User(UserDto userDto) {
        this.id = UUID.randomUUID().toString();
        this.name = userDto.getName();
        this.lastName = userDto.getLastName();
        this.email = userDto.getEmail();
        try{
            SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
            this.createdAt = formatter1.parse(userDto.getCreatedAt());
        }catch (ParseException E){
            String createdAt1="1/10/2021";
        }

    }

    public User(String id, UserDto userDto) {
        this.id = id;
        this.name = userDto.getName();
        this.lastName = userDto.getLastName();
        this.email = userDto.getEmail();
        try{
            SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
            this.createdAt = formatter1.parse(userDto.getCreatedAt());
        }catch (ParseException E){
            String createdAt1="1/10/2021";
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
