package diagrama_de_clases;

import java.util.ArrayList;
import java.util.Vector;
import gestion_de_lineas.*;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Lineas {
	public BD_Principal _bd_Principal;
	public Vector<Linea> _cont_lineas = new Vector<Linea>();

	public Linea getLinea(String aNombre) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void deleteLinea(Lineas aLinea)throws PersistentException {
		throw new UnsupportedOperationException();
	}

	public void addLinea(ArrayList aDatos)throws PersistentException {
		int id_linea = -1;
		
		String nombre =(String)aDatos.get(0);
		PersistentTransaction t = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			 Linea as = LineaDAO.createLinea();
			 as.setNombreLinea(nombre);
			 LineaDAO.save(as);
			 id_linea = as.getORMID();
			 t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
	}

	public void vincularParadas(ArrayList aIncluidos, ArrayList aExcluidos)throws PersistentException {
		throw new UnsupportedOperationException();
	}
}