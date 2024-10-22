package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import beans.*;

public class TemperatureSensor extends UnicastRemoteObject implements TemperatureSensorInterface {
		
	private Temperature t = new Temperature();
	
	public TemperatureSensor() throws RemoteException {
	}

	@Override
	public void augmenter(double temp) throws RemoteException {
		 t.setTemp(t.getTemp() + temp);	
	}

	@Override
	public void diminuer(double temp) throws RemoteException {
		t.setTemp(t.getTemp() - temp);		
	}

	@Override
	public double lister() throws RemoteException {
		return t.getTemp();
	}
	

}
