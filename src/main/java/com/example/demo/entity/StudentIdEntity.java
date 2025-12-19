package com.example.demo.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentIdEntity{
    private Integer id;
    private int idno;
    private int Studentid;
   
}