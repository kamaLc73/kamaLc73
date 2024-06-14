package agenceRemote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import beans.*;

public interface agenceRemote extends Remote {
	
	public ArrayList<Packagee> selectAll() throws RemoteException;
	public ArrayList<Hotel> getListHotel(Packagee p) throws RemoteException;
	public ArrayList<Transport> getListCTransport(Packagee p) throws RemoteException;
	public Client createClient(String name) throws RemoteException;
	public Reservation asignPackageToClient(Client client , Packagee p) throws RemoteException;
	public void deleteHotel(int idHotel, int idReservation) throws RemoteException;
	public void updateTransport(Transport p, int idReservation) throws RemoteException;
	 
	
	
	

}
