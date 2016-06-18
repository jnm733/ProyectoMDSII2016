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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TarifaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final DoubleExpression precio;
	public final CollectionExpression cobra;
	
	public TarifaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		precio = new DoubleExpression("precio", this);
		cobra = new CollectionExpression("ORM_Cobra", this);
	}
	
	public TarifaCriteria(PersistentSession session) {
		this(session.createCriteria(Tarifa.class));
	}
	
	public TarifaCriteria() throws PersistentException {
		this(diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession());
	}
	
	public diagrama_de_base_de_datos.LineaCriteria createCobraCriteria() {
		return new diagrama_de_base_de_datos.LineaCriteria(createCriteria("ORM_Cobra"));
	}
	
	public Tarifa uniqueTarifa() {
		return (Tarifa) super.uniqueResult();
	}
	
	public Tarifa[] listTarifa() {
		java.util.List list = super.list();
		return (Tarifa[]) list.toArray(new Tarifa[list.size()]);
	}
}

