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
public class Usuario implements Serializable {
	public Usuario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == diagrama_de_base_de_datos.ORMConstants.KEY_USUARIO_REALIZADA_POR) {
			return ORM_realizada_por;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private String nombre;
	
	private String password;
	
	private String email;
	
	private java.util.Set ORM_realizada_por = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	private void setORM_Realizada_por(java.util.Set value) {
		this.ORM_realizada_por = value;
	}
	
	private java.util.Set getORM_Realizada_por() {
		return ORM_realizada_por;
	}
	
	public final diagrama_de_base_de_datos.ConsultaSetCollection realizada_por = new diagrama_de_base_de_datos.ConsultaSetCollection(this, _ormAdapter, diagrama_de_base_de_datos.ORMConstants.KEY_USUARIO_REALIZADA_POR, diagrama_de_base_de_datos.ORMConstants.KEY_CONSULTA_REALIZA, diagrama_de_base_de_datos.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public boolean identificarse(String nombre, String password, String email) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public boolean registrarse(String nombre, String password, String email) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
