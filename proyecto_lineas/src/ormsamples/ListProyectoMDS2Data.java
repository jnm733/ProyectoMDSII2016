/**
 * Licensee: University of Almeria
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListProyectoMDS2Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Tarifa...");
		diagrama_de_base_de_datos.Tarifa[] diagrama_de_Base_de_DatosTarifas = diagrama_de_base_de_datos.TarifaDAO.listTarifaByQuery(null, null);
		int length = Math.min(diagrama_de_Base_de_DatosTarifas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_de_Base_de_DatosTarifas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Direccion...");
		diagrama_de_base_de_datos.Direccion[] diagrama_de_Base_de_DatosDireccions = diagrama_de_base_de_datos.DireccionDAO.listDireccionByQuery(null, null);
		length = Math.min(diagrama_de_Base_de_DatosDireccions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_de_Base_de_DatosDireccions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Barrio...");
		diagrama_de_base_de_datos.Barrio[] diagrama_de_Base_de_DatosBarrios = diagrama_de_base_de_datos.BarrioDAO.listBarrioByQuery(null, null);
		length = Math.min(diagrama_de_Base_de_DatosBarrios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_de_Base_de_DatosBarrios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Parada...");
		diagrama_de_base_de_datos.Parada[] diagrama_de_Base_de_DatosParadas = diagrama_de_base_de_datos.ParadaDAO.listParadaByQuery(null, null);
		length = Math.min(diagrama_de_Base_de_DatosParadas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_de_Base_de_DatosParadas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Descarga...");
		diagrama_de_base_de_datos.Descarga[] diagrama_de_Base_de_DatosDescargas = diagrama_de_base_de_datos.DescargaDAO.listDescargaByQuery(null, null);
		length = Math.min(diagrama_de_Base_de_DatosDescargas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_de_Base_de_DatosDescargas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PuntoInteres...");
		diagrama_de_base_de_datos.PuntoInteres[] diagrama_de_Base_de_DatosPuntoIntereses = diagrama_de_base_de_datos.PuntoInteresDAO.listPuntoInteresByQuery(null, null);
		length = Math.min(diagrama_de_Base_de_DatosPuntoIntereses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_de_Base_de_DatosPuntoIntereses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Linea...");
		diagrama_de_base_de_datos.Linea[] diagrama_de_Base_de_DatosLineas = diagrama_de_base_de_datos.LineaDAO.listLineaByQuery(null, null);
		length = Math.min(diagrama_de_Base_de_DatosLineas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_de_Base_de_DatosLineas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Evento...");
		diagrama_de_base_de_datos.Evento[] diagrama_de_Base_de_DatosEventos = diagrama_de_base_de_datos.EventoDAO.listEventoByQuery(null, null);
		length = Math.min(diagrama_de_Base_de_DatosEventos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_de_Base_de_DatosEventos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Consulta...");
		diagrama_de_base_de_datos.Consulta[] diagrama_de_Base_de_DatosConsultas = diagrama_de_base_de_datos.ConsultaDAO.listConsultaByQuery(null, null);
		length = Math.min(diagrama_de_Base_de_DatosConsultas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_de_Base_de_DatosConsultas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Imagen...");
		diagrama_de_base_de_datos.Imagen[] diagrama_de_Base_de_DatosImagens = diagrama_de_base_de_datos.ImagenDAO.listImagenByQuery(null, null);
		length = Math.min(diagrama_de_Base_de_DatosImagens.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_de_Base_de_DatosImagens[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario...");
		diagrama_de_base_de_datos.Usuario[] diagrama_de_Base_de_DatosUsuarios = diagrama_de_base_de_datos.UsuarioDAO.listUsuarioByQuery(null, null);
		length = Math.min(diagrama_de_Base_de_DatosUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_de_Base_de_DatosUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Linea_Parada...");
		diagrama_de_base_de_datos.Linea_Parada[] diagrama_de_Base_de_DatosLinea_Paradas = diagrama_de_base_de_datos.Linea_ParadaDAO.listLinea_ParadaByQuery(null, null);
		length = Math.min(diagrama_de_Base_de_DatosLinea_Paradas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_de_Base_de_DatosLinea_Paradas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Tarifa by Criteria...");
		diagrama_de_base_de_datos.TarifaCriteria diagrama_de_Base_de_DatosTarifaCriteria = new diagrama_de_base_de_datos.TarifaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_de_Base_de_DatosTarifaCriteria.ID.eq();
		diagrama_de_Base_de_DatosTarifaCriteria.setMaxResults(ROW_COUNT);
		diagrama_de_base_de_datos.Tarifa[] diagrama_de_Base_de_DatosTarifas = diagrama_de_Base_de_DatosTarifaCriteria.listTarifa();
		int length =diagrama_de_Base_de_DatosTarifas== null ? 0 : Math.min(diagrama_de_Base_de_DatosTarifas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_de_Base_de_DatosTarifas[i]);
		}
		System.out.println(length + " Tarifa record(s) retrieved."); 
		
		System.out.println("Listing Direccion by Criteria...");
		diagrama_de_base_de_datos.DireccionCriteria diagrama_de_Base_de_DatosDireccionCriteria = new diagrama_de_base_de_datos.DireccionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_de_Base_de_DatosDireccionCriteria.ID.eq();
		diagrama_de_Base_de_DatosDireccionCriteria.setMaxResults(ROW_COUNT);
		diagrama_de_base_de_datos.Direccion[] diagrama_de_Base_de_DatosDireccions = diagrama_de_Base_de_DatosDireccionCriteria.listDireccion();
		length =diagrama_de_Base_de_DatosDireccions== null ? 0 : Math.min(diagrama_de_Base_de_DatosDireccions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_de_Base_de_DatosDireccions[i]);
		}
		System.out.println(length + " Direccion record(s) retrieved."); 
		
		System.out.println("Listing Barrio by Criteria...");
		diagrama_de_base_de_datos.BarrioCriteria diagrama_de_Base_de_DatosBarrioCriteria = new diagrama_de_base_de_datos.BarrioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_de_Base_de_DatosBarrioCriteria.ID.eq();
		diagrama_de_Base_de_DatosBarrioCriteria.setMaxResults(ROW_COUNT);
		diagrama_de_base_de_datos.Barrio[] diagrama_de_Base_de_DatosBarrios = diagrama_de_Base_de_DatosBarrioCriteria.listBarrio();
		length =diagrama_de_Base_de_DatosBarrios== null ? 0 : Math.min(diagrama_de_Base_de_DatosBarrios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_de_Base_de_DatosBarrios[i]);
		}
		System.out.println(length + " Barrio record(s) retrieved."); 
		
		System.out.println("Listing Parada by Criteria...");
		diagrama_de_base_de_datos.ParadaCriteria diagrama_de_Base_de_DatosParadaCriteria = new diagrama_de_base_de_datos.ParadaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_de_Base_de_DatosParadaCriteria.nombreParada.eq();
		diagrama_de_Base_de_DatosParadaCriteria.setMaxResults(ROW_COUNT);
		diagrama_de_base_de_datos.Parada[] diagrama_de_Base_de_DatosParadas = diagrama_de_Base_de_DatosParadaCriteria.listParada();
		length =diagrama_de_Base_de_DatosParadas== null ? 0 : Math.min(diagrama_de_Base_de_DatosParadas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_de_Base_de_DatosParadas[i]);
		}
		System.out.println(length + " Parada record(s) retrieved."); 
		
		System.out.println("Listing Descarga by Criteria...");
		diagrama_de_base_de_datos.DescargaCriteria diagrama_de_Base_de_DatosDescargaCriteria = new diagrama_de_base_de_datos.DescargaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_de_Base_de_DatosDescargaCriteria.ID.eq();
		diagrama_de_Base_de_DatosDescargaCriteria.setMaxResults(ROW_COUNT);
		diagrama_de_base_de_datos.Descarga[] diagrama_de_Base_de_DatosDescargas = diagrama_de_Base_de_DatosDescargaCriteria.listDescarga();
		length =diagrama_de_Base_de_DatosDescargas== null ? 0 : Math.min(diagrama_de_Base_de_DatosDescargas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_de_Base_de_DatosDescargas[i]);
		}
		System.out.println(length + " Descarga record(s) retrieved."); 
		
		System.out.println("Listing PuntoInteres by Criteria...");
		diagrama_de_base_de_datos.PuntoInteresCriteria diagrama_de_Base_de_DatosPuntoInteresCriteria = new diagrama_de_base_de_datos.PuntoInteresCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_de_Base_de_DatosPuntoInteresCriteria.ID.eq();
		diagrama_de_Base_de_DatosPuntoInteresCriteria.setMaxResults(ROW_COUNT);
		diagrama_de_base_de_datos.PuntoInteres[] diagrama_de_Base_de_DatosPuntoIntereses = diagrama_de_Base_de_DatosPuntoInteresCriteria.listPuntoInteres();
		length =diagrama_de_Base_de_DatosPuntoIntereses== null ? 0 : Math.min(diagrama_de_Base_de_DatosPuntoIntereses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_de_Base_de_DatosPuntoIntereses[i]);
		}
		System.out.println(length + " PuntoInteres record(s) retrieved."); 
		
		System.out.println("Listing Linea by Criteria...");
		diagrama_de_base_de_datos.LineaCriteria diagrama_de_Base_de_DatosLineaCriteria = new diagrama_de_base_de_datos.LineaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_de_Base_de_DatosLineaCriteria.numeroLinea.eq();
		diagrama_de_Base_de_DatosLineaCriteria.setMaxResults(ROW_COUNT);
		diagrama_de_base_de_datos.Linea[] diagrama_de_Base_de_DatosLineas = diagrama_de_Base_de_DatosLineaCriteria.listLinea();
		length =diagrama_de_Base_de_DatosLineas== null ? 0 : Math.min(diagrama_de_Base_de_DatosLineas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_de_Base_de_DatosLineas[i]);
		}
		System.out.println(length + " Linea record(s) retrieved."); 
		
		System.out.println("Listing Evento by Criteria...");
		diagrama_de_base_de_datos.EventoCriteria diagrama_de_Base_de_DatosEventoCriteria = new diagrama_de_base_de_datos.EventoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_de_Base_de_DatosEventoCriteria.ID.eq();
		diagrama_de_Base_de_DatosEventoCriteria.setMaxResults(ROW_COUNT);
		diagrama_de_base_de_datos.Evento[] diagrama_de_Base_de_DatosEventos = diagrama_de_Base_de_DatosEventoCriteria.listEvento();
		length =diagrama_de_Base_de_DatosEventos== null ? 0 : Math.min(diagrama_de_Base_de_DatosEventos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_de_Base_de_DatosEventos[i]);
		}
		System.out.println(length + " Evento record(s) retrieved."); 
		
		System.out.println("Listing Consulta by Criteria...");
		diagrama_de_base_de_datos.ConsultaCriteria diagrama_de_Base_de_DatosConsultaCriteria = new diagrama_de_base_de_datos.ConsultaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_de_Base_de_DatosConsultaCriteria.ID.eq();
		diagrama_de_Base_de_DatosConsultaCriteria.setMaxResults(ROW_COUNT);
		diagrama_de_base_de_datos.Consulta[] diagrama_de_Base_de_DatosConsultas = diagrama_de_Base_de_DatosConsultaCriteria.listConsulta();
		length =diagrama_de_Base_de_DatosConsultas== null ? 0 : Math.min(diagrama_de_Base_de_DatosConsultas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_de_Base_de_DatosConsultas[i]);
		}
		System.out.println(length + " Consulta record(s) retrieved."); 
		
		System.out.println("Listing Imagen by Criteria...");
		diagrama_de_base_de_datos.ImagenCriteria diagrama_de_Base_de_DatosImagenCriteria = new diagrama_de_base_de_datos.ImagenCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_de_Base_de_DatosImagenCriteria.ID.eq();
		diagrama_de_Base_de_DatosImagenCriteria.setMaxResults(ROW_COUNT);
		diagrama_de_base_de_datos.Imagen[] diagrama_de_Base_de_DatosImagens = diagrama_de_Base_de_DatosImagenCriteria.listImagen();
		length =diagrama_de_Base_de_DatosImagens== null ? 0 : Math.min(diagrama_de_Base_de_DatosImagens.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_de_Base_de_DatosImagens[i]);
		}
		System.out.println(length + " Imagen record(s) retrieved."); 
		
		System.out.println("Listing Usuario by Criteria...");
		diagrama_de_base_de_datos.UsuarioCriteria diagrama_de_Base_de_DatosUsuarioCriteria = new diagrama_de_base_de_datos.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_de_Base_de_DatosUsuarioCriteria.email.eq();
		diagrama_de_Base_de_DatosUsuarioCriteria.setMaxResults(ROW_COUNT);
		diagrama_de_base_de_datos.Usuario[] diagrama_de_Base_de_DatosUsuarios = diagrama_de_Base_de_DatosUsuarioCriteria.listUsuario();
		length =diagrama_de_Base_de_DatosUsuarios== null ? 0 : Math.min(diagrama_de_Base_de_DatosUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_de_Base_de_DatosUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Linea_Parada by Criteria...");
		diagrama_de_base_de_datos.Linea_ParadaCriteria diagrama_de_Base_de_DatosLinea_ParadaCriteria = new diagrama_de_base_de_datos.Linea_ParadaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_de_Base_de_DatosLinea_ParadaCriteria.ID.eq();
		diagrama_de_Base_de_DatosLinea_ParadaCriteria.setMaxResults(ROW_COUNT);
		diagrama_de_base_de_datos.Linea_Parada[] diagrama_de_Base_de_DatosLinea_Paradas = diagrama_de_Base_de_DatosLinea_ParadaCriteria.listLinea_Parada();
		length =diagrama_de_Base_de_DatosLinea_Paradas== null ? 0 : Math.min(diagrama_de_Base_de_DatosLinea_Paradas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_de_Base_de_DatosLinea_Paradas[i]);
		}
		System.out.println(length + " Linea_Parada record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProyectoMDS2Data listProyectoMDS2Data = new ListProyectoMDS2Data();
			try {
				listProyectoMDS2Data.listTestData();
				//listProyectoMDS2Data.listByCriteria();
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
