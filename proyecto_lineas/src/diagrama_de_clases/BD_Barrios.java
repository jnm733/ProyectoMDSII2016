package diagrama_de_clases;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_de_base_de_datos.*;

import java.util.Vector;

public class BD_Barrios {
	public BD_Principal _bd_Principal;
	public Vector<Barrio> _cont_barrios = new Vector<Barrio>();
}