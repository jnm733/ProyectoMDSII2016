package diagrama_de_clases;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_de_base_de_datos.*;

public class BD_PuntosInteres {
	public BD_Principal _bd_Principal;
	public Vector<PuntoInteres> _cont_puntosInteres = new Vector<PuntoInteres>();

	public PuntoInteres getPtoInteres(int ID)throws PersistentException {
		PuntoInteres punto = null;
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession()
				.beginTransaction();
		try {
			punto = diagrama_de_base_de_datos.PuntoInteresDAO.loadPuntoInteresByORMID(ID);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return punto;
	}

	public PuntoInteres[] getPuntosInteres() throws PersistentException {
		PuntoInteres[] puntos = null;

		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession()
				.beginTransaction();
		try {
			puntos = diagrama_de_base_de_datos.PuntoInteresDAO.listPuntoInteresByQuery(null, null);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return puntos;
	}
	
	public void incluirPtoInteres(ArrayList aDatos)throws PersistentException {
		int id_ptosInteres = -1;
		
		String nombre =(String)aDatos.get(0);
		String direccion =(String)aDatos.get(1);
		String paradaCercana =(String)aDatos.get(2);
		
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			 PuntoInteres as = PuntoInteresDAO.createPuntoInteres();
			 as.setNombrePunto(nombre);
			 as.setDireccionPunto(direccion);
			 
			 
			 PuntoInteresDAO.save(as);
			 id_ptosInteres = as.getORMID();
			 t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
	}

	public void borrarPto(PuntoInteres punto)throws PersistentException {
		_bd_Principal = new BD_Principal();
		Parada[] paradas = _bd_Principal.getParadas();
		PuntoInteresSetCollection puntos = null;
		
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			for(int i = 0 ; i< paradas.length;i++){
				puntos = paradas[i].pertenece;
				if(puntos.contains(punto)){
					paradas[i].pertenece.remove(punto);
				}
			}
			diagrama_de_base_de_datos.PuntoInteresDAO.delete(punto);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
	}
	
	
	public void vincularPntoInteres(int idPunto, int idParada)throws PersistentException{
		int id_ptoInteres_parada = -1;
		
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			 
			 PuntoInteres as = PuntoInteresDAO.createPuntoInteres();
			 Set setA = new HashSet();


			 id_ptoInteres_parada = as.getORMID();
			 t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
	}
}