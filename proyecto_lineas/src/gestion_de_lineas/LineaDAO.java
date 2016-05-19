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

public class LineaDAO {
	public static Linea loadLineaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return loadLineaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea getLineaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return getLineaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea loadLineaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return loadLineaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea getLineaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return getLineaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea loadLineaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Linea) session.load(gestion_de_lineas.Linea.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea getLineaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Linea) session.get(gestion_de_lineas.Linea.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea loadLineaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Linea) session.load(gestion_de_lineas.Linea.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea getLineaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Linea) session.get(gestion_de_lineas.Linea.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLinea(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return queryLinea(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLinea(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return queryLinea(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea[] listLineaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return listLineaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea[] listLineaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return listLineaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLinea(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.Linea as Linea");
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
	
	public static List queryLinea(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.Linea as Linea");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Linea", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea[] listLineaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryLinea(session, condition, orderBy);
			return (Linea[]) list.toArray(new Linea[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea[] listLineaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryLinea(session, condition, orderBy, lockMode);
			return (Linea[]) list.toArray(new Linea[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea loadLineaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return loadLineaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea loadLineaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return loadLineaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea loadLineaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Linea[] lineas = listLineaByQuery(session, condition, orderBy);
		if (lineas != null && lineas.length > 0)
			return lineas[0];
		else
			return null;
	}
	
	public static Linea loadLineaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Linea[] lineas = listLineaByQuery(session, condition, orderBy, lockMode);
		if (lineas != null && lineas.length > 0)
			return lineas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLineaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return iterateLineaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLineaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return iterateLineaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLineaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.Linea as Linea");
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
	
	public static java.util.Iterator iterateLineaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.Linea as Linea");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Linea", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea createLinea() {
		return new gestion_de_lineas.Linea();
	}
	
	public static boolean save(gestion_de_lineas.Linea linea) throws PersistentException {
		try {
			gestion_de_lineas.ProyectoMDS2PersistentManager.instance().saveObject(linea);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(gestion_de_lineas.Linea linea) throws PersistentException {
		try {
			gestion_de_lineas.ProyectoMDS2PersistentManager.instance().deleteObject(linea);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(gestion_de_lineas.Linea linea)throws PersistentException {
		try {
			if (linea.getImagen() != null) {
				linea.getImagen().setLinea(null);
			}
			
			gestion_de_lineas.Parada[] lPerteneces = linea.pertenece.toArray();
			for(int i = 0; i < lPerteneces.length; i++) {
				lPerteneces[i].contiene.remove(linea);
			}
			gestion_de_lineas.Tarifa[] lEs_usadas = linea.es_usada.toArray();
			for(int i = 0; i < lEs_usadas.length; i++) {
				lEs_usadas[i].cobra.remove(linea);
			}
			return delete(linea);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(gestion_de_lineas.Linea linea, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (linea.getImagen() != null) {
				linea.getImagen().setLinea(null);
			}
			
			gestion_de_lineas.Parada[] lPerteneces = linea.pertenece.toArray();
			for(int i = 0; i < lPerteneces.length; i++) {
				lPerteneces[i].contiene.remove(linea);
			}
			gestion_de_lineas.Tarifa[] lEs_usadas = linea.es_usada.toArray();
			for(int i = 0; i < lEs_usadas.length; i++) {
				lEs_usadas[i].cobra.remove(linea);
			}
			try {
				session.delete(linea);
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
	
	public static boolean refresh(gestion_de_lineas.Linea linea) throws PersistentException {
		try {
			gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession().refresh(linea);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(gestion_de_lineas.Linea linea) throws PersistentException {
		try {
			gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession().evict(linea);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea loadLineaByCriteria(LineaCriteria lineaCriteria) {
		Linea[] lineas = listLineaByCriteria(lineaCriteria);
		if(lineas == null || lineas.length == 0) {
			return null;
		}
		return lineas[0];
	}
	
	public static Linea[] listLineaByCriteria(LineaCriteria lineaCriteria) {
		return lineaCriteria.listLinea();
	}
}
