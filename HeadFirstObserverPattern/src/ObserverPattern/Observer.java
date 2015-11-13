package ObserverPattern;

public interface Observer {
	//When weather data is changed, the updates will be passed to observers as parameters.
	void Update(float temp, float humidity, float pressure);
	float getTemp();
}