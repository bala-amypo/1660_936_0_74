package com.example.demo.service;

import com.example.demo.entity.ValidationEntity;
import java.util.List;
public interface ValidationService{
 
  ValidationEntity postData(ValidationEntity validation);
  List<ValidationEntity>getAllData();
  String deleteData(int id);
  StudentEntity getData(int id);
  StudentEntity updateData(int id, StudentEntity entity);

}