package torpedo;

import java.util.Random;

public class BattleShipGame {

	public static void main(String[] args) {
		int battleFieldSideLength = 20;
		Random random = new Random();
		BattleField battleField = new BattleField(battleFieldSideLength);
		battleField.initBattleField(10);
		Gun gun = new Gun(battleField);
		int attackNumber = 0;
		while(!battleField.isFieldEmpty()){
			int y = random.nextInt(battleFieldSideLength);
			int x = random.nextInt(battleFieldSideLength);
			gun.attack(y, x);
			attackNumber++;
			System.out.println(battleField.getShipNum() + " ships left!");
		}
		System.out.println("Attack number: " + attackNumber);

	}

}
