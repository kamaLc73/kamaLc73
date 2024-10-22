package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import beans.HotelReservation;

public class RemoteHotelReservationImp extends UnicastRemoteObject implements RemoteHotelReservartion  {
		
	private ArrayList<HotelReservation> hrs = new ArrayList<HotelReservation>(); ;
		
	public RemoteHotelReservationImp() throws RemoteException {
	}

	@Override
	public int reserver(HotelReservation hr) throws RemoteException {
		if(!checkReservation(hr)) {
			hrs.add(hr);
			return hr.getId();
		}
		return -1;
	}
	
	@Override
	public void annuler(int id) throws RemoteException {
		for (HotelReservation h : hrs) {
			if(h.getId() ==  id) {
				hrs.remove(h);
				return ;
			}
		} 	
	}

	@Override
	public HotelReservation lister(int id) throws RemoteException {
		for (HotelReservation h : hrs) {
			if(h.getId() == id) {
				return h ;
			}
		}
		return null;
	}
	
	private boolean checkReservation(HotelReservation hr) {
		for (HotelReservation h : hrs) {
			if(h.getId() == hr.getId()) return true;
		}
		return false;
	}
}
