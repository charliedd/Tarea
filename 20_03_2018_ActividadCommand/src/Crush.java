
public class Crush implements Command{
	Receiver receiver;
	
	
	Crush(Receiver receiver){
		this.receiver = receiver;
	}
	
	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return "Estoy crusheando en " + receiver.action();
	}
}
