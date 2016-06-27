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

public class Linea_ParadaDAO {
	public static Linea_Parada loadLinea_ParadaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return loadLinea_ParadaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea_Parada getLinea_ParadaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return getLinea_ParadaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea_Parada loadLinea_ParadaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return loadLinea_ParadaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea_Parada getLinea_ParadaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return getLinea_ParadaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea_Parada loadLinea_ParadaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Linea_Parada) session.load(diagrama_de_base_de_datos.Linea_Parada.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea_Parada getLinea_ParadaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Linea_Parada) session.get(diagrama_de_base_de_datos.Linea_Parada.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea_Parada loadLinea_ParadaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Linea_Parada) session.load(diagrama_de_base_de_datos.Linea_Parada.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea_Parada getLinea_ParadaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Linea_Parada) session.get(diagrama_de_base_de_datos.Linea_Parada.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLinea_Parada(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return queryLinea_Parada(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLinea_Parada(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return queryLinea_Parada(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea_Parada[] listLinea_ParadaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return listLinea_ParadaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea_Parada[] listLinea_ParadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return listLinea_ParadaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLinea_Parada(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.Linea_Parada as Linea_Parada");
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
	
	public static List queryLinea_Parada(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.Linea_Parada as Linea_Parada");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Linea_Parada", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea_Parada[] listLinea_ParadaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryLinea_Parada(session, condition, orderBy);
			return (Linea_Parada[]) list.toArray(new Linea_Parada[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea_Parada[] listLinea_ParadaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryLinea_Parada(session, condition, orderBy, lockMode);
			return (Linea_Parada[]) list.toArray(new Linea_Parada[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea_Parada loadLinea_ParadaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return loadLinea_ParadaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea_Parada loadLinea_ParadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return loadLinea_ParadaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea_Parada loadLinea_ParadaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Linea_Parada[] linea_Paradas = listLinea_ParadaByQuery(session, condition, orderBy);
		if (linea_Paradas != null && linea_Paradas.length > 0)
			return linea_Paradas[0];
		else
			return null;
	}
	
	public static Linea_Parada loadLinea_ParadaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Linea_Parada[] linea_Paradas = listLinea_ParadaByQuery(session, condition, orderBy, lockMode);
		if (linea_Paradas != null && linea_Paradas.length > 0)
			return linea_Paradas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLinea_ParadaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return iterateLinea_ParadaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLinea_ParadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return iterateLinea_ParadaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLinea_ParadaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.Linea_Parada as Linea_Parada");
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
	
	public static java.util.Iterator iterateLinea_ParadaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.Linea_Parada as Linea_Parada");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Linea_Parada", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea_Parada createLinea_Parada() {
		return new diagrama_de_base_de_datos.Linea_Parada();
	}
	
	public static boolean save(diagrama_de_base_de_datos.Linea_Parada linea_Parada) throws PersistentException {
		try {
			diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().saveObject(linea_Parada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(diagrama_de_base_de_datos.Linea_Parada linea_Parada) throws PersistentException {
		try {
			diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().deleteObject(linea_Parada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(diagrama_de_base_de_datos.Linea_Parada linea_Parada)throws PersistentException {
		try {
			if (linea_Parada.getLinea() != null) {
				linea_Parada.getLinea().linea_Paradas.remove(linea_Parada);
			}
			
			if (linea_Parada.getParada() != null) {
				linea_Parada.getParada().linea_Paradas.remove(linea_Parada);
			}
			
			return delete(linea_Parada);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(diagrama_de_base_de_datos.Linea_Parada linea_Parada, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (linea_Parada.getLinea() != null) {
				linea_Parada.getLinea().linea_Paradas.remove(linea_Parada);
			}
			
			if (linea_Parada.getParada() != null) {
				linea_Parada.getParada().linea_Paradas.remove(linea_Parada);
			}
			
			try {
				session.delete(linea_Parada);
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
	
	public static boolean refresh(diagrama_de_base_de_datos.Linea_Parada linea_Parada) throws PersistentException {
		try {
			diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().refresh(linea_Parada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(diagrama_de_base_de_datos.Linea_Parada linea_Parada) throws PersistentException {
		try {
			diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().evict(linea_Parada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea_Parada loadLinea_ParadaByCriteria(Linea_ParadaCriteria linea_ParadaCriteria) {
		Linea_Parada[] linea_Paradas = listLinea_ParadaByCriteria(linea_ParadaCriteria);
		if(linea_Paradas == null || linea_Paradas.length == 0) {
			return null;
		}
		return linea_Paradas[0];
	}
	
	public static Linea_Parada[] listLinea_ParadaByCriteria(Linea_ParadaCriteria linea_ParadaCriteria) {
		return linea_ParadaCriteria.listLinea_Parada();
	}
}
