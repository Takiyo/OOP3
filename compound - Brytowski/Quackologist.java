// Observes ducks so they need to implement observer interface
public class Quackologist implements Observer {

	// Reports which duck quacked
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}
 
	public String toString() {
		return "Quackologist";
	}
}
