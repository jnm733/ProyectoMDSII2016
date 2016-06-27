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

public class LineaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression numeroLinea;
	public final IntegerExpression imagenId;
	public final AssociationExpression imagen;
	public final IntegerExpression ID;
	public final StringExpression nombreLinea;
	public final DoubleExpression tarifaLinea;
	public final StringExpression empresaGestora;
	public final StringExpression horario;
	public final StringExpression recorrido;
	public final CollectionExpression linea_Paradas;
	public final CollectionExpression es_usada;
	
	public LineaDetachedCriteria() {
		super(diagrama_de_base_de_datos.Linea.class, diagrama_de_base_de_datos.LineaCriteria.class);
		numeroLinea = new StringExpression("numeroLinea", this.getDetachedCriteria());
		imagenId = new IntegerExpression("imagen.ID", this.getDetachedCriteria());
		imagen = new AssociationExpression("imagen", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombreLinea = new StringExpression("nombreLinea", this.getDetachedCriteria());
		tarifaLinea = new DoubleExpression("tarifaLinea", this.getDetachedCriteria());
		empresaGestora = new StringExpression("empresaGestora", this.getDetachedCriteria());
		horario = new StringExpression("horario", this.getDetachedCriteria());
		recorrido = new StringExpression("recorrido", this.getDetachedCriteria());
		linea_Paradas = new CollectionExpression("ORM_Linea_Paradas", this.getDetachedCriteria());
		es_usada = new CollectionExpression("ORM_Es_usada", this.getDetachedCriteria());
	}
	
	public LineaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, diagrama_de_base_de_datos.LineaCriteria.class);
		numeroLinea = new StringExpression("numeroLinea", this.getDetachedCriteria());
		imagenId = new IntegerExpression("imagen.ID", this.getDetachedCriteria());
		imagen = new AssociationExpression("imagen", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombreLinea = new StringExpression("nombreLinea", this.getDetachedCriteria());
		tarifaLinea = new DoubleExpression("tarifaLinea", this.getDetachedCriteria());
		empresaGestora = new StringExpression("empresaGestora", this.getDetachedCriteria());
		horario = new StringExpression("horario", this.getDetachedCriteria());
		recorrido = new StringExpression("recorrido", this.getDetachedCriteria());
		linea_Paradas = new CollectionExpression("ORM_Linea_Paradas", this.getDetachedCriteria());
		es_usada = new CollectionExpression("ORM_Es_usada", this.getDetachedCriteria());
	}
	
	public ImagenDetachedCriteria createImagenCriteria() {
		return new ImagenDetachedCriteria(createCriteria("imagen"));
	}
	
	public diagrama_de_base_de_datos.Linea_ParadaDetachedCriteria createLinea_ParadasCriteria() {
		return new diagrama_de_base_de_datos.Linea_ParadaDetachedCriteria(createCriteria("ORM_Linea_Paradas"));
	}
	
	public diagrama_de_base_de_datos.TarifaDetachedCriteria createEs_usadaCriteria() {
		return new diagrama_de_base_de_datos.TarifaDetachedCriteria(createCriteria("ORM_Es_usada"));
	}
	
	public Linea uniqueLinea(PersistentSession session) {
		return (Linea) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Linea[] listLinea(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Linea[]) list.toArray(new Linea[list.size()]);
	}
}

