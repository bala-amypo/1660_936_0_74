package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
import org.framework.beans.factory.annotation.Autowired;


@Service
public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepository student; 
    
     public StudentEntity postData(StudentEntity student){

     }
}