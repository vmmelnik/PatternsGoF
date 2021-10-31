package ru.vmmelnik.patterns.observer.jdk;

import ru.vmmelnik.patterns.observer.jdk.observer.CurrentConditionsDisplay;
import ru.vmmelnik.patterns.observer.jdk.subject.WeatherData;

/**
 * @author vmmelnik
 * @version 0.1
 */
public class WeatherStation {

	public static void main(String[] args) {

		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
//		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);

	}

}
