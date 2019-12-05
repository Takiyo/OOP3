// RedheadDuck class represents one type of duck
public class RedheadDuck implements Quackable {
	
	// Every quackable has an observable
	Observable observable;

	public RedheadDuck() {
		observable = new Observable(this);
	}

	// Prints quick and notifies subscribed observers.
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}

	public String toString() {
		return "Redhead Duck";
	}
}
