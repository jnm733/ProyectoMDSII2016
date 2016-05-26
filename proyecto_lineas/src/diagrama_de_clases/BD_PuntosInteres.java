package diagrama_de_clases;

import java.util.ArrayList;
import java.util.Vector;
import gestion_de_lineas.*;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_PuntosInteres {
	public BD_Principal _bD_Principal;
	public Vector<PuntoInteres> _cont_puntosInteres = new Vector<PuntoInteres>();

	public PuntoInteres getPtoInteres(String aNombre)throws PersistentException {
		throw new UnsupportedOperationException();
	}

	public void incluirPtoInteres(ArrayList aDatos)throws PersistentException {
		throw new UnsupportedOperationException();
	}

	public void borrarPto(String aNombre)throws PersistentException {
		throw new UnsupportedOperationException();
	}
}