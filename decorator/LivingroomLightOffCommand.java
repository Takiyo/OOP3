// Encapsulated method invocation that represends a command
public class LivingroomLightOffCommand implements Command {
	Light light;

	public LivingroomLightOffCommand(Light light) {
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
