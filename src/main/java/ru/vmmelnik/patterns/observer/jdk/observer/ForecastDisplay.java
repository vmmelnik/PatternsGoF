package ru.vmmelnik.patterns.observer.jdk.observer;

import ru.vmmelnik.patterns.observer.jdk.subject.WeatherData;
import java.util.Observable;
import java.util.Observer;

/**
 * @author vmmelnik
 * @version 0.1
 */
public class ForecastDisplay implements Observer, DisplayElement {

	Observable observable;
	private float currentPressure = 29.92f;

	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.currentPressure = weatherData.getPressure();
			display();
		}
	}

	@Override
	public void display() {

	}
}
