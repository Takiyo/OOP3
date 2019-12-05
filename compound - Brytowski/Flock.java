import java.util.Iterator;
import java.util.ArrayList;

// Class that composes array of quackables and iterates through them to do certain things
public class Flock implements Quackable {
	ArrayList<Quackable> quackers = new ArrayList<Quackable>();
  
	// Adds to array list of quackables
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}

	// Iterate through flock and quack on each element
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = iterator.next(); 
			quacker.quack();
		}
	}
   
	// Iterate through flock and subscribe each as an observer
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.registerObserver(observer);
		}
	}
  
	public void notifyObservers() { }
  
	public String toString() {
		return "Flock of Ducks";
	}
}
