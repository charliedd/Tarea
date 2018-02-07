
public class DisplayB extends Display {
	
	
	public DisplayB(WeatherData weatherData, int id){
		this.id = id;
		this.weatherData = weatherData;
		this.weatherData.addDisplay(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Soy el display B con id " + id + " y " + weatherData.getState());
	}

}