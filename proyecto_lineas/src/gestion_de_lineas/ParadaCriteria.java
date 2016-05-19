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

public class ParadaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombreParada;
	public final StringExpression direccionParada;
	public final StringExpression observaciones;
	public final StringExpression imagenParada;
	public final CollectionExpression contiene;
	public final IntegerExpression direccion_contieneId;
	public final AssociationExpression direccion_contiene;
	public final CollectionExpression pertenece;
	public final IntegerExpression imagen_perteneceId;
	public final AssociationExpression imagen_pertenece;
	public final CollectionExpression evento_pertenece;
	
	public ParadaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nombreParada = new StringExpression("nombreParada", this);
		direccionParada = new StringExpression("direccionParada", this);
		observaciones = new StringExpression("observaciones", this);
		imagenParada = new StringExpression("imagenParada", this);
		contiene = new CollectionExpression("ORM_Contiene", this);
		direccion_contieneId = new IntegerExpression("direccion_contiene.ID", this);
		direccion_contiene = new AssociationExpression("direccion_contiene", this);
		pertenece = new CollectionExpression("ORM_Pertenece", this);
		imagen_perteneceId = new IntegerExpression("imagen_pertenece.ID", this);
		imagen_pertenece = new AssociationExpression("imagen_pertenece", this);
		evento_pertenece = new CollectionExpression("ORM_Evento_pertenece", this);
	}
	
	public ParadaCriteria(PersistentSession session) {
		this(session.createCriteria(Parada.class));
	}
	
	public ParadaCriteria() throws PersistentException {
		this(gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession());
	}
	
	public gestion_de_lineas.LineaCriteria createContieneCriteria() {
		return new gestion_de_lineas.LineaCriteria(createCriteria("ORM_Contiene"));
	}
	
	public DireccionCriteria createDireccion_contieneCriteria() {
		return new DireccionCriteria(createCriteria("direccion_contiene"));
	}
	
	public gestion_de_lineas.PuntoInteresCriteria createPerteneceCriteria() {
		return new gestion_de_lineas.PuntoInteresCriteria(createCriteria("ORM_Pertenece"));
	}
	
	public ImagenCriteria createImagen_perteneceCriteria() {
		return new ImagenCriteria(createCriteria("imagen_pertenece"));
	}
	
	public gestion_de_lineas.EventoCriteria createEvento_perteneceCriteria() {
		return new gestion_de_lineas.EventoCriteria(createCriteria("ORM_Evento_pertenece"));
	}
	
	public Parada uniqueParada() {
		return (Parada) super.uniqueResult();
	}
	
	public Parada[] listParada() {
		java.util.List list = super.list();
		return (Parada[]) list.toArray(new Parada[list.size()]);
	}
}

