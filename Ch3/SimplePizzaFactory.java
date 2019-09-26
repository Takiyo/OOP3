// Pizza factory that creates what pizza type is passed in by matching string.
public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;
        
        // Currently handles 4 pizza types.
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
