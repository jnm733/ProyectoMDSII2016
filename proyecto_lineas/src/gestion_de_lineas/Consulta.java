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
import java.util.ArrayList;
public class Consulta implements Serializable {
	public Consulta() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == gestion_de_lineas.ORMConstants.KEY_CONSULTA_REALIZA) {
			this.realiza = (gestion_de_lineas.Usuario) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private gestion_de_lineas.Usuario realiza;
	
	private String origenConsulta;
	
	private String destinoConsulta;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setOrigenConsulta(String value) {
		this.origenConsulta = value;
	}
	
	public String getOrigenConsulta() {
		return origenConsulta;
	}
	
	public void setDestinoConsulta(String value) {
		this.destinoConsulta = value;
	}
	
	public String getDestinoConsulta() {
		return destinoConsulta;
	}
	
	public void setRealiza(gestion_de_lineas.Usuario value) {
		if (realiza != null) {
			realiza.realizada_por.remove(this);
		}
		if (value != null) {
			value.realizada_por.add(this);
		}
	}
	
	public gestion_de_lineas.Usuario getRealiza() {
		return realiza;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Realiza(gestion_de_lineas.Usuario value) {
		this.realiza = value;
	}
	
	private gestion_de_lineas.Usuario getORM_Realiza() {
		return realiza;
	}
	
	public diagrama_de_clases.SolucionConsulta getSolucionConsulta(String id) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public diagrama_de_clases.SolucionConsulta getConsulta(ArrayList datos) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
