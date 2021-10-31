package ru.vmmelnik.patterns.observer.jdk.observer;

import ru.vmmelnik.patterns.observer.jdk.subject.WeatherData;
import java.util.Observable;
import java.util.Observer;

/**
 * @author vmmelnik
 * @version 0.1
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

	Observable observable;
	private float temperature;
	private float humidity;
	private float pressure;

	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.pressure = weatherData.getPressure();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity and " + pressure);
	}

}
