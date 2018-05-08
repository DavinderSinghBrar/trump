package game;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Main {

	/**
	 * Some notes on testing:
	 * 
	 * Player1: Arrow keys Red
	 * Player2: WASD Blue
	 * Player3: IJKL Yellow
	 * Player4: 8465 (numpad) Purple
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GameLogic gameLogic = new GameLogic();
		Display display = new Display();
		display.addSnake(gameLogic.getSnake());
		display.setSnakes(gameLogic.getSnakes());
		//KeyHandler keyHandler = new KeyHandler();
		display.addKeyHandler(gameLogic.getKeyHandler());
		
	
//		Rather than have the snake move by 10 or things drawn by 10 pixels, maybe use pixelisation.
//		ie 10X10 or 2X2 to handle that. IE: int granularity = 10;
//		do the logic in a grid array rather than with pixels?

		// display.Run();
		while(true) {
			gameLogic.Update();
			display.render();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
//		gameLogic.Update();
//		display.render();

	}
}
