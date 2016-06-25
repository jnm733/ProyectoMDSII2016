package diagrama_de_clases;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_de_base_de_datos.*;

public class BD_Usuarios {
	public BD_Principal _bD_Principal;
	public Vector<Usuario> _cont_Usuario = new Vector<Usuario>();

	public boolean identificarse(String aEmail, String aNombre, String aPassword)throws PersistentException {
		throw new UnsupportedOperationException();
	}

	public boolean registrarse(String aNombre, String aPassword, String aEmail)throws PersistentException {
		int id_usuario = -1;
		
		
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			 Usuario as = UsuarioDAO.createUsuario();
			 as.setEmail(aEmail);
			 as.setNombre(aNombre);
			 as.setPassword(aPassword);
			 
			 
			 UsuarioDAO.save(as);
			 id_usuario = as.getORMID();
			 t.commit();
		}
		catch (Exception e) {
			t.rollback();
			return false;
		}
		return true;
	}
	
	public Usuario[] getUsuarios()throws PersistentException {
		Usuario[] usuarios = null;

		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession()
				.beginTransaction();
		try {
			usuarios = diagrama_de_base_de_datos.UsuarioDAO.listUsuarioByQuery(null, null);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return usuarios;
	}
	
	public Usuario getUsuario(int ID)throws PersistentException {
		Usuario usuario = null;

		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession()
				.beginTransaction();
		try {
			usuario = diagrama_de_base_de_datos.UsuarioDAO.loadUsuarioByORMID(ID);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return usuario;
	}

	public boolean pago(String aNumero, String aTipoPago)throws PersistentException {
		throw new UnsupportedOperationException();
	}
}