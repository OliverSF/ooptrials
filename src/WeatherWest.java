import java.util.*;

public class WeatherWest implements Subject{
	
	private ArrayList<Observers> observers = new ArrayList<Observers>();
	private long temperature;
	private long humidity;	
	private long pressure;

	@Override
	public void registerObserver(Observers o) {
		
		observers.add(o);
		
	}

	@Override
	public void unregisterObserver(Observers o) {
		
		int observerIndex = observers.indexOf(o);
		observers.remove(observerIndex);
		
	}

	@Override
	public void notifyObservers() {
		
		for(Observers ob: observers){
			
			ob.update(temperature, humidity, pressure);
		}
		
	}
	
	public void dataIn(long temperature, long humidity, long pressure){
		
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObservers();
	}

	public long getTemperature() {
		return temperature;
	}

	public long getHumidity() {
		return humidity;
	}

	public long getPressure() {
		return pressure;
	}

}
