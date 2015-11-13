package ObserverPattern;

public class StatisticsDisplay implements Observer, DisplayElement{
	//Show max, mid, min values
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.RegisterObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Max temperature:" + this.weatherData.getMaxTemperature());
	}

	@Override
	public void Update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

	@Override
	public float getTemp() {
		// TODO Auto-generated method stub
		return this.temperature;
	}
}
