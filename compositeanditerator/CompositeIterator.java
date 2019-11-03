import java.util.*;
  
// Uses java's built in iterator to iterate over composite objects in our system.
public class CompositeIterator implements Iterator<MenuComponent> {
	Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();
   
    // The iterator of whatever composite we're using is passed in and put in to a stack.
	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}
   
	public MenuComponent next() {
		if (hasNext()) {
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component = iterator.next();
            
            stack.push(component.createIterator());
            
            return component;
		} else {
			return null;
		}
	}
  
    // The uniform way to determine if the menucomponent (either a menu item OR a menu with children menu items)
    // has another object. To see if the iterator has a next element we see if the stack is empty.
    // If it isn't, we then check the top of the stack recursively. If it has a next element we return true.
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		} else {
			Iterator<MenuComponent> iterator = stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}
	
	// public void remove() {
	// 	throw new UnsupportedOperationException();
	// }

}


