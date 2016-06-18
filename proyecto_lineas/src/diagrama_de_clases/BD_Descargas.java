package diagrama_de_clases;

import java.util.ArrayList;
import java.util.Vector;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_de_base_de_datos.*;

public class BD_Descargas {
	public BD_Principal _bd_Principal;
	public Vector<Descarga> _cont_Descargas = new Vector<Descarga>();

	public void descargar(Object aArchivo)throws PersistentException {
		throw new UnsupportedOperationException();
	}

	public void agregarDescarga(ArrayList aDatos, Object aArchivo)throws PersistentException {
		throw new UnsupportedOperationException();
	}
}