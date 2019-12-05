// Our client, flow of control begins here
public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
 
		simulator.simulate(duckFactory);
	}
  
	// Accepts created duck factory as parameter, can be anything that implements
	void simulate(AbstractDuckFactory duckFactory) {
  
		// Calls factory to instantiate ducks rather than doing so directly
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        // Goose is wrapped in adapter to appear as duck
		Quackable gooseDuck = new GooseAdapter(new Goose());
 
		// Create and add to flock
		Flock flockOfDucks = new Flock();
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
 
		Flock flockOfMallards = new Flock();
 
		// Calls factory to instantiate ducks rather than doing so directly
		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();

		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);

		// Adds all of mallard flock to duck flock
		flockOfDucks.add(flockOfMallards);

		System.out.println("\nDuck Simulator: With Observer");

		// Creates quackologist and registers them as an observer of the ducks
		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);

		simulate(flockOfDucks);

		// Prints global QuackCounter's getQuacks getter property
		System.out.println("\nThe ducks quacked " + 
		                   QuackCounter.getQuacks() + 
		                   " times");
	}
 
	void simulate(Quackable duck) {
		duck.quack();
	}
}
