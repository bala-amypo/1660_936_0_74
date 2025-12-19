package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id; 
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentIdEntity{
      @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private int idno;
    private int Studentid;

    @OneToOne
    private StudentDetails{
        
    }
   
}