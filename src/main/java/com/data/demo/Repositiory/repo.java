package com.data.demo.Repositiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.demo.Database.database;

public interface repo extends JpaRepository<database, Long> {

}
