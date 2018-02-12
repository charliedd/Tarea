
public class Test {

	public static void main(String[] args) {
		WeatherData wederdata = new WeatherData();
		
		wederdata.addObserver(new DisplayA());
		wederdata.addObserver(new DisplayB());
		
		wederdata.updateState(12, "Hello my dudes");
		
		wederdata.addObserver(new DisplayA());
		
		wederdata.updateState(3, "Va a hacer frio my dudes");
		
	}

}
