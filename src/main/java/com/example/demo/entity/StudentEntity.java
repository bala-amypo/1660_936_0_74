package com.example.demo.entity

import.java
@Entity
public class StudentEntity{
    private Integer id;
    private String username;
    private String email;
    private String password;
    private Date createAt;
}

public void setId(Integer id){
    this.id=id;
}
public void getId(){
    return id;
}
public void setuser