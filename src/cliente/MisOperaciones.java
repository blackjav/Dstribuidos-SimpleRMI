package cliente;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MisOperaciones extends Remote {
	
	public int sumarDatos(int a[] )throws RemoteException;
	public int restarDatos(int a[])throws RemoteException;
	public double media(int a[])throws RemoteException;
	public void mostarDatos(int a[] )throws RemoteException;


}
