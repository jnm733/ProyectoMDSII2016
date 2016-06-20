package diagrama_de_clases;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Vector;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_de_base_de_datos.*;

public class BD_Descargas {
	public BD_Principal _bd_Principal;
	public Vector<Descarga> _cont_Descargas = new Vector<Descarga>();

	public void descargar(Object aArchivo)throws PersistentException {
		throw new UnsupportedOperationException();
	}
	
	public Descarga[] getDescargas() throws PersistentException{
		Descarga[] descargas = null;

		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession()
				.beginTransaction();
		try {
			descargas = diagrama_de_base_de_datos.DescargaDAO.listDescargaByQuery(null, null);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return descargas;
	}

	public void agregarDescarga(ArrayList aDatos, Object aArchivo)throws PersistentException {
		int id_descarga = -1;
		
		String nombre =(String)aDatos.get(0);
		String descripcion =(String)aDatos.get(1);
		String url =(String)aDatos.get(2);
		String tam1 = (String)aDatos.get(3);
		Double tam2 = Double.parseDouble(tam1);
		BigDecimal size = BigDecimal.valueOf(tam2);
		
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			 Descarga as = DescargaDAO.createDescarga();
			 as.setTituloDescarga(nombre);
			 as.setDescripcionDescarga(descripcion);
			 as.setUrlDescarga(url);
			 as.setTamaño(size);
			 
			 DescargaDAO.save(as);
			 id_descarga = as.getORMID();
			 t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
	}
}