// Encapsulated method invocation that represends a command
public class TVOffCommand implements Command {
	TV tv;

	public TVOffCommand(TV tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.off();
    }
    
    // Sets to previous speed, can only undo one command
	public void undo() {
		tv.on();
	}
}
