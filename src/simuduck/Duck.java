/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuduck;

import Fly.*;
import Quack.*;

/**
 *
 * @author Kasuni Gaveshika
 */
public abstract class Duck {
    FlyBehavior flybehavior;
    QuackBehavior quackbehavior;
    
    public abstract void display();
    public void swim(){
        System.out.println("swim");
    }
    public void performFly(){
    flybehavior.fly();
    }
    public void performQuack(){
    quackbehavior.quack();
    }
    public void setQuackbehavior(QuackBehavior qb){
     quackbehavior=qb;
    }
    public void setFlybehavior(FlyBehavior fb){
     flybehavior=fb;
    }
}
