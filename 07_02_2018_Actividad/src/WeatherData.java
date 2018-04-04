import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class WeatherData extends Observable implements IWeatherData {
	private int temp;
	private String msg;

	private List<Display> displays = new ArrayList<Display>();

	public void updateState(int temp, String msg) {
		this.temp = temp;
		this.msg = msg;
		

	}

	public String getState() {
		return "Temperatura: " + temp + " Mensaje: " + msg;
	}

	public void addDisplay(Display display) {
		displays.add(display);
	}

	public void notifyAllDisplays() {
		for (Display display : displays) {
			display.update();
		}
	}

	@Override
	public void removeDisplay(int id) {
		// TODO Auto-generated method stub
		for (Display display : displays){
			if (display.id == id){
				displays.remove(display);
			}
			
		}
		
	}
	
	public int getTemp(){
		
	}

}
