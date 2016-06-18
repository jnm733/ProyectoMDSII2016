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
public class Barrio implements Serializable {
	public Barrio() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == diagrama_de_base_de_datos.ORMConstants.KEY_BARRIO_PERTENECE) {
			return ORM_pertenece;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private String nombreBarrio;
	
	private int codigoPostal;
	
	private java.util.Set ORM_pertenece = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNombreBarrio(String value) {
		this.nombreBarrio = value;
	}
	
	public String getNombreBarrio() {
		return nombreBarrio;
	}
	
	public void setCodigoPostal(int value) {
		this.codigoPostal = value;
	}
	
	public int getCodigoPostal() {
		return codigoPostal;
	}
	
	private void setORM_Pertenece(java.util.Set value) {
		this.ORM_pertenece = value;
	}
	
	private java.util.Set getORM_Pertenece() {
		return ORM_pertenece;
	}
	
	public final diagrama_de_base_de_datos.DireccionSetCollection pertenece = new diagrama_de_base_de_datos.DireccionSetCollection(this, _ormAdapter, diagrama_de_base_de_datos.ORMConstants.KEY_BARRIO_PERTENECE, diagrama_de_base_de_datos.ORMConstants.KEY_DIRECCION_CONTIENE, diagrama_de_base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
