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
public class RedHeadDuck extends Duck{
        public RedHeadDuck(){
     flybehavior = new FlyWithWings();
     quackbehavior = new Squeak();
   }
 public void display(){
     System.out.println("I am RedHeadDuck duck");
 }   
}
