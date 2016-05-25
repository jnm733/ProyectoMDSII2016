package diagrama_de_clases;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;

import gestion_de_lineas.*;

public interface IUsuario extends Remote{

	public boolean identificarse(String aNombre, String aPassword, String aEmail) throws RemoteException;

	public boolean registrarse(String aNombre, String aPassword, String aEmail) throws RemoteException;
	
	boolean descargar(Object archivo) throws RemoteException;
	
	SolucionConsulta getSolucionConsulta(String id) throws RemoteException;
	
	SolucionConsulta getConsulta(ArrayList<String> datos) throws RemoteException;
	
	PuntoInteres getPtoInteres(String nombre) throws RemoteException;
	
	Parada getParada(String nombre) throws RemoteException;
	
	Linea getLinea(String linea) throws RemoteException;
}