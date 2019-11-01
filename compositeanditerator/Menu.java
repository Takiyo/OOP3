import java.util.Iterator;
import java.util.ArrayList;

// A composite component that will have children elements, unlike MenuItem.
// Despite this, they both extend MenuComponent so that iteration can be uniform.
public class Menu extends MenuComponent {
	Iterator<MenuComponent> iterator = null;
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	String description;
  
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
 
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
 
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
 
	public MenuComponent getChild(int i) {
		return menuComponents.get(i);
	}
 
	public String getName() {
		return name;
	}
 
	public String getDescription() {
		return description;
	}

  
	public Iterator<MenuComponent> createIterator() {
		if (iterator == null) {
			iterator = new CompositeIterator(menuComponents.iterator());
		}
		return iterator;
	}
 
    // Prints information about not only the menu but each inner component of the menu.
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
  
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        // Calls each component's print while they still exist.
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			menuComponent.print();
		}
	}
}
