package beans;

import java.io.Serializable;

public class Client implements Serializable {
	private int id ;
	private String nameClient;
	
	public Client() {
	}
	
	public int getId() {
		return id;
	}
	public String getNameClient() {
		return nameClient;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}

	@Override
	public String toString() {
		return "client [id=" + id + ", nameClient=" + nameClient + "]";
	}

	public Client(int id, String nameClient) {
		this.id = id;
		this.nameClient = nameClient;
	}
	
	
}
