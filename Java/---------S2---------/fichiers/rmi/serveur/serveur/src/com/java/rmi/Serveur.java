package com.java.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Serveur {

	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1099);
			ProduitRemote pr = new ProduitRemoteImpl();
			System.out.println(pr);
			Naming.rebind("rmi:// 192.168.56.1:1099/PR", pr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
