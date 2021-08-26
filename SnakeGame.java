//https://www.youtube.com/watch?v=bI6e6qjJ8JQ&ab_channel=BroCode
package snake;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

//TODO
//add menu for options,new game,scores,exit
//add restart by R
//add difficulty(in options)
//add image to apple(maybe snake too)
//add sound
//add random spawning blocks that ends the game(can be chosen in settings)
//wall settings problem, wall spawns but does not shown in the app

public class SnakeGame {

	public static void main(String[] args) {
		Menu m = new Menu();
		m.SetUpGUI();
	}
}
