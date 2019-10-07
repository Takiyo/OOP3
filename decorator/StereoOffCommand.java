// Encapsulated method invocation that represends a command
public class StereoOffCommand implements Command {
	Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.off();
    }
    
    // Currently only one other state, sets to opposite
	public void undo() {
		stereo.on();
	}
}
