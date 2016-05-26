package diagrama_de_clases;

import java.util.ArrayList;
import java.util.Vector;
import gestion_de_lineas.*;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Paradas {
	public BD_Principal _bd_Principal;
	public Vector<Parada> _cont_paradas = new Vector<Parada>();

	public Parada getParada(String aNombre)throws PersistentException {
		throw new UnsupportedOperationException();
	}

	public void addParada(ArrayList aDatos)throws PersistentException {
		throw new UnsupportedOperationException();
	}

	public Lineas getLinea(Lineas aNombre)throws PersistentException {
		throw new UnsupportedOperationException();
	}

	public void vincularPtosInteres(ArrayList aIncluidos, ArrayList aExcluidos)throws PersistentException {
		throw new UnsupportedOperationException();
	}

	public void borrarParada(String aNombre)throws PersistentException {
		throw new UnsupportedOperationException();
	}
}