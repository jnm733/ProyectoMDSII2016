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

public class EventoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombreEvento;
	public final StringExpression direccionEvento;
	public final DateExpression fechaInicio;
	public final DateExpression fechaFin;
	public final CollectionExpression contiene;
	public final IntegerExpression tiene_eventoId;
	public final AssociationExpression tiene_evento;
	
	public EventoDetachedCriteria() {
		super(gestion_de_lineas.Evento.class, gestion_de_lineas.EventoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombreEvento = new StringExpression("nombreEvento", this.getDetachedCriteria());
		direccionEvento = new StringExpression("direccionEvento", this.getDetachedCriteria());
		fechaInicio = new DateExpression("fechaInicio", this.getDetachedCriteria());
		fechaFin = new DateExpression("fechaFin", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_Contiene", this.getDetachedCriteria());
		tiene_eventoId = new IntegerExpression("tiene_evento.ID", this.getDetachedCriteria());
		tiene_evento = new AssociationExpression("tiene_evento", this.getDetachedCriteria());
	}
	
	public EventoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, gestion_de_lineas.EventoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombreEvento = new StringExpression("nombreEvento", this.getDetachedCriteria());
		direccionEvento = new StringExpression("direccionEvento", this.getDetachedCriteria());
		fechaInicio = new DateExpression("fechaInicio", this.getDetachedCriteria());
		fechaFin = new DateExpression("fechaFin", this.getDetachedCriteria());
		contiene = new CollectionExpression("ORM_Contiene", this.getDetachedCriteria());
		tiene_eventoId = new IntegerExpression("tiene_evento.ID", this.getDetachedCriteria());
		tiene_evento = new AssociationExpression("tiene_evento", this.getDetachedCriteria());
	}
	
	public gestion_de_lineas.ParadaDetachedCriteria createContieneCriteria() {
		return new gestion_de_lineas.ParadaDetachedCriteria(createCriteria("ORM_Contiene"));
	}
	
	public DireccionDetachedCriteria createTiene_eventoCriteria() {
		return new DireccionDetachedCriteria(createCriteria("tiene_evento"));
	}
	
	public Evento uniqueEvento(PersistentSession session) {
		return (Evento) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Evento[] listEvento(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Evento[]) list.toArray(new Evento[list.size()]);
	}
}

