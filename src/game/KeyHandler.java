package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

// Listens for keystrokes and sends the keyEvents to the GameMovementController
//this is a temporary placeholder to demonstrate 4 snakes working independantly.

public class KeyHandler implements KeyListener {
	// Holds the reference to a snake
	Snake snake = null;
	//ArrayList<snake>
	ArrayList<Snake> snakes = null;
	GameLogic gamelogic = null;
	
	KeyHandler(GameLogic newGameLogic){
		this.gamelogic = newGameLogic;
		snake = gamelogic.getSnake();
		snakes = gamelogic.getSnakes();
	}
	

	@Override
	public void keyTyped(KeyEvent e) {


	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		   int key = e.getKeyCode();
		    switch( key ) { 
		        case KeyEvent.VK_UP:
		            //System.out.println("Up");
		       // 	snake.changeDirection("Up");
		            snakes.get(0).changeDirection("Up");
		            break;
		        case KeyEvent.VK_DOWN:
		            // down 
		        	 snakes.get(0).changeDirection("Down");
		            break;
		        case KeyEvent.VK_LEFT:
		            // left
		        //	 snake.changeDirection("Left");
		        	 snakes.get(0).changeDirection("Left");
		            break;
		        case KeyEvent.VK_RIGHT :
		            // right
		        	 snakes.get(0).changeDirection("Right");
		            break;
		            
		            
		            //snake 2 controls
		            
		        case KeyEvent.VK_W:
		            //System.out.println("Up");
		        	 snakes.get(1).changeDirection("Up");
		            break;
		        case KeyEvent.VK_S:
		            // down 
		        	 snakes.get(1).changeDirection("Down");
		            break;
		        case KeyEvent.VK_A:
		            // left
		        	 snakes.get(1).changeDirection("Left");
		            break;
		        case KeyEvent.VK_D :
		            // right
		        	 snakes.get(1).changeDirection("Right");
		            break;
//		            
		            //snake 3 controls
		            
		        case KeyEvent.VK_I:
		            //System.out.println("Up");
		        	 snakes.get(2).changeDirection("Up");
		            break;
		        case KeyEvent.VK_K:
		            // down 
		        	 snakes.get(2).changeDirection("Down");
		            break;
		        case KeyEvent.VK_J:
		            // left
		        	 snakes.get(2).changeDirection("Left");
		            break;
		        case KeyEvent.VK_L :
		            // right
		        	 snakes.get(2).changeDirection("Right");
		            break;
		            
		            //snake 4 controls
		        case KeyEvent.VK_NUMPAD8:
		            //System.out.println("Up");
		        	 snakes.get(3).changeDirection("Up");
		            break;
		        case KeyEvent.VK_NUMPAD5:
		            // down 
		        	 snakes.get(3).changeDirection("Down");
		            break;
		        case KeyEvent.VK_NUMPAD4:
		            // left
		        	 snakes.get(3).changeDirection("Left");
		            break;
		        case KeyEvent.VK_NUMPAD6 :
		            // right
		        	 snakes.get(3).changeDirection("Right");
		            break;
		            
		            
		     }
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}


	public void Update() {
		gamelogic.Update();
	}


	public boolean equals(Object obj) {
		return gamelogic.equals(obj);
	}


	public Snake getSnake() {
		return gamelogic.getSnake();
	}


	public int hashCode() {
		return gamelogic.hashCode();
	}


	public String toString() {
		return gamelogic.toString();
	}


	public ArrayList<Snake> getSnakes() {
		return snakes;
	}


	public void setSnakes(ArrayList<Snake> snakes) {
		this.snakes = snakes;
	}
	
	
}
