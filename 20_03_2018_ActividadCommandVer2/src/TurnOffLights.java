
public class TurnOffLights implements Command{
	Luces luces;
	
	
	TurnOffLights(Luces luces){
		this.luces = luces;
	}
	
	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return "Apagando las luces....." + luces.turnOn();
	}

	@Override
	public String Undo() {
		// TODO Auto-generated method stub
		return "Prendiendo las luces....." + luces.turnOff();
	}
}
