/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuduck;

import Fly.FlyWithWings;

/**
 *
 * @author Kasuni Gaveshika
 */
public class SimuDuck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Duck md[] = new Duck[4];
        md[0] = new MallarDuck();
        md[1] = new RedHeadDuck();
        md[2] = new RubberDuck();
        md[3] = new DecoyDuck();

        for (int i = 0; i < 4; i++) {
            md[i].display();
            md[i].performFly();
            md[i].performQuack();
            md[i].swim();
            System.out.println("");
            System.out.println("********************************");
        }

//       md.setFlybehavior(new FlyWithWings());
//      md.performFly();
//      md.performQuack();
//      md.swim();
//      md.display();
    }

}
