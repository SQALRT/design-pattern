package com.example.pattern_design.Controller;

import java.util.HashMap;
import java.util.Map;

import com.example.pattern_design.Dao.RoleDao;
import com.example.pattern_design.Dao.UserDao;
import com.example.pattern_design.Factory.RoleFactory;
import com.example.pattern_design.entity.Role;
import com.example.pattern_design.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
@Controller
public class RoleController{
    @Autowired
    private RoleDao roledao;
    @Autowired
    private UserDao userdao;
    private User user;
    @ResponseBody
    @PostMapping("/log")
	public Map getrole(String username){
		User user = userdao.findByUsername(username);
		if (user!=null){
            this.user = user;
            Map<String, String> hashMap = new HashMap<String, String>(){
                {
                put("status", "ok");
                }            
    };
			return hashMap;
		}
		else{
            Map<String, String> hashMap = new HashMap<String, String>();
			return hashMap;
		}
    }
    @RequestMapping("/play")
    public String getmain(){
        return "play";
    }


    @ResponseBody
    @PostMapping("/user")
	public String addDriver(String  name,String characterName)
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