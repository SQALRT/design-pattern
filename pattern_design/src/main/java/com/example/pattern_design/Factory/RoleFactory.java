package com.example.pattern_design.Factory;

import com.example.pattern_design.entity.Heroine;
import com.example.pattern_design.entity.Monk;
import com.example.pattern_design.entity.Nanja;
import com.example.pattern_design.entity.Role;

public class RoleFactory{
    public RoleFactory(){

    }
    public Role CreateRole(String charactername){
        System.out.println(charactername.getClass());
        if(charactername.equals("swordwoman")){
            Heroine heroine = new Heroine();
            return heroine;
        }
        if (charactername.equals("ninja")){
            Nanja nanja = new Nanja();
            return nanja;
        }
        if(charactername.equals("monk")){
            Monk monk = new Monk();
            return monk;
        }
        else{
            
            return null;
        }

    }
}