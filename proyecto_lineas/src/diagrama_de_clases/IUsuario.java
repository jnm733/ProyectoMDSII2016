package diagrama_de_clases;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;

import diagrama_de_base_de_datos.*;

public interface IUsuario extends Remote{

	public boolean identificarse(String aNombre, String aPassword, String aEmail) throws RemoteException;

	public boolean registrarse(String aNombre, String aPassword, String aEmail) throws RemoteException;
	
	boolean descargar(Object archivo) throws RemoteException;
	
	SolucionConsulta getSolucionConsulta(String id) throws RemoteException;
	
	Consulta getConsulta(int id) throws RemoteException;
	
	PuntoInteres getPtoInteres(int ID) throws RemoteException;
	
	Parada getParada(String nombre) throws RemoteException;
	
	Linea getLinea(String linea) throws RemoteException;
	
	public void incluirConsulta(String email,String origen,String destino) throws RemoteException;
}