package diagrama_de_clases;

import java.util.Vector;
import gestion_de_lineas.*;

public class BD_Usuarios {
	public BD_Principal _bD_Principal;
	public Vector<Usuario> _cont_Usuario = new Vector<Usuario>();

	public boolean identificarse(String aEmail, String aNombre, String aPassword) {
		throw new UnsupportedOperationException();
	}

	public boolean registrarse(String aNombre, String aPassword, String aEmail) {
		throw new UnsupportedOperationException();
	}

	public boolean pago(String aNumero, String aTipoPago) {
		throw new UnsupportedOperationException();
	}
}