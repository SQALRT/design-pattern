package com.example.pattern_design.Controller;
import javax.jws.soap.SOAPBinding.Use;
import javax.servlet.http.HttpServletResponse;

import com.example.pattern_design.Dao.RoleDao;
import com.example.pattern_design.Dao.UserDao;
import com.example.pattern_design.Factory.RoleFactory;
import com.example.pattern_design.entity.Role;
import com.example.pattern_design.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController{
    @Autowired
    private RoleDao roledao;
    @Autowired
    private UserDao userdao;
    private User user;
    @PostMapping("/log")
	public String getrole(String username){
		User user = userdao.findByUsername(username);
		if (user!=null){
			this.user = user;
			return "ok";
		}
		else{
			return "false";
		}
    }
    @PostMapping("/user")
	public String addDriver(String name,String characterName)
	{
        RoleFactory roleFactory = new RoleFactory();
        Role role = roleFactory.CreateRole(characterName);
        User user= new User(name,role);
        System.out.println(role.getDescription());
        System.out.println(user.getUsername());
        userdao.save(user);
        roledao.save(role);
        return "ok";
	}
    
}