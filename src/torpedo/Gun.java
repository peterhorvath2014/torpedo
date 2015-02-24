package torpedo;

public class Gun {
	private BattleField targetBattleField;
	
	public Gun(BattleField targetBattleField){
		this.targetBattleField = targetBattleField;
	}
	
	public boolean attack(int y, int x){
		return targetBattleField.shoot(y, x);
	}

}
