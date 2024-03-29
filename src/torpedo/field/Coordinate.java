package torpedo.field;

public class Coordinate {
	private int x, y = 0;

	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public boolean validateCoordinates(int sideLength) {
		return (y < sideLength && y >= 0 && x < sideLength && x >= 0);
	}
}
