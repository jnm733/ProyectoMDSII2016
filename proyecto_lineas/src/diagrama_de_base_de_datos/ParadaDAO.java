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

public class ParadaDAO {
	public static Parada loadParadaByORMID(String nombreParada) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return loadParadaByORMID(session, nombreParada);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada getParadaByORMID(String nombreParada) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return getParadaByORMID(session, nombreParada);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada loadParadaByORMID(String nombreParada, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return loadParadaByORMID(session, nombreParada, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada getParadaByORMID(String nombreParada, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return getParadaByORMID(session, nombreParada, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada loadParadaByORMID(PersistentSession session, String nombreParada) throws PersistentException {
		try {
			return (Parada) session.load(diagrama_de_base_de_datos.Parada.class, nombreParada);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada getParadaByORMID(PersistentSession session, String nombreParada) throws PersistentException {
		try {
			return (Parada) session.get(diagrama_de_base_de_datos.Parada.class, nombreParada);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada loadParadaByORMID(PersistentSession session, String nombreParada, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Parada) session.load(diagrama_de_base_de_datos.Parada.class, nombreParada, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada getParadaByORMID(PersistentSession session, String nombreParada, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Parada) session.get(diagrama_de_base_de_datos.Parada.class, nombreParada, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryParada(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return queryParada(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryParada(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return queryParada(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada[] listParadaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return listParadaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada[] listParadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return listParadaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryParada(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.Parada as Parada");
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
	
	public static List queryParada(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.Parada as Parada");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Parada", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada[] listParadaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryParada(session, condition, orderBy);
			return (Parada[]) list.toArray(new Parada[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada[] listParadaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryParada(session, condition, orderBy, lockMode);
			return (Parada[]) list.toArray(new Parada[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada loadParadaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return loadParadaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada loadParadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return loadParadaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada loadParadaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Parada[] paradas = listParadaByQuery(session, condition, orderBy);
		if (paradas != null && paradas.length > 0)
			return paradas[0];
		else
			return null;
	}
	
	public static Parada loadParadaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Parada[] paradas = listParadaByQuery(session, condition, orderBy, lockMode);
		if (paradas != null && paradas.length > 0)
			return paradas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateParadaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return iterateParadaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateParadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession();
			return iterateParadaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateParadaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.Parada as Parada");
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
	
	public static java.util.Iterator iterateParadaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.Parada as Parada");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Parada", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada createParada() {
		return new diagrama_de_base_de_datos.Parada();
	}
	
	public static boolean save(diagrama_de_base_de_datos.Parada parada) throws PersistentException {
		try {
			diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().saveObject(parada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(diagrama_de_base_de_datos.Parada parada) throws PersistentException {
		try {
			diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().deleteObject(parada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(diagrama_de_base_de_datos.Parada parada)throws PersistentException {
		try {
			if (parada.getParadaa() != null) {
				parada.getParadaa().setParada(null);
			}
			
			if (parada.getDireccion_contiene() != null) {
				parada.getDireccion_contiene().setParada_se_ubica(null);
			}
			
			diagrama_de_base_de_datos.PuntoInteres[] lPerteneces = parada.pertenece.toArray();
			for(int i = 0; i < lPerteneces.length; i++) {
				lPerteneces[i].contiene.remove(parada);
			}
			if (parada.getImagen_pertenece() != null) {
				parada.getImagen_pertenece().setContiene(null);
			}
			
			diagrama_de_base_de_datos.Evento[] lEvento_perteneces = parada.evento_pertenece.toArray();
			for(int i = 0; i < lEvento_perteneces.length; i++) {
				lEvento_perteneces[i].contiene.remove(parada);
			}
			if (parada.getParada() != null) {
				parada.getParada().setParadaa(null);
			}
			
			diagrama_de_base_de_datos.Linea_Parada[] lLinea_Paradass = parada.linea_Paradas.toArray();
			for(int i = 0; i < lLinea_Paradass.length; i++) {
				lLinea_Paradass[i].setParada(null);
			}
			return delete(parada);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(diagrama_de_base_de_datos.Parada parada, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (parada.getParadaa() != null) {
				parada.getParadaa().setParada(null);
			}
			
			if (parada.getDireccion_contiene() != null) {
				parada.getDireccion_contiene().setParada_se_ubica(null);
			}
			
			diagrama_de_base_de_datos.PuntoInteres[] lPerteneces = parada.pertenece.toArray();
			for(int i = 0; i < lPerteneces.length; i++) {
				lPerteneces[i].contiene.remove(parada);
			}
			if (parada.getImagen_pertenece() != null) {
				parada.getImagen_pertenece().setContiene(null);
			}
			
			diagrama_de_base_de_datos.Evento[] lEvento_perteneces = parada.evento_pertenece.toArray();
			for(int i = 0; i < lEvento_perteneces.length; i++) {
				lEvento_perteneces[i].contiene.remove(parada);
			}
			if (parada.getParada() != null) {
				parada.getParada().setParadaa(null);
			}
			
			diagrama_de_base_de_datos.Linea_Parada[] lLinea_Paradass = parada.linea_Paradas.toArray();
			for(int i = 0; i < lLinea_Paradass.length; i++) {
				lLinea_Paradass[i].setParada(null);
			}
			try {
				session.delete(parada);
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
	
	public static boolean refresh(diagrama_de_base_de_datos.Parada parada) throws PersistentException {
		try {
			diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().refresh(parada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(diagrama_de_base_de_datos.Parada parada) throws PersistentException {
		try {
			diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().evict(parada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada loadParadaByCriteria(ParadaCriteria paradaCriteria) {
		Parada[] paradas = listParadaByCriteria(paradaCriteria);
		if(paradas == null || paradas.length == 0) {
			return null;
		}
		return paradas[0];
	}
	
	public static Parada[] listParadaByCriteria(ParadaCriteria paradaCriteria) {
		return paradaCriteria.listParada();
	}
}
