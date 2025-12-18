package com.example.demo.entity;

import jakarta.persistence.Entity;
@Entity
public class ValidationEntity{
    private Long id;
    private String username;
    private String email;
    private String password;
    private int age;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password;
    private int age;
}