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
public class Direccion implements Serializable {
	public Direccion() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == gestion_de_lineas.ORMConstants.KEY_DIRECCION_CONTIENE) {
			this.contiene = (gestion_de_lineas.Barrio) owner;
		}
		
		else if (key == gestion_de_lineas.ORMConstants.KEY_DIRECCION_PARADA_SE_UBICA) {
			this.parada_se_ubica = (gestion_de_lineas.Parada) owner;
		}
		
		else if (key == gestion_de_lineas.ORMConstants.KEY_DIRECCION_EVENTO_SE_UBICA) {
			this.evento_se_ubica = (gestion_de_lineas.Evento) owner;
		}
		
		else if (key == gestion_de_lineas.ORMConstants.KEY_DIRECCION_PTO_SE_UBICA) {
			this.pto_se_ubica = (gestion_de_lineas.PuntoInteres) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private gestion_de_lineas.PuntoInteres pto_se_ubica;
	
	private gestion_de_lineas.Evento evento_se_ubica;
	
	private gestion_de_lineas.Parada parada_se_ubica;
	
	private gestion_de_lineas.Barrio contiene;
	
	private String calle;
	
	private int numero;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setCalle(String value) {
		this.calle = value;
	}
	
	public String getCalle() {
		return calle;
	}
	
	public void setNumero(int value) {
		this.numero = value;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setContiene(gestion_de_lineas.Barrio value) {
		if (contiene != null) {
			contiene.pertenece.remove(this);
		}
		if (value != null) {
			value.pertenece.add(this);
		}
	}
	
	public gestion_de_lineas.Barrio getContiene() {
		return contiene;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Contiene(gestion_de_lineas.Barrio value) {
		this.contiene = value;
	}
	
	private gestion_de_lineas.Barrio getORM_Contiene() {
		return contiene;
	}
	
	public void setParada_se_ubica(gestion_de_lineas.Parada value) {
		if (this.parada_se_ubica != value) {
			gestion_de_lineas.Parada lparada_se_ubica = this.parada_se_ubica;
			this.parada_se_ubica = value;
			if (value != null) {
				parada_se_ubica.setDireccion_contiene(this);
			}
			if (lparada_se_ubica != null && lparada_se_ubica.getDireccion_contiene() == this) {
				lparada_se_ubica.setDireccion_contiene(null);
			}
		}
	}
	
	public gestion_de_lineas.Parada getParada_se_ubica() {
		return parada_se_ubica;
	}
	
	public void setEvento_se_ubica(gestion_de_lineas.Evento value) {
		if (this.evento_se_ubica != value) {
			gestion_de_lineas.Evento levento_se_ubica = this.evento_se_ubica;
			this.evento_se_ubica = value;
			if (value != null) {
				evento_se_ubica.setTiene_evento(this);
			}
			if (levento_se_ubica != null && levento_se_ubica.getTiene_evento() == this) {
				levento_se_ubica.setTiene_evento(null);
			}
		}
	}
	
	public gestion_de_lineas.Evento getEvento_se_ubica() {
		return evento_se_ubica;
	}
	
	public void setPto_se_ubica(gestion_de_lineas.PuntoInteres value) {
		if (this.pto_se_ubica != value) {
			gestion_de_lineas.PuntoInteres lpto_se_ubica = this.pto_se_ubica;
			this.pto_se_ubica = value;
			if (value != null) {
				pto_se_ubica.setTiene(this);
			}
			if (lpto_se_ubica != null && lpto_se_ubica.getTiene() == this) {
				lpto_se_ubica.setTiene(null);
			}
		}
	}
	
	public gestion_de_lineas.PuntoInteres getPto_se_ubica() {
		return pto_se_ubica;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
