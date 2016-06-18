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
		throw new UnsupportedOperationException();
	}

	public boolean pago(String aNumero, String aTipoPago)throws PersistentException {
		throw new UnsupportedOperationException();
	}
}