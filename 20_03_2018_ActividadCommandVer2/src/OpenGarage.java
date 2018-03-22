
public class OpenGarage implements Command{
	GarageDoor garageDoor;
	
	
	OpenGarage(GarageDoor garageDoor){
		this.garageDoor = garageDoor;
	}
	
	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return "Abriendo la puerta del garage.... " + garageDoor.openDoor();
	}

	@Override
	public String Undo() {
		// TODO Auto-generated method stub
		return "Cerrando la puerta del garage.... " + garageDoor.closeDoor();
	}
}
