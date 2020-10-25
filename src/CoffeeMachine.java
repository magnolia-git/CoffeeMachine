
public class CoffeeMachine {

	public static void main(String[] args) {
		OldCoffeeMachine bigDrink = new OldCoffeeMachine();
		CoffeeTouchscreenAdapter newDrink = new CoffeeTouchscreenAdapter(bigDrink);
		
		newDrink.chooseFirstSelection();
		newDrink.chooseSecondSelection();

	}

}
