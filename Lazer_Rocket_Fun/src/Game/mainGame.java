/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Galaga.SpaceObjects.AlienShip;
import Galaga.SpaceObjects.SpaceObject;
import Galaga.SpaceObjects.SpaceShip;
import java.applet.Applet;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.net.URL;
import javax.swing.JApplet;

public class mainGame extends Applet {
	
	SpaceArena _SpaceArena;

	/**
	 * main() simply creates an instance of the Game class and calls its run() function.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
            
        	// It all starts here.
		new mainGame().run();
	}
	/**
    * Launches the game.
    */
	public void run()
	{
                            // Create our initial batch of creatures
		List<SpaceObject> Ships = new ArrayList();
		//Image Alien_ship_image;
                                
		// Add some rocks(s) to the world
		for(int i = 0; i < 5; i++) {
			AlienShip A = new AlienShip();
                        A.setLocation(i * 70 + 50, i * 70);
                        //A.setImage(Alien_ship_image);
			Ships.add(A);
		}


		// Create the world
		_SpaceArena = new SpaceArena(Ships);
	}
	

}