//Every observer will implement this interface. Parameters in "update" method
//determine what values the observers get from the subject.
public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
