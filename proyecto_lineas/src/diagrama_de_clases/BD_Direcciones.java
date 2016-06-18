package diagrama_de_clases;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_de_base_de_datos.*;

public class BD_Direcciones {
	public BD_Principal _bD_Principal;
	public Vector<Direccion> _cont_direcciones = new Vector<Direccion>();
}