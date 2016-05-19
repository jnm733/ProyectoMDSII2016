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

public class DireccionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression pto_se_ubicaId;
	public final AssociationExpression pto_se_ubica;
	public final IntegerExpression evento_se_ubicaId;
	public final AssociationExpression evento_se_ubica;
	public final IntegerExpression parada_se_ubicaId;
	public final AssociationExpression parada_se_ubica;
	public final IntegerExpression contieneId;
	public final AssociationExpression contiene;
	public final StringExpression calle;
	public final IntegerExpression numero;
	
	public DireccionDetachedCriteria() {
		super(gestion_de_lineas.Direccion.class, gestion_de_lineas.DireccionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		pto_se_ubicaId = new IntegerExpression("pto_se_ubica.ID", this.getDetachedCriteria());
		pto_se_ubica = new AssociationExpression("pto_se_ubica", this.getDetachedCriteria());
		evento_se_ubicaId = new IntegerExpression("evento_se_ubica.ID", this.getDetachedCriteria());
		evento_se_ubica = new AssociationExpression("evento_se_ubica", this.getDetachedCriteria());
		parada_se_ubicaId = new IntegerExpression("parada_se_ubica.ID", this.getDetachedCriteria());
		parada_se_ubica = new AssociationExpression("parada_se_ubica", this.getDetachedCriteria());
		contieneId = new IntegerExpression("contiene.ID", this.getDetachedCriteria());
		contiene = new AssociationExpression("contiene", this.getDetachedCriteria());
		calle = new StringExpression("calle", this.getDetachedCriteria());
		numero = new IntegerExpression("numero", this.getDetachedCriteria());
	}
	
	public DireccionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, gestion_de_lineas.DireccionCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		pto_se_ubicaId = new IntegerExpression("pto_se_ubica.ID", this.getDetachedCriteria());
		pto_se_ubica = new AssociationExpression("pto_se_ubica", this.getDetachedCriteria());
		evento_se_ubicaId = new IntegerExpression("evento_se_ubica.ID", this.getDetachedCriteria());
		evento_se_ubica = new AssociationExpression("evento_se_ubica", this.getDetachedCriteria());
		parada_se_ubicaId = new IntegerExpression("parada_se_ubica.ID", this.getDetachedCriteria());
		parada_se_ubica = new AssociationExpression("parada_se_ubica", this.getDetachedCriteria());
		contieneId = new IntegerExpression("contiene.ID", this.getDetachedCriteria());
		contiene = new AssociationExpression("contiene", this.getDetachedCriteria());
		calle = new StringExpression("calle", this.getDetachedCriteria());
		numero = new IntegerExpression("numero", this.getDetachedCriteria());
	}
	
	public PuntoInteresDetachedCriteria createPto_se_ubicaCriteria() {
		return new PuntoInteresDetachedCriteria(createCriteria("pto_se_ubica"));
	}
	
	public EventoDetachedCriteria createEvento_se_ubicaCriteria() {
		return new EventoDetachedCriteria(createCriteria("evento_se_ubica"));
	}
	
	public ParadaDetachedCriteria createParada_se_ubicaCriteria() {
		return new ParadaDetachedCriteria(createCriteria("parada_se_ubica"));
	}
	
	public BarrioDetachedCriteria createContieneCriteria() {
		return new BarrioDetachedCriteria(createCriteria("contiene"));
	}
	
	public Direccion uniqueDireccion(PersistentSession session) {
		return (Direccion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Direccion[] listDireccion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Direccion[]) list.toArray(new Direccion[list.size()]);
	}
}

