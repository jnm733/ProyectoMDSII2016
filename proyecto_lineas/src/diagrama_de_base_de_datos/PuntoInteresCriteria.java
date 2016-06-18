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

public class PuntoInteresCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombrePunto;
	public final StringExpression direccionPunto;
	public final CollectionExpression contiene;
	public final IntegerExpression tieneId;
	public final AssociationExpression tiene;
	
	public PuntoInteresCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nombrePunto = new StringExpression("nombrePunto", this);
		direccionPunto = new StringExpression("direccionPunto", this);
		contiene = new CollectionExpression("ORM_Contiene", this);
		tieneId = new IntegerExpression("tiene.ID", this);
		tiene = new AssociationExpression("tiene", this);
	}
	
	public PuntoInteresCriteria(PersistentSession session) {
		this(session.createCriteria(PuntoInteres.class));
	}
	
	public PuntoInteresCriteria() throws PersistentException {
		this(diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession());
	}
	
	public diagrama_de_base_de_datos.ParadaCriteria createContieneCriteria() {
		return new diagrama_de_base_de_datos.ParadaCriteria(createCriteria("ORM_Contiene"));
	}
	
	public DireccionCriteria createTieneCriteria() {
		return new DireccionCriteria(createCriteria("tiene"));
	}
	
	public PuntoInteres uniquePuntoInteres() {
		return (PuntoInteres) super.uniqueResult();
	}
	
	public PuntoInteres[] listPuntoInteres() {
		java.util.List list = super.list();
		return (PuntoInteres[]) list.toArray(new PuntoInteres[list.size()]);
	}
}

