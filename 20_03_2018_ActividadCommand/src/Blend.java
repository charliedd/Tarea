
public class Blend implements Command {
	Receiver receiver;
	
	
	Blend(Receiver receiver){
		this.receiver = receiver;
	}
	
	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return "Empezando a blendiar " + receiver.action();
	}
}
