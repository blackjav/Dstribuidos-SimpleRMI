package servidor;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.JOptionPane;

public class Servidor {

	public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
		
		MisOperaciones ope = new MisOperacionesImpl();
//		LocateRegistry.createRegistry(1099);
//		Naming.bind("nombre", ope);
		Registry myRegistry = LocateRegistry.createRegistry(1098);
		myRegistry.rebind("nombre", new MisOperacionesImpl());
//		JOptionPane.showMessageDialog(null, "Ok");

	}

}
