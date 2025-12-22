package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import com.example.demo.service. Service;
import com.example.demo.entity. StudentIdEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository. StudentDetailsRepository;


@Service
public class StudentDetailsServiceImpl implements StudentIdService{
    @Autowired StudentDetailsRepository stss; 
    @Override
     public  StudentIdEntity postDetailsData( StudentIdEntity std){
        return stss.save(std);
     }
}