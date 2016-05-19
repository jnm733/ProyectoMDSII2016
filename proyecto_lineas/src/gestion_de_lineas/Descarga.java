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
public class Descarga implements Serializable {
	public Descarga() {
	}
	
	private int ID;
	
	private String tituloDescarga;
	
	private String descripcionDescarga;
	
	private String urlDescarga;
	
	private java.math.BigDecimal tamaño;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setTituloDescarga(String value) {
		this.tituloDescarga = value;
	}
	
	public String getTituloDescarga() {
		return tituloDescarga;
	}
	
	public void setDescripcionDescarga(String value) {
		this.descripcionDescarga = value;
	}
	
	public String getDescripcionDescarga() {
		return descripcionDescarga;
	}
	
	public void setUrlDescarga(String value) {
		this.urlDescarga = value;
	}
	
	public String getUrlDescarga() {
		return urlDescarga;
	}
	
	public void setTamaño(java.math.BigDecimal value) {
		this.tamaño = value;
	}
	
	public java.math.BigDecimal getTamaño() {
		return tamaño;
	}
	
	public void descargar(Object archivo) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void agregarDescarga(ArrayList datos, Object archivo) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
