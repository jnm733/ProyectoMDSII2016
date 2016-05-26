package diagrama_de_clases;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.rmi.*;
import java.rmi.server.*;

import gestion_de_lineas.Evento;
import gestion_de_lineas.Linea;
import gestion_de_lineas.Parada;
import gestion_de_lineas.PuntoInteres;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

/*public interface BD_Principal extends java.rmi.Remote{
	
}*/


public class BD_Principal implements IInvitado, IAdministrador, IUsuario{

	public BD_Usuarios _bD_Usuarios;
	public BD_Eventos _bD_Eventos;
	public BD_Barrios _bD_Barrios;
	public BD_Lineas _bD_Lineas;
	public BD_Paradas _bD_Paradas;
	public BD_Tarifas _bD_Tarifas;
	public BD_Direcciones _bD_Direcciones;
	public BD_Imagenes _bD_Imagenes;
	public BD_PuntosInteres _bD_PuntosInteres;
	public BD_Consultas _bD_Consultas;
	public BD_Descargas _bD_Descargas;
	
	public static void main(String[] args)
	{
		if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }
		try {
            String nombre1 = "Servidor1";
            String nombre2 = "Servidor2";
            
            LocateRegistry.createRegistry(1099);
            BD_Principal servidor = new BD_Principal();
            Remote servicio = UnicastRemoteObject.exportObject(servidor, 0);
            IAdministrador administrador =
                    (IAdministrador) servicio;
            IUsuario usuario =
                    (IUsuario) servicio;
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind(nombre1, administrador);
            registry.rebind(nombre2, usuario);
            System.out.println("Servidor Arrancado");
        } catch (Exception e) {
            System.err.println("Problema con el servidor");
            e.printStackTrace();
        }
	}

	@Override
	public boolean identificarse(String aNombre, String aPassword, String aEmail) {
		try {
			return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean registrarse(String aNombre, String aPassword, String aEmail) {
		try {
			return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean descargar(Object archivo) {
		try {
			return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public SolucionConsulta getSolucionConsulta(String id) {
		try{
			return null;
		}catch(Exception e){
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public SolucionConsulta getConsulta(ArrayList<String> datos) {
		try{
			return null;
		}catch(Exception e){
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PuntoInteres getPtoInteres(String nombre) {
		try{
			return null;
		}catch(Exception e){
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Parada getParada(String nombre) {
		try{
			return null;
		}catch(Exception e){
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Linea getLinea(String linea) {
		try{
			return null;
		}catch(Exception e){
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean agregarDescargas(ArrayList<String> datos, Object archivo) {
		try{
			return false;
		}catch(Exception e){
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean vincularPtosInteres(ArrayList<Object> incluidos, ArrayList<Object> excluidos){
		try{
			return false;
		}catch(Exception e){
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean incluirPtoInteres(ArrayList<String> datos) {
		try{
			return false;
		}catch(Exception e){
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean borrarPto(String nombre) {
		try{
			return false;
		}catch(Exception e){
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean incluirBarrio(ArrayList<String> datos) {
		try{
			return false;
		}catch(Exception e){
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean incluirDireccion(ArrayList<String> datos) {
		try{
			return false;
		}catch(Exception e){
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean vincularEventos(ArrayList<Evento> incluidos, ArrayList<Evento> excluidos) {
		try{
			return false;
		}catch(Exception e){
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean incluirEvento(ArrayList<String> datos) {
		try{
			return false;
		}catch(Exception e){
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean borrarEvento(String id) {
		try{
			return false;
		}catch(Exception e){
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean vincularParada(ArrayList<Evento> incluidos, ArrayList<Evento> excluidos) {
		try{
			return false;
		}catch(Exception e){
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean incluirParada(ArrayList<String> datos) {
		try{
			return false;
		}catch(Exception e){
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean borrarParada(String nombre) {
		try{
			return false;
		}catch(Exception e){
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void setImagen(String url) {
		try{
			System.out.println("Hola");
		}catch(Exception e){
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean vincularLinea(ArrayList<Evento> incluidos, ArrayList<Evento> excluidos) {
		try{
			return false;
		}catch(Exception e){
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean incluirLinea(ArrayList<String> datos) {
		try{
			return false;
		}catch(Exception e){
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean borrarLinea(String id) {
		try{
			return false;
		}catch(Exception e){
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}