package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



import com.example.demo.entity.StudentIdEntity;
import com.example.demo.service.StudentIdService;

@RestController
public class StudentIdController{

    @Autowired StudentIdService serv;
    
    @PostMapping("/posting")
    public StudentIdEntity sendIdData(@RequestBody StudentIdEntity ti){
        return serv.postIdData(ti);
    }
}