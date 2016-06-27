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

public class UsuarioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression email;
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression password;
	public final CollectionExpression realizada_por;
	
	public UsuarioDetachedCriteria() {
		super(diagrama_de_base_de_datos.Usuario.class, diagrama_de_base_de_datos.UsuarioCriteria.class);
		email = new StringExpression("email", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		realizada_por = new CollectionExpression("ORM_Realizada_por", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, diagrama_de_base_de_datos.UsuarioCriteria.class);
		email = new StringExpression("email", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		realizada_por = new CollectionExpression("ORM_Realizada_por", this.getDetachedCriteria());
	}
	
	public diagrama_de_base_de_datos.ConsultaDetachedCriteria createRealizada_porCriteria() {
		return new diagrama_de_base_de_datos.ConsultaDetachedCriteria(createCriteria("ORM_Realizada_por"));
	}
	
	public Usuario uniqueUsuario(PersistentSession session) {
		return (Usuario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario[] listUsuario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario[]) list.toArray(new Usuario[list.size()]);
	}
}

