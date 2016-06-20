package diagrama_de_clases;

import java.util.ArrayList;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_de_base_de_datos.*;

public class BD_Lineas {
	public BD_Principal _bd_Principal;
	public Vector<Linea> _cont_lineas = new Vector<Linea>();

	public Linea[] getLineas() throws PersistentException {
		Linea[] lineas = null;
		
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			lineas = diagrama_de_base_de_datos.LineaDAO.listLineaByQuery(null,null);
			
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		 
		return lineas;
	}
	
	public Linea getLinea(String aNombre) throws PersistentException{
		Linea linea = null;
		int id = -1;
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			Linea[] lineas = diagrama_de_base_de_datos.LineaDAO.listLineaByQuery(null, null);
			for(int i = 0; i < lineas.length; i++){
				if(aNombre == lineas[i].getNombreLinea()){
					id = i;
				}
			}
			linea = diagrama_de_base_de_datos.LineaDAO.getLineaByORMID(id);
			
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}	
		 
		return linea;
	}

	public void deleteLinea(String id)throws PersistentException {
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			
			Linea linea = diagrama_de_base_de_datos.LineaDAO.loadLineaByORMID(0);
			diagrama_de_base_de_datos.LineaDAO.delete(linea);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
		diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().disposePersistentManager();
	}

	public void addLinea(ArrayList<Object> aDatos)throws PersistentException {
		int id_linea = -1;
		String numero =(String)aDatos.get(0);
		String nombre =(String)aDatos.get(1);
		String horario=(String)aDatos.get(2);
		String recorrido=(String)aDatos.get(3);
		double tarifa = Double.parseDouble((String)aDatos.get(4));
		String frecuencia=(String)aDatos.get(5);

		//Imagen
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			 Linea as = LineaDAO.createLinea();
			 as.setNumeroLinea(numero);
			 as.setNombreLinea(nombre);
			 as.setHorario(horario);
			 as.setRecorrido(recorrido);
			 as.setTarifaLinea(tarifa);
			 as.setImagen((Imagen)aDatos.get(6));
			 
			 
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