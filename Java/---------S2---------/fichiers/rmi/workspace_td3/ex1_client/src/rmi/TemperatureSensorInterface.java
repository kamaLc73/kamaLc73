package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TemperatureSensorInterface extends Remote {
	public void augmenter(double t) throws RemoteException;
	public void diminuer(double t) throws RemoteException;
	public double lister() throws RemoteException;
	
}
