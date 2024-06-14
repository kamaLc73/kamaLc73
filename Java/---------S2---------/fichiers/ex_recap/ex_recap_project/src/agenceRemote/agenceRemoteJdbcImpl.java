package agenceRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import beans.*;

public class agenceRemoteJdbcImpl extends UnicastRemoteObject implements agenceRemote{
	
	public agenceRemoteJdbcImpl() throws RemoteException {
		
	}

	public ArrayList<Hotel> getListHotel(Packagee p) throws RemoteException {
		return null;
	}

	public ArrayList<Transport> getListCTransport(Packagee p) throws RemoteException {
		return null;
	}

	public void deleteHotel(int idHotel, int idReservation) throws RemoteException {
		
	}

	public void updateTransport(Transport p, int idReservation) throws RemoteException {		
	}
	
	public Client createClient(String name) throws RemoteException {
		return null;
	}

	public Reservation asignPackageToClient(Client client, Packagee p) throws RemoteException {
		return null;
	}

	public ArrayList<Packagee> selectAll() throws RemoteException {
		return null;
	}


}
