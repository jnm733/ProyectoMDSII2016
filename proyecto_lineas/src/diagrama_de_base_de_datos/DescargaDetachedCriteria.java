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

public class DescargaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression tituloDescarga;
	public final StringExpression descripcionDescarga;
	public final StringExpression urlDescarga;
	public final BigDecimalExpression tamaño;
	
	public DescargaDetachedCriteria() {
		super(diagrama_de_base_de_datos.Descarga.class, diagrama_de_base_de_datos.DescargaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		tituloDescarga = new StringExpression("tituloDescarga", this.getDetachedCriteria());
		descripcionDescarga = new StringExpression("descripcionDescarga", this.getDetachedCriteria());
		urlDescarga = new StringExpression("urlDescarga", this.getDetachedCriteria());
		tamaño = new BigDecimalExpression("tamaÃ±o", this.getDetachedCriteria());
	}
	
	public DescargaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, diagrama_de_base_de_datos.DescargaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		tituloDescarga = new StringExpression("tituloDescarga", this.getDetachedCriteria());
		descripcionDescarga = new StringExpression("descripcionDescarga", this.getDetachedCriteria());
		urlDescarga = new StringExpression("urlDescarga", this.getDetachedCriteria());
		tamaño = new BigDecimalExpression("tamaÃ±o", this.getDetachedCriteria());
	}
	
	public Descarga uniqueDescarga(PersistentSession session) {
		return (Descarga) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Descarga[] listDescarga(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Descarga[]) list.toArray(new Descarga[list.size()]);
	}
}

