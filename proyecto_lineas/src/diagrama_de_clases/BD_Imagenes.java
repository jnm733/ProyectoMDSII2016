package diagrama_de_clases;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_de_base_de_datos.*;

public class BD_Imagenes {
	public BD_Principal _bd_Principal;
	public Vector<Imagen> _cont_Imagenes = new Vector<Imagen>();

	public void setImagen(String aUrl)throws PersistentException {
		throw new UnsupportedOperationException();
	}
}