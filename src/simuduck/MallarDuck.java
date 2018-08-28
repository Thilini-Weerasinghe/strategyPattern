/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuduck;

import Fly.FlyNoWay;
import Quack.Quack;

/**
 *
 * @author Kasuni Gaveshika
 */
public class MallarDuck extends Duck{
    public MallarDuck(){
     flybehavior = new FlyNoWay();
     quackbehavior = new Quack();
   }
 public void display(){
     System.out.println("I am MALLAR duck");
 }   
}
