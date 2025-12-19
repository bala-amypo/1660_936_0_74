package com.example.demo.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDetailsEntity{
    private String name;
    private String regno;
    private String address;
}