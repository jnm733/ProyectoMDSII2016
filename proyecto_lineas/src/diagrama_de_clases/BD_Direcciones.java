package diagrama_de_clases;

import java.util.ArrayList;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_de_base_de_datos.*;

public class BD_Direcciones {
	public BD_Principal _bD_Principal;
	public Vector<Direccion> _cont_direcciones = new Vector<Direccion>();
	
	public void addDireccion(ArrayList<String> datos)throws PersistentException {
		int id_direccion = -1;
		BD_Paradas bd_paradas = new BD_Paradas();
		BD_Barrios bd_Barrios = new BD_Barrios();
		
		
		Parada parada = bd_paradas.getParada(datos.get(0));
		Barrio barrio = bd_Barrios.getBarrio(datos.get(3));
		try {
			if(barrio == null){
				Barrio[] barrios = bd_Barrios.getBarrios();
				barrio = barrios[0];
			}
		} catch (Exception e) {
		}
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			 Direccion as = DireccionDAO.createDireccion();
			 as.setNumero(Integer.parseInt(datos.get(2)));
			 as.setCalle(datos.get(1));
			 as.setParada_se_ubica(parada);
			 as.setContiene(barrio);
			 DireccionDAO.save(as);
			 t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
	}

	public Direccion[] getDirecciones() throws PersistentException {
		Direccion[] direcciones = null;

		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession()
				.beginTransaction();
		try {
			direcciones = diagrama_de_base_de_datos.DireccionDAO.listDireccionByQuery(null, null);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return direcciones;
	}

	public void delete(Direccion direccion)  throws PersistentException {
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			direccion.setParada_se_ubica(new Parada());
			diagrama_de_base_de_datos.DireccionDAO.delete(direccion);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
}