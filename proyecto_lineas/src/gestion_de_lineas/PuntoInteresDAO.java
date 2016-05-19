/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package gestion_de_lineas;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class PuntoInteresDAO {
	public static PuntoInteres loadPuntoInteresByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return loadPuntoInteresByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PuntoInteres getPuntoInteresByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return getPuntoInteresByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PuntoInteres loadPuntoInteresByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return loadPuntoInteresByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PuntoInteres getPuntoInteresByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return getPuntoInteresByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PuntoInteres loadPuntoInteresByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (PuntoInteres) session.load(gestion_de_lineas.PuntoInteres.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PuntoInteres getPuntoInteresByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (PuntoInteres) session.get(gestion_de_lineas.PuntoInteres.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PuntoInteres loadPuntoInteresByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PuntoInteres) session.load(gestion_de_lineas.PuntoInteres.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PuntoInteres getPuntoInteresByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PuntoInteres) session.get(gestion_de_lineas.PuntoInteres.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPuntoInteres(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return queryPuntoInteres(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPuntoInteres(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return queryPuntoInteres(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PuntoInteres[] listPuntoInteresByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return listPuntoInteresByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PuntoInteres[] listPuntoInteresByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return listPuntoInteresByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPuntoInteres(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.PuntoInteres as PuntoInteres");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPuntoInteres(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.PuntoInteres as PuntoInteres");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PuntoInteres", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PuntoInteres[] listPuntoInteresByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPuntoInteres(session, condition, orderBy);
			return (PuntoInteres[]) list.toArray(new PuntoInteres[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PuntoInteres[] listPuntoInteresByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPuntoInteres(session, condition, orderBy, lockMode);
			return (PuntoInteres[]) list.toArray(new PuntoInteres[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PuntoInteres loadPuntoInteresByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return loadPuntoInteresByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PuntoInteres loadPuntoInteresByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return loadPuntoInteresByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PuntoInteres loadPuntoInteresByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		PuntoInteres[] puntoIntereses = listPuntoInteresByQuery(session, condition, orderBy);
		if (puntoIntereses != null && puntoIntereses.length > 0)
			return puntoIntereses[0];
		else
			return null;
	}
	
	public static PuntoInteres loadPuntoInteresByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		PuntoInteres[] puntoIntereses = listPuntoInteresByQuery(session, condition, orderBy, lockMode);
		if (puntoIntereses != null && puntoIntereses.length > 0)
			return puntoIntereses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePuntoInteresByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return iteratePuntoInteresByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePuntoInteresByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return iteratePuntoInteresByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePuntoInteresByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.PuntoInteres as PuntoInteres");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePuntoInteresByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.PuntoInteres as PuntoInteres");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PuntoInteres", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PuntoInteres createPuntoInteres() {
		return new gestion_de_lineas.PuntoInteres();
	}
	
	public static boolean save(gestion_de_lineas.PuntoInteres puntoInteres) throws PersistentException {
		try {
			gestion_de_lineas.ProyectoMDS2PersistentManager.instance().saveObject(puntoInteres);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(gestion_de_lineas.PuntoInteres puntoInteres) throws PersistentException {
		try {
			gestion_de_lineas.ProyectoMDS2PersistentManager.instance().deleteObject(puntoInteres);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(gestion_de_lineas.PuntoInteres puntoInteres)throws PersistentException {
		try {
			gestion_de_lineas.Parada[] lContienes = puntoInteres.contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].pertenece.remove(puntoInteres);
			}
			if (puntoInteres.getTiene() != null) {
				puntoInteres.getTiene().setPto_se_ubica(null);
			}
			
			return delete(puntoInteres);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(gestion_de_lineas.PuntoInteres puntoInteres, org.orm.PersistentSession session)throws PersistentException {
		try {
			gestion_de_lineas.Parada[] lContienes = puntoInteres.contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].pertenece.remove(puntoInteres);
			}
			if (puntoInteres.getTiene() != null) {
				puntoInteres.getTiene().setPto_se_ubica(null);
			}
			
			try {
				session.delete(puntoInteres);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(gestion_de_lineas.PuntoInteres puntoInteres) throws PersistentException {
		try {
			gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession().refresh(puntoInteres);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(gestion_de_lineas.PuntoInteres puntoInteres) throws PersistentException {
		try {
			gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession().evict(puntoInteres);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PuntoInteres loadPuntoInteresByCriteria(PuntoInteresCriteria puntoInteresCriteria) {
		PuntoInteres[] puntoIntereses = listPuntoInteresByCriteria(puntoInteresCriteria);
		if(puntoIntereses == null || puntoIntereses.length == 0) {
			return null;
		}
		return puntoIntereses[0];
	}
	
	public static PuntoInteres[] listPuntoInteresByCriteria(PuntoInteresCriteria puntoInteresCriteria) {
		return puntoInteresCriteria.listPuntoInteres();
	}
}
