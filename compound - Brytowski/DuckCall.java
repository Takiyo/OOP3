// DuckCall class represents one type of duck
public class DuckCall implements Quackable {
	
	// Every quackable has an observable
	Observable observable;

	public DuckCall() {
		observable = new Observable(this);
	}
 
	// Prints quick and notifies subscribed observers.
	public void quack() {
		System.out.println("Kwak");
		notifyObservers();
	}
 
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}
 
	public String toString() {
		return "Duck Call";
	}
}
