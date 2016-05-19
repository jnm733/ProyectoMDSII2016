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

public class ConsultaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression realizaId;
	public final AssociationExpression realiza;
	public final StringExpression origenConsulta;
	public final StringExpression destinoConsulta;
	
	public ConsultaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		realizaId = new IntegerExpression("realiza.ID", this);
		realiza = new AssociationExpression("realiza", this);
		origenConsulta = new StringExpression("origenConsulta", this);
		destinoConsulta = new StringExpression("destinoConsulta", this);
	}
	
	public ConsultaCriteria(PersistentSession session) {
		this(session.createCriteria(Consulta.class));
	}
	
	public ConsultaCriteria() throws PersistentException {
		this(gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createRealizaCriteria() {
		return new UsuarioCriteria(createCriteria("realiza"));
	}
	
	public Consulta uniqueConsulta() {
		return (Consulta) super.uniqueResult();
	}
	
	public Consulta[] listConsulta() {
		java.util.List list = super.list();
		return (Consulta[]) list.toArray(new Consulta[list.size()]);
	}
}

