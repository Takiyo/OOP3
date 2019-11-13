// State representing a gumball machine that had its crank turned and should be about to dispense a gumball.
public class SoldState implements State {
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
    // Doesn't change state.
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
	}
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}
 
    // Releases gumball. Changes state based on gumball count after release.
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
	
    // Has no need to change state.
    public void refill() { }
 
	public String toString() {
		return "dispensing a gumball";
	}
}
