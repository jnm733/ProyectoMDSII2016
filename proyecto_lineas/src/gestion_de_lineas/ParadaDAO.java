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

public class ParadaDAO {
	public static Parada loadParadaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return loadParadaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada getParadaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return getParadaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada loadParadaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return loadParadaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada getParadaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return getParadaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada loadParadaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Parada) session.load(gestion_de_lineas.Parada.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada getParadaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Parada) session.get(gestion_de_lineas.Parada.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada loadParadaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Parada) session.load(gestion_de_lineas.Parada.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada getParadaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Parada) session.get(gestion_de_lineas.Parada.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryParada(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return queryParada(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryParada(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return queryParada(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada[] listParadaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return listParadaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada[] listParadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
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
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return loadParadaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Parada loadParadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
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
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return iterateParadaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateParadaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
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
		return new gestion_de_lineas.Parada();
	}
	
	public static boolean save(gestion_de_lineas.Parada parada) throws PersistentException {
		try {
			gestion_de_lineas.ProyectoMDS2PersistentManager.instance().saveObject(parada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(gestion_de_lineas.Parada parada) throws PersistentException {
		try {
			gestion_de_lineas.ProyectoMDS2PersistentManager.instance().deleteObject(parada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(gestion_de_lineas.Parada parada)throws PersistentException {
		try {
			gestion_de_lineas.Linea[] lContienes = parada.contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].pertenece.remove(parada);
			}
			if (parada.getDireccion_contiene() != null) {
				parada.getDireccion_contiene().setParada_se_ubica(null);
			}
			
			gestion_de_lineas.PuntoInteres[] lPerteneces = parada.pertenece.toArray();
			for(int i = 0; i < lPerteneces.length; i++) {
				lPerteneces[i].contiene.remove(parada);
			}
			if (parada.getImagen_pertenece() != null) {
				parada.getImagen_pertenece().setContiene(null);
			}
			
			gestion_de_lineas.Evento[] lEvento_perteneces = parada.evento_pertenece.toArray();
			for(int i = 0; i < lEvento_perteneces.length; i++) {
				lEvento_perteneces[i].contiene.remove(parada);
			}
			return delete(parada);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(gestion_de_lineas.Parada parada, org.orm.PersistentSession session)throws PersistentException {
		try {
			gestion_de_lineas.Linea[] lContienes = parada.contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].pertenece.remove(parada);
			}
			if (parada.getDireccion_contiene() != null) {
				parada.getDireccion_contiene().setParada_se_ubica(null);
			}
			
			gestion_de_lineas.PuntoInteres[] lPerteneces = parada.pertenece.toArray();
			for(int i = 0; i < lPerteneces.length; i++) {
				lPerteneces[i].contiene.remove(parada);
			}
			if (parada.getImagen_pertenece() != null) {
				parada.getImagen_pertenece().setContiene(null);
			}
			
			gestion_de_lineas.Evento[] lEvento_perteneces = parada.evento_pertenece.toArray();
			for(int i = 0; i < lEvento_perteneces.length; i++) {
				lEvento_perteneces[i].contiene.remove(parada);
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
	
	public static boolean refresh(gestion_de_lineas.Parada parada) throws PersistentException {
		try {
			gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession().refresh(parada);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(gestion_de_lineas.Parada parada) throws PersistentException {
		try {
			gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession().evict(parada);
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
