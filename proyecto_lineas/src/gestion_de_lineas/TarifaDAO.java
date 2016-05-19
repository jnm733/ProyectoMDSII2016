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

public class TarifaDAO {
	public static Tarifa loadTarifaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return loadTarifaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tarifa getTarifaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return getTarifaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tarifa loadTarifaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return loadTarifaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tarifa getTarifaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return getTarifaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tarifa loadTarifaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Tarifa) session.load(gestion_de_lineas.Tarifa.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tarifa getTarifaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Tarifa) session.get(gestion_de_lineas.Tarifa.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tarifa loadTarifaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tarifa) session.load(gestion_de_lineas.Tarifa.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tarifa getTarifaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tarifa) session.get(gestion_de_lineas.Tarifa.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTarifa(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return queryTarifa(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTarifa(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return queryTarifa(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tarifa[] listTarifaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return listTarifaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tarifa[] listTarifaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return listTarifaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTarifa(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.Tarifa as Tarifa");
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
	
	public static List queryTarifa(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.Tarifa as Tarifa");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tarifa", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tarifa[] listTarifaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTarifa(session, condition, orderBy);
			return (Tarifa[]) list.toArray(new Tarifa[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tarifa[] listTarifaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTarifa(session, condition, orderBy, lockMode);
			return (Tarifa[]) list.toArray(new Tarifa[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tarifa loadTarifaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return loadTarifaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tarifa loadTarifaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return loadTarifaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tarifa loadTarifaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tarifa[] tarifas = listTarifaByQuery(session, condition, orderBy);
		if (tarifas != null && tarifas.length > 0)
			return tarifas[0];
		else
			return null;
	}
	
	public static Tarifa loadTarifaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tarifa[] tarifas = listTarifaByQuery(session, condition, orderBy, lockMode);
		if (tarifas != null && tarifas.length > 0)
			return tarifas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTarifaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return iterateTarifaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTarifaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession();
			return iterateTarifaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTarifaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.Tarifa as Tarifa");
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
	
	public static java.util.Iterator iterateTarifaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagrama_de_base_de_datos.Tarifa as Tarifa");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tarifa", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tarifa createTarifa() {
		return new gestion_de_lineas.Tarifa();
	}
	
	public static boolean save(gestion_de_lineas.Tarifa tarifa) throws PersistentException {
		try {
			gestion_de_lineas.ProyectoMDS2PersistentManager.instance().saveObject(tarifa);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(gestion_de_lineas.Tarifa tarifa) throws PersistentException {
		try {
			gestion_de_lineas.ProyectoMDS2PersistentManager.instance().deleteObject(tarifa);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(gestion_de_lineas.Tarifa tarifa)throws PersistentException {
		try {
			gestion_de_lineas.Linea[] lCobras = tarifa.cobra.toArray();
			for(int i = 0; i < lCobras.length; i++) {
				lCobras[i].es_usada.remove(tarifa);
			}
			return delete(tarifa);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(gestion_de_lineas.Tarifa tarifa, org.orm.PersistentSession session)throws PersistentException {
		try {
			gestion_de_lineas.Linea[] lCobras = tarifa.cobra.toArray();
			for(int i = 0; i < lCobras.length; i++) {
				lCobras[i].es_usada.remove(tarifa);
			}
			try {
				session.delete(tarifa);
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
	
	public static boolean refresh(gestion_de_lineas.Tarifa tarifa) throws PersistentException {
		try {
			gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession().refresh(tarifa);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(gestion_de_lineas.Tarifa tarifa) throws PersistentException {
		try {
			gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession().evict(tarifa);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tarifa loadTarifaByCriteria(TarifaCriteria tarifaCriteria) {
		Tarifa[] tarifas = listTarifaByCriteria(tarifaCriteria);
		if(tarifas == null || tarifas.length == 0) {
			return null;
		}
		return tarifas[0];
	}
	
	public static Tarifa[] listTarifaByCriteria(TarifaCriteria tarifaCriteria) {
		return tarifaCriteria.listTarifa();
	}
}
