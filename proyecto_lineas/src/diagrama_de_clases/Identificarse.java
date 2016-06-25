package diagrama_de_clases;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import diagrama_de_base_de_datos.*;

public class Identificarse {
	public String user;
	public String password;
	public IAdministrador bd;
	public BD_Principal bd_Principal;

	public Usuario identificarse(String user, String Password) {
		Usuario usuario = null;
		if (System.getSecurityManager() == null) {
	        System.setSecurityManager(new SecurityManager());
	    }
	    try {
	        String nombre = "Servidor1";
	        Registry registry = LocateRegistry.getRegistry(1099);
	        bd = (IAdministrador) registry.lookup(nombre);
	         
	        
	    } catch (Exception e) {
	        System.err.println("Servidor no arrancado:");
	        e.printStackTrace();
	    }
	    
	    bd_Principal = new BD_Principal();
	    
	    try {
			Usuario[] usuarios = bd_Principal.getUsuarios();
			for(int i = 0; i< usuarios.length;i++){
				if(usuarios[i].getNombre().equals(user)&&usuarios[i].getPassword().equals(Password)){
					usuario = usuarios[i];
					break;
				}
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	    
	    
	    return usuario;
	}
}