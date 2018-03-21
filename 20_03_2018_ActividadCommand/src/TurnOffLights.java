
public class TurnOffLights implements Command{
	Receiver receiver;
	
	
	TurnOffLights(Receiver receiver){
		this.receiver = receiver;
	}
	
	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return "Apagando las luces en " + receiver.action();
	}
}
