// Class counting quacks that will decorate a duck/quackable
// To be used in CountingDuckFactory
public class QuackCounter implements Quackable {
    
    // May be goose adapter as well as duck
	Quackable duck;
	static int numberOfQuacks;
  
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
  
    // Delegates the quack to the quackable being decorated
    // Increments counter
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
 
    // Getter property
	public static int getQuacks() {
		return numberOfQuacks;
	}
 
    // Adds observer to be automatically notified when notifyObservers called
	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
	}
 
	public void notifyObservers() {
		duck.notifyObservers();
	}
   
    // Delegates to quackable's toString
	public String toString() {
		return duck.toString();
	}
}
