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

public class LineaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public LineaDetachedCriteria() {
		super(gestion_de_lineas.Linea.class, gestion_de_lineas.LineaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		imagenId = new IntegerExpression("imagen.ID", this.getDetachedCriteria());
		imagen = new AssociationExpression("imagen", this.getDetachedCriteria());
		nombreLinea = new StringExpression("nombreLinea", this.getDetachedCriteria());
		numeroLinea = new StringExpression("numeroLinea", this.getDetachedCriteria());
		tarifaLinea = new DoubleExpression("tarifaLinea", this.getDetachedCriteria());
		empresaGestora = new StringExpression("empresaGestora", this.getDetachedCriteria());
		horario = new StringExpression("horario", this.getDetachedCriteria());
		recorrido = new StringExpression("recorrido", this.getDetachedCriteria());
		pertenece = new CollectionExpression("ORM_Pertenece", this.getDetachedCriteria());
		es_usada = new CollectionExpression("ORM_Es_usada", this.getDetachedCriteria());
	}
	
	public LineaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, gestion_de_lineas.LineaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		imagenId = new IntegerExpression("imagen.ID", this.getDetachedCriteria());
		imagen = new AssociationExpression("imagen", this.getDetachedCriteria());
		nombreLinea = new StringExpression("nombreLinea", this.getDetachedCriteria());
		numeroLinea = new StringExpression("numeroLinea", this.getDetachedCriteria());
		tarifaLinea = new DoubleExpression("tarifaLinea", this.getDetachedCriteria());
		empresaGestora = new StringExpression("empresaGestora", this.getDetachedCriteria());
		horario = new StringExpression("horario", this.getDetachedCriteria());
		recorrido = new StringExpression("recorrido", this.getDetachedCriteria());
		pertenece = new CollectionExpression("ORM_Pertenece", this.getDetachedCriteria());
		es_usada = new CollectionExpression("ORM_Es_usada", this.getDetachedCriteria());
	}
	
	public ImagenDetachedCriteria createImagenCriteria() {
		return new ImagenDetachedCriteria(createCriteria("imagen"));
	}
	
	public gestion_de_lineas.ParadaDetachedCriteria createPerteneceCriteria() {
		return new gestion_de_lineas.ParadaDetachedCriteria(createCriteria("ORM_Pertenece"));
	}
	
	public gestion_de_lineas.TarifaDetachedCriteria createEs_usadaCriteria() {
		return new gestion_de_lineas.TarifaDetachedCriteria(createCriteria("ORM_Es_usada"));
	}
	
	public Linea uniqueLinea(PersistentSession session) {
		return (Linea) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Linea[] listLinea(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Linea[]) list.toArray(new Linea[list.size()]);
	}
}

