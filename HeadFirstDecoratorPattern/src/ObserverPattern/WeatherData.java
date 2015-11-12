package ObserverPattern;

import java.util.ArrayList;

public class WeatherData implements Subject{
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList<Observer>();
	}
	@Override
	public void RegisterObserver(Observer o) {
		// TODO Add observers to array list.
		observers.add(o);
	}

	@Override
	public void RemoveObserver(Observer o) {
		// TODO Remove from observer list
		int i = observers.indexOf(o);
		
		if(i > 0){
			observers.remove(i);
		}
	}

	@Override
	public void NotifyObservers() {
		// TODO Send message to observers in list.
		for(int i = 0; i < observers.size(); i++){
			Observer observer = observers.get(i);
			observer.Update(temperature, humidity, pressure);
		}
	}
	
	public void MeasurementChanged(){
		NotifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}
	public float getMaxTemperature(){
		float max = Float.MIN_VALUE;
		for(Observer o : observers){
			if(o.getTemp() > max){
				max = o.getTemp();
			}
		}
		
		return max;
	}
	
}
