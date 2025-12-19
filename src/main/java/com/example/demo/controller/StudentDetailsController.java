package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



import com.example.demo.entity.StudentDetaitlsEntity;
import com.example.demo.service.StudentDetailsService;

@RestController
public class StudentDetailsController{

    @Autowired StudentDetailsService servd;
    
    @PostMapping("/postings")
    public StudentDetailsEntity sendDetailsData(@RequestBody StudentDetailsEntity tie){
        return servd.postDetailsData(tie);
    }
}