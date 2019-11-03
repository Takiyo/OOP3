// Abstract class that caffinated beverages inherit from.
public abstract class CaffeineBeverage {
  
	// Encapsulated algorithm that every caffinated beverage can utilise.
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	// Subclasses will override these.
	abstract void brew();
	abstract void addCondiments();
 
	// These methods don't need to be overwritten, default behavior is defined here.
	void boilWater() {
		System.out.println("Boiling water");
	}
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
