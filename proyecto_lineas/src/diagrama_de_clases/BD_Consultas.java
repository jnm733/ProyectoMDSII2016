package diagrama_de_clases;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_de_base_de_datos.*;

public class BD_Consultas {
	public BD_Principal _bd_Principal;
	public Vector<Consulta> _cont_consultas = new Vector<Consulta>();

	public SolucionConsulta getSolucionConsulta(String aId) throws PersistentException {
		return null;
	}
}