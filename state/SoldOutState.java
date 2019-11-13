// State representing a gumball machine with no gumballs in it.
public class SoldOutState implements State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    // These methods won't change the state because there are no gumballs left.
	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out");
	}
	public void ejectQuarter() {
		System.out.println("You can't eject, you haven't inserted a quarter yet");
	}
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
	}
	public void dispense() {
		System.out.println("No gumball dispensed");
	}
    
    // The actual refilling is done in GumballMachine, this will change state to the default no quarter filled state.
	public void refill() { 
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public String toString() {
		return "sold out";
	}
}
