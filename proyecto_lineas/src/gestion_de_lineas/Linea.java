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
public class Linea implements Serializable {
	public Linea() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == gestion_de_lineas.ORMConstants.KEY_LINEA_PERTENECE) {
			return ORM_pertenece;
		}
		else if (key == gestion_de_lineas.ORMConstants.KEY_LINEA_ES_USADA) {
			return ORM_es_usada;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == gestion_de_lineas.ORMConstants.KEY_LINEA_IMAGEN) {
			this.imagen = (gestion_de_lineas.Imagen) owner;
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
	
	private gestion_de_lineas.Imagen imagen;
	
	private String nombreLinea;
	
	private String numeroLinea;
	
	private Double tarifaLinea;
	
	private String empresaGestora;
	
	private String horario;
	
	private String recorrido;
	
	private java.util.Set ORM_pertenece = new java.util.HashSet();
	
	private java.util.Set ORM_es_usada = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNombreLinea(String value) {
		this.nombreLinea = value;
	}
	
	public String getNombreLinea() {
		return nombreLinea;
	}
	
	public void setNumeroLinea(String value) {
		this.numeroLinea = value;
	}
	
	public String getNumeroLinea() {
		return numeroLinea;
	}
	
	public void setTarifaLinea(double value) {
		setTarifaLinea(new Double(value));
	}
	
	public void setTarifaLinea(Double value) {
		this.tarifaLinea = value;
	}
	
	public Double getTarifaLinea() {
		return tarifaLinea;
	}
	
	public void setEmpresaGestora(String value) {
		this.empresaGestora = value;
	}
	
	public String getEmpresaGestora() {
		return empresaGestora;
	}
	
	public void setHorario(String value) {
		this.horario = value;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public void setRecorrido(String value) {
		this.recorrido = value;
	}
	
	public String getRecorrido() {
		return recorrido;
	}
	
	public void setImagen(gestion_de_lineas.Imagen value) {
		if (this.imagen != value) {
			gestion_de_lineas.Imagen limagen = this.imagen;
			this.imagen = value;
			if (value != null) {
				imagen.setLinea(this);
			}
			if (limagen != null && limagen.getLinea() == this) {
				limagen.setLinea(null);
			}
		}
	}
	
	public gestion_de_lineas.Imagen getImagen() {
		return imagen;
	}
	
	private void setORM_Pertenece(java.util.Set value) {
		this.ORM_pertenece = value;
	}
	
	private java.util.Set getORM_Pertenece() {
		return ORM_pertenece;
	}
	
	public final gestion_de_lineas.ParadaSetCollection pertenece = new gestion_de_lineas.ParadaSetCollection(this, _ormAdapter, gestion_de_lineas.ORMConstants.KEY_LINEA_PERTENECE, gestion_de_lineas.ORMConstants.KEY_PARADA_CONTIENE, gestion_de_lineas.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Es_usada(java.util.Set value) {
		this.ORM_es_usada = value;
	}
	
	private java.util.Set getORM_Es_usada() {
		return ORM_es_usada;
	}
	
	public final gestion_de_lineas.TarifaSetCollection es_usada = new gestion_de_lineas.TarifaSetCollection(this, _ormAdapter, gestion_de_lineas.ORMConstants.KEY_LINEA_ES_USADA, gestion_de_lineas.ORMConstants.KEY_TARIFA_COBRA, gestion_de_lineas.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public diagrama_de_clases.Lineas getLinea(String nombre) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public diagrama_de_clases.Lineas filtrar(String nombre) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void deleteLinea(diagrama_de_clases.Lineas linea) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void addLinea(ArrayList datos) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void vincularParadas(ArrayList incluidos, ArrayList excluidos) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
