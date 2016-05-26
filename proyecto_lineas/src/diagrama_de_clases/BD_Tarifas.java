package diagrama_de_clases;

import java.util.Vector;
import gestion_de_lineas.*;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Tarifas {
	public BD_Principal _bd_Principal;
	public Vector<Tarifa> _cont_Tarifas = new Vector<Tarifa>();
}