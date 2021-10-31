package ru.vmmelnik.patterns.observer.jdk.subject;

/**
 * @author vmmelnik
 * @version 0.1
 */
public class WeatherData extends java.util.Observable {

	private float temperature;
	private float humidity;
	private float pressure;

	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

}