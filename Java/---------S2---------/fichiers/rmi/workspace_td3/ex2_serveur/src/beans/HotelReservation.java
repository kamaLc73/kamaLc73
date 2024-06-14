package beans;

import java.io.Serializable;

public class HotelReservation implements Serializable{
	private int id ;
	private String client ;
	private String hotelName ;
	private String date ;
	private int roomNum;
	public HotelReservation() {
	}
	
	public HotelReservation(int id, String client, String hotelName, String date, int roomNum) {
		super();
		this.id = id;
		this.client = client;
		this.hotelName = hotelName;
		this.date = date;
		this.roomNum = roomNum;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getClient() {
		return client;
	}
	
	public void setClient(String client) {
		this.client = client;
	}
	
	public String getHotelName() {
		return hotelName;
	}
	
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public int getRoomNum() {
		return roomNum;
	}
	
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	
	@Override
	public String toString() {
		return "HotelReservation [id=" + id + ", client=" + client + ", hotelName=" + hotelName + ", date=" + date
				+ ", roomNum=" + roomNum + "]";
	}
}
