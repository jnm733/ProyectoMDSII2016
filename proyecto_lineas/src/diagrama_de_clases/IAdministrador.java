package diagrama_de_clases;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;

import org.orm.PersistentException;

import diagrama_de_base_de_datos.*;

public interface IAdministrador extends  Remote{
	public boolean agregarDescargas(ArrayList<String> datos, Object archivo) throws RemoteException;
	
	public boolean borrarEvento(Evento evento) throws RemoteException;
	
	public boolean borrarLinea(Linea linea) throws RemoteException;
	
	public boolean borrarParada(Parada parada) throws RemoteException;
	
	public boolean borrarPto(PuntoInteres punto) throws RemoteException;
	
	public Barrio getBarrio(String nombre) throws RemoteException;
	
	public Consulta[] getConsultas() throws RemoteException;
	
	public Descarga getDescarga(String select) throws RemoteException;
	
	public Descarga[] getDescargas() throws RemoteException;
	
	public Direccion[] getDirecciones() throws RemoteException;
	
	public Evento getEvento(String nombre) throws RemoteException;
	
	public Evento[] getEventos() throws RemoteException;
	
	public Linea[] getLineas() throws RemoteException;
	
	public Parada[] getParadas() throws RemoteException;
	
	public Usuario[] getUsuarios() throws RemoteException;
	
	public Usuario getUsuario(String email) throws RemoteException;
	
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
	
	public boolean vincularParada(ArrayList<ArrayList<String>> incluidos, ArrayList<String> excluidos,String key) throws RemoteException;
	
	public boolean vincularPtosInteres(ArrayList<String> incluidos, ArrayList<String> excluidos,String key) throws RemoteException;

}