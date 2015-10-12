package servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MisOperacionesImpl extends UnicastRemoteObject implements MisOperaciones{
	
	private static final long serialVersionUID = 1L;
	protected MisOperacionesImpl() throws RemoteException {
	}
	@Override
	public int sumarDatos(int[] a) {
		
		int sum=0;
		for(int sumar : a)
		{
			sum += sumar;
		}
		return sum;
	}
	@Override
	public int restarDatos(int[] a) {
		
		int res=0;
		for (int restar : a)
		{
			res-= restar;
		}
		return res;
	}
	@Override
	public double media(int[] a) {
		
		int total = sumarDatos(a)/a.length;
		
		return total;
	}
	@Override
	public void mostarDatos(int[] a) {
		
		System.out.print("[");
		for(int mostrar : a)
		{
			System.out.print(mostrar+",");
		}
		System.out.print("]");
		System.out.println("");
		
	}

	
	
}
