
public class Invoker {
	Command[] comandos;
	Command lastCommand;
	Luces luces;
	Fan fan;
	Licuadora licuadora;
	GarageDoor garageDoor;
	CeilingFan ceilinFan;
	
	Invoker(){
		luces = new Luces();
		fan = new Fan();
		licuadora = new Licuadora();
		garageDoor = new GarageDoor();
		ceilinFan = new CeilingFan();
		
		comandos = new Command[8];
		lastCommand = null;
		
		this.comandos[0] = new ActivarVentilador(ceilinFan);
		
		this.comandos[1] = new MacroComando(new OpenGarage(garageDoor),new TurnOnLights(luces),new TurnOnFan(fan));
		this.comandos[2] = new CloseGarage(garageDoor);
		this.comandos[3] = new OpenGarage(garageDoor);
		this.comandos[4] = new TurnOnLights(luces);
		this.comandos[5] = new TurnOffLights(luces);
		this.comandos[6] = new TurnOnFan(fan);
		this.comandos[7] = new TurnOffFan(fan);
		
	}
	
	public void SetCommand(Command command, int bttnIndex){
		this.comandos[bttnIndex] = command;
	}
	
	public String ButtonPress(int bttnIndex){
		lastCommand = this.comandos[bttnIndex];
		return this.comandos[bttnIndex].execute();
	}
	
	public String buttonUndo(int index){
		//String comando = lastCommand.Undo();
		//lastCommand = null;
		return comandos[index].Undo();
		//return comando;
	}
}
