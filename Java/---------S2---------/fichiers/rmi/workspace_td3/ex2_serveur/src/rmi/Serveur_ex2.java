package rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Serveur_ex2 {
	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1099);
			RemoteHotelReservartion hr = new RemoteHotelReservationImp();
			System.out.println(hr);
			Naming.rebind("rmi://localhost:1099/HR", hr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
