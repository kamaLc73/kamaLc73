package beans;

import java.io.Serializable;

public class Hotel implements Serializable {
	private int idhotel;
	private String name;
	private int room;
	
	public Hotel() {
	}

	public Hotel(int id, String name, int room) {
		this.idhotel = id;
		this.name = name;
		this.room = room;
	}

	public int getId() {
		return idhotel;
	}

	public void setId(int id) {
		this.idhotel = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "hotel [id=" + idhotel + ", name=" + name + ", room=" + room + "]";
	}
	
	

}
