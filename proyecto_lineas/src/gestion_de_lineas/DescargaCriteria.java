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

public class DescargaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression tituloDescarga;
	public final StringExpression descripcionDescarga;
	public final StringExpression urlDescarga;
	public final BigDecimalExpression tamaño;
	
	public DescargaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		tituloDescarga = new StringExpression("tituloDescarga", this);
		descripcionDescarga = new StringExpression("descripcionDescarga", this);
		urlDescarga = new StringExpression("urlDescarga", this);
		tamaño = new BigDecimalExpression("tamaÃ±o", this);
	}
	
	public DescargaCriteria(PersistentSession session) {
		this(session.createCriteria(Descarga.class));
	}
	
	public DescargaCriteria() throws PersistentException {
		this(gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession());
	}
	
	public Descarga uniqueDescarga() {
		return (Descarga) super.uniqueResult();
	}
	
	public Descarga[] listDescarga() {
		java.util.List list = super.list();
		return (Descarga[]) list.toArray(new Descarga[list.size()]);
	}
}

