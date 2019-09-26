//The pizza store uses a pizza factory.
public class PizzaStore {
	SimplePizzaFactory factory;
 
    // Constructor uses the type of factory passed in.
	public PizzaStore(SimplePizzaFactory factory) { 
		this.factory = factory;
	}
    
    // Parameter type is a string representation of what kind of pizza was ordered.
	public Pizza orderPizza(String type) {
		Pizza pizza;
 
		pizza = factory.createPizza(type);
 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
