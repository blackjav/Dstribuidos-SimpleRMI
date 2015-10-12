package cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import servidor.MisOperaciones;



public class Cliente {
	
	public static void main(String args[]) throws Exception
	{
		Registry myRegistry = LocateRegistry.getRegistry("127.0.0.1",1098);
		MisOperaciones ope = (MisOperaciones)myRegistry.lookup("nombre");
//		MisOperaciones ope = (MisOperaciones)Naming.lookup("nombre");
		int x[] = {3,2,1,10};
		System.out.println(ope.sumarDatos(x));
	}

}
;