import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WeatherTest {
	
	WeatherWest data1;
	CurrentConditions current;
	
	@Before
	public void setUp() throws Exception {
		
		data1 = new WeatherWest();
		current = new CurrentConditions(data1);
		
		
	}

	@Test
	public void CurrrentConditionsTest() {
		
		long temp =  33;
		long humidity = 12;
		long pressure = 22;
		
		data1.dataIn(temp, humidity, pressure);
		
		long actualtemp = data1.getTemperature();
		long actualhumidity = data1.getHumidity();
		long actualpressure = data1.getPressure();
		
		assertEquals(temp, actualtemp);
		assertEquals(humidity, actualhumidity);
		assertEquals(pressure, actualpressure);
		
	}

}
