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
public class Imagen implements Serializable {
	public Imagen() {
	}
	
	private int ID;
	
	private diagrama_de_base_de_datos.Parada contiene;
	
	private String imagen;
	
	private String tipo;
	
	private diagrama_de_base_de_datos.Linea linea;
	
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
	
	public void setContiene(diagrama_de_base_de_datos.Parada value) {
		if (this.contiene != value) {
			diagrama_de_base_de_datos.Parada lcontiene = this.contiene;
			this.contiene = value;
			if (value != null) {
				contiene.setImagen_pertenece(this);
			}
			if (lcontiene != null && lcontiene.getImagen_pertenece() == this) {
				lcontiene.setImagen_pertenece(null);
			}
		}
	}
	
	public diagrama_de_base_de_datos.Parada getContiene() {
		return contiene;
	}
	
	public void setLinea(diagrama_de_base_de_datos.Linea value) {
		if (this.linea != value) {
			diagrama_de_base_de_datos.Linea llinea = this.linea;
			this.linea = value;
			if (value != null) {
				linea.setImagen(this);
			}
			if (llinea != null && llinea.getImagen() == this) {
				llinea.setImagen(null);
			}
		}
	}
	
	public diagrama_de_base_de_datos.Linea getLinea() {
		return linea;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
