
public class Crush implements Command{
	Licuadora blender;
	
	
	Crush(Licuadora blender){
		this.blender = blender;
	}
	
	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return "La licuadora esta empezando a crushear..... " + blender.crush();
	}

	@Override
	public String Undo() {
		// TODO Auto-generated method stub
		return "La licuadora se esta apagando......" + blender.turnOff();
	}
}
