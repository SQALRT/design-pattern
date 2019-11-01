package com.example.pattern_design.Factory;

import com.example.pattern_design.entity.Heroine;
import com.example.pattern_design.entity.Monk;
import com.example.pattern_design.entity.Nanja;
import com.example.pattern_design.entity.Role;

public class RoleFactory{
    public Role CreateRole(String charactername){
        if(charactername =="swordwoman"){
            Heroine heroine = new Heroine();
            return heroine;
        }
        else if (charactername == "ninja"){
            Nanja nanja = new Nanja();
            return nanja;
        }
        else{
            Monk monk = new Monk();
            return monk;
        }
    }
}