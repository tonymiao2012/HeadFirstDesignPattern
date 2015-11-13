package ObserverPattern;

public class Program {

	public static void main(String[] args) {
		// TODO Main function
		WeatherData wd = new WeatherData();
		CurrentConditionsDisplay cur = new CurrentConditionsDisplay(wd);
		wd.setMeasurements(80, 65, 30.4f);
		wd.NotifyObservers();
		wd.setMeasurements(82, 70, 29f);
		wd.NotifyObservers();
	}

}