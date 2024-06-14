package rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class serveur_ex1 {
	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1099);
			TemperatureSensorInterface tr = new TemperatureSensor();
			System.out.println(tr);
			Naming.rebind("rmi://localhost:1099/TR", tr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
