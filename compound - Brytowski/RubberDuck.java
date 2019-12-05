// RubberDuck class represents one type of duck
public class RubberDuck implements Quackable {
	
	// Every quackable has an observable
	Observable observable;

	public RubberDuck() {
		observable = new Observable(this);
	}
	
	// Prints quick and notifies subscribed observers.
	public void quack() {
		System.out.println("Squeak");
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}
  
	public String toString() {
		return "Rubber Duck";
	}
}
