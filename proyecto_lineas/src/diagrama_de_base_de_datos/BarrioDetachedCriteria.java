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

public class BarrioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombreBarrio;
	public final IntegerExpression codigoPostal;
	public final CollectionExpression pertenece;
	
	public BarrioDetachedCriteria() {
		super(diagrama_de_base_de_datos.Barrio.class, diagrama_de_base_de_datos.BarrioCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombreBarrio = new StringExpression("nombreBarrio", this.getDetachedCriteria());
		codigoPostal = new IntegerExpression("codigoPostal", this.getDetachedCriteria());
		pertenece = new CollectionExpression("ORM_Pertenece", this.getDetachedCriteria());
	}
	
	public BarrioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, diagrama_de_base_de_datos.BarrioCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombreBarrio = new StringExpression("nombreBarrio", this.getDetachedCriteria());
		codigoPostal = new IntegerExpression("codigoPostal", this.getDetachedCriteria());
		pertenece = new CollectionExpression("ORM_Pertenece", this.getDetachedCriteria());
	}
	
	public diagrama_de_base_de_datos.DireccionDetachedCriteria createPerteneceCriteria() {
		return new diagrama_de_base_de_datos.DireccionDetachedCriteria(createCriteria("ORM_Pertenece"));
	}
	
	public Barrio uniqueBarrio(PersistentSession session) {
		return (Barrio) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Barrio[] listBarrio(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Barrio[]) list.toArray(new Barrio[list.size()]);
	}
}

