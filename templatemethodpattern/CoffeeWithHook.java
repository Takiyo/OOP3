import java.io.*;

// Class overwrites two abstract methods defined in parent class.
// Includes a way to change how condiments are used.
public class CoffeeWithHook extends CaffeineBeverageWithHook {
 
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
 
    // Overridden method from parent class.
	public boolean customerWantsCondiments() {

		String answer = getUserInput();

        // Lower cases input and tests if it starts with "y" to test for a yes input.
		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
 
    // Gets users response from the console to determine whether to add condiments or not.
	private String getUserInput() {
		String answer = null;

		System.out.print("Would you like milk and sugar with your coffee (y/n)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO error trying to read your answer");
		}
		if (answer == null) {
			return "no";
		}
		return answer;
	}
}
