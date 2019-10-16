// Flow of control begins here for testing ducks and
// the adapter that converts turkey to duck.
public class DuckTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();

		WildTurkey turkey = new WildTurkey();

		// Wraps turkey in adapter, making it appear as duck.
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();

		System.out.println("\nThe Duck says...");
		testDuck(duck);

		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}

	// A method that only accepts ducks to test the turkeyadapter.
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
