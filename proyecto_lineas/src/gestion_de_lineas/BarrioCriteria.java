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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class BarrioCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombreBarrio;
	public final IntegerExpression codigoPostal;
	public final CollectionExpression pertenece;
	
	public BarrioCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nombreBarrio = new StringExpression("nombreBarrio", this);
		codigoPostal = new IntegerExpression("codigoPostal", this);
		pertenece = new CollectionExpression("ORM_Pertenece", this);
	}
	
	public BarrioCriteria(PersistentSession session) {
		this(session.createCriteria(Barrio.class));
	}
	
	public BarrioCriteria() throws PersistentException {
		this(gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession());
	}
	
	public gestion_de_lineas.DireccionCriteria createPerteneceCriteria() {
		return new gestion_de_lineas.DireccionCriteria(createCriteria("ORM_Pertenece"));
	}
	
	public Barrio uniqueBarrio() {
		return (Barrio) super.uniqueResult();
	}
	
	public Barrio[] listBarrio() {
		java.util.List list = super.list();
		return (Barrio[]) list.toArray(new Barrio[list.size()]);
	}
}

