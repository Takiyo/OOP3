// Command that can execute other, multiple commands
public class MacroCommand implements Command {
	Command[] commands;
    
    // Several commands can be passed in.
	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}
 
	public void execute() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
    }

	public void undo() {
		for (int i = commands.length -1; i >= 0; i--) {
			commands[i].undo();
		}
	}
}

