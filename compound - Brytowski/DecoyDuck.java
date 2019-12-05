// Decoy duck class represents one type of duck
public class DecoyDuck implements Quackable {
	
	// Every quackable has an observable
	Observable observable;

	public DecoyDuck() {
		observable = new Observable(this);
	}

 	// Prints quick and notifies subscribed observers.
	public void quack() {
		System.out.println("<< Silence >>");
		notifyObservers();
	}
 
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}
 
	public String toString() {
		return "Decoy Duck";
	}
}
