package diagrama_de_clases;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;

import org.orm.PersistentException;

import diagrama_de_base_de_datos.*;

public interface IAdministrador extends  Remote{
	public boolean agregarDescargas(ArrayList<String> datos, Object archivo) throws RemoteException;
	
	public boolean borrarEvento(String id) throws RemoteException;
	
	public boolean borrarLinea(String id) throws RemoteException;
	
	public boolean borrarParada(String nombre) throws RemoteException;
	
	public boolean borrarPto(String nombre) throws RemoteException;
	
	public Descarga getDescarga(String select) throws RemoteException;
	
	public Descarga[] getDescargas() throws RemoteException;
	
	public Evento getEvento(String nombre)throws RemoteException;
	
	public Evento[] getEventos() throws RemoteException;
	
	public Linea[] getLineas() throws RemoteException;
	
	public Parada[] getParadas()throws RemoteException;
	
	public PuntoInteres getPtoInteres(String nombre) throws RemoteException;
	
	public PuntoInteres[] getPtosInteres() throws RemoteException;
	
	public boolean incluirBarrio (ArrayList<String> datos) throws RemoteException;
	
	public boolean incluirDireccion (ArrayList<String> datos) throws RemoteException;
	
	public boolean incluirEvento(ArrayList<String> datos) throws RemoteException;
	
	public boolean incluirLinea(ArrayList<String> datos) throws RemoteException;
	
	public boolean incluirParada(ArrayList<String> datos) throws RemoteException;
	
	public boolean incluirPtoInteres(ArrayList<String> datos) throws RemoteException;
	
	public void setImagen(String url) throws RemoteException;
	
	public boolean vincularEventos(ArrayList<String> incluidos, ArrayList<String> excluidos,String key) throws RemoteException;
	
	public boolean vincularLinea(ArrayList<String> incluidos, ArrayList<String> excluidos) throws RemoteException;
	
	public boolean vincularParada(ArrayList<String> incluidos, ArrayList<String> excluidos,String key) throws RemoteException;
	
	public boolean vincularPtosInteres(ArrayList<String> incluidos, ArrayList<String> excluidos,String key) throws RemoteException;

}