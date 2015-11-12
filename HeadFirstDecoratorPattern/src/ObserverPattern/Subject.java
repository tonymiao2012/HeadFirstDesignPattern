package ObserverPattern;

public interface Subject {
	void RegisterObserver(Observer o);	//Add observer
	void RemoveObserver(Observer o);	//Remove observer
	void NotifyObservers();	//When there are updates, notify all observers
	float getMaxTemperature();
}
