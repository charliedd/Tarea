
public class Blend implements Command {
	Licuadora receiver;
	
	
	Blend(Licuadora receiver){
		this.receiver = receiver;
	}
	
	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return "Empezando a blendiar........ " + receiver.blend();
	}

	@Override
	public String Undo() {
		// TODO Auto-generated method stub
		return "Apagando la licuadora.........." + receiver.turnOff();
	}
}
