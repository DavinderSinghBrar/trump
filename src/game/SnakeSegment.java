package game;

public class SnakeSegment {

	int segmentXCoordinate = 0;
	int segmentYCoordinate = 0;
	
	
	
	
	public SnakeSegment(int segmentXCoordinate, int segmentYCoordinate) {
		super();
		this.segmentXCoordinate = segmentXCoordinate;
		this.segmentYCoordinate = segmentYCoordinate;
	}
	
	
	public int getSegmentXCoordinate() {
		return segmentXCoordinate;
	}
	public void setSegmentXCoordinate(int segmentXCoordinate) {
		this.segmentXCoordinate = segmentXCoordinate;
	}
	public int getSegmentYCoordinate() {
		return segmentYCoordinate;
	}
	public void setSegmentYCoordinate(int segmentYCoordinate) {
		this.segmentYCoordinate = segmentYCoordinate;
	}
	
	
	
}
