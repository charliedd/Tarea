
public class TurnOffFan implements Command{
	Fan fan;
	
	
	TurnOffFan(Fan fan){
		this.fan = fan;
	}
	
	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return "Apagando el ventilador " + fan.turnOff();
	}

	@Override
	public String Undo() {
		// TODO Auto-generated method stub
		return "Prendiendo el ventilador " + fan.turnOn();
	}
	
}
