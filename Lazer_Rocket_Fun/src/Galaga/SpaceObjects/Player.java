package Galaga.SpaceObjects;

import Galaga.Characters.*;
import Galaga.SpaceObjects.interfaces.moveable;
import Galaga.SpaceObjects.interfaces.paintable;
import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;


public class Player extends SpaceShip implements moveable, paintable {

    private boolean left = false, right = false, forward = false, backward = false;
    public int lives;

      
    public Player (){
        lives = 3;
        health = 3;
        //welp = new Weapon(Weapon.WEAPON_GOD);
    }
    /*
    public double getDistance(Point p) {
        return Math.sqrt((p.x - xposi) * (p.x - xposi) + (p.y - yposi) * (p.y - yposi));
    }
    public double getDistance(int x, int y) {
        return Math.sqrt((x - xposi) * (x - xposi) + (y - yposi) * (y - yposi));
    }
    */
    
    /*
    public boolean collide(Player other) {
        if (getDistance(other.getX(), other.getY()) < other.size() / 2 + this.size() / 2) {
            other.health -= 10;
            health -= 10;
            return true;
        }
        return false;
    }
    public boolean collide(Dot other) {
        if (getDistance(other.getX(), other.getY()) < other.size() / 2 + this.size() / 2) {
            health--;
            return true;
        }
        return false;
    }*/
    public int health() {
        return health;
    }
   /* 
    public void setWeapon(int w) {
        welp = new Weapon (w);
    }
    public int getWeapon() {
        return welp.serialnum();
    }
*/
    
    @Override
    public void move() {
        /*
        if (left) {
            xposi -= xspeed;
        }
        if (right) {
            xposi += xspeed;
        }
        if (forward) {
            yposi -= yspeed;
        }
        if (backward) {
            yposi += yspeed;
        }

//        xposi = xposi + xspeed;
//        yposi+=yspeed;
        if (yposi > 512 - 40) {
            yposi = 512 - 40;
        }
        if (xposi > 512 - 24) {
            xposi = 512 - 24;
        }
        if (yposi < 24) {
            yposi = 24;
        }
        if (xposi < 24) {
            xposi = 24;
        }
        xpos = (int) (xposi);
        ypos = (int) (yposi);
        loc.setLocation(xpos, ypos);*/
    }
    //public ArrayList<Dot> fire() {return welp.fire(xposi, yposi);}
    
    public void left(boolean l) {left = l;}
    public void right(boolean r) {right = r;}
    public void forward(boolean f) {forward = f;}
    public void backward(boolean b) {backward = b;}
    
    
    public void draw() {
 //       page.drawImage(ship, (int) (xpos - size/2), (int) (ypos - size/2), (int) size, (int) size, null);
    }
   // public void draw(Graphics g){
    //    g.drawImage(ship, (int) (xpos - size/2), (int) (ypos - size/2), (int) size, (int) size, null);
    //}
    /*
    public void explode() {
        for (double x1 : x) {
            x1 = 1.04 * x1;
        }
        int[] xx = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            xx[i] = (int) x[i];
        }
        int[] yy = new int[y.length];
        page.fillPolygon(null);
    }*/
}
