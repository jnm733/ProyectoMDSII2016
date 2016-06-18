/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateProyectoMDS2Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			diagrama_de_base_de_datos.Tarifa diagrama_de_Base_de_DatosTarifa = diagrama_de_base_de_datos.TarifaDAO.createTarifa();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cobra
			diagrama_de_base_de_datos.TarifaDAO.save(diagrama_de_Base_de_DatosTarifa);
			diagrama_de_base_de_datos.Direccion diagrama_de_Base_de_DatosDireccion = diagrama_de_base_de_datos.DireccionDAO.createDireccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene
			diagrama_de_base_de_datos.DireccionDAO.save(diagrama_de_Base_de_DatosDireccion);
			diagrama_de_base_de_datos.Barrio diagrama_de_Base_de_DatosBarrio = diagrama_de_base_de_datos.BarrioDAO.createBarrio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : pertenece
			diagrama_de_base_de_datos.BarrioDAO.save(diagrama_de_Base_de_DatosBarrio);
			diagrama_de_base_de_datos.Parada diagrama_de_Base_de_DatosParada = diagrama_de_base_de_datos.ParadaDAO.createParada();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : evento_pertenece, imagen_pertenece, pertenece, contiene
			diagrama_de_base_de_datos.ParadaDAO.save(diagrama_de_Base_de_DatosParada);
			diagrama_de_base_de_datos.Descarga diagrama_de_Base_de_DatosDescarga = diagrama_de_base_de_datos.DescargaDAO.createDescarga();
			// Initialize the properties of the persistent object here
			diagrama_de_base_de_datos.DescargaDAO.save(diagrama_de_Base_de_DatosDescarga);
			diagrama_de_base_de_datos.PuntoInteres diagrama_de_Base_de_DatosPuntoInteres = diagrama_de_base_de_datos.PuntoInteresDAO.createPuntoInteres();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene
			diagrama_de_base_de_datos.PuntoInteresDAO.save(diagrama_de_Base_de_DatosPuntoInteres);
			diagrama_de_base_de_datos.Linea diagrama_de_Base_de_DatosLinea = diagrama_de_base_de_datos.LineaDAO.createLinea();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_usada, pertenece, imagen
			diagrama_de_base_de_datos.LineaDAO.save(diagrama_de_Base_de_DatosLinea);
			diagrama_de_base_de_datos.Evento diagrama_de_Base_de_DatosEvento = diagrama_de_base_de_datos.EventoDAO.createEvento();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene
			diagrama_de_base_de_datos.EventoDAO.save(diagrama_de_Base_de_DatosEvento);
			diagrama_de_base_de_datos.Consulta diagrama_de_Base_de_DatosConsulta = diagrama_de_base_de_datos.ConsultaDAO.createConsulta();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : realiza
			diagrama_de_base_de_datos.ConsultaDAO.save(diagrama_de_Base_de_DatosConsulta);
			diagrama_de_base_de_datos.Imagen diagrama_de_Base_de_DatosImagen = diagrama_de_base_de_datos.ImagenDAO.createImagen();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : linea, contiene
			diagrama_de_base_de_datos.ImagenDAO.save(diagrama_de_Base_de_DatosImagen);
			diagrama_de_base_de_datos.Usuario diagrama_de_Base_de_DatosUsuario = diagrama_de_base_de_datos.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : realizada_por, email
			diagrama_de_base_de_datos.UsuarioDAO.save(diagrama_de_Base_de_DatosUsuario);
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
				diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
