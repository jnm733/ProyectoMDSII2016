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
public class Consulta implements Serializable {
	public Consulta() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == diagrama_de_base_de_datos.ORMConstants.KEY_CONSULTA_REALIZA) {
			this.realiza = (diagrama_de_base_de_datos.Usuario) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private diagrama_de_base_de_datos.Usuario realiza;
	
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
	
	public void setRealiza(diagrama_de_base_de_datos.Usuario value) {
		if (realiza != null) {
			realiza.realizada_por.remove(this);
		}
		if (value != null) {
			value.realizada_por.add(this);
		}
	}
	
	public diagrama_de_base_de_datos.Usuario getRealiza() {
		return realiza;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Realiza(diagrama_de_base_de_datos.Usuario value) {
		this.realiza = value;
	}
	
	private diagrama_de_base_de_datos.Usuario getORM_Realiza() {
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
