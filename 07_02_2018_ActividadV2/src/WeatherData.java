import java.util.Observable;

public class WeatherData extends Observable implements IWeatherData{
	int temp;
	String msg;


	public void updateState(int temp, String msg) {
		this.temp = temp;
		this.msg = msg;
		setChanged();
		notifyObservers(this);
	}
	
	public int getTemp() {
		return this.temp;
	}
	
	public String getMsg(){
		return this.msg;
	}


}
