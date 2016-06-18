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

public class ConsultaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression realizaId;
	public final AssociationExpression realiza;
	public final StringExpression origenConsulta;
	public final StringExpression destinoConsulta;
	
	public ConsultaDetachedCriteria() {
		super(diagrama_de_base_de_datos.Consulta.class, diagrama_de_base_de_datos.ConsultaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		realizaId = new IntegerExpression("realiza.ID", this.getDetachedCriteria());
		realiza = new AssociationExpression("realiza", this.getDetachedCriteria());
		origenConsulta = new StringExpression("origenConsulta", this.getDetachedCriteria());
		destinoConsulta = new StringExpression("destinoConsulta", this.getDetachedCriteria());
	}
	
	public ConsultaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, diagrama_de_base_de_datos.ConsultaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		realizaId = new IntegerExpression("realiza.ID", this.getDetachedCriteria());
		realiza = new AssociationExpression("realiza", this.getDetachedCriteria());
		origenConsulta = new StringExpression("origenConsulta", this.getDetachedCriteria());
		destinoConsulta = new StringExpression("destinoConsulta", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createRealizaCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("realiza"));
	}
	
	public Consulta uniqueConsulta(PersistentSession session) {
		return (Consulta) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Consulta[] listConsulta(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Consulta[]) list.toArray(new Consulta[list.size()]);
	}
}

