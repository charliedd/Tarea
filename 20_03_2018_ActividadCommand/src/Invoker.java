
public class Invoker {
	Command command;
	
	Invoker(Command command){
		this.command = command;
	}
	
	public void SetCommand(Command command){
		this.command = command;
	}
	
	public String ButtonPress(){
		return this.command.execute();
	}
}
