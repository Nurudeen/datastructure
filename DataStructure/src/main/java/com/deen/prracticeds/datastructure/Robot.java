/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deen.prracticeds.datastructure;

/**
 *
 * @author n-yusuf
 */
public class Robot {
    
      String name ;
    String color ;
    int weight ;
    
    
    public Robot(){
        
    }
    
    public Robot(String name , String color , int weight){
        
        this.name = name ;
        this.color  = color ;
        this.weight = weight ;
        
    }
    
    public void introduceSelf(){
        
        System.out.println("My name is " + name);
    }
    
    public static void main(String[] args) {
   
        Robot robot = new Robot("Yellow Robot","Yellow",30);
        
        robot.introduceSelf();
        
}
    
}
