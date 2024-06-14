package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import beans.Personne;

public interface PersonneDaoRemote extends Remote{
	public ArrayList<Personne> getListePersonne() throws RemoteException ;
}
