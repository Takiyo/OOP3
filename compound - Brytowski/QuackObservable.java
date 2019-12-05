// Observable interface that all quackables implement if they want to be observed
public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
