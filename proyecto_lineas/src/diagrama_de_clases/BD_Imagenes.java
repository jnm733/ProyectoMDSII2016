package diagrama_de_clases;

import java.util.ArrayList;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_de_base_de_datos.*;

public class BD_Imagenes {
	public BD_Principal _bd_Principal;
	public Vector<Imagen> _cont_Imagenes = new Vector<Imagen>();

	public void addImagen(String tipo,String titulo,Parada parada)throws PersistentException {
		int id_imagen = -1;
		
		//Imagen
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			 Imagen as = ImagenDAO.createImagen();
			 as.setImagen(titulo);
			 as.setTipo(tipo);
			 as.setContiene(parada);
			 ImagenDAO.save(as);
			 id_imagen = as.getORMID();
			 t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
	}
	
	public void setImagen(String aUrl)throws PersistentException {
		throw new UnsupportedOperationException();
	}

	public Imagen[] getImagenes()throws PersistentException {
		Imagen[] imagenes = null;
		
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			
			imagenes = diagrama_de_base_de_datos.ImagenDAO.listImagenByQuery(null,null);
			
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		 
		return imagenes;
	}

	public Imagen getImagen(String tipo, String titulo)throws PersistentException  {
		Imagen[] imagenes = null;
		Imagen imagen = null;
		imagenes = getImagenes();
		for(int i = 0 ; i< imagenes.length;i++){
			if(imagenes[i].getImagen().equals(titulo)&&imagenes[i].getTipo().equals(tipo)){
				imagen = imagenes[i];
				break;
			}
		}
		return imagen;
	}
}