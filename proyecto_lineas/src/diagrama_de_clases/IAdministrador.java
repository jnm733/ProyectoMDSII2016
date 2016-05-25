package diagrama_de_clases;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;

import gestion_de_lineas.*;

public interface IAdministrador extends  Remote{
	boolean agregarDescargas(ArrayList<String> datos, Object archivo) throws RemoteException;
	
	boolean vincularPtosInteres(ArrayList<Object> incluidos, ArrayList<Object> excluidos) throws RemoteException;
	
	boolean incluirPtoInteres(ArrayList<String> datos) throws RemoteException;
	
	boolean borrarPto(String nombre) throws RemoteException;
	
	boolean incluirBarrio (ArrayList<String> datos) throws RemoteException;
	
	boolean incluirDireccion (ArrayList<String> datos) throws RemoteException;
	
	boolean vincularEventos(ArrayList<Evento> incluidos, ArrayList<Evento> excluidos) throws RemoteException;
	
	boolean incluirEvento(ArrayList<String> datos) throws RemoteException;
	
	boolean borrarEvento(String id) throws RemoteException;
	
	boolean vincularParada(ArrayList<Evento> incluidos, ArrayList<Evento> excluidos) throws RemoteException;
	
	boolean incluirParada(ArrayList<String> datos) throws RemoteException;
	
	boolean borrarParada(String nombre) throws RemoteException;
	
	void setImagen(String url) throws RemoteException;
	
	boolean vincularLinea(ArrayList<Evento> incluidos, ArrayList<Evento> excluidos) throws RemoteException;
	
	boolean incluirLinea(ArrayList<String> datos) throws RemoteException;
	
	boolean borrarLinea(String id) throws RemoteException;
}