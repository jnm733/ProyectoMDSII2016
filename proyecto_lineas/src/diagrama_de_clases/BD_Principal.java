package diagrama_de_clases;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;
import java.rmi.server.*;

import java.util.ArrayList;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_de_base_de_datos.Barrio;
import diagrama_de_base_de_datos.Consulta;
import diagrama_de_base_de_datos.Descarga;
import diagrama_de_base_de_datos.Direccion;
import diagrama_de_base_de_datos.Evento;
import diagrama_de_base_de_datos.EventoSetCollection;
import diagrama_de_base_de_datos.Imagen;
import diagrama_de_base_de_datos.Linea;
import diagrama_de_base_de_datos.Linea_Parada;
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
	public boolean borrarEvento(Evento evento) {
		try {
			bd_eventos.borrarEvento(evento);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean borrarLinea(Linea linea) {
		BD_Lineas bd_lineas = new BD_Lineas();
		try {
			Linea_Parada[] linpar =bd_lineas.getLineas_Paradas();
			for (int i = 0; i < linpar.length; i++) {
				if(linpar[i].getLinea().equals(linea)){
					bd_lineas.borrarLinea_Parada(linpar[i]);
				}
			}
			bd_lineas.deleteLinea(linea);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public boolean borrarParada(Parada parada) {
		BD_Paradas bd_paradas = new BD_Paradas();
		BD_Lineas bd_lineas = new BD_Lineas();
		try {
			Linea_Parada[] linpar =bd_lineas.getLineas_Paradas();
			for (int i = 0; i < linpar.length; i++) {
				if(linpar[i].getParada().equals(parada)){
					bd_lineas.borrarLinea_Parada(linpar[i]);
				}
			}
			bd_paradas.borrarParada(parada);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public boolean borrarPto(PuntoInteres punto) {
		try {
			bd_puntosInteres.borrarPto(punto);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
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
	public Barrio getBarrio(String nombre) {
		Barrio barrio = null;
		try {
			barrio = bd_barrios.getBarrio(nombre);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return barrio;
	}

	@Override
	public Consulta getConsulta(int id) {
		Consulta consulta = null;
		try {
			consulta = bd_consultas.getSolucionConsulta(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return consulta;
	}
	
	@Override
	public Consulta[] getConsultas() {
		Consulta[] consultas = null;
		try {
			consultas = bd_consultas.getConsultas();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return consultas;
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
	
	public Direccion[] getDirecciones() {
		Direccion[] direcciones = null;
		try {
			direcciones = bd_direcciones.getDirecciones();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return direcciones;
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

	public Linea_Parada[] getLinas_Paradas() {
		Linea_Parada[] linpars = null;
		try {
			linpars = bd_lineas.getLineas_Paradas();
		} catch (Exception e) {
		}
		return linpars;
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
	

	public Linea[] getLineas_Parada(String nombreParada) {
		Linea[] lineas = null;
		try {
			lineas = bd_lineas.getParada_Lineas(nombreParada);
		} catch (Exception e) {
		}
		return lineas;
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

	public Parada[] getParadas_Linea(String numeroLinea)throws RemoteException {
		Parada[] paradas = null;
		try {
			paradas = bd_lineas.getParadas_Linea(numeroLinea);
		} catch (Exception e) {
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

	@Override
	public Usuario getUsuario(String email) throws RemoteException {
		Usuario[] usuarios = null;
		Usuario usuario = null;
		try {
			usuarios = bd_usuarios.getUsuarios();
			for(int i = 0; i < usuarios.length;i++){
				if(usuarios[i].getEmail().equals(email)){
					usuario = usuarios[i];
					break;
				}
			}
		} catch (Exception e) {
			
		}
		return usuario;
	}

	@Override
	public Usuario[] getUsuarios() throws RemoteException {
		Usuario[] usuarios = null;
		try {
			usuarios = bd_usuarios.getUsuarios();
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return usuarios;
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

	public void incluirConsulta(String email,String nOrigen, String nDestino) {
		try {
			bd_consultas.addConsulta(email,nOrigen,nDestino);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean incluirDireccion(ArrayList<String> datos) {
		try {
			datos.remove(2);
			datos.remove(1);
			bd_direcciones.addDireccion(datos);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
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
			 ArrayList<Object> datosLinea = new ArrayList<>();
			 datosLinea.addAll(datos);
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
			bd_usuarios.registrarse(aNombre, aPassword, aEmail);
		} catch (Exception e) {
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
	public boolean vincularParada(ArrayList<ArrayList<String>> incluidos, ArrayList<String> excluidos,String key) {
		Linea linea = getLinea(key);
		Parada parada = null;
		Linea_Parada linpar = null;
		try {
			for(int i = 0 ; i < excluidos.size();i++){
				parada = getParada(excluidos.get(i));
				linpar = bd_lineas.getLinea_Parada(linea,parada);
				if(linpar != null){
					bd_lineas.borrarLinea_Parada(linea,parada);
				}
			}
			for(int i = 0; i < incluidos.size();i++){
				parada = getParada(incluidos.get(i).get(0));
				linpar = bd_lineas.getLinea_Parada(linea,parada);
				if(linpar == null){
					bd_lineas.vincularParada(linea, parada,incluidos.get(i));
				}
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
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