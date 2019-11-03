import java.util.Iterator;

// A singular component that won't have children elements, unlike MenuItem.
// Despite this, they both extend MenuComponent so that iteration can be uniform.
public class MenuItem extends MenuComponent {
 
	String name;
	String description;
	boolean vegetarian;
	double price;
    
	public MenuItem(String name, 
	                String description, 
	                boolean vegetarian, 
	                double price) 
	{ 
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
  
	// Get properties just return passed in values.
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public double getPrice() {
		return price;
	}

	// To signify if an item is vegetarian, only applicable to menu items and not
	// all menu components, because a component could be a menu itself.
	public boolean isVegetarian() {
		return vegetarian;
	}

	// Returns nulliterator because this component will not have child elements.
	public Iterator<MenuComponent> createIterator() {
		return new NullIterator();
	}
 
	public void print() {
		System.out.print("  " + getName());
		if (isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.println(", " + getPrice());
		System.out.println("     -- " + getDescription());
	}

}

