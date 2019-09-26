import java.util.ArrayList;

//Different types of pizza extend this class.
abstract public class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();

	public String getName() {
		return name;
	}

    //Prepare, bake, cut and box all tell you what's being done with
    // the pizza by printing it to console.
	public void prepare() {
		System.out.println("Preparing " + name);
	}

	public void bake() {
		System.out.println("Baking " + name);
	}

	public void cut() {
		System.out.println("Cutting " + name);
	}

	public void box() {
		System.out.println("Boxing " + name);
	}

    //Displays pizza name and ingredients.
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}
}
