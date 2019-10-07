// Encapsulated method invocation that represends a command
public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
    }
    
    // Currently only one other state, sets to opposite
	public void undo() {
		light.off();
	}
}
