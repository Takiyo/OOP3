// State representing a gumball machine that is about to dispense two gumballs.
public class WinnerState implements State {
    GumballMachine gumballMachine;
 
    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    // No need to change states.
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a Gumball");
	}
	public void ejectQuarter() {
		System.out.println("Please wait, we're already giving you a Gumball");
	}
	public void turnCrank() {
		System.out.println("Turning again doesn't get you another gumball!");
	}
 
    // Releases two gumballs for your one quarter, unless the machine is out.
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			System.out.println("YOU'RE A WINNER! You got two gumballs for your quarter");
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
            	System.out.println("Oops, out of gumballs!");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}
 
    // No need to change state.
	public void refill() { }
	
	public String toString() {
		return "despensing two gumballs for your quarter, because YOU'RE A WINNER!";
	}
}
