package torpedo;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GunTest {

	@Mock
	BattleField battleField;
	
	Gun underTest;
	
	@BeforeMethod
	public void init(){
		MockitoAnnotations.initMocks(this);
		underTest = new Gun(battleField);
	}
	
	@Test
	public void testAttack(){
		Mockito.when(battleField.shoot(1, 1)).thenReturn(true);
		boolean result = underTest.attack(1, 1);
		Assert.assertTrue(result);
	}
}
