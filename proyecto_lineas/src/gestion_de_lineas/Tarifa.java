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

import java.io.Serializable;
public class Tarifa implements Serializable {
	public Tarifa() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == gestion_de_lineas.ORMConstants.KEY_TARIFA_COBRA) {
			return ORM_cobra;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private Double precio;
	
	private java.util.Set ORM_cobra = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setPrecio(double value) {
		setPrecio(new Double(value));
	}
	
	public void setPrecio(Double value) {
		this.precio = value;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	private void setORM_Cobra(java.util.Set value) {
		this.ORM_cobra = value;
	}
	
	private java.util.Set getORM_Cobra() {
		return ORM_cobra;
	}
	
	public final gestion_de_lineas.LineaSetCollection cobra = new gestion_de_lineas.LineaSetCollection(this, _ormAdapter, gestion_de_lineas.ORMConstants.KEY_TARIFA_COBRA, gestion_de_lineas.ORMConstants.KEY_LINEA_ES_USADA, gestion_de_lineas.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
