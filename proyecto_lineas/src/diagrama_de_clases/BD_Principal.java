package diagrama_de_clases;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;
import java.rmi.server.*;

import java.util.ArrayList;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_de_base_de_datos.Descarga;
import diagrama_de_base_de_datos.Evento;
import diagrama_de_base_de_datos.EventoSetCollection;
import diagrama_de_base_de_datos.Imagen;
import diagrama_de_base_de_datos.Linea;
import diagrama_de_base_de_datos.Parada;
import diagrama_de_base_de_datos.PuntoInteres;
import diagrama_de_base_de_datos.Usuario;

/*public interface BD_Principal extends java.rmi.Remote{
	
}*/

public class BD_Principal implements IInvitado, IAdministrador, IUsuario {

	public static void main(String[] args) {
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
		try {
			String nombre1 = "Servidor1";
			String nombre2 = "Servidor2";
			String nombre3 = "Servidor3";

			LocateRegistry.createRegistry(1099);
			BD_Principal servidor = new BD_Principal();
			Remote servicio = UnicastRemoteObject.exportObject(servidor, 0);
			IAdministrador administrador = (IAdministrador) servicio;
			IUsuario usuario = (IUsuario) servicio;
			IInvitado invitado = (IInvitado) servicio;
			Registry registry = LocateRegistry.getRegistry();
			registry.rebind(nombre1, administrador);
			registry.rebind(nombre2, usuario);
			registry.rebind(nombre3, invitado);
			System.out.println("Servidor Arrancado");
		} catch (Exception e) {
			System.err.println("Problema con el servidor");
			e.printStackTrace();
		}
	}
	public BD_Barrios bd_barrios = new BD_Barrios();
	public BD_Consultas bd_consultas = new BD_Consultas();
	public BD_Descargas bd_descargas = new BD_Descargas();
	public BD_Direcciones bd_direcciones = new BD_Direcciones();
	public BD_Eventos bd_eventos = new BD_Eventos();
	public BD_Imagenes bd_imagenes = new BD_Imagenes();
	public BD_Lineas bd_lineas = new BD_Lineas();
	public BD_Paradas bd_paradas = new BD_Paradas();
	public BD_PuntosInteres bd_puntosInteres = new BD_PuntosInteres();
	public BD_Tarifas bd_tarifas = new BD_Tarifas();

	public BD_Usuarios bd_usuarios = new BD_Usuarios();

