/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Galaga.SpaceObjects;
import java.awt.Image;
import java.awt.Point;

/**
 *
 * @author andrew
 */
public abstract class SpaceObject {
    protected int xpos, ypos;//actual location
    protected Point loc = new Point(xpos, ypos);//actual location in point form
    protected double xspeed, yspeed;//traveling speed
    protected int size; //size of object on the screen
    protected Image objectImage;
  
    public SpaceObject (){
        ypos = 0;
        xpos = 0;
        loc = new Point(xpos, ypos);
        objectImage = null;
    }
    
    /*****************************************************
     * getX()
     * @return returns objects X location
     *****************************************************/
    public int getX() {return xpos;}
    
    /*****************************************************
     * getY()
     * @return returns objects Y location
     *****************************************************/
    public int getY() {return ypos;}
    
    /*****************************************************
     * setX(double x)
     * @param x location
     *****************************************************/
    public void setX(double x) {
        this.xpos = (int) x;
    }
    
    /*****************************************************
     * setY(double y)
     * @param y location
     *****************************************************/
    public void setY(double y) {
        this.ypos = (int) y;
    }
    
    /*****************************************************
     * setLocation(double x, double y)
     * @param x
     * @param y
     *****************************************************/
    public void setLocation(double x, double y) {
        setX(x);
        setY(y);
        loc.setLocation(x, y);
    }
    
    /*****************************************************
     * setLocation(double x, double y)
     * @param p Point object
     *****************************************************/
    public void setLocation(Point p) {
        setX(p.getX());
        setY(p.getY());
        loc = p;
    }
    
    /*****************************************************
     * setXspeed(double speed)
     * @param speed x speed
     *****************************************************/
    public void setXspeed(double speed) {xspeed = speed;}
    
    /*****************************************************
     * setYspeed(double speed)
     * @param speed y speed
     *****************************************************/
    public void setYspeed(double speed) {yspeed = speed;}
    
    
    /*****************************************************
     * setSize()
     * @param object_size
     *****************************************************/
    public void setSize(int object_size) {
        size = object_size;
    }
    
    /*****************************************************
     * size()
     * @return int
     *****************************************************/
    public double size() {
        return size;
    }
    
    /*****************************************************
     * setImage(Image image)
     * @param image
     *****************************************************/
    public void setImage(Image image) {objectImage = image;}
    
    /*****************************************************
     * getImage()
     * @return image
     *****************************************************/
    public Image getImage() {return objectImage;}
    /*
    public double getDistance(Point p) {
        return Math.sqrt((p.x - xposi) * (p.x - xposi) + (p.y - yposi) * (p.y - yposi));
    }
    public double getDistance(int x, int y) {
        return Math.sqrt((x - xposi) * (x - xposi) + (y - yposi) * (y - yposi));
    }
    public boolean collide(Ship other) {
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
    }
    public int health() {
        return health;
    }
    */
    /*
    public void setWeapon(int w) {
        welp = new Weapon (w);
    }
    public int getWeapon() {
        return welp.serialnum();
    }

    public void act() {
        move ();
    }
    
    public void move() {
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
        loc.setLocation(xpos, ypos);
    }
*/
    
//    public ArrayList<Dot> fire() {return welp.fire(xposi, yposi);}
    
//    public void left(boolean l) {left = l;}
//    public void right(boolean r) {right = r;}
//    public void forward(boolean f) {forward = f;}
//    public void backward(boolean b) {backward = b;}
//    public void setHealth(int h) {health = h;}
//    public void draw() {
//        page.drawImage(ship, (int) (xpos - size/2), (int) (ypos - size/2), (int) size, (int) size, null);
//    }
//    public void draw(Graphics g){
//        g.drawImage(ship, (int) (xpos - size/2), (int) (ypos - size/2), (int) size, (int) size, null);
//    }
//    public void explode() {
//        for (double x1 : x) {
//            x1 = 1.04 * x1;
//        }
//        int[] xx = new int[x.length];
//        for (int i = 0; i < x.length; i++) {
//            xx[i] = (int) x[i];
//        }
//        int[] yy = new int[y.length];
//        page.fillPolygon(null);
//    }
}
