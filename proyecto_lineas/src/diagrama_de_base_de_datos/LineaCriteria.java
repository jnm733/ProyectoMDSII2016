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

public class LineaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression imagenId;
	public final AssociationExpression imagen;
	public final StringExpression nombreLinea;
	public final StringExpression numeroLinea;
	public final DoubleExpression tarifaLinea;
	public final StringExpression empresaGestora;
	public final StringExpression horario;
	public final StringExpression recorrido;
	public final CollectionExpression pertenece;
	public final CollectionExpression es_usada;
	
	public LineaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		imagenId = new IntegerExpression("imagen.ID", this);
		imagen = new AssociationExpression("imagen", this);
		nombreLinea = new StringExpression("nombreLinea", this);
		numeroLinea = new StringExpression("numeroLinea", this);
		tarifaLinea = new DoubleExpression("tarifaLinea", this);
		empresaGestora = new StringExpression("empresaGestora", this);
		horario = new StringExpression("horario", this);
		recorrido = new StringExpression("recorrido", this);
		pertenece = new CollectionExpression("ORM_Pertenece", this);
		es_usada = new CollectionExpression("ORM_Es_usada", this);
	}
	
	public LineaCriteria(PersistentSession session) {
		this(session.createCriteria(Linea.class));
	}
	
	public LineaCriteria() throws PersistentException {
		this(diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession());
	}
	
	public ImagenCriteria createImagenCriteria() {
		return new ImagenCriteria(createCriteria("imagen"));
	}
	
	public diagrama_de_base_de_datos.ParadaCriteria createPerteneceCriteria() {
		return new diagrama_de_base_de_datos.ParadaCriteria(createCriteria("ORM_Pertenece"));
	}
	
	public diagrama_de_base_de_datos.TarifaCriteria createEs_usadaCriteria() {
		return new diagrama_de_base_de_datos.TarifaCriteria(createCriteria("ORM_Es_usada"));
	}
	
	public Linea uniqueLinea() {
		return (Linea) super.uniqueResult();
	}
	
	public Linea[] listLinea() {
		java.util.List list = super.list();
		return (Linea[]) list.toArray(new Linea[list.size()]);
	}
}

