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

public class ImagenDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression contieneId;
	public final AssociationExpression contiene;
	public final StringExpression imagen;
	public final StringExpression tipo;
	public final IntegerExpression lineaId;
	public final AssociationExpression linea;
	
	public ImagenDetachedCriteria() {
		super(diagrama_de_base_de_datos.Imagen.class, diagrama_de_base_de_datos.ImagenCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		contieneId = new IntegerExpression("contiene.ID", this.getDetachedCriteria());
		contiene = new AssociationExpression("contiene", this.getDetachedCriteria());
		imagen = new StringExpression("imagen", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
		lineaId = new IntegerExpression("linea.ID", this.getDetachedCriteria());
		linea = new AssociationExpression("linea", this.getDetachedCriteria());
	}
	
	public ImagenDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, diagrama_de_base_de_datos.ImagenCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		contieneId = new IntegerExpression("contiene.ID", this.getDetachedCriteria());
		contiene = new AssociationExpression("contiene", this.getDetachedCriteria());
		imagen = new StringExpression("imagen", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
		lineaId = new IntegerExpression("linea.ID", this.getDetachedCriteria());
		linea = new AssociationExpression("linea", this.getDetachedCriteria());
	}
	
	public ParadaDetachedCriteria createContieneCriteria() {
		return new ParadaDetachedCriteria(createCriteria("contiene"));
	}
	
	public LineaDetachedCriteria createLineaCriteria() {
		return new LineaDetachedCriteria(createCriteria("linea"));
	}
	
	public Imagen uniqueImagen(PersistentSession session) {
		return (Imagen) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Imagen[] listImagen(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Imagen[]) list.toArray(new Imagen[list.size()]);
	}
}

