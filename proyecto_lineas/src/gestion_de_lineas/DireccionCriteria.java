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

public class DireccionCriteria extends AbstractORMCriteria {
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
	
	public DireccionCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		pto_se_ubicaId = new IntegerExpression("pto_se_ubica.ID", this);
		pto_se_ubica = new AssociationExpression("pto_se_ubica", this);
		evento_se_ubicaId = new IntegerExpression("evento_se_ubica.ID", this);
		evento_se_ubica = new AssociationExpression("evento_se_ubica", this);
		parada_se_ubicaId = new IntegerExpression("parada_se_ubica.ID", this);
		parada_se_ubica = new AssociationExpression("parada_se_ubica", this);
		contieneId = new IntegerExpression("contiene.ID", this);
		contiene = new AssociationExpression("contiene", this);
		calle = new StringExpression("calle", this);
		numero = new IntegerExpression("numero", this);
	}
	
	public DireccionCriteria(PersistentSession session) {
		this(session.createCriteria(Direccion.class));
	}
	
	public DireccionCriteria() throws PersistentException {
		this(gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession());
	}
	
	public PuntoInteresCriteria createPto_se_ubicaCriteria() {
		return new PuntoInteresCriteria(createCriteria("pto_se_ubica"));
	}
	
	public EventoCriteria createEvento_se_ubicaCriteria() {
		return new EventoCriteria(createCriteria("evento_se_ubica"));
	}
	
	public ParadaCriteria createParada_se_ubicaCriteria() {
		return new ParadaCriteria(createCriteria("parada_se_ubica"));
	}
	
	public BarrioCriteria createContieneCriteria() {
		return new BarrioCriteria(createCriteria("contiene"));
	}
	
	public Direccion uniqueDireccion() {
		return (Direccion) super.uniqueResult();
	}
	
	public Direccion[] listDireccion() {
		java.util.List list = super.list();
		return (Direccion[]) list.toArray(new Direccion[list.size()]);
	}
}

