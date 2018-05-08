package game;

import java.awt.Color;
import java.util.ArrayList;
import java.util.WeakHashMap;

public class Snake {
	// make a 2d array, like this: snakeSize = {a: x, y} {b: x,y} {c: x,y} etc, grow
	// the array (or list?) as the snake grows

	private int snakeXCoordinate = 150;
	private int snakeYCoordinate = 160;
	// Color snakeColour = new Color(Color.YELLOW);
	Color snakeColour = Color.BLACK;

	SnakeSegment[] snakeBody = new SnakeSegment[10];

	String snakeDirection = "South";

	Snake() {

		int snakeHeadYCoordinate = snakeYCoordinate;
		for (int i = 0; i < snakeBody.length; i++) {
			snakeHeadYCoordinate -= 10;
			snakeBody[i] = new SnakeSegment(snakeXCoordinate, snakeHeadYCoordinate);
		}
	}

	Snake(int x, int y) {
		this.setSnakeXCoordinate(x);
		this.setSnakeYCoordinate(y);
		int snakeHeadYCoordinate = snakeYCoordinate;
		for (int i = 0; i < snakeBody.length; i++) {
			snakeHeadYCoordinate -= 10;
			snakeBody[i] = new SnakeSegment(snakeXCoordinate, snakeHeadYCoordinate);
		}

		// for (SnakeSegment snakeSegment : snakeBody) {
		//
		// snakeSegment.setSegmentYCoordinate(new SnakeSegment(snakeXCoordinate,
		// snakeHeadYCoordinate));
		// //snakeSegment.setSegmentXCoordinate(snakeXCoordinate);
		// }
	}

	Snake(int x, int y, String direction, Color snakeColour) {
			this.setSnakeXCoordinate(x);
			this.setSnakeYCoordinate(y);
			this.setSnakeDirection(direction);
			this.setSnakeColour(snakeColour);
			int snakeHeadYCoordinate = snakeYCoordinate;
			for (int i = 0; i < snakeBody.length; i++) {
				snakeHeadYCoordinate -= 10;
				snakeBody[i] = new SnakeSegment(snakeXCoordinate, snakeHeadYCoordinate);
			}}

	public void moveSnake() {
		this.moveBody();
		switch (snakeDirection) {
		case "North":
			snakeYCoordinate -= 10;
			break;
		case "East":
			snakeXCoordinate += 10;
			break;
		case "South":
			snakeYCoordinate += 10;
			break;
		case "West":
			snakeXCoordinate -= 10;
			break;
		}
		// System.out.println("moved snake");
	}

	// each segment takes the xy coordinates of the section in front of it.
	public void moveBody() {

		for (int i = snakeBody.length - 1; i > 0; i--) {
			snakeBody[i].setSegmentXCoordinate(snakeBody[i - 1].getSegmentXCoordinate());
			snakeBody[i].setSegmentYCoordinate(snakeBody[i - 1].getSegmentYCoordinate());
		}
		snakeBody[0].setSegmentXCoordinate(snakeXCoordinate);
		snakeBody[0].setSegmentYCoordinate(snakeYCoordinate);
	}

	public void changeDirection(String changeInDirection) {
		if (snakeDirection.equals("North")) {
			if (changeInDirection.equals("Left")) {

				this.setSnakeDirection("West");
			} else if (changeInDirection.equals("Right")) {

				this.setSnakeDirection("East");
			}

		} else if (snakeDirection.equals("East")) {
			if (changeInDirection.equals("Up")) {

				this.setSnakeDirection("North");
			} else if (changeInDirection.equals("Down")) {

				this.setSnakeDirection("South");
			}
		} else if (snakeDirection.equals("South")) {
			if (changeInDirection.equals("Left")) {

				this.setSnakeDirection("West");
			} else if (changeInDirection.equals("Right")) {

				this.setSnakeDirection("East");
			}

		} else if (snakeDirection.equals("West")) {
			if (changeInDirection.equals("Up")) {

				this.setSnakeDirection("North");
			} else if (changeInDirection.equals("Down")) {

				this.setSnakeDirection("South");
			}

		}

	}

	public SnakeSegment[] getSnakeBody() {
		return snakeBody;
	}

	public void setSnakeBody(SnakeSegment[] snakeBody) {
		this.snakeBody = snakeBody;
	}

	public int getSnakeXCoordinate() {
		return snakeXCoordinate;
	}

	public void setSnakeXCoordinate(int snakeXCoordinate) {
		this.snakeXCoordinate = snakeXCoordinate;
	}

	public int getSnakeYCoordinate() {
		return snakeYCoordinate;
	}

	public void setSnakeYCoordinate(int snakeYCoordinate) {
		this.snakeYCoordinate = snakeYCoordinate;
	}

	public String getSnakeDirection() {
		return snakeDirection;
	}

	public void setSnakeDirection(String snakeDirection) {

		this.snakeDirection = snakeDirection;
		System.out.println("snake turned: " + snakeDirection);
	}

	public Color getSnakeColour() {
		return snakeColour;
	}

	public void setSnakeColour(Color snakeColour) {
		this.snakeColour = snakeColour;
	}

}
