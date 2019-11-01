import java.util.Iterator;

// For 'leaf' nodes that don't have children to iterate over, 
// they use this null iterator.
public class NullIterator implements Iterator<MenuComponent> {
   
	public MenuComponent next() {
		return null;
	}
  
    // Always returns false.
	public boolean hasNext() {
		return false;
	}
   

	// public void remove() {
	// 	throw new UnsupportedOperationException();
	// }

}
