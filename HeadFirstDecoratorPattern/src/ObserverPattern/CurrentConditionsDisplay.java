package ObserverPattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.RegisterObserver(this);
	}

	@Override
	public void display() {
		// TODO Show current temperature and humidity only.
		System.out.println("Current conditions:" + temperature + " F degress and " + humidity + " % humidity.");
		
	}

	@Override
	public void Update(float temp, float humidity, float pressure) {
		// TODO Save temperature and humidity. Then call Display()
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}
	
	@Override
	public float getTemp(){
		return this.temperature;
	}

}
