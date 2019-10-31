package com.example.pattern_design.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;


@Entity
public abstract class Role{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private Integer life_value;
    private Integer magic_value;
    private String description;
    @Transient
    private Attack attack;

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

    public Attack getAttack() {
        return attack;
    }

    public void setAttack(Attack attack) {
        this.attack = attack;
    }
    
}