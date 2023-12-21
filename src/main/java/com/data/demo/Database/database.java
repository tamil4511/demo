package com.data.demo.Database;

import org.springframework.stereotype.Component;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="userDetails")
@Component
public class database {
    
      @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String username;
    String password;
}
