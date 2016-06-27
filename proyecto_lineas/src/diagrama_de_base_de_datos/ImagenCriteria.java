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

public class ImagenCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression contieneId;
	public final AssociationExpression contiene;
	public final StringExpression imagen;
	public final StringExpression tipo;
	public final IntegerExpression lineaId;
	public final AssociationExpression linea;
	
	public ImagenCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		contieneId = new StringExpression("contiene.nombreParada", this);
		contiene = new AssociationExpression("contiene", this);
		imagen = new StringExpression("imagen", this);
		tipo = new StringExpression("tipo", this);
		lineaId = new IntegerExpression("linea.ID", this);
		linea = new AssociationExpression("linea", this);
	}
	
	public ImagenCriteria(PersistentSession session) {
		this(session.createCriteria(Imagen.class));
	}
	
	public ImagenCriteria() throws PersistentException {
		this(diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession());
	}
	
	public ParadaCriteria createContieneCriteria() {
		return new ParadaCriteria(createCriteria("contiene"));
	}
	
	public LineaCriteria createLineaCriteria() {
		return new LineaCriteria(createCriteria("linea"));
	}
	
	public Imagen uniqueImagen() {
		return (Imagen) super.uniqueResult();
	}
	
	public Imagen[] listImagen() {
		java.util.List list = super.list();
		return (Imagen[]) list.toArray(new Imagen[list.size()]);
	}
}

