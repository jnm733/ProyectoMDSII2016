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

public class PuntoInteresDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombrePunto;
	public final StringExpression direccionPunto;
	public final CollectionExpression contiene;
	public final IntegerExpression tieneId;
	public final AssociationExpression tiene;
	
	public PuntoInteresDetachedCriteria() {
		super(gestion_de_lineas.PuntoInteres.class, gestion_de_lineas.PuntoInteresCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombrePunto = new StringExpression("nombrePunto", this.getDetachedCriteria());
		direccionPunto = new StringExpression("direccionPunto", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_Contiene", this.getDetachedCriteria());
		tieneId = new IntegerExpression("tiene.ID", this.getDetachedCriteria());
		tiene = new AssociationExpression("tiene", this.getDetachedCriteria());
	}
	
	public PuntoInteresDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, gestion_de_lineas.PuntoInteresCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombrePunto = new StringExpression("nombrePunto", this.getDetachedCriteria());
		direccionPunto = new StringExpression("direccionPunto", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_Contiene", this.getDetachedCriteria());
		tieneId = new IntegerExpression("tiene.ID", this.getDetachedCriteria());
		tiene = new AssociationExpression("tiene", this.getDetachedCriteria());
	}
	
	public gestion_de_lineas.ParadaDetachedCriteria createContieneCriteria() {
		return new gestion_de_lineas.ParadaDetachedCriteria(createCriteria("ORM_Contiene"));
	}
	
	public DireccionDetachedCriteria createTieneCriteria() {
		return new DireccionDetachedCriteria(createCriteria("tiene"));
	}
	
	public PuntoInteres uniquePuntoInteres(PersistentSession session) {
		return (PuntoInteres) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public PuntoInteres[] listPuntoInteres(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (PuntoInteres[]) list.toArray(new PuntoInteres[list.size()]);
	}
}

