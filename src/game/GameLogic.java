package game;

import java.awt.Color;
import java.util.ArrayList;

public class GameLogic {
	Snake snake1 = new Snake();
	Snake snake2 = new Snake();
	KeyHandler keyhandler = new KeyHandler(this);
	ArrayList<Snake> snakes = new ArrayList<Snake>();

	GameLogic() {
		// Snake snake1 = new Snake();
	//	snake2.setSnakeXCoordinate(snake2.getSnakeXCoordinate()- 50);
		
		
		snakes.add(new Snake(150, 150, "South", Color.RED));
		snakes.add(new Snake(450 , 150, "South", Color.BLUE));
		snakes.add(new Snake(150 ,450, "North", Color.YELLOW));
		snakes.add(new Snake(450,450, "North", Color.magenta));
		
		keyhandler.setSnakes(snakes);
	}

	public void Update() {
		//snake1.moveSnake();
		
		 for (Snake snake : snakes) {
			snake.moveSnake();
		}
		// System.out.println("updating game");
	}

	public Snake getSnake() {
		return snake1;
	}

	public KeyHandler getKeyHandler() {
		return keyhandler;
	}

	public ArrayList<Snake> getSnakes() {
		return snakes;
	}

	public void setSnakes(ArrayList<Snake> snakes) {
		this.snakes = snakes;
	}

	
}
