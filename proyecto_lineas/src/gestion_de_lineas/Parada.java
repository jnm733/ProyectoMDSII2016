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
public class Parada implements Serializable {
	public Parada() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == gestion_de_lineas.ORMConstants.KEY_PARADA_CONTIENE) {
			return ORM_contiene;
		}
		else if (key == gestion_de_lineas.ORMConstants.KEY_PARADA_PERTENECE) {
			return ORM_pertenece;
		}
		else if (key == gestion_de_lineas.ORMConstants.KEY_PARADA_EVENTO_PERTENECE) {
			return ORM_evento_pertenece;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == gestion_de_lineas.ORMConstants.KEY_PARADA_DIRECCION_CONTIENE) {
			this.direccion_contiene = (gestion_de_lineas.Direccion) owner;
		}
		
		else if (key == gestion_de_lineas.ORMConstants.KEY_PARADA_IMAGEN_PERTENECE) {
			this.imagen_pertenece = (gestion_de_lineas.Imagen) owner;
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
	
	private String nombreParada;
	
	private String direccionParada;
	
	private String observaciones;
	
	private String imagenParada;
	
	private java.util.Set ORM_contiene = new java.util.HashSet();
	
	private gestion_de_lineas.Direccion direccion_contiene;
	
	private java.util.Set ORM_pertenece = new java.util.HashSet();
	
	private gestion_de_lineas.Imagen imagen_pertenece;
	
	private java.util.Set ORM_evento_pertenece = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNombreParada(String value) {
		this.nombreParada = value;
	}
	
	public String getNombreParada() {
		return nombreParada;
	}
	
	public void setDireccionParada(String value) {
		this.direccionParada = value;
	}
	
	public String getDireccionParada() {
		return direccionParada;
	}
	
	public void setObservaciones(String value) {
		this.observaciones = value;
	}
	
	public String getObservaciones() {
		return observaciones;
	}
	
	public void setImagenParada(String value) {
		this.imagenParada = value;
	}
	
	public String getImagenParada() {
		return imagenParada;
	}
	
	private void setORM_Contiene(java.util.Set value) {
		this.ORM_contiene = value;
	}
	
	private java.util.Set getORM_Contiene() {
		return ORM_contiene;
	}
	
	public final gestion_de_lineas.LineaSetCollection contiene = new gestion_de_lineas.LineaSetCollection(this, _ormAdapter, gestion_de_lineas.ORMConstants.KEY_PARADA_CONTIENE, gestion_de_lineas.ORMConstants.KEY_LINEA_PERTENECE, gestion_de_lineas.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setDireccion_contiene(gestion_de_lineas.Direccion value) {
		if (this.direccion_contiene != value) {
			gestion_de_lineas.Direccion ldireccion_contiene = this.direccion_contiene;
			this.direccion_contiene = value;
			if (value != null) {
				direccion_contiene.setParada_se_ubica(this);
			}
			if (ldireccion_contiene != null && ldireccion_contiene.getParada_se_ubica() == this) {
				ldireccion_contiene.setParada_se_ubica(null);
			}
		}
	}
	
	public gestion_de_lineas.Direccion getDireccion_contiene() {
		return direccion_contiene;
	}
	
	private void setORM_Pertenece(java.util.Set value) {
		this.ORM_pertenece = value;
	}
	
	private java.util.Set getORM_Pertenece() {
		return ORM_pertenece;
	}
	
	public final gestion_de_lineas.PuntoInteresSetCollection pertenece = new gestion_de_lineas.PuntoInteresSetCollection(this, _ormAdapter, gestion_de_lineas.ORMConstants.KEY_PARADA_PERTENECE, gestion_de_lineas.ORMConstants.KEY_PUNTOINTERES_CONTIENE, gestion_de_lineas.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setImagen_pertenece(gestion_de_lineas.Imagen value) {
		if (this.imagen_pertenece != value) {
			gestion_de_lineas.Imagen limagen_pertenece = this.imagen_pertenece;
			this.imagen_pertenece = value;
			if (value != null) {
				imagen_pertenece.setContiene(this);
			}
			if (limagen_pertenece != null && limagen_pertenece.getContiene() == this) {
				limagen_pertenece.setContiene(null);
			}
		}
	}
	
	public gestion_de_lineas.Imagen getImagen_pertenece() {
		return imagen_pertenece;
	}
	
	private void setORM_Evento_pertenece(java.util.Set value) {
		this.ORM_evento_pertenece = value;
	}
	
	private java.util.Set getORM_Evento_pertenece() {
		return ORM_evento_pertenece;
	}
	
	public final gestion_de_lineas.EventoSetCollection evento_pertenece = new gestion_de_lineas.EventoSetCollection(this, _ormAdapter, gestion_de_lineas.ORMConstants.KEY_PARADA_EVENTO_PERTENECE, gestion_de_lineas.ORMConstants.KEY_EVENTO_CONTIENE, gestion_de_lineas.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public diagrama_de_clases.Paradas getParada(String nombre) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public diagrama_de_clases.Lineas getLinea(String nombre) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void addParada(ArrayList datos) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void borrarParada(String nombre) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
