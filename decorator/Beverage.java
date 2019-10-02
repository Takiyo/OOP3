// Beverage that several specific beverage types will inherit.
public abstract class Beverage {
	// If this string gets printed there's a problem.
	String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
