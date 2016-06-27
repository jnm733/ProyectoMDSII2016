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

public class Linea_ParadaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public Linea_ParadaDetachedCriteria() {
		super(diagrama_de_base_de_datos.Linea_Parada.class, diagrama_de_base_de_datos.Linea_ParadaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		lineaId = new StringExpression("linea.numeroLinea", this.getDetachedCriteria());
		linea = new AssociationExpression("linea", this.getDetachedCriteria());
		paradaId = new StringExpression("parada.nombreParada", this.getDetachedCriteria());
		parada = new AssociationExpression("parada", this.getDetachedCriteria());
		nombreParada = new StringExpression("nombreParada", this.getDetachedCriteria());
		numeroLinea = new StringExpression("numeroLinea", this.getDetachedCriteria());
		distancia = new DoubleExpression("distancia", this.getDetachedCriteria());
		horaPaso = new StringExpression("horaPaso", this.getDetachedCriteria());
		posicion = new StringExpression("posicion", this.getDetachedCriteria());
	}
	
	public Linea_ParadaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, diagrama_de_base_de_datos.Linea_ParadaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		lineaId = new StringExpression("linea.numeroLinea", this.getDetachedCriteria());
		linea = new AssociationExpression("linea", this.getDetachedCriteria());
		paradaId = new StringExpression("parada.nombreParada", this.getDetachedCriteria());
		parada = new AssociationExpression("parada", this.getDetachedCriteria());
		nombreParada = new StringExpression("nombreParada", this.getDetachedCriteria());
		numeroLinea = new StringExpression("numeroLinea", this.getDetachedCriteria());
		distancia = new DoubleExpression("distancia", this.getDetachedCriteria());
		horaPaso = new StringExpression("horaPaso", this.getDetachedCriteria());
		posicion = new StringExpression("posicion", this.getDetachedCriteria());
	}
	
	public LineaDetachedCriteria createLineaCriteria() {
		return new LineaDetachedCriteria(createCriteria("linea"));
	}
	
	public ParadaDetachedCriteria createParadaCriteria() {
		return new ParadaDetachedCriteria(createCriteria("parada"));
	}
	
	public Linea_Parada uniqueLinea_Parada(PersistentSession session) {
		return (Linea_Parada) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Linea_Parada[] listLinea_Parada(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Linea_Parada[]) list.toArray(new Linea_Parada[list.size()]);
	}
}

