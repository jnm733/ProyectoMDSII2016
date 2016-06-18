package diagrama_de_clases;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_de_base_de_datos.*;

public class BD_Tarifas {
	public BD_Principal _bd_Principal;
	public Vector<Tarifa> _cont_Tarifas = new Vector<Tarifa>();
}