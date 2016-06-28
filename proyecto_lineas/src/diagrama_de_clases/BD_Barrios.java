package diagrama_de_clases;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_de_base_de_datos.*;

import java.util.ArrayList;
import java.util.Vector;

public class BD_Barrios {
	public BD_Principal _bd_Principal;
	public Vector<Barrio> _cont_barrios = new Vector<Barrio>();
	
	public Barrio getBarrio(String aNombre) throws PersistentException {
		Barrio barrio = null;
		Barrio[] barrios = getBarrios();
		int id = -1;
		for (int i = 0; i < barrios.length; i++) {
			if(barrios[i].getNombreBarrio().equals(aNombre)){
				barrio = barrios[i];
				break;
			}
		}
		return barrio;
	}
	
	
	public Barrio[] getBarrios() throws PersistentException {
		Barrio[] barrios = null;

		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession()
				.beginTransaction();
		try {
			barrios = diagrama_de_base_de_datos.BarrioDAO.listBarrioByQuery(null, null);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return barrios;
	}
	
	public void addBarrio(String nombre)throws PersistentException {
		int id_barrio = -1;
		
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			Barrio as = BarrioDAO.createBarrio();
			as.setNombreBarrio(nombre);
			as.setCodigoPostal(1001);
			 t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
	}
}