
public interface IWeatherData {
	void addDisplay(Display display);

	void removeDisplay(int id);

	void notifyAllDisplays();
}
