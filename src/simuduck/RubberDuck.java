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
public class RubberDuck extends Duck{
      public RubberDuck(){
     flybehavior = new FlyNoWay();
     quackbehavior = new MuteQuack();
   }
 public void display(){
     System.out.println("I am RubberDuck duck");
 }   
    
}
