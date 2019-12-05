import java.util.Iterator;
import java.util.ArrayList;

// Class that represents an observable object
public class Observable implements QuackObservable {
	ArrayList<Observer> observers = new ArrayList<Observer>();
	QuackObservable duck;
 
	public Observable(QuackObservable duck) {
		this.duck = duck;
	}
	
	// Subscribes observer to be
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
  
	// Iterates over observers and subscribes each to be notified
	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(duck);
		}
	}
 
	// Getter property that returns observers
	public Iterator<Observer> getObservers() {
		return observers.iterator();
	}
}
