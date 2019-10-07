// Encapsulated method invocation that represends a command
public class HottubOnCommand implements Command {
	Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}
	public void execute() {
		hottub.on();
		hottub.setTemperature(104);
		hottub.circulate();
    }
    
    // Currently only one other state, sets to opposite
	public void undo() {
		hottub.off();
	}
}
