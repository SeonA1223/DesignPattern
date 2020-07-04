package observerpattern;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherdata = new WeatherData();
		
		CurrentConditionDisplay currentCD = new CurrentConditionDisplay(weatherdata);
		StatisticsDisplay SD = new StatisticsDisplay(weatherdata);
		
		weatherdata.setMeasurements(28.0f, 65, 30.4f);
		weatherdata.setMeasurements(32.0f, 70, 82.5f);
		weatherdata.setMeasurements(19.0f, 40, 61.5f);

	}
}
