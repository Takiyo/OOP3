import java.util.Random;

// State representing a gumball machine with a quarter in it.
public class HasQuarterState implements State {
	Random randomWinner = new Random(System.currentTimeMillis());
	GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}
 
    // Quarter is in slot so it can be ejected.
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
    // Quarter is in slot so crank can be turned.
	public void turnCrank() {
		System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        // If winner gumball is next and machine still has gumballs, change state.
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}
    
    // Only in HasQuarterState when the crank has yet to be turned.
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
    
    // Has no need to change state.
    public void refill() { }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
