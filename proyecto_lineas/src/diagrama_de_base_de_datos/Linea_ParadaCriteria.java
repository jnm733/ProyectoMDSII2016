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

public class Linea_ParadaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression lineaId;
	public final AssociationExpression linea;
	public final StringExpression paradaId;
	public final AssociationExpression parada;
	public final StringExpression nombreParada;
	public final StringExpression numeroLinea;
	public final DoubleExpression distancia;
	public final StringExpression horaPaso;
	public final StringExpression posicion;
	
	public Linea_ParadaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		lineaId = new StringExpression("linea.numeroLinea", this);
		linea = new AssociationExpression("linea", this);
		paradaId = new StringExpression("parada.nombreParada", this);
		parada = new AssociationExpression("parada", this);
		nombreParada = new StringExpression("nombreParada", this);
		numeroLinea = new StringExpression("numeroLinea", this);
		distancia = new DoubleExpression("distancia", this);
		horaPaso = new StringExpression("horaPaso", this);
		posicion = new StringExpression("posicion", this);
	}
	
	public Linea_ParadaCriteria(PersistentSession session) {
		this(session.createCriteria(Linea_Parada.class));
	}
	
	public Linea_ParadaCriteria() throws PersistentException {
		this(diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession());
	}
	
	public LineaCriteria createLineaCriteria() {
		return new LineaCriteria(createCriteria("linea"));
	}
	
	public ParadaCriteria createParadaCriteria() {
		return new ParadaCriteria(createCriteria("parada"));
	}
	
	public Linea_Parada uniqueLinea_Parada() {
		return (Linea_Parada) super.uniqueResult();
	}
	
	public Linea_Parada[] listLinea_Parada() {
		java.util.List list = super.list();
		return (Linea_Parada[]) list.toArray(new Linea_Parada[list.size()]);
	}
}

