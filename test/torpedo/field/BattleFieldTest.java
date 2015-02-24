package torpedo.field;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BattleFieldTest {

	private static final int FIELD_SIDE_LENGTH = 10;
	private static final int SHIP_NUM = 3;
	
	BattleField underTest;
	
	@BeforeMethod
	public void init(){
		underTest = new BattleField(FIELD_SIDE_LENGTH);
	}
	
	@Test
	public void testShootShouldReturnFalse(){
		boolean result = underTest.shoot(1, 1);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testIsFieldEmptyShouldReturnTrue(){
		boolean result = underTest.isFieldEmpty();
		Assert.assertTrue(result);
	}
	
	@Test
	public void testIsFieldEmptyShouldReturnFalse(){
		underTest.initBattleField(SHIP_NUM);
		boolean result = underTest.isFieldEmpty();
		Assert.assertFalse(result);
	}
}
