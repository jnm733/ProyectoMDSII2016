package diagrama_de_clases;

import java.util.ArrayList;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_de_base_de_datos.*;

public class BD_Paradas {
	public BD_Principal _bd_Principal;
	public Vector<Parada> _cont_paradas = new Vector<Parada>();

	public void addParada(ArrayList aDatos)throws PersistentException {
		int id_parada = -1;
		
		String nombre =(String)aDatos.get(0);
		String observaciones =(String)aDatos.get(1);
		String direccion =(String)aDatos.get(2);
		

		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			 Parada as = ParadaDAO.createParada();
			 as.setDireccionParada(direccion);
			 as.setImagenParada("");
			 as.setNombreParada(nombre);
			 as.setObservaciones(observaciones);
			 ParadaDAO.save(as);
			 //id_parada = as.getORMID();
			 t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
	}
	
	public void borrarParada(Parada parada)throws PersistentException {
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession()
				.beginTransaction();
		try {
			parada.linea_Paradas.clear();
			diagrama_de_base_de_datos.ParadaDAO.delete(parada);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public Lineas getLinea(Lineas aNombre)throws PersistentException {
		throw new UnsupportedOperationException();
	}

	public Parada getParada(String aNombre)throws PersistentException {
		Parada[] paradas = null;
		Parada parada = null;
		String nombre = "";
		paradas = diagrama_de_base_de_datos.ParadaDAO.listParadaByQuery(null, null);
		for(int i = 0; i<paradas.length;i++){
			if(paradas[i].getNombreParada().equals(aNombre)){
				nombre = paradas[i].getNombreParada();
				break;
			}
		}
		
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			parada = diagrama_de_base_de_datos.ParadaDAO.loadParadaByORMID(nombre);
			
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		 
		return parada;
	}

	public Parada[] getParadas() throws PersistentException {
		Parada[] paradas = null;

		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession()
				.beginTransaction();
		try {
			paradas = diagrama_de_base_de_datos.ParadaDAO.listParadaByQuery(null, null);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return paradas;
	}

	public void vincularPtosInteres(ArrayList aIncluidos, ArrayList aExcluidos)throws PersistentException {
		throw new UnsupportedOperationException();
	}
}