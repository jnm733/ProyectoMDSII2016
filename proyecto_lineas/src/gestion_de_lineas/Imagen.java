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
public class Imagen implements Serializable {
	public Imagen() {
	}
	
	private int ID;
	
	private gestion_de_lineas.Parada contiene;
	
	private String imagen;
	
	private String tipo;
	
	private gestion_de_lineas.Linea linea;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setImagen(String value) {
		this.imagen = value;
	}
	
	public String getImagen() {
		return imagen;
	}
	
	public void setTipo(String value) {
		this.tipo = value;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setContiene(gestion_de_lineas.Parada value) {
		if (this.contiene != value) {
			gestion_de_lineas.Parada lcontiene = this.contiene;
			this.contiene = value;
			if (value != null) {
				contiene.setImagen_pertenece(this);
			}
			if (lcontiene != null && lcontiene.getImagen_pertenece() == this) {
				lcontiene.setImagen_pertenece(null);
			}
		}
	}
	
	public gestion_de_lineas.Parada getContiene() {
		return contiene;
	}
	
	public void setLinea(gestion_de_lineas.Linea value) {
		if (this.linea != value) {
			gestion_de_lineas.Linea llinea = this.linea;
			this.linea = value;
			if (value != null) {
				linea.setImagen(this);
			}
			if (llinea != null && llinea.getImagen() == this) {
				llinea.setImagen(null);
			}
		}
	}
	
	public gestion_de_lineas.Linea getLinea() {
		return linea;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
