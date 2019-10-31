package com.example.pattern_design.entity;

import javax.persistence.Entity;

@Entity
public class Heroine extends Role{
    private Integer life_value = 100;
    private Integer magic_value = 100;
    private String description="是一个侠女";

    public Integer getLife_value() {
        return life_value;
    }

    public void setLife_value(Integer life_value) {
        this.life_value = life_value;
    }

    public Integer getMagic_value() {
        return magic_value;
    }

    public void setMagic_value(Integer magic_value) {
        this.magic_value = magic_value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}