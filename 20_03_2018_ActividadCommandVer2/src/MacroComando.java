import java.util.ArrayList;

public class MacroComando implements Command {
	ArrayList<Command> comandos;
	
	MacroComando(Command commnd1,Command commnd2,Command commnd3){
		comandos = new ArrayList<Command>();
		comandos.add(commnd1);
		comandos.add(commnd2);
		comandos.add(commnd3);
	}
	
	//public void addComand(Command command){
	//	comandos.add(command);
	//}

	@Override
	public String execute() {
		String executados = "";
		for (Command c : comandos){
			executados += c.execute() + "\n";
		}
		// TODO Auto-generated method stub
		return executados;
	}

	@Override
	public String Undo() {
		String executados = "";
		for (Command c : comandos){
			executados += c.Undo();
		}
		// TODO Auto-generated method stub
		return executados;
	}

	
}
