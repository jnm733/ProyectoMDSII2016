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
public class Linea_Parada implements Serializable {
	public Linea_Parada() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == diagrama_de_base_de_datos.ORMConstants.KEY_LINEA_PARADA_PARADA) {
			this.parada = (diagrama_de_base_de_datos.Parada) owner;
		}
		
		else if (key == diagrama_de_base_de_datos.ORMConstants.KEY_LINEA_PARADA_LINEA) {
			this.linea = (diagrama_de_base_de_datos.Linea) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private diagrama_de_base_de_datos.Linea linea;
	
	private diagrama_de_base_de_datos.Parada parada;
	
	private String nombreParada;
	
	private String numeroLinea;
	
	private double distancia;
	
	private String horaPaso;
	
	private String posicion;
	
	public void setNombreParada(String value) {
		this.nombreParada = value;
	}
	
	public String getNombreParada() {
		return nombreParada;
	}
	
	public void setNumeroLinea(String value) {
		this.numeroLinea = value;
	}
	
	public String getNumeroLinea() {
		return numeroLinea;
	}
	
	public void setDistancia(double value) {
		this.distancia = value;
	}
	
	public double getDistancia() {
		return distancia;
	}
	
	public void setHoraPaso(String value) {
		this.horaPaso = value;
	}
	
	public String getHoraPaso() {
		return horaPaso;
	}
	
	public void setPosicion(String value) {
		this.posicion = value;
	}
	
	public String getPosicion() {
		return posicion;
	}
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setParada(diagrama_de_base_de_datos.Parada value) {
		if (parada != null) {
			parada.linea_Paradas.remove(this);
		}
		if (value != null) {
			value.linea_Paradas.add(this);
		}
	}
	
	public diagrama_de_base_de_datos.Parada getParada() {
		return parada;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Parada(diagrama_de_base_de_datos.Parada value) {
		this.parada = value;
	}
	
	private diagrama_de_base_de_datos.Parada getORM_Parada() {
		return parada;
	}
	
	public void setLinea(diagrama_de_base_de_datos.Linea value) {
		if (linea != null) {
			linea.linea_Paradas.remove(this);
		}
		if (value != null) {
			value.linea_Paradas.add(this);
		}
	}
	
	public diagrama_de_base_de_datos.Linea getLinea() {
		return linea;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Linea(diagrama_de_base_de_datos.Linea value) {
		this.linea = value;
	}
	
	private diagrama_de_base_de_datos.Linea getORM_Linea() {
		return linea;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
