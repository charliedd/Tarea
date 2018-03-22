
public class ActivarVentilador implements Command{
	CeilingFan fan;
	
	ActivarVentilador(CeilingFan fan){
		this.fan = fan;
	}
	
	@Override
	public String execute() {
		
		switch(fan.getSpeed()){
		case 0:
			return fan.slow();
		case 1:
			return fan.medium();
		case 2:
			return fan.high();
		}
		// TODO Auto-generated method stub
		return "No pasa nada";
	}

	@Override
	public String Undo() {
		
		switch(fan.getSpeed()){
		case 1:
			return fan.turnOff();
		case 2:
			return fan.slow();
		case 3:
			return fan.medium();
		}
		return "No pasa nada";
	}
	
}
