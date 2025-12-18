package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import jakarta.validation.Valid;

import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;


@RestController
public class ValidationController{

    @Autowired ValidationService valid;
    
    @PostMapping("/valpost")
    public ValidationEntity giveData(@Valid @RequestBody ValidationEntity val){
        return valid.postValue(val);
    }
}