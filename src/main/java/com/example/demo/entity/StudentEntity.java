package com.example.demo.entity

import.java
@Entity
public class StudentEntity{
    private Integer id;
    private String username;
    private String email;
    private String password;
    private Date created;
}

public void setId(Integer id){
    this.id=id;
}
public Integer getId(){
    return id;
}
public void setUserName(String name){
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
public void setCreatAt(Date Created){
    this.created=CreateAt;
}
public 