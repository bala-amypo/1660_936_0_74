package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;

@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2,max=10,message="must be 2 to 10 character")
    private String username;
    @Email(message="Email is not valid")
    private String email;
    @Size(min=3,max=6,message="must be 3 to 6 character")
    @NotNull(message="Password is mandatory")
    private String password;
    @max(30)
    @Positive(message="age must be positive")
    private int age;

    public void setId(Long id){
    this.id=id;
    }
    public Long getId(){
        return id;
    }
    public void setUserName(String username){
        this.username=username;
    }
    public String getUserName(){
        return username;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getAge(){
        return age;
    }

    public ValidationEntity(
        Long id,@NotNull @Size(min=2,max=10,message="must be 2 to 10 character")
        String username, @Email(message="Email is not valid")
        String email,@Size(min=3,max=6,message="must be 2 to 10 character") @NotNull(message="Password is mandatory")
        String password, @max(30) @Positive(message="age must be positive")
        int age){
            this.id=id;
            this.username=username;
            this.email=email;
            this.password=password;
            this.age=age;
        }
    public ValidationEntity(){

    }

    
}