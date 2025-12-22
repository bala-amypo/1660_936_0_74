package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



import com.example.demo.entity.TimestampEntity;
import com.example.demo.service.TimestampService;

@RestController
public class TimestampController{

    @Autowired TimestampService times;
    
    @PostMapping("/posted")
    public TimestampEntity sendsData(@RequestBody TimestampEntity time){
        return times.postTimeData(time);
    }
}