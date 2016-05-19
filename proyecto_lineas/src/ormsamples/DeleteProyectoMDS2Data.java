/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteProyectoMDS2Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			gestion_de_lineas.Tarifa diagrama_de_Base_de_DatosTarifa = gestion_de_lineas.TarifaDAO.loadTarifaByQuery(null, null);
			// Delete the persistent object
			gestion_de_lineas.TarifaDAO.delete(diagrama_de_Base_de_DatosTarifa);
			gestion_de_lineas.Direccion diagrama_de_Base_de_DatosDireccion = gestion_de_lineas.DireccionDAO.loadDireccionByQuery(null, null);
			// Delete the persistent object
			gestion_de_lineas.DireccionDAO.delete(diagrama_de_Base_de_DatosDireccion);
			gestion_de_lineas.Barrio diagrama_de_Base_de_DatosBarrio = gestion_de_lineas.BarrioDAO.loadBarrioByQuery(null, null);
			// Delete the persistent object
			gestion_de_lineas.BarrioDAO.delete(diagrama_de_Base_de_DatosBarrio);
			gestion_de_lineas.Parada diagrama_de_Base_de_DatosParada = gestion_de_lineas.ParadaDAO.loadParadaByQuery(null, null);
			// Delete the persistent object
			gestion_de_lineas.ParadaDAO.delete(diagrama_de_Base_de_DatosParada);
			gestion_de_lineas.Descarga diagrama_de_Base_de_DatosDescarga = gestion_de_lineas.DescargaDAO.loadDescargaByQuery(null, null);
			// Delete the persistent object
			gestion_de_lineas.DescargaDAO.delete(diagrama_de_Base_de_DatosDescarga);
			gestion_de_lineas.PuntoInteres diagrama_de_Base_de_DatosPuntoInteres = gestion_de_lineas.PuntoInteresDAO.loadPuntoInteresByQuery(null, null);
			// Delete the persistent object
			gestion_de_lineas.PuntoInteresDAO.delete(diagrama_de_Base_de_DatosPuntoInteres);
			gestion_de_lineas.Linea diagrama_de_Base_de_DatosLinea = gestion_de_lineas.LineaDAO.loadLineaByQuery(null, null);
			// Delete the persistent object
			gestion_de_lineas.LineaDAO.delete(diagrama_de_Base_de_DatosLinea);
			gestion_de_lineas.Evento diagrama_de_Base_de_DatosEvento = gestion_de_lineas.EventoDAO.loadEventoByQuery(null, null);
			// Delete the persistent object
			gestion_de_lineas.EventoDAO.delete(diagrama_de_Base_de_DatosEvento);
			gestion_de_lineas.Consulta diagrama_de_Base_de_DatosConsulta = gestion_de_lineas.ConsultaDAO.loadConsultaByQuery(null, null);
			// Delete the persistent object
			gestion_de_lineas.ConsultaDAO.delete(diagrama_de_Base_de_DatosConsulta);
			gestion_de_lineas.Imagen diagrama_de_Base_de_DatosImagen = gestion_de_lineas.ImagenDAO.loadImagenByQuery(null, null);
			// Delete the persistent object
			gestion_de_lineas.ImagenDAO.delete(diagrama_de_Base_de_DatosImagen);
			gestion_de_lineas.Usuario diagrama_de_Base_de_DatosUsuario = gestion_de_lineas.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			gestion_de_lineas.UsuarioDAO.delete(diagrama_de_Base_de_DatosUsuario);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteProyectoMDS2Data deleteProyectoMDS2Data = new DeleteProyectoMDS2Data();
			try {
				deleteProyectoMDS2Data.deleteTestData();
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
