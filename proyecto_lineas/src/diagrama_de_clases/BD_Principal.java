package Diagrama_de_Base_de_Datos;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import citas.Bd_Principal;
import citas.iAdministrador;
import citas.iUsuario;

public class BD_Principal extends Diagrama_de_Base_de_Datos.java.rmi.UniCastRemoteObject implements IInvitado, IAdministrador, registrarse {
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
            iAdministrador administrador =
                    (iAdministrador) servicio;
            iUsuario usuario =
                    (iUsuario) servicio;
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind(nombre1, administrador);
            registry.rebind(nombre2, usuario);
            System.out.println("Servidor Arrancado");
        } catch (Exception e) {
            System.err.println("Problema con el servidor");
            e.printStackTrace();
        }
	};
}