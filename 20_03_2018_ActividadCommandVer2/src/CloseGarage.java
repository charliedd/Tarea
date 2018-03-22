
public class CloseGarage implements Command{
	GarageDoor garageDoor;
	
	
	CloseGarage(GarageDoor garageDoor){
		this.garageDoor = garageDoor;
	}
	
	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return "Cerrando la puerta del garage.... " + garageDoor.closeDoor();
	}

	@Override
	public String Undo() {
		// TODO Auto-generated method stub
		return "Abriendo la puerta del garage.... " + garageDoor.openDoor();
	}

}
