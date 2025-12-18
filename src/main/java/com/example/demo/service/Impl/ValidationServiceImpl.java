package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.StudentRepository;


@Service
public class ValidationServiceImpl implements ValidationService{
    @Autowired ValidationRepository student; 
    @Override
     public ValidationEntity postData(StudentEntity stu){
        return student.save(stu);
     }