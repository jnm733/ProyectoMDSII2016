/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteProyectoMDS2Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			diagrama_de_base_de_datos.Tarifa diagrama_de_Base_de_DatosTarifa = diagrama_de_base_de_datos.TarifaDAO.loadTarifaByQuery(null, null);
			// Delete the persistent object
			diagrama_de_base_de_datos.TarifaDAO.delete(diagrama_de_Base_de_DatosTarifa);
			diagrama_de_base_de_datos.Direccion diagrama_de_Base_de_DatosDireccion = diagrama_de_base_de_datos.DireccionDAO.loadDireccionByQuery(null, null);
			// Delete the persistent object
			diagrama_de_base_de_datos.DireccionDAO.delete(diagrama_de_Base_de_DatosDireccion);
			diagrama_de_base_de_datos.Barrio diagrama_de_Base_de_DatosBarrio = diagrama_de_base_de_datos.BarrioDAO.loadBarrioByQuery(null, null);
			// Delete the persistent object
			diagrama_de_base_de_datos.BarrioDAO.delete(diagrama_de_Base_de_DatosBarrio);
			diagrama_de_base_de_datos.Parada diagrama_de_Base_de_DatosParada = diagrama_de_base_de_datos.ParadaDAO.loadParadaByQuery(null, null);
			// Delete the persistent object
			diagrama_de_base_de_datos.ParadaDAO.delete(diagrama_de_Base_de_DatosParada);
			diagrama_de_base_de_datos.Descarga diagrama_de_Base_de_DatosDescarga = diagrama_de_base_de_datos.DescargaDAO.loadDescargaByQuery(null, null);
			// Delete the persistent object
			diagrama_de_base_de_datos.DescargaDAO.delete(diagrama_de_Base_de_DatosDescarga);
			diagrama_de_base_de_datos.PuntoInteres diagrama_de_Base_de_DatosPuntoInteres = diagrama_de_base_de_datos.PuntoInteresDAO.loadPuntoInteresByQuery(null, null);
			// Delete the persistent object
			diagrama_de_base_de_datos.PuntoInteresDAO.delete(diagrama_de_Base_de_DatosPuntoInteres);
			diagrama_de_base_de_datos.Linea diagrama_de_Base_de_DatosLinea = diagrama_de_base_de_datos.LineaDAO.loadLineaByQuery(null, null);
			// Delete the persistent object
			diagrama_de_base_de_datos.LineaDAO.delete(diagrama_de_Base_de_DatosLinea);
			diagrama_de_base_de_datos.Evento diagrama_de_Base_de_DatosEvento = diagrama_de_base_de_datos.EventoDAO.loadEventoByQuery(null, null);
			// Delete the persistent object
			diagrama_de_base_de_datos.EventoDAO.delete(diagrama_de_Base_de_DatosEvento);
			diagrama_de_base_de_datos.Consulta diagrama_de_Base_de_DatosConsulta = diagrama_de_base_de_datos.ConsultaDAO.loadConsultaByQuery(null, null);
			// Delete the persistent object
			diagrama_de_base_de_datos.ConsultaDAO.delete(diagrama_de_Base_de_DatosConsulta);
			diagrama_de_base_de_datos.Imagen diagrama_de_Base_de_DatosImagen = diagrama_de_base_de_datos.ImagenDAO.loadImagenByQuery(null, null);
			// Delete the persistent object
			diagrama_de_base_de_datos.ImagenDAO.delete(diagrama_de_Base_de_DatosImagen);
			diagrama_de_base_de_datos.Usuario diagrama_de_Base_de_DatosUsuario = diagrama_de_base_de_datos.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			diagrama_de_base_de_datos.UsuarioDAO.delete(diagrama_de_Base_de_DatosUsuario);
			diagrama_de_base_de_datos.Linea_Parada diagrama_de_Base_de_DatosLinea_Parada = diagrama_de_base_de_datos.Linea_ParadaDAO.loadLinea_ParadaByQuery(null, null);
			// Delete the persistent object
			diagrama_de_base_de_datos.Linea_ParadaDAO.delete(diagrama_de_Base_de_DatosLinea_Parada);
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
				diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
