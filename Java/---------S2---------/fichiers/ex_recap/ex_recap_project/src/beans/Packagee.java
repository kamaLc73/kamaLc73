package beans;

import java.io.Serializable;
import java.util.ArrayList;

public class Packagee implements Serializable {

	private int id;
	private ArrayList<Hotel> hotels;
	private ArrayList<Transport> transports;
	
	public Packagee() {
		hotels = new ArrayList<>();
		transports= new ArrayList<>();
	}
	public Packagee(int id , ArrayList<Hotel> hotels, ArrayList<Transport> transports) {
		this.id = id ;
		this.hotels = hotels;
		this.transports = transports;
	}

	public ArrayList<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(ArrayList<Hotel> hotels) {
		this.hotels = hotels;
	}

	public ArrayList<Transport> getTransports() {
		return transports;
	}

	public void setTransports(ArrayList<Transport> transports) {
		this.transports = transports;
	}
	@Override
	public String toString() {
		return "Packagee [id=" + id + ", hotels=" + hotels + ", transports=" + transports + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	
	

	

}
