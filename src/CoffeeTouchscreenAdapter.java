
public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
	
	OldCoffeeMachine coffeeMachine;
	
	public CoffeeTouchscreenAdapter(OldCoffeeMachine coffeeMachine) {
		this.coffeeMachine = coffeeMachine;
	}
	
	public boolean chooseFirstSelection() {
		return coffeeMachine.selectA();
	}
	
	public boolean chooseSecondSelection() {
		return coffeeMachine.selectB();
	}

}
