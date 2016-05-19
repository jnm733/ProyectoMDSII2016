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

public class TarifaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final DoubleExpression precio;
	public final CollectionExpression cobra;
	
	public TarifaDetachedCriteria() {
		super(gestion_de_lineas.Tarifa.class, gestion_de_lineas.TarifaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
		cobra = new CollectionExpression("ORM_Cobra", this.getDetachedCriteria());
	}
	
	public TarifaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, gestion_de_lineas.TarifaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
		cobra = new CollectionExpression("ORM_Cobra", this.getDetachedCriteria());
	}
	
	public gestion_de_lineas.LineaDetachedCriteria createCobraCriteria() {
		return new gestion_de_lineas.LineaDetachedCriteria(createCriteria("ORM_Cobra"));
	}
	
	public Tarifa uniqueTarifa(PersistentSession session) {
		return (Tarifa) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tarifa[] listTarifa(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tarifa[]) list.toArray(new Tarifa[list.size()]);
	}
}

