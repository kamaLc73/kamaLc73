package beans;

import java.io.Serializable;

public class Reservation implements Serializable {
	private int idReservation ;
	private Packagee p;
	private Client c ;
	public Reservation() {
	}
	public Reservation(int idReservation, Packagee p, Client c) {
		this.idReservation = idReservation;
		this.p = p;
		this.c = c;
	}
	public int getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}
	public Packagee getP() {
		return p;
	}
	public void setP(Packagee p) {
		this.p = p;
	}
	public Client getC() {
		return c;
	}
	public void setC(Client c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", p=" + p + ", c=" + c + "]";
	}
	
	
}
