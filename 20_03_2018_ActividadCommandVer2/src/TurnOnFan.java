
public class TurnOnFan implements Command {
	Fan fan;
	
	
	TurnOnFan(Fan fan){
		this.fan = fan;
	}
	
	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return "Prendiendo el ventilador..... " + fan.turnOn();
	}

	@Override
	public String Undo() {
		// TODO Auto-generated method stub
		return "Apagando el ventilador......" + fan.turnOff();
	}
	
}
