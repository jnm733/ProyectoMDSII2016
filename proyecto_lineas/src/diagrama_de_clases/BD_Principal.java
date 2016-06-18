package diagrama_de_clases;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;
import java.rmi.server.*;

import java.util.ArrayList;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_de_base_de_datos.Evento;
import diagrama_de_base_de_datos.Linea;
import diagrama_de_base_de_datos.Parada;
import diagrama_de_base_de_datos.PuntoInteres;
import diagrama_de_base_de_datos.Usuario;

/*public interface BD_Principal extends java.rmi.Remote{
	
}*/

public class BD_Principal implements IInvitado, IAdministrador, IUsuario {

	public BD_Usuarios bd_usuarios = new BD_Usuarios();
	public BD_Eventos bd_eventos = new BD_Eventos();
	public BD_Barrios bd_barrios = new BD_Barrios();
	public BD_Lineas bd_lineas = new BD_Lineas();
	public BD_Paradas bd_paradas = new BD_Paradas();
	public BD_Tarifas bd_tarifas = new BD_Tarifas();
	public BD_Direcciones bd_direcciones = new BD_Direcciones();
	public BD_Imagenes bd_imagenes = new BD_Imagenes();
	public BD_PuntosInteres bd_puntosInteres = new BD_PuntosInteres();
	public BD_Consultas bd_consultas = new BD_Consultas();
	public BD_Descargas bd_descargas = new BD_Descargas();

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
		try {
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
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
	public PuntoInteres getPtoInteres(int ID) {
		PuntoInteres punto = null;
		try {
			punto = bd_puntosInteres.getPtoInteres(ID);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return punto;
	}

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
	public Parada getParada(String nombre) {
		try {
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Parada[] getParadas() {
		Parada[] paradas = null;
		try {
			paradas = bd_paradas.getParadas();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return paradas;
	}

	@Override
	public Linea getLinea(String linea) {
		try {
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Linea[] getLineas() {
		Linea[] listLineas = null;
		try {
			listLineas = bd_lineas.getLineas();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listLineas;
	}

	@Override
	public boolean agregarDescargas(ArrayList<String> datos, Object archivo) {
		try {
			return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean vincularPtosInteres(ArrayList<Object> incluidos, ArrayList<Object> excluidos) {
		try {
			return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public boolean vincularPntoInteres(int idPunto, int idParada){
		try {
			bd_puntosInteres.vincularPntoInteres(idPunto, idParada);
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
	public boolean vincularEventos(ArrayList<Evento> incluidos, ArrayList<Evento> excluidos) {
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
	public boolean vincularParada(ArrayList<Evento> incluidos, ArrayList<Evento> excluidos) {
		try {
			return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean incluirParada(ArrayList<String> datos) {
		try {
			bd_paradas.addParada(datos);
			return true;
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
	public void setImagen(String url) {
		try {
			System.out.println("Hola");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public boolean vincularLinea(ArrayList<Evento> incluidos, ArrayList<Evento> excluidos) {
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
			bd_lineas.addLinea(datos);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

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
}