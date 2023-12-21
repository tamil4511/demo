package com.data.demo.Server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.demo.Database.database;
import com.data.demo.Repositiory.repo;

@Service
public class server {
   @Autowired
   repo RepoObj;
   
    public void save(database db) {
        RepoObj.save(db);

    }

    
    
}
