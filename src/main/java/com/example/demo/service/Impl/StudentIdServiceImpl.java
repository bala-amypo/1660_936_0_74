package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import com.example.demo.service. Service;
import com.example.demo.entity. TimestampEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository. TimestampRepository;


@Service
public class TimestampServiceImpl implements TimestampService{
    @Autowired TimestampRepository timestamp; 
    @Override
     public TimestampEntity postTimeData( TimestampEntity time){
        return timestamp.save(time);
     }
}