import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SelectionTest {

	@Test
	void test() {
		OldCoffeeMachine bigDrink = new OldCoffeeMachine();
		CoffeeTouchscreenAdapter newDrink = new CoffeeTouchscreenAdapter(bigDrink);
		
		assertEquals(true, newDrink.chooseFirstSelection());
		assertEquals(true, newDrink.chooseSecondSelection());
	}

}
