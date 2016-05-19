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

public class DireccionDAO {
	public static Direccion loadDireccionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return loadDireccionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion getDireccionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return getDireccionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion loadDireccionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return loadDireccionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion getDireccionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return getDireccionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion loadDireccionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Direccion) session.load(gestion_de_lineas.Direccion.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion getDireccionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Direccion) session.get(gestion_de_lineas.Direccion.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion loadDireccionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Direccion) session.load(gestion_de_lineas.Direccion.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion getDireccionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Direccion) session.get(gestion_de_lineas.Direccion.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDireccion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return queryDireccion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDireccion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return queryDireccion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion[] listDireccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return listDireccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion[] listDireccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return listDireccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDireccion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.Direccion as Direccion");
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
	
	public static List queryDireccion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.Direccion as Direccion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Direccion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion[] listDireccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDireccion(session, condition, orderBy);
			return (Direccion[]) list.toArray(new Direccion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion[] listDireccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDireccion(session, condition, orderBy, lockMode);
			return (Direccion[]) list.toArray(new Direccion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion loadDireccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return loadDireccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion loadDireccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return loadDireccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion loadDireccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Direccion[] direccions = listDireccionByQuery(session, condition, orderBy);
		if (direccions != null && direccions.length > 0)
			return direccions[0];
		else
			return null;
	}
	
	public static Direccion loadDireccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Direccion[] direccions = listDireccionByQuery(session, condition, orderBy, lockMode);
		if (direccions != null && direccions.length > 0)
			return direccions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDireccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return iterateDireccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDireccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return iterateDireccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDireccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.Direccion as Direccion");
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
	
	public static java.util.Iterator iterateDireccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.Direccion as Direccion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Direccion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion createDireccion() {
		return new gestion_de_lineas.Direccion();
	}
	
	public static boolean save(gestion_de_lineas.Direccion direccion) throws PersistentException {
		try {
			gestion_de_lineas.ProyectoMDS2PersistentManager.instance().saveObject(direccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(gestion_de_lineas.Direccion direccion) throws PersistentException {
		try {
			gestion_de_lineas.ProyectoMDS2PersistentManager.instance().deleteObject(direccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(gestion_de_lineas.Direccion direccion)throws PersistentException {
		try {
			if (direccion.getPto_se_ubica() != null) {
				direccion.getPto_se_ubica().setTiene(null);
			}
			
			if (direccion.getEvento_se_ubica() != null) {
				direccion.getEvento_se_ubica().setTiene_evento(null);
			}
			
			if (direccion.getParada_se_ubica() != null) {
				direccion.getParada_se_ubica().setDireccion_contiene(null);
			}
			
			if (direccion.getContiene() != null) {
				direccion.getContiene().pertenece.remove(direccion);
			}
			
			return delete(direccion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(gestion_de_lineas.Direccion direccion, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (direccion.getPto_se_ubica() != null) {
				direccion.getPto_se_ubica().setTiene(null);
			}
			
			if (direccion.getEvento_se_ubica() != null) {
				direccion.getEvento_se_ubica().setTiene_evento(null);
			}
			
			if (direccion.getParada_se_ubica() != null) {
				direccion.getParada_se_ubica().setDireccion_contiene(null);
			}
			
			if (direccion.getContiene() != null) {
				direccion.getContiene().pertenece.remove(direccion);
			}
			
			try {
				session.delete(direccion);
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
	
	public static boolean refresh(gestion_de_lineas.Direccion direccion) throws PersistentException {
		try {
			gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession().refresh(direccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(gestion_de_lineas.Direccion direccion) throws PersistentException {
		try {
			gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession().evict(direccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Direccion loadDireccionByCriteria(DireccionCriteria direccionCriteria) {
		Direccion[] direccions = listDireccionByCriteria(direccionCriteria);
		if(direccions == null || direccions.length == 0) {
			return null;
		}
		return direccions[0];
	}
	
	public static Direccion[] listDireccionByCriteria(DireccionCriteria direccionCriteria) {
		return direccionCriteria.listDireccion();
	}
}
