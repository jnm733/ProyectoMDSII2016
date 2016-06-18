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

import java.io.Serializable;
import java.util.ArrayList;
public class Evento implements Serializable {
	public Evento() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == diagrama_de_base_de_datos.ORMConstants.KEY_EVENTO_CONTIENE) {
			return ORM_contiene;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == diagrama_de_base_de_datos.ORMConstants.KEY_EVENTO_TIENE_EVENTO) {
			this.tiene_evento = (diagrama_de_base_de_datos.Direccion) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private String nombreEvento;
	
	private String direccionEvento;
	
	private java.util.Date fechaInicio;
	
	private java.util.Date fechaFin;
	
	private java.util.Set ORM_contiene = new java.util.HashSet();
	
	private diagrama_de_base_de_datos.Direccion tiene_evento;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNombreEvento(String value) {
		this.nombreEvento = value;
	}
	
	public String getNombreEvento() {
		return nombreEvento;
	}
	
	public void setDireccionEvento(String value) {
		this.direccionEvento = value;
	}
	
	public String getDireccionEvento() {
		return direccionEvento;
	}
	
	public void setFechaInicio(java.util.Date value) {
		this.fechaInicio = value;
	}
	
	public java.util.Date getFechaInicio() {
		return fechaInicio;
	}
	
	public void setFechaFin(java.util.Date value) {
		this.fechaFin = value;
	}
	
	public java.util.Date getFechaFin() {
		return fechaFin;
	}
	
	private void setORM_Contiene(java.util.Set value) {
		this.ORM_contiene = value;
	}
	
	private java.util.Set getORM_Contiene() {
		return ORM_contiene;
	}
	
	public final diagrama_de_base_de_datos.ParadaSetCollection contiene = new diagrama_de_base_de_datos.ParadaSetCollection(this, _ormAdapter, diagrama_de_base_de_datos.ORMConstants.KEY_EVENTO_CONTIENE, diagrama_de_base_de_datos.ORMConstants.KEY_PARADA_EVENTO_PERTENECE, diagrama_de_base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setTiene_evento(diagrama_de_base_de_datos.Direccion value) {
		if (this.tiene_evento != value) {
			diagrama_de_base_de_datos.Direccion ltiene_evento = this.tiene_evento;
			this.tiene_evento = value;
			if (value != null) {
				tiene_evento.setEvento_se_ubica(this);
			}
			if (ltiene_evento != null && ltiene_evento.getEvento_se_ubica() == this) {
				ltiene_evento.setEvento_se_ubica(null);
			}
		}
	}
	
	public diagrama_de_base_de_datos.Direccion getTiene_evento() {
		return tiene_evento;
	}
	
	public void vincularEventos(ArrayList incluidos, ArrayList excluidos) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void incluirEvento(ArrayList datos) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void borrarEvento(String id) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
