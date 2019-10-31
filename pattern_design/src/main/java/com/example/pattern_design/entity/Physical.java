package com.example.pattern_design.entity;
public abstract class Physical implements Attack{
    private String attackWay = "物理攻击";
    public String getWay(){
        return attackWay;
    }
    public abstract void attack();
}