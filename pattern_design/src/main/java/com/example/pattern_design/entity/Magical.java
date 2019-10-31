package com.example.pattern_design.entity;
public abstract class Magical implements Attack{
    private String attackWay = "魔法攻击";
    public String getWay(){
        return attackWay;
    }
    public abstract void attack();
}