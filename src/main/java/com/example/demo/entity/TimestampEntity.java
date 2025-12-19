package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id; 
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import jakarta.persistance.PrePersist;
import jakarta.persistance.PreUpdate;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TimestampEntity{
     @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    @Prepersist
    LocalDateTime now=LocalDateTime.now();
    public void Oncreate(){
        
        this.createAt=now;
        this.updateAt=now;
    }

    @PreUpdate
    public void Onupdate(){
        this.updateAt=now;
    }
}