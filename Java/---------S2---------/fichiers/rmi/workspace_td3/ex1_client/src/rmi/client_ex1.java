package rmi;

import java.rmi.Naming;

public class client_ex1 {
	public static void main(String[] args) {
		try {
			TemperatureSensorInterface tr = (TemperatureSensorInterface) Naming.lookup("rmi://localhost:1099/TR");
			tr.augmenter(15.0);
			System.out.println(tr.lister());
			tr.diminuer(5.5);
			tr.augmenter(12.0);
			System.out.println(tr.lister());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
