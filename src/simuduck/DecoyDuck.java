/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuduck;

import Fly.*;
//import Fly.FlyWithWings;
import Quack.*;

/**
 *
 * @author Kasuni Gaveshika
 */
public class DecoyDuck extends Duck{
      public DecoyDuck(){
     flybehavior = new FlyWithWings();
     quackbehavior = new Quack();
   }
 public void display(){
     System.out.println("I am Decoy duck");
 }   
}
