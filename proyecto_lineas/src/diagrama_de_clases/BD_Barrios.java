package diagrama_de_clases;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import java.util.Vector;
import gestion_de_lineas.*;

public class BD_Barrios {
	public BD_Principal _bd_Principal;
	public Vector<Barrio> _cont_barrios = new Vector<Barrio>();
}