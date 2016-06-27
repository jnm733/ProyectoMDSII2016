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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ParadaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression nombreParada;
	public final StringExpression paradaaId;
	public final AssociationExpression paradaa;
	public final IntegerExpression ID;
	public final StringExpression direccionParada;
	public final StringExpression observaciones;
	public final StringExpression imagenParada;
	public final StringExpression direccion_contieneId;
	public final AssociationExpression direccion_contiene;
	public final CollectionExpression pertenece;
	public final StringExpression imagen_perteneceId;
	public final AssociationExpression imagen_pertenece;
	public final CollectionExpression evento_pertenece;
	public final StringExpression paradaId;
	public final AssociationExpression parada;
	public final CollectionExpression linea_Paradas;
	
	public ParadaDetachedCriteria() {
		super(diagrama_de_base_de_datos.Parada.class, diagrama_de_base_de_datos.ParadaCriteria.class);
		nombreParada = new StringExpression("nombreParada", this.getDetachedCriteria());
		paradaaId = new StringExpression("paradaa.nombreParada", this.getDetachedCriteria());
		paradaa = new AssociationExpression("paradaa", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		direccionParada = new StringExpression("direccionParada", this.getDetachedCriteria());
		observaciones = new StringExpression("observaciones", this.getDetachedCriteria());
		imagenParada = new StringExpression("imagenParada", this.getDetachedCriteria());
		direccion_contieneId = new StringExpression("direccion_contiene.nombreParada", this.getDetachedCriteria());
		direccion_contiene = new AssociationExpression("direccion_contiene", this.getDetachedCriteria());
		pertenece = new CollectionExpression("ORM_Pertenece", this.getDetachedCriteria());
		imagen_perteneceId = new StringExpression("imagen_pertenece.nombreParada", this.getDetachedCriteria());
		imagen_pertenece = new AssociationExpression("imagen_pertenece", this.getDetachedCriteria());
		evento_pertenece = new CollectionExpression("ORM_Evento_pertenece", this.getDetachedCriteria());
		paradaId = new StringExpression("parada.nombreParada", this.getDetachedCriteria());
		parada = new AssociationExpression("parada", this.getDetachedCriteria());
		linea_Paradas = new CollectionExpression("ORM_Linea_Paradas", this.getDetachedCriteria());
	}
	
	public ParadaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, diagrama_de_base_de_datos.ParadaCriteria.class);
		nombreParada = new StringExpression("nombreParada", this.getDetachedCriteria());
		paradaaId = new StringExpression("paradaa.nombreParada", this.getDetachedCriteria());
		paradaa = new AssociationExpression("paradaa", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		direccionParada = new StringExpression("direccionParada", this.getDetachedCriteria());
		observaciones = new StringExpression("observaciones", this.getDetachedCriteria());
		imagenParada = new StringExpression("imagenParada", this.getDetachedCriteria());
		direccion_contieneId = new StringExpression("direccion_contiene.nombreParada", this.getDetachedCriteria());
		direccion_contiene = new AssociationExpression("direccion_contiene", this.getDetachedCriteria());
		pertenece = new CollectionExpression("ORM_Pertenece", this.getDetachedCriteria());
		imagen_perteneceId = new StringExpression("imagen_pertenece.nombreParada", this.getDetachedCriteria());
		imagen_pertenece = new AssociationExpression("imagen_pertenece", this.getDetachedCriteria());
		evento_pertenece = new CollectionExpression("ORM_Evento_pertenece", this.getDetachedCriteria());
		paradaId = new StringExpression("parada.nombreParada", this.getDetachedCriteria());
		parada = new AssociationExpression("parada", this.getDetachedCriteria());
		linea_Paradas = new CollectionExpression("ORM_Linea_Paradas", this.getDetachedCriteria());
	}
	
	public ParadaDetachedCriteria createParadaaCriteria() {
		return new ParadaDetachedCriteria(createCriteria("paradaa"));
	}
	
	public DireccionDetachedCriteria createDireccion_contieneCriteria() {
		return new DireccionDetachedCriteria(createCriteria("direccion_contiene"));
	}
	
	public diagrama_de_base_de_datos.PuntoInteresDetachedCriteria createPerteneceCriteria() {
		return new diagrama_de_base_de_datos.PuntoInteresDetachedCriteria(createCriteria("ORM_Pertenece"));
	}
	
	public ImagenDetachedCriteria createImagen_perteneceCriteria() {
		return new ImagenDetachedCriteria(createCriteria("imagen_pertenece"));
	}
	
	public diagrama_de_base_de_datos.EventoDetachedCriteria createEvento_perteneceCriteria() {
		return new diagrama_de_base_de_datos.EventoDetachedCriteria(createCriteria("ORM_Evento_pertenece"));
	}
	
	public ParadaDetachedCriteria createParadaCriteria() {
		return new ParadaDetachedCriteria(createCriteria("parada"));
	}
	
	public diagrama_de_base_de_datos.Linea_ParadaDetachedCriteria createLinea_ParadasCriteria() {
		return new diagrama_de_base_de_datos.Linea_ParadaDetachedCriteria(createCriteria("ORM_Linea_Paradas"));
	}
	
	public Parada uniqueParada(PersistentSession session) {
		return (Parada) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Parada[] listParada(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Parada[]) list.toArray(new Parada[list.size()]);
	}
}

