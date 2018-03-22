
public class CeilingFan {
	private int velocidad;
	
	CeilingFan(){
		velocidad = 0;
	}
	
	public int getSpeed(){
		return velocidad;
	}
	
	public String slow(){
		velocidad = 1;
		return "Velocidad del ventilador slow";
	}
	
	public String medium(){
		velocidad = 2;
		return "Velocidad del ventilador medium";
	}
	
	public String high(){
		velocidad = 3;
		return "Velocidad del ventilador High";
	}
	
	public String turnOff(){
		velocidad = 0;
		return "El ventilador se ha apagado";
	}
}
