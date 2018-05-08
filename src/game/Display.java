package game;

import java.awt.Canvas;
import java.awt.Color;
//import java.awt.Frame;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

//This class handles all of the display side of things.
public class Display {
	int width = 600;
	int height = 600;
	JFrame frame = new JFrame();
	Canvas canvas = new Canvas();
	BufferStrategy strategy = null;
	Graphics graphics = null;
	int[][] gameBoard = new int[60][60];

	static Color boardColourBlue = new Color(35, 145, 6);
	static Color boardColourGreen = new Color(59, 183, 52);
	static Color snakeColourRed = new Color(195, 29, 33);
	static Color foodColourOranger = new Color(226, 134, 64);

	Snake snake = null;
	
	ArrayList<Snake> snakes = null;

	Display() {

		// frame.setSize(width, height);
		canvas.setSize(width, height);

		frame.add(canvas);
		frame.pack();
		frame.setVisible(true);

		canvas.createBufferStrategy(3);
		strategy = canvas.getBufferStrategy();

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void addSnake(Snake newSnake) {
		this.setSnake(newSnake);
	}

	public void render() {

		graphics = strategy.getDrawGraphics();
		canvas.paint(graphics);

		PaintCheckerBoard();
		paintSnakes();
		// paint snake
		// paint food
		strategy.show();
		// try {
		// Thread.sleep(100);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

	}

	public void addKeyHandler(KeyHandler newKeyHandler) {
		frame.addKeyListener(newKeyHandler);
	}

	public void paintSnakes() {
		
		 for (Snake snakeInstance : snakes) {
			this.paintSnake(snakeInstance);
		}
		
	}
	
	//maybe make a "paint snakes" method that calls paint snake for every snake?
	public void paintSnake(Snake thisSnake) {
		graphics.setColor(snakeColourRed);
		graphics.setColor(thisSnake.getSnakeColour());
		// graphics.fillRect(100, 100, 10, 10);
	//	graphics.fillRect(snake.getSnakeXCoordinate(), snake.getSnakeYCoordinate(), 10, 10);
		
		//have an array in snake, the snake can be a multi dimensional array with certain segments set on or off.
		
		//for each segment in snakeArray
		graphics.fillRect(thisSnake.getSnakeXCoordinate(), thisSnake.getSnakeYCoordinate(), 10, 10);
		
		 for (SnakeSegment segment : thisSnake.getSnakeBody()) {
			graphics.fillRect(segment.getSegmentXCoordinate(), segment.getSegmentYCoordinate(), 10, 10);
		}
	}

	// this paints the red yellow checker board
	public void PaintCheckerBoard() {
		// graphics = strategy.getDrawGraphics();
		// canvas.paint(graphics);

		int paintBrushY = 0;
		int paintBrushX = 0;

		graphics.setColor(boardColourBlue);

		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard[i].length; j++) {

				switchColour(graphics);

				graphics.fillRect(paintBrushX, paintBrushY, 10, 10);
				paintBrushY += 10;

			}
			paintBrushX += 10;
			paintBrushY = 0;
			switchColour(graphics);
		}

		// strategy.show();
	}

	public static void switchColour(Graphics graph) {
		if (graph.getColor().equals(boardColourBlue)) {
			graph.setColor(boardColourGreen);
		} else {
			graph.setColor(boardColourBlue);
		}
	}

	public Snake getSnake() {
		return snake;
	}

	public void setSnake(Snake snake) {
		this.snake = snake;
	}

	public ArrayList<Snake> getSnakes() {
		return snakes;
	}

	public void setSnakes(ArrayList<Snake> snakes) {
		this.snakes = snakes;
	};
	
	

}
