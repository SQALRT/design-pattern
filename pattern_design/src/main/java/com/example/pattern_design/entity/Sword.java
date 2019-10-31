package com.example.pattern_design.entity;
public class Sword extends Physical{
    private Integer damage = 0;
    private Integer use_blue = 0;
    public void attack(){
        System.out.println("在使用剑攻击");
    }
}