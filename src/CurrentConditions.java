
public class CurrentConditions implements Observers{
	
	private Subject subject;
	private long temperature;
	private long humidity;
	
	public CurrentConditions(Subject sub){
		this.subject = sub;
		sub.registerObserver(this);
	}
	
	public long getTemperature() {
		return temperature;
	}

	public long getHumidity() {
		return humidity;
	}

	@Override
	public void update(long temperature, long humidity, long pressure) {
		
		this.temperature = temperature;
		this.humidity =  humidity;
	}

	@Override
	public void setSubject(Subject sub) {
		
		this.subject.unregisterObserver(this);
		this.subject = sub;
		this.subject.registerObserver(this);
		
	}
	
	public void display(){
		System.out.println("Current temp = " + temperature + "\nCurrent Humidity = " + humidity);
	}
	

}
