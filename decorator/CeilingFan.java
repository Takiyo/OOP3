// One of several objects to be manipulated by remote.
// Mostly prints output to console to simulate an object.
public class CeilingFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	String location;
	int speed;
 
	public CeilingFan(String location) {
		this.location = location;
	}
  
	public void high() {
		speed = HIGH;
		System.out.println(location + " ceiling fan is on high");
	} 

	public void medium() {
		speed = MEDIUM;
		System.out.println(location + " ceiling fan is on medium");
	}

	public void low() {
		speed = LOW;
		System.out.println(location + " ceiling fan is on low");
	}
    
    // No on() method due to high/med/low being considered on.
	public void off() {
		speed = OFF;
		System.out.println(location + " ceiling fan is off");
	}
 
	public int getSpeed() {
		return speed;
	}
}
