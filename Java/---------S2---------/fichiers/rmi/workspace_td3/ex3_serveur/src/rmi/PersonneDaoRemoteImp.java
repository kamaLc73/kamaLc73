package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import beans.Personne;
import jdbc.DataBase;
import jdbc.MySQLDataSource;

public class PersonneDaoRemoteImp extends UnicastRemoteObject implements PersonneDaoRemote {

	public PersonneDaoRemoteImp() throws RemoteException {	
	}

	@Override
	public ArrayList<Personne> getListePersonne() throws RemoteException {
		DataBase db = new DataBase(new MySQLDataSource("india"));	
		return (ArrayList<Personne>) db.selectAllPeronnes();
	}
	
}
