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

public class LineaDAO {
	public static Linea loadLineaByORMID(String numeroLinea) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return loadLineaByORMID(session, numeroLinea);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea getLineaByORMID(String numeroLinea) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return getLineaByORMID(session, numeroLinea);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea loadLineaByORMID(String numeroLinea, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return loadLineaByORMID(session, numeroLinea, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea getLineaByORMID(String numeroLinea, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return getLineaByORMID(session, numeroLinea, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea loadLineaByORMID(PersistentSession session, String numeroLinea) throws PersistentException {
		try {
			return (Linea) session.load(diagrama_de_base_de_datos.Linea.class, numeroLinea);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea getLineaByORMID(PersistentSession session, String numeroLinea) throws PersistentException {
		try {
			return (Linea) session.get(diagrama_de_base_de_datos.Linea.class, numeroLinea);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea loadLineaByORMID(PersistentSession session, String numeroLinea, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Linea) session.load(diagrama_de_base_de_datos.Linea.class, numeroLinea, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea getLineaByORMID(PersistentSession session, String numeroLinea, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Linea) session.get(diagrama_de_base_de_datos.Linea.class, numeroLinea, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLinea(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return queryLinea(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLinea(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return queryLinea(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea[] listLineaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return listLineaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea[] listLineaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
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
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return loadLineaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Linea loadLineaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
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
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return iterateLineaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLineaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
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
		return new diagrama_de_base_de_datos.Linea();
	}
	
	public static boolean save(diagrama_de_base_de_datos.Linea linea) throws PersistentException {
		try {
			diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().saveObject(linea);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(diagrama_de_base_de_datos.Linea linea) throws PersistentException {
		try {
			diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().deleteObject(linea);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(diagrama_de_base_de_datos.Linea linea)throws PersistentException {
		try {
			if (linea.getImagen() != null) {
				linea.getImagen().setLinea(null);
			}
			
			diagrama_de_base_de_datos.Linea_Parada[] lLinea_Paradass = linea.linea_Paradas.toArray();
			for(int i = 0; i < lLinea_Paradass.length; i++) {
				lLinea_Paradass[i].setLinea(null);
			}
			diagrama_de_base_de_datos.Tarifa[] lEs_usadas = linea.es_usada.toArray();
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
	
	public static boolean deleteAndDissociate(diagrama_de_base_de_datos.Linea linea, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (linea.getImagen() != null) {
				linea.getImagen().setLinea(null);
			}
			
			diagrama_de_base_de_datos.Linea_Parada[] lLinea_Paradass = linea.linea_Paradas.toArray();
			for(int i = 0; i < lLinea_Paradass.length; i++) {
				lLinea_Paradass[i].setLinea(null);
			}
			diagrama_de_base_de_datos.Tarifa[] lEs_usadas = linea.es_usada.toArray();
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
	
	public static boolean refresh(diagrama_de_base_de_datos.Linea linea) throws PersistentException {
		try {
			diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().refresh(linea);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(diagrama_de_base_de_datos.Linea linea) throws PersistentException {
		try {
			diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().evict(linea);
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
