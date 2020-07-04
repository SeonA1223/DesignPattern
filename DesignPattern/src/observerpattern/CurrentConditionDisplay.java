package observerpattern;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject WeatherData){
		this.weatherData = WeatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
	//	this.pressure = pressure;
		
		display();
	}
	
	@Override
	public void display() {
		System.out.println("Current Condition :  " + temperature + "C degrees and " + humidity + " % humidity");
		
	}
}
