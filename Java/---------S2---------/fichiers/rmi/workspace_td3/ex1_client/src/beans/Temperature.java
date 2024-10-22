package beans;

import java.io.Serializable;

public class Temperature implements Serializable {
	private double temp ;
	
	public Temperature() {
		this.temp = 0.0 ;
	}
	
	public Temperature(double temp) {
		this.temp = temp;
	}

	public double getTemp() {
		return this.temp;
	}
	
	public  void setTemp(double temp) {
		this.temp = temp;
	}

	@Override
	public String toString() {
		return "Temperature [temp=" + temp + "]";
	}
	
}
