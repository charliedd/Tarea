
public class DisplayA extends Display {
	
	
	public DisplayA(WeatherData weatherData, int id) {
		this.id = id;
		this.weatherData = weatherData;
		this.weatherData.addDisplay(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Soy el displayA con id " + id + " y " + weatherData.getState());
	}

}
