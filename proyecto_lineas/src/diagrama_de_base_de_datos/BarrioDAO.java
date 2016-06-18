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
package diagrama_de_base_de_datos;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class BarrioDAO {
	public static Barrio loadBarrioByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return loadBarrioByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Barrio getBarrioByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return getBarrioByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Barrio loadBarrioByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return loadBarrioByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Barrio getBarrioByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return getBarrioByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Barrio loadBarrioByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Barrio) session.load(diagrama_de_base_de_datos.Barrio.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Barrio getBarrioByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Barrio) session.get(diagrama_de_base_de_datos.Barrio.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Barrio loadBarrioByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Barrio) session.load(diagrama_de_base_de_datos.Barrio.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Barrio getBarrioByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Barrio) session.get(diagrama_de_base_de_datos.Barrio.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBarrio(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return queryBarrio(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBarrio(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return queryBarrio(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Barrio[] listBarrioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return listBarrioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Barrio[] listBarrioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return listBarrioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBarrio(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.Barrio as Barrio");
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
	
	public static List queryBarrio(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.Barrio as Barrio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Barrio", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Barrio[] listBarrioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryBarrio(session, condition, orderBy);
			return (Barrio[]) list.toArray(new Barrio[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Barrio[] listBarrioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryBarrio(session, condition, orderBy, lockMode);
			return (Barrio[]) list.toArray(new Barrio[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Barrio loadBarrioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return loadBarrioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Barrio loadBarrioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return loadBarrioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Barrio loadBarrioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Barrio[] barrios = listBarrioByQuery(session, condition, orderBy);
		if (barrios != null && barrios.length > 0)
			return barrios[0];
		else
			return null;
	}
	
	public static Barrio loadBarrioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Barrio[] barrios = listBarrioByQuery(session, condition, orderBy, lockMode);
		if (barrios != null && barrios.length > 0)
			return barrios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateBarrioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return iterateBarrioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBarrioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return iterateBarrioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBarrioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.Barrio as Barrio");
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
	
	public static java.util.Iterator iterateBarrioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.Barrio as Barrio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Barrio", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Barrio createBarrio() {
		return new diagrama_de_base_de_datos.Barrio();
	}
	
	public static boolean save(diagrama_de_base_de_datos.Barrio barrio) throws PersistentException {
		try {
			diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().saveObject(barrio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(diagrama_de_base_de_datos.Barrio barrio) throws PersistentException {
		try {
			diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().deleteObject(barrio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(diagrama_de_base_de_datos.Barrio barrio)throws PersistentException {
		try {
			diagrama_de_base_de_datos.Direccion[] lPerteneces = barrio.pertenece.toArray();
			for(int i = 0; i < lPerteneces.length; i++) {
				lPerteneces[i].setContiene(null);
			}
			return delete(barrio);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(diagrama_de_base_de_datos.Barrio barrio, org.orm.PersistentSession session)throws PersistentException {
		try {
			diagrama_de_base_de_datos.Direccion[] lPerteneces = barrio.pertenece.toArray();
			for(int i = 0; i < lPerteneces.length; i++) {
				lPerteneces[i].setContiene(null);
			}
			try {
				session.delete(barrio);
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
	
	public static boolean refresh(diagrama_de_base_de_datos.Barrio barrio) throws PersistentException {
		try {
			diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().refresh(barrio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(diagrama_de_base_de_datos.Barrio barrio) throws PersistentException {
		try {
			diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().evict(barrio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Barrio loadBarrioByCriteria(BarrioCriteria barrioCriteria) {
		Barrio[] barrios = listBarrioByCriteria(barrioCriteria);
		if(barrios == null || barrios.length == 0) {
			return null;
		}
		return barrios[0];
	}
	
	public static Barrio[] listBarrioByCriteria(BarrioCriteria barrioCriteria) {
		return barrioCriteria.listBarrio();
	}
}
