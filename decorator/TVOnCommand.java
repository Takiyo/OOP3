// Encapsulated method invocation that represends a command
public class TVOnCommand implements Command {
	TV tv;

	public TVOnCommand(TV tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.on();
		tv.setInputChannel();
	}

    // Sets to previous speed, can only undo one command
	public void undo() {
		tv.off();
	}
}
