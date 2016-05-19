/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProyectoMDS2Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			gestion_de_lineas.Tarifa diagrama_de_Base_de_DatosTarifa = gestion_de_lineas.TarifaDAO.loadTarifaByQuery(null, null);
			// Update the properties of the persistent object
			gestion_de_lineas.TarifaDAO.save(diagrama_de_Base_de_DatosTarifa);
			gestion_de_lineas.Direccion diagrama_de_Base_de_DatosDireccion = gestion_de_lineas.DireccionDAO.loadDireccionByQuery(null, null);
			// Update the properties of the persistent object
			gestion_de_lineas.DireccionDAO.save(diagrama_de_Base_de_DatosDireccion);
			gestion_de_lineas.Barrio diagrama_de_Base_de_DatosBarrio = gestion_de_lineas.BarrioDAO.loadBarrioByQuery(null, null);
			// Update the properties of the persistent object
			gestion_de_lineas.BarrioDAO.save(diagrama_de_Base_de_DatosBarrio);
			gestion_de_lineas.Parada diagrama_de_Base_de_DatosParada = gestion_de_lineas.ParadaDAO.loadParadaByQuery(null, null);
			// Update the properties of the persistent object
			gestion_de_lineas.ParadaDAO.save(diagrama_de_Base_de_DatosParada);
			gestion_de_lineas.Descarga diagrama_de_Base_de_DatosDescarga = gestion_de_lineas.DescargaDAO.loadDescargaByQuery(null, null);
			// Update the properties of the persistent object
			gestion_de_lineas.DescargaDAO.save(diagrama_de_Base_de_DatosDescarga);
			gestion_de_lineas.PuntoInteres diagrama_de_Base_de_DatosPuntoInteres = gestion_de_lineas.PuntoInteresDAO.loadPuntoInteresByQuery(null, null);
			// Update the properties of the persistent object
			gestion_de_lineas.PuntoInteresDAO.save(diagrama_de_Base_de_DatosPuntoInteres);
			gestion_de_lineas.Linea diagrama_de_Base_de_DatosLinea = gestion_de_lineas.LineaDAO.loadLineaByQuery(null, null);
			// Update the properties of the persistent object
			gestion_de_lineas.LineaDAO.save(diagrama_de_Base_de_DatosLinea);
			gestion_de_lineas.Evento diagrama_de_Base_de_DatosEvento = gestion_de_lineas.EventoDAO.loadEventoByQuery(null, null);
			// Update the properties of the persistent object
			gestion_de_lineas.EventoDAO.save(diagrama_de_Base_de_DatosEvento);
			gestion_de_lineas.Consulta diagrama_de_Base_de_DatosConsulta = gestion_de_lineas.ConsultaDAO.loadConsultaByQuery(null, null);
			// Update the properties of the persistent object
			gestion_de_lineas.ConsultaDAO.save(diagrama_de_Base_de_DatosConsulta);
			gestion_de_lineas.Imagen diagrama_de_Base_de_DatosImagen = gestion_de_lineas.ImagenDAO.loadImagenByQuery(null, null);
			// Update the properties of the persistent object
			gestion_de_lineas.ImagenDAO.save(diagrama_de_Base_de_DatosImagen);
			gestion_de_lineas.Usuario diagrama_de_Base_de_DatosUsuario = gestion_de_lineas.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			gestion_de_lineas.UsuarioDAO.save(diagrama_de_Base_de_DatosUsuario);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Tarifa by TarifaCriteria");
		gestion_de_lineas.TarifaCriteria diagrama_de_Base_de_DatosTarifaCriteria = new gestion_de_lineas.TarifaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_de_Base_de_DatosTarifaCriteria.ID.eq();
		System.out.println(diagrama_de_Base_de_DatosTarifaCriteria.uniqueTarifa());
		
		System.out.println("Retrieving Direccion by DireccionCriteria");
		gestion_de_lineas.DireccionCriteria diagrama_de_Base_de_DatosDireccionCriteria = new gestion_de_lineas.DireccionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_de_Base_de_DatosDireccionCriteria.ID.eq();
		System.out.println(diagrama_de_Base_de_DatosDireccionCriteria.uniqueDireccion());
		
		System.out.println("Retrieving Barrio by BarrioCriteria");
		gestion_de_lineas.BarrioCriteria diagrama_de_Base_de_DatosBarrioCriteria = new gestion_de_lineas.BarrioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_de_Base_de_DatosBarrioCriteria.ID.eq();
		System.out.println(diagrama_de_Base_de_DatosBarrioCriteria.uniqueBarrio());
		
		System.out.println("Retrieving Parada by ParadaCriteria");
		gestion_de_lineas.ParadaCriteria diagrama_de_Base_de_DatosParadaCriteria = new gestion_de_lineas.ParadaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_de_Base_de_DatosParadaCriteria.ID.eq();
		System.out.println(diagrama_de_Base_de_DatosParadaCriteria.uniqueParada());
		
		System.out.println("Retrieving Descarga by DescargaCriteria");
		gestion_de_lineas.DescargaCriteria diagrama_de_Base_de_DatosDescargaCriteria = new gestion_de_lineas.DescargaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_de_Base_de_DatosDescargaCriteria.ID.eq();
		System.out.println(diagrama_de_Base_de_DatosDescargaCriteria.uniqueDescarga());
		
		System.out.println("Retrieving PuntoInteres by PuntoInteresCriteria");
		gestion_de_lineas.PuntoInteresCriteria diagrama_de_Base_de_DatosPuntoInteresCriteria = new gestion_de_lineas.PuntoInteresCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_de_Base_de_DatosPuntoInteresCriteria.ID.eq();
		System.out.println(diagrama_de_Base_de_DatosPuntoInteresCriteria.uniquePuntoInteres());
		
		System.out.println("Retrieving Linea by LineaCriteria");
		gestion_de_lineas.LineaCriteria diagrama_de_Base_de_DatosLineaCriteria = new gestion_de_lineas.LineaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_de_Base_de_DatosLineaCriteria.ID.eq();
		System.out.println(diagrama_de_Base_de_DatosLineaCriteria.uniqueLinea());
		
		System.out.println("Retrieving Evento by EventoCriteria");
		gestion_de_lineas.EventoCriteria diagrama_de_Base_de_DatosEventoCriteria = new gestion_de_lineas.EventoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_de_Base_de_DatosEventoCriteria.ID.eq();
		System.out.println(diagrama_de_Base_de_DatosEventoCriteria.uniqueEvento());
		
		System.out.println("Retrieving Consulta by ConsultaCriteria");
		gestion_de_lineas.ConsultaCriteria diagrama_de_Base_de_DatosConsultaCriteria = new gestion_de_lineas.ConsultaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_de_Base_de_DatosConsultaCriteria.ID.eq();
		System.out.println(diagrama_de_Base_de_DatosConsultaCriteria.uniqueConsulta());
		
		System.out.println("Retrieving Imagen by ImagenCriteria");
		gestion_de_lineas.ImagenCriteria diagrama_de_Base_de_DatosImagenCriteria = new gestion_de_lineas.ImagenCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//diagrama_de_Base_de_DatosImagenCriteria.ID.eq();
		System.out.println(diagrama_de_Base_de_DatosImagenCriteria.uniqueImagen());
		
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		gestion_de_lineas.UsuarioCriteria diagrama_de_Base_de_DatosUsuarioCriteria = new gestion_de_lineas.UsuarioCriteria();
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
				gestion_de_lineas.ProyectoMDS2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
