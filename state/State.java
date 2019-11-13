// Interface representing a state the gumball machine can be in.
// Each state will use these methods a little differently.
public interface State {
 
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
	
	public void refill();
}
