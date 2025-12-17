package com.example.demo.entity;


import java.util.date;
import jakarta.persistance.Entity;
import jakarta.persistance.GeneratedValue;
import.jakarta.persistance.GenerationType;
import jakarta.persistance.Id;
@Entity
public class StudentEntity{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String email;
    private String password;
    private Date created;


public void setId(Integer id){
    this.id=id;
}
public Integer getId(){
    return id;
}
public void setUserName(String username){
    this.username=username;
}
public String getUserName(){
    return username;
}
public void setEmail(String Email){
    this.email=email;
}
public String getEmail(){
    return email;
}
public void setPassword(String Password){
    this.password=password;
}
public String getPassword(){
    return password;
}
public void setCreated(Date Created){
    this.created=created;
}
public Date getCreated(){
    return created;
}

public StudentEntity(Interger id, String name, String email, String password, Date created){
    this.id=id;
    this.name=name;
    this.email=email;
    this.password=password;
    this.created=created;
}

public StudentEntity(){

}

}