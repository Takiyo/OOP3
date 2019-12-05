// Adapter meant to adapt geese in to quackables
public class GooseAdapter implements Quackable {
	Goose goose;

	// Every quackable has an observable
	Observable observable;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
		observable = new Observable(this);
	}
 
    // Calls goose's honk method, meant to be a parallel to quack
    // Subscribed observers will be notified
	public void quack() {
		goose.honk();
		notifyObservers();
	}

    // Registers observer to be notified when goose "quacks"
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}

	public String toString() {
		return "Goose pretending to be a Duck";
	}
}
