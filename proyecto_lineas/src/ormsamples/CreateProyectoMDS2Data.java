/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateProyectoMDS2Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = gestion_de_lineas.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			gestion_de_lineas.Tarifa diagrama_de_Base_de_DatosTarifa = gestion_de_lineas.TarifaDAO.createTarifa();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cobra
			gestion_de_lineas.TarifaDAO.save(diagrama_de_Base_de_DatosTarifa);
			gestion_de_lineas.Direccion diagrama_de_Base_de_DatosDireccion = gestion_de_lineas.DireccionDAO.createDireccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene
			gestion_de_lineas.DireccionDAO.save(diagrama_de_Base_de_DatosDireccion);
			gestion_de_lineas.Barrio diagrama_de_Base_de_DatosBarrio = gestion_de_lineas.BarrioDAO.createBarrio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : pertenece
			gestion_de_lineas.BarrioDAO.save(diagrama_de_Base_de_DatosBarrio);
			gestion_de_lineas.Parada diagrama_de_Base_de_DatosParada = gestion_de_lineas.ParadaDAO.createParada();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : evento_pertenece, imagen_pertenece, pertenece, contiene
			gestion_de_lineas.ParadaDAO.save(diagrama_de_Base_de_DatosParada);
			gestion_de_lineas.Descarga diagrama_de_Base_de_DatosDescarga = gestion_de_lineas.DescargaDAO.createDescarga();
			// Initialize the properties of the persistent object here
			gestion_de_lineas.DescargaDAO.save(diagrama_de_Base_de_DatosDescarga);
			gestion_de_lineas.PuntoInteres diagrama_de_Base_de_DatosPuntoInteres = gestion_de_lineas.PuntoInteresDAO.createPuntoInteres();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene
			gestion_de_lineas.PuntoInteresDAO.save(diagrama_de_Base_de_DatosPuntoInteres);
			gestion_de_lineas.Linea diagrama_de_Base_de_DatosLinea = gestion_de_lineas.LineaDAO.createLinea();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_usada, pertenece, imagen
			gestion_de_lineas.LineaDAO.save(diagrama_de_Base_de_DatosLinea);
			gestion_de_lineas.Evento diagrama_de_Base_de_DatosEvento = gestion_de_lineas.EventoDAO.createEvento();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene
			gestion_de_lineas.EventoDAO.save(diagrama_de_Base_de_DatosEvento);
			gestion_de_lineas.Consulta diagrama_de_Base_de_DatosConsulta = gestion_de_lineas.ConsultaDAO.createConsulta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : realiza
			gestion_de_lineas.ConsultaDAO.save(diagrama_de_Base_de_DatosConsulta);
			gestion_de_lineas.Imagen diagrama_de_Base_de_DatosImagen = gestion_de_lineas.ImagenDAO.createImagen();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : linea, contiene
			gestion_de_lineas.ImagenDAO.save(diagrama_de_Base_de_DatosImagen);
			gestion_de_lineas.Usuario diagrama_de_Base_de_DatosUsuario = gestion_de_lineas.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : realizada_por, email
			gestion_de_lineas.UsuarioDAO.save(diagrama_de_Base_de_DatosUsuario);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProyectoMDS2Data createProyectoMDS2Data = new CreateProyectoMDS2Data();
			try {
				createProyectoMDS2Data.createTestData();
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
