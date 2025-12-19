package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import com.example.demo.service. Service;
import com.example.demo.entity. StudentIdEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository. StudentIdRepository;


@Service
public class StudentIdServiceImpl implements StudentIdService{
    @Autowired StudentIdRepository st; 
    @Override
     public StudentIdEntity postIdData( StudentIdEntity sts){
        return st.save(sts);
     }
}