package torpedo.field;

public class BattleField {

	private final static int SIDE_LENGTH = 10;

	private boolean[][] battleFieldStorage;

	public BattleField() {
		battleFieldStorage = new boolean[SIDE_LENGTH][SIDE_LENGTH];
		initBattleField();
	}

	public void initBattleField() {
		for (int i = 0; i < SIDE_LENGTH; i++) {
			for (int j = 0; j < SIDE_LENGTH; j++) {
				battleFieldStorage[i][j] = false;
			}
		}
	}

	public boolean shoot(Coordinate coordinate) {
		boolean shipHit = false;
		if (coordinate.validateCoordinates(SIDE_LENGTH)) {
			//TODO
		}
		return shipHit;
	}

}
