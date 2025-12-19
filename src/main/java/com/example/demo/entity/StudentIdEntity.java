package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id; 
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;

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
    @JoinColumn(name="student_id")
    private StudentDetails student;
   
}