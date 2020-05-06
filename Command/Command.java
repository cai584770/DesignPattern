package Command;

public abstract class Command {
	protected Receiver receiver;
	
	public Command (Receiver receiver) {
		this.receiver = receiver;
	}
	
	abstract public void Execute();
}
