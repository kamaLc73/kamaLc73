package rmi;

import java.rmi.Naming;

public class Client_ex3 {
	public static void main(String[] args) {
		try {
			PersonneDaoRemote pr = (PersonneDaoRemote) Naming.lookup("rmi://localhost:1099/PR");
			System.out.println(pr.getListePersonne());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