	@Override
	public boolean agregarDescargas(ArrayList<String> datos, Object archivo) {
		try {
			bd_descargas.agregarDescarga(datos, archivo);
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean borrarEvento(String id) {
		try {
			return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean borrarLinea(String id) {
		try {
			bd_lineas.deleteLinea(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public boolean borrarParada(String nombre) {
		try {
			return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public boolean borrarPto(String nombre) {
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
	public SolucionConsulta getConsulta(ArrayList<String> datos) {
		try {
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Descarga getDescarga(String select){
		Descarga descarga = null;
		try {
			Descarga[] descargas = bd_descargas.getDescargas();
			for(int i = 0; i< descargas.length;i++){
				if(descargas[i].getTituloDescarga().equals(select)){
					descarga= descargas[i];
					break;
				}
			}
		} catch (Exception e) {

		}
		return descarga;
	}
	
	@Override
	public Descarga[] getDescargas() throws RemoteException {
		Descarga[] descargas = null;
		try {
			descargas = bd_descargas.getDescargas();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return descargas;
	}

	@Override
	public Evento getEvento(String nombre){
		Evento evento = null;
		
		Evento[] eventos = null;
		try {
			eventos = bd_eventos.getEventos();
		} catch (Exception e) {

			e.printStackTrace();
		}
		for (int i = 0; i < eventos.length; i++) {
			if(eventos[i].getNombreEvento().equals(nombre)){
				evento = eventos[i];
			}
		}
		
		return evento;
	}
	
	@Override
	public Evento[] getEventos() {
		Evento[] listEvento = null;
		try {
			listEvento = bd_eventos.getEventos();
		} catch (PersistentException e) {
			
			e.printStackTrace();
		}
		return listEvento;
	}
	
	@Override
	public Linea getLinea(String nombre) {
		Linea[] lineas = null;
		Linea linea = null;
		try {
			lineas = getLineas();
			for(int i = 0 ; i < lineas.length;i++){
				if(lineas[i].getNombreLinea().equals(nombre)){
					linea = lineas[i];
					break;
				}
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return linea;
	}

	@Override
	public Linea[] getLineas() {
		Linea[] listLineas = null;
		try {
			listLineas = bd_lineas.getLineas();
		} catch (PersistentException e) {
			
			e.printStackTrace();
		}
		return listLineas;
	}

	@Override
	public Parada getParada(String nombre) {
		Parada[] paradas = null;
		Parada parada = null;
		try {
			paradas = bd_paradas.getParadas();
			for (int i = 0; i < paradas.length; i++) {
				if(paradas[i].getNombreParada().equals(nombre)){
					parada = paradas[i];
					break;
				}
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return parada;
	}

	@Override
	public Parada[] getParadas() {
		Parada[] paradas = null;
		try {
			paradas = bd_paradas.getParadas();
		} catch (Exception e) {

			e.printStackTrace();
		}
		return paradas;
	}

	@Override
	public PuntoInteres getPtoInteres(int ID) {
		PuntoInteres punto = null;
		try {
			punto = bd_puntosInteres.getPtoInteres(ID);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return punto;
	}
	

	@Override
	public PuntoInteres getPtoInteres(String nombre) {
		PuntoInteres punto = null;
		PuntoInteres[] puntos = null;
		try {
			puntos = bd_puntosInteres.getPuntosInteres();
		} catch (Exception e) {

			e.printStackTrace();
		}
		for (int i = 0; i < puntos.length; i++) {
			if(puntos[i].getNombrePunto().equals(nombre)){
				punto = puntos[i];
			}
		}
		return punto;
	}

	@Override
	public PuntoInteres[] getPtosInteres() throws RemoteException {
		PuntoInteres[] puntoInteres = null;
		try {
			puntoInteres = bd_puntosInteres.getPuntosInteres();
		} catch (Exception e) {

			e.printStackTrace();
		}
		return puntoInteres;
	}

	@Override
	public SolucionConsulta getSolucionConsulta(String id) {
		try {
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public boolean identificarse(String aNombre, String aPassword, String aEmail) {
		Usuario us = null;
		try {
			return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean incluirBarrio(ArrayList<String> datos) {
		try {
			return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public boolean incluirDireccion(ArrayList<String> datos) {
		try {
			return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean incluirEvento(ArrayList<String> datos) {
		try {
			return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean incluirLinea(ArrayList<String> datos) {
		try {
			Parada[] parada = bd_paradas.getParadas();
			BD_Imagenes bd_imagen = new BD_Imagenes();
			 Imagen imagen = null;
			 Imagen[] imagenes = bd_imagen.getImagenes();
			 for(int i = 0; i < imagenes.length;i++){
				 if(imagenes[i].getTipo().equals("linea")&&imagenes[i].getImagen().equals("Por defecto")){
					 imagen = imagenes[i];
					 break;
				 }
			 }
			 if(imagen == null){
				 bd_imagen.addImagen("linea", "Por defecto",parada[0]);
				 imagen = bd_imagen.getImagen("linea","Por defecto");
			 }
			 ArrayList<Object> datosLinea = new ArrayList<>();
			 datosLinea.addAll(datos);
			 datosLinea.add(imagen);
			bd_lineas.addLinea(datosLinea);
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean incluirParada(ArrayList<String> datos) {
		try {
			bd_paradas.addParada(datos);
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean incluirPtoInteres(ArrayList<String> datos) {
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
	public void setImagen(String url) {
		try {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public boolean vincularEventos(ArrayList<String> incluidos, ArrayList<String> excluidos,String key) {
		Evento evento = getEvento(key);
		Parada parada = null;
		try {
			for(int i = 0 ; i < incluidos.size();i++){
				parada = getParada(incluidos.get(i));
				if(!parada.evento_pertenece.contains(evento)){
					parada.evento_pertenece.add(evento);
				}
			}
			
			for(int i = 0 ; i < excluidos.size();i++){
				parada = getParada(excluidos.get(i));
				if(parada.evento_pertenece.contains(evento)){
					parada.evento_pertenece.remove(evento);;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean vincularLinea(ArrayList<String> incluidos, ArrayList<String> excluidos) {
		try {
			return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean vincularParada(ArrayList<String> incluidos, ArrayList<String> excluidos,String key) {
		try {
			return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean vincularPtosInteres(ArrayList<String> incluidos, ArrayList<String> excluidos,String key) {
		PuntoInteres punto = getPtoInteres(key);
		Parada parada = null;
		try {
			for(int i = 0 ; i < incluidos.size();i++){
				parada = getParada(incluidos.get(i));
				if(!parada.pertenece.contains(punto)){
					parada.pertenece.add(punto);
				}
			}
			
			for(int i = 0 ; i < excluidos.size();i++){
				parada = getParada(excluidos.get(i));
				if(parada.pertenece.contains(punto)){
					parada.pertenece.remove(punto);;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}