// Abstract class that caffinated beverages inherit from.
// "Hooks" in to higher level classes.
public abstract class CaffeineBeverageWithHook {
    
    // Encapsulated algorithm that every caffinated beverage can utilise.
    // Includes a way for a high level component to determine if condiments are needed.
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
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
    
    // Defines default behavior, but is overwritable. We do this with user input.
	boolean customerWantsCondiments() {
		return true;
	}
}
