
public class TurnOnLights implements Command {
	Receiver receiver;
	
	
	TurnOnLights(Receiver receiver){
		this.receiver = receiver;
	}
	
	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return "Prendiendo las luces en " + receiver.action();
	}
	
}
