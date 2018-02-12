import java.util.Observable;
import java.util.Observer;


public class DisplayB implements Observer {
	
	public void update(Observable o, Object args) {
		// TODO Auto-generated method stub
		
		if(args == null){
			return;
		}
		else if (args instanceof WeatherData){
			WeatherData wederdata = (WeatherData)args;
			System.out.println("Soy el display B ; temp: " + wederdata.getTemp() + " y el mensaje del dia es: " + wederdata.getMsg());
		}
	}
	
}