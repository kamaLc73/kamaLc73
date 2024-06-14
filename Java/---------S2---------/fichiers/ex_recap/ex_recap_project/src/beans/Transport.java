package beans;

public class Transport {
	
	private int idTrans ;
	private String type;
	
	public Transport() {
	}

	public Transport(int id, String type) {
		this.idTrans = id;
		this.type = type;
	}

	public int getId() {
		return idTrans;
	}

	public void setId(int id) {
		this.idTrans = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "transport [id=" + idTrans + ", type=" + type + "]";
	}
	
	
	

}
