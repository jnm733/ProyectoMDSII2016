package diagrama_de_clases;

import java.util.ArrayList;
import java.util.Vector;
import gestion_de_lineas.*;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Eventos {
	public BD_Principal _bd_Principal;
	public Vector<Evento> _cont_eventos = new Vector<Evento>();

	public InfoEventos getEvento(String aIdEvento)throws PersistentException {
		throw new UnsupportedOperationException();
	}

	public void vincularEventos(ArrayList aIncluidos, ArrayList aExcluidos) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void incluirEvento(ArrayList aDatos)throws PersistentException {
		throw new UnsupportedOperationException();
	}

	public void borrarEvento(String aId)throws PersistentException {
		throw new UnsupportedOperationException();
	}
}