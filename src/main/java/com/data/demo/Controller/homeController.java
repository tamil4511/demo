package com.data.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.data.demo.Database.database;
import com.data.demo.Server.server;




@Controller
public class homeController {

       @Autowired
server serverObj;

public homeController( server serverObj) {
this.serverObj=serverObj;
}




    @GetMapping("/")
	public String hello() {
		return "detials";
	}


    @PostMapping("/login")
    public String loginMethod(@RequestParam String username,@RequestParam String password) {
      
        System.out.println(username + password);
          database  db=new database();
          db.setUsername(username);
          db.setPassword(password);
        serverObj.save(db);
        return "detials";
    }
    

}
