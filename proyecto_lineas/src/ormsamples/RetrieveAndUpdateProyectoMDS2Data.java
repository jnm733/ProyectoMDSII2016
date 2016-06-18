/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProyectoMDS2Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			diagrama_de_base_de_datos.Tarifa diagrama_de_Base_de_DatosTarifa = diagrama_de_base_de_datos.TarifaDAO.loadTarifaByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_de_base_de_datos.TarifaDAO.save(diagrama_de_Base_de_DatosTarifa);
			diagrama_de_base_de_datos.Direccion diagrama_de_Base_de_DatosDireccion = diagrama_de_base_de_datos.DireccionDAO.loadDireccionByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_de_base_de_datos.DireccionDAO.save(diagrama_de_Base_de_DatosDireccion);
			diagrama_de_base_de_datos.Barrio diagrama_de_Base_de_DatosBarrio = diagrama_de_base_de_datos.BarrioDAO.loadBarrioByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_de_base_de_datos.BarrioDAO.save(diagrama_de_Base_de_DatosBarrio);
			diagrama_de_base_de_datos.Parada diagrama_de_Base_de_DatosParada = diagrama_de_base_de_datos.ParadaDAO.loadParadaByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_de_base_de_datos.ParadaDAO.save(diagrama_de_Base_de_DatosParada);
			diagrama_de_base_de_datos.Descarga diagrama_de_Base_de_DatosDescarga = diagrama_de_base_de_datos.DescargaDAO.loadDescargaByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_de_base_de_datos.DescargaDAO.save(diagrama_de_Base_de_DatosDescarga);
			diagrama_de_base_de_datos.PuntoInteres diagrama_de_Base_de_DatosPuntoInteres = diagrama_de_base_de_datos.PuntoInteresDAO.loadPuntoInteresByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_de_base_de_datos.PuntoInteresDAO.save(diagrama_de_Base_de_DatosPuntoInteres);
			diagrama_de_base_de_datos.Linea diagrama_de_Base_de_DatosLinea = diagrama_de_base_de_datos.LineaDAO.loadLineaByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_de_base_de_datos.LineaDAO.save(diagrama_de_Base_de_DatosLinea);
			diagrama_de_base_de_datos.Evento diagrama_de_Base_de_DatosEvento = diagrama_de_base_de_datos.EventoDAO.loadEventoByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_de_base_de_datos.EventoDAO.save(diagrama_de_Base_de_DatosEvento);
			diagrama_de_base_de_datos.Consulta diagrama_de_Base_de_DatosConsulta = diagrama_de_base_de_datos.ConsultaDAO.loadConsultaByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_de_base_de_datos.ConsultaDAO.save(diagrama_de_Base_de_DatosConsulta);
			diagrama_de_base_de_datos.Imagen diagrama_de_Base_de_DatosImagen = diagrama_de_base_de_datos.ImagenDAO.loadImagenByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_de_base_de_datos.ImagenDAO.save(diagrama_de_Base_de_DatosImagen);
			diagrama_de_base_de_datos.Usuario diagrama_de_Base_de_DatosUsuario = diagrama_de_base_de_datos.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			diagrama_de_base_de_datos.UsuarioDAO.save(diagrama_de_Base_de_DatosUsuario);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Tarifa by TarifaCriteria");
		diagrama_de_base_de_datos.TarifaCriteria diagrama_de_Base_de_DatosTarifaCriteria = new diagrama_de_base_de_datos.TarifaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_de_Base_de_DatosTarifaCriteria.ID.eq();
		System.out.println(diagrama_de_Base_de_DatosTarifaCriteria.uniqueTarifa());
		
		System.out.println("Retrieving Direccion by DireccionCriteria");
		diagrama_de_base_de_datos.DireccionCriteria diagrama_de_Base_de_DatosDireccionCriteria = new diagrama_de_base_de_datos.DireccionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_de_Base_de_DatosDireccionCriteria.ID.eq();
		System.out.println(diagrama_de_Base_de_DatosDireccionCriteria.uniqueDireccion());
		
		System.out.println("Retrieving Barrio by BarrioCriteria");
		diagrama_de_base_de_datos.BarrioCriteria diagrama_de_Base_de_DatosBarrioCriteria = new diagrama_de_base_de_datos.BarrioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_de_Base_de_DatosBarrioCriteria.ID.eq();
		System.out.println(diagrama_de_Base_de_DatosBarrioCriteria.uniqueBarrio());
		
		System.out.println("Retrieving Parada by ParadaCriteria");
		diagrama_de_base_de_datos.ParadaCriteria diagrama_de_Base_de_DatosParadaCriteria = new diagrama_de_base_de_datos.ParadaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_de_Base_de_DatosParadaCriteria.ID.eq();
		System.out.println(diagrama_de_Base_de_DatosParadaCriteria.uniqueParada());
		
		System.out.println("Retrieving Descarga by DescargaCriteria");
		diagrama_de_base_de_datos.DescargaCriteria diagrama_de_Base_de_DatosDescargaCriteria = new diagrama_de_base_de_datos.DescargaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_de_Base_de_DatosDescargaCriteria.ID.eq();
		System.out.println(diagrama_de_Base_de_DatosDescargaCriteria.uniqueDescarga());
		
		System.out.println("Retrieving PuntoInteres by PuntoInteresCriteria");
		diagrama_de_base_de_datos.PuntoInteresCriteria diagrama_de_Base_de_DatosPuntoInteresCriteria = new diagrama_de_base_de_datos.PuntoInteresCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_de_Base_de_DatosPuntoInteresCriteria.ID.eq();
		System.out.println(diagrama_de_Base_de_DatosPuntoInteresCriteria.uniquePuntoInteres());
		
		System.out.println("Retrieving Linea by LineaCriteria");
		diagrama_de_base_de_datos.LineaCriteria diagrama_de_Base_de_DatosLineaCriteria = new diagrama_de_base_de_datos.LineaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_de_Base_de_DatosLineaCriteria.ID.eq();
		System.out.println(diagrama_de_Base_de_DatosLineaCriteria.uniqueLinea());
		
		System.out.println("Retrieving Evento by EventoCriteria");
		diagrama_de_base_de_datos.EventoCriteria diagrama_de_Base_de_DatosEventoCriteria = new diagrama_de_base_de_datos.EventoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_de_Base_de_DatosEventoCriteria.ID.eq();
		System.out.println(diagrama_de_Base_de_DatosEventoCriteria.uniqueEvento());
		
		System.out.println("Retrieving Consulta by ConsultaCriteria");
		diagrama_de_base_de_datos.ConsultaCriteria diagrama_de_Base_de_DatosConsultaCriteria = new diagrama_de_base_de_datos.ConsultaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_de_Base_de_DatosConsultaCriteria.ID.eq();
		System.out.println(diagrama_de_Base_de_DatosConsultaCriteria.uniqueConsulta());
		
		System.out.println("Retrieving Imagen by ImagenCriteria");
		diagrama_de_base_de_datos.ImagenCriteria diagrama_de_Base_de_DatosImagenCriteria = new diagrama_de_base_de_datos.ImagenCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_de_Base_de_DatosImagenCriteria.ID.eq();
		System.out.println(diagrama_de_Base_de_DatosImagenCriteria.uniqueImagen());
		
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		diagrama_de_base_de_datos.UsuarioCriteria diagrama_de_Base_de_DatosUsuarioCriteria = new diagrama_de_base_de_datos.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_de_Base_de_DatosUsuarioCriteria.ID.eq();
		System.out.println(diagrama_de_Base_de_DatosUsuarioCriteria.uniqueUsuario());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProyectoMDS2Data retrieveAndUpdateProyectoMDS2Data = new RetrieveAndUpdateProyectoMDS2Data();
			try {
				retrieveAndUpdateProyectoMDS2Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateProyectoMDS2Data.retrieveByCriteria();
			}
			finally {
				diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
