// Encapsulated method invocation that represends a command
public class LightOffCommand implements Command {
	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}
    
    // Currently only one other state, sets to opposite
	public void undo() {
		light.on();
	}
}
