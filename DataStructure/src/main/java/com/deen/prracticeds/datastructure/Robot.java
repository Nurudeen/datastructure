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
   
        Robot robot = new Robot("Tom","Yellow",30);
        
        Robot robot2 = new Robot("Jerry","Yellow",50);
        
        Person person1 = new Person("Alice","aggresive",false);
        Person person2 = new Person("Becky","talkative",true);
        
        robot.introduceSelf();
        robot2.introduceSelf();
        
        person1.robotOwned = robot ;
        person2.robotOwned = robot2 ;
        
        person1.robotOwned.introduceSelf();
        person2.robotOwned.introduceSelf();
        
}
    
}


class Person {
    
    String name ;
    String personality ;
    boolean isSitting ;
    Robot robotOwned ;
    
    public Person(String n , String p , boolean i){
        this.name = n;
        this.personality = p ;
        this.isSitting = i ;
    }
    
    void sitDown(){
        this.isSitting = true ;
        
    }
    void standUp(){
        this.isSitting = false ;
    }
    
}
