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
public class PuntoInteres implements Serializable {
	public PuntoInteres() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == diagrama_de_base_de_datos.ORMConstants.KEY_PUNTOINTERES_CONTIENE) {
			return ORM_contiene;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == diagrama_de_base_de_datos.ORMConstants.KEY_PUNTOINTERES_TIENE) {
			this.tiene = (diagrama_de_base_de_datos.Direccion) owner;
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
	
	private String nombrePunto;
	
	private String direccionPunto;
	
	private java.util.Set ORM_contiene = new java.util.HashSet();
	
	private diagrama_de_base_de_datos.Direccion tiene;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNombrePunto(String value) {
		this.nombrePunto = value;
	}
	
	public String getNombrePunto() {
		return nombrePunto;
	}
	
	public void setDireccionPunto(String value) {
		this.direccionPunto = value;
	}
	
	public String getDireccionPunto() {
		return direccionPunto;
	}
	
	private void setORM_Contiene(java.util.Set value) {
		this.ORM_contiene = value;
	}
	
	private java.util.Set getORM_Contiene() {
		return ORM_contiene;
	}
	
	public final diagrama_de_base_de_datos.ParadaSetCollection contiene = new diagrama_de_base_de_datos.ParadaSetCollection(this, _ormAdapter, diagrama_de_base_de_datos.ORMConstants.KEY_PUNTOINTERES_CONTIENE, diagrama_de_base_de_datos.ORMConstants.KEY_PARADA_PERTENECE, diagrama_de_base_de_datos.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setTiene(diagrama_de_base_de_datos.Direccion value) {
		if (this.tiene != value) {
			diagrama_de_base_de_datos.Direccion ltiene = this.tiene;
			this.tiene = value;
			if (value != null) {
				tiene.setPto_se_ubica(this);
			}
			if (ltiene != null && ltiene.getPto_se_ubica() == this) {
				ltiene.setPto_se_ubica(null);
			}
		}
	}
	
	public diagrama_de_base_de_datos.Direccion getTiene() {
		return tiene;
	}
	
	public PuntoInteres getPtoInteres(String nombre) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void vincularPtosInteres(ArrayList incluidos, ArrayList excluidos) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void incluirPtoInteres(ArrayList datos) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void borrarPto(String nombre) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
