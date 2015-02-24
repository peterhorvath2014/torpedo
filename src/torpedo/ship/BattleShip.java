package torpedo.ship;

import java.util.List;

public abstract class BattleShip {
	
	protected int maskWidth;
	protected int maskHeight;
	protected int maskLeftUpY;
	protected int maskLeftUpX;
	
	protected List<ShipCellStatus>[][] shipMask;
	
	public abstract BulletEffect checkHit(int y, int x);
	
	protected abstract boolean isHitTheMask(int y, int x);

}
