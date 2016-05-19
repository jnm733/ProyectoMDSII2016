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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ParadaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombreParada;
	public final StringExpression direccionParada;
	public final StringExpression observaciones;
	public final StringExpression imagenParada;
	public final CollectionExpression contiene;
	public final IntegerExpression direccion_contieneId;
	public final AssociationExpression direccion_contiene;
	public final CollectionExpression pertenece;
	public final IntegerExpression imagen_perteneceId;
	public final AssociationExpression imagen_pertenece;
	public final CollectionExpression evento_pertenece;
	
	public ParadaDetachedCriteria() {
		super(gestion_de_lineas.Parada.class, gestion_de_lineas.ParadaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombreParada = new StringExpression("nombreParada", this.getDetachedCriteria());
		direccionParada = new StringExpression("direccionParada", this.getDetachedCriteria());
		observaciones = new StringExpression("observaciones", this.getDetachedCriteria());
		imagenParada = new StringExpression("imagenParada", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_Contiene", this.getDetachedCriteria());
		direccion_contieneId = new IntegerExpression("direccion_contiene.ID", this.getDetachedCriteria());
		direccion_contiene = new AssociationExpression("direccion_contiene", this.getDetachedCriteria());
		pertenece = new CollectionExpression("ORM_Pertenece", this.getDetachedCriteria());
		imagen_perteneceId = new IntegerExpression("imagen_pertenece.ID", this.getDetachedCriteria());
		imagen_pertenece = new AssociationExpression("imagen_pertenece", this.getDetachedCriteria());
		evento_pertenece = new CollectionExpression("ORM_Evento_pertenece", this.getDetachedCriteria());
	}
	
	public ParadaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, gestion_de_lineas.ParadaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombreParada = new StringExpression("nombreParada", this.getDetachedCriteria());
		direccionParada = new StringExpression("direccionParada", this.getDetachedCriteria());
		observaciones = new StringExpression("observaciones", this.getDetachedCriteria());
		imagenParada = new StringExpression("imagenParada", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_Contiene", this.getDetachedCriteria());
		direccion_contieneId = new IntegerExpression("direccion_contiene.ID", this.getDetachedCriteria());
		direccion_contiene = new AssociationExpression("direccion_contiene", this.getDetachedCriteria());
		pertenece = new CollectionExpression("ORM_Pertenece", this.getDetachedCriteria());
		imagen_perteneceId = new IntegerExpression("imagen_pertenece.ID", this.getDetachedCriteria());
		imagen_pertenece = new AssociationExpression("imagen_pertenece", this.getDetachedCriteria());
		evento_pertenece = new CollectionExpression("ORM_Evento_pertenece", this.getDetachedCriteria());
	}
	
	public gestion_de_lineas.LineaDetachedCriteria createContieneCriteria() {
		return new gestion_de_lineas.LineaDetachedCriteria(createCriteria("ORM_Contiene"));
	}
	
	public DireccionDetachedCriteria createDireccion_contieneCriteria() {
		return new DireccionDetachedCriteria(createCriteria("direccion_contiene"));
	}
	
	public gestion_de_lineas.PuntoInteresDetachedCriteria createPerteneceCriteria() {
		return new gestion_de_lineas.PuntoInteresDetachedCriteria(createCriteria("ORM_Pertenece"));
	}
	
	public ImagenDetachedCriteria createImagen_perteneceCriteria() {
		return new ImagenDetachedCriteria(createCriteria("imagen_pertenece"));
	}
	
	public gestion_de_lineas.EventoDetachedCriteria createEvento_perteneceCriteria() {
		return new gestion_de_lineas.EventoDetachedCriteria(createCriteria("ORM_Evento_pertenece"));
	}
	
	public Parada uniqueParada(PersistentSession session) {
		return (Parada) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Parada[] listParada(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Parada[]) list.toArray(new Parada[list.size()]);
	}
}

