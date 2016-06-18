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

public class EventoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombreEvento;
	public final StringExpression direccionEvento;
	public final DateExpression fechaInicio;
	public final DateExpression fechaFin;
	public final CollectionExpression contiene;
	public final IntegerExpression tiene_eventoId;
	public final AssociationExpression tiene_evento;
	
	public EventoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nombreEvento = new StringExpression("nombreEvento", this);
		direccionEvento = new StringExpression("direccionEvento", this);
		fechaInicio = new DateExpression("fechaInicio", this);
		fechaFin = new DateExpression("fechaFin", this);
		contiene = new CollectionExpression("ORM_Contiene", this);
		tiene_eventoId = new IntegerExpression("tiene_evento.ID", this);
		tiene_evento = new AssociationExpression("tiene_evento", this);
	}
	
	public EventoCriteria(PersistentSession session) {
		this(session.createCriteria(Evento.class));
	}
	
	public EventoCriteria() throws PersistentException {
		this(diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession());
	}
	
	public diagrama_de_base_de_datos.ParadaCriteria createContieneCriteria() {
		return new diagrama_de_base_de_datos.ParadaCriteria(createCriteria("ORM_Contiene"));
	}
	
	public DireccionCriteria createTiene_eventoCriteria() {
		return new DireccionCriteria(createCriteria("tiene_evento"));
	}
	
	public Evento uniqueEvento() {
		return (Evento) super.uniqueResult();
	}
	
	public Evento[] listEvento() {
		java.util.List list = super.list();
		return (Evento[]) list.toArray(new Evento[list.size()]);
	}
}

