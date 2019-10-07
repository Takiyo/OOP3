// Interface that represents an unbound command, used for clearing commands
public class NoCommand implements Command {
	public void execute() { }
	public void undo() { }
}
