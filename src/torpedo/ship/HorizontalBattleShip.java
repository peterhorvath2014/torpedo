package torpedo.ship;

public class HorizontalBattleShip extends BattleShip {

	@Override
	public BulletEffect checkHit(int y, int x) {
		BulletEffect effect = BulletEffect.MISSED;
		boolean isThereIntact = false;

		if (isHitTheMask(y, x)) {
			effect = BulletEffect.HIT;
			for (int xPos = 0; xPos < maskWidth; xPos++) {
				// if()
			}
		}

		return effect;
	}

	@Override
	protected boolean isHitTheMask(int y, int x) {
		return (y == maskLeftUpY && x >= maskLeftUpX && x < maskLeftUpX
				+ maskWidth);
	}

}
