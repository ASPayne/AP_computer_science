/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Galaga.SpaceObjects;

import Galaga.SpaceObjects.interfaces.moveable;
import Galaga.SpaceObjects.interfaces.paintable;
import java.util.Random;

/**
 *
 * @author andrew
 */
public class AlienShip extends SpaceShip implements paintable, moveable {

    
    public AlienShip() {
    Random rand = new Random();
    this.setXspeed(rand.nextInt(20) - 10);
    this.setYspeed(rand.nextInt(20) - 10);
    }
    
    @Override
    public void draw() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void move() {
    this.setLocation(xpos + xspeed, ypos + yspeed);
    if (xpos > 600) {xpos -= 600;}
    if (ypos > 600) {ypos -= 600;}
    if (xpos <   0) {xpos += 600;}
    if (ypos <   0) {ypos += 600;}
    }
    
}
