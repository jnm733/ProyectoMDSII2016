package diagrama_de_clases;

import java.util.Vector;
import gestion_de_lineas.*;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Imagenes {
	public BD_Principal _bd_Principal;
	public Vector<Imagen> _cont_Imagenes = new Vector<Imagen>();

	public void setImagen(String aUrl)throws PersistentException {
		throw new UnsupportedOperationException();
	}
}