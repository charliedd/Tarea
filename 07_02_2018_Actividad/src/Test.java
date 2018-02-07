
public class Test {

	public static void main(String[] args) {
		WeatherData wederdata = new WeatherData();
		
		new DisplayA(wederdata, 1);
		new DisplayB(wederdata, 2);
		
		wederdata.updateState(12, "HEy q onda");
		wederdata.notifyAllDisplays();
	}

}
