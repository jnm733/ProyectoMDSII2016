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
		gestion_de_lineas.Tarifa[] diagrama_de_Base_de_DatosTarifas = gestion_de_lineas.TarifaDAO.listTarifaByQuery(null, null);
		int length = Math.min(diagrama_de_Base_de_DatosTarifas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_de_Base_de_DatosTarifas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Direccion...");
		gestion_de_lineas.Direccion[] diagrama_de_Base_de_DatosDireccions = gestion_de_lineas.DireccionDAO.listDireccionByQuery(null, null);
		length = Math.min(diagrama_de_Base_de_DatosDireccions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_de_Base_de_DatosDireccions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Barrio...");
		gestion_de_lineas.Barrio[] diagrama_de_Base_de_DatosBarrios = gestion_de_lineas.BarrioDAO.listBarrioByQuery(null, null);
		length = Math.min(diagrama_de_Base_de_DatosBarrios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_de_Base_de_DatosBarrios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Parada...");
		gestion_de_lineas.Parada[] diagrama_de_Base_de_DatosParadas = gestion_de_lineas.ParadaDAO.listParadaByQuery(null, null);
		length = Math.min(diagrama_de_Base_de_DatosParadas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_de_Base_de_DatosParadas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Descarga...");
		gestion_de_lineas.Descarga[] diagrama_de_Base_de_DatosDescargas = gestion_de_lineas.DescargaDAO.listDescargaByQuery(null, null);
		length = Math.min(diagrama_de_Base_de_DatosDescargas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_de_Base_de_DatosDescargas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing PuntoInteres...");
		gestion_de_lineas.PuntoInteres[] diagrama_de_Base_de_DatosPuntoIntereses = gestion_de_lineas.PuntoInteresDAO.listPuntoInteresByQuery(null, null);
		length = Math.min(diagrama_de_Base_de_DatosPuntoIntereses.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_de_Base_de_DatosPuntoIntereses[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Linea...");
		gestion_de_lineas.Linea[] diagrama_de_Base_de_DatosLineas = gestion_de_lineas.LineaDAO.listLineaByQuery(null, null);
		length = Math.min(diagrama_de_Base_de_DatosLineas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_de_Base_de_DatosLineas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Evento...");
		gestion_de_lineas.Evento[] diagrama_de_Base_de_DatosEventos = gestion_de_lineas.EventoDAO.listEventoByQuery(null, null);
		length = Math.min(diagrama_de_Base_de_DatosEventos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_de_Base_de_DatosEventos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Consulta...");
		gestion_de_lineas.Consulta[] diagrama_de_Base_de_DatosConsultas = gestion_de_lineas.ConsultaDAO.listConsultaByQuery(null, null);
		length = Math.min(diagrama_de_Base_de_DatosConsultas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_de_Base_de_DatosConsultas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Imagen...");
		gestion_de_lineas.Imagen[] diagrama_de_Base_de_DatosImagens = gestion_de_lineas.ImagenDAO.listImagenByQuery(null, null);
		length = Math.min(diagrama_de_Base_de_DatosImagens.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_de_Base_de_DatosImagens[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario...");
		gestion_de_lineas.Usuario[] diagrama_de_Base_de_DatosUsuarios = gestion_de_lineas.UsuarioDAO.listUsuarioByQuery(null, null);
		length = Math.min(diagrama_de_Base_de_DatosUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagrama_de_Base_de_DatosUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Tarifa by Criteria...");
		gestion_de_lineas.TarifaCriteria diagrama_de_Base_de_DatosTarifaCriteria = new gestion_de_lineas.TarifaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_de_Base_de_DatosTarifaCriteria.ID.eq();
		diagrama_de_Base_de_DatosTarifaCriteria.setMaxResults(ROW_COUNT);
		gestion_de_lineas.Tarifa[] diagrama_de_Base_de_DatosTarifas = diagrama_de_Base_de_DatosTarifaCriteria.listTarifa();
		int length =diagrama_de_Base_de_DatosTarifas== null ? 0 : Math.min(diagrama_de_Base_de_DatosTarifas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_de_Base_de_DatosTarifas[i]);
		}
		System.out.println(length + " Tarifa record(s) retrieved."); 
		
		System.out.println("Listing Direccion by Criteria...");
		gestion_de_lineas.DireccionCriteria diagrama_de_Base_de_DatosDireccionCriteria = new gestion_de_lineas.DireccionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_de_Base_de_DatosDireccionCriteria.ID.eq();
		diagrama_de_Base_de_DatosDireccionCriteria.setMaxResults(ROW_COUNT);
		gestion_de_lineas.Direccion[] diagrama_de_Base_de_DatosDireccions = diagrama_de_Base_de_DatosDireccionCriteria.listDireccion();
		length =diagrama_de_Base_de_DatosDireccions== null ? 0 : Math.min(diagrama_de_Base_de_DatosDireccions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_de_Base_de_DatosDireccions[i]);
		}
		System.out.println(length + " Direccion record(s) retrieved."); 
		
		System.out.println("Listing Barrio by Criteria...");
		gestion_de_lineas.BarrioCriteria diagrama_de_Base_de_DatosBarrioCriteria = new gestion_de_lineas.BarrioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_de_Base_de_DatosBarrioCriteria.ID.eq();
		diagrama_de_Base_de_DatosBarrioCriteria.setMaxResults(ROW_COUNT);
		gestion_de_lineas.Barrio[] diagrama_de_Base_de_DatosBarrios = diagrama_de_Base_de_DatosBarrioCriteria.listBarrio();
		length =diagrama_de_Base_de_DatosBarrios== null ? 0 : Math.min(diagrama_de_Base_de_DatosBarrios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_de_Base_de_DatosBarrios[i]);
		}
		System.out.println(length + " Barrio record(s) retrieved."); 
		
		System.out.println("Listing Parada by Criteria...");
		gestion_de_lineas.ParadaCriteria diagrama_de_Base_de_DatosParadaCriteria = new gestion_de_lineas.ParadaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_de_Base_de_DatosParadaCriteria.ID.eq();
		diagrama_de_Base_de_DatosParadaCriteria.setMaxResults(ROW_COUNT);
		gestion_de_lineas.Parada[] diagrama_de_Base_de_DatosParadas = diagrama_de_Base_de_DatosParadaCriteria.listParada();
		length =diagrama_de_Base_de_DatosParadas== null ? 0 : Math.min(diagrama_de_Base_de_DatosParadas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_de_Base_de_DatosParadas[i]);
		}
		System.out.println(length + " Parada record(s) retrieved."); 
		
		System.out.println("Listing Descarga by Criteria...");
		gestion_de_lineas.DescargaCriteria diagrama_de_Base_de_DatosDescargaCriteria = new gestion_de_lineas.DescargaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_de_Base_de_DatosDescargaCriteria.ID.eq();
		diagrama_de_Base_de_DatosDescargaCriteria.setMaxResults(ROW_COUNT);
		gestion_de_lineas.Descarga[] diagrama_de_Base_de_DatosDescargas = diagrama_de_Base_de_DatosDescargaCriteria.listDescarga();
		length =diagrama_de_Base_de_DatosDescargas== null ? 0 : Math.min(diagrama_de_Base_de_DatosDescargas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_de_Base_de_DatosDescargas[i]);
		}
		System.out.println(length + " Descarga record(s) retrieved."); 
		
		System.out.println("Listing PuntoInteres by Criteria...");
		gestion_de_lineas.PuntoInteresCriteria diagrama_de_Base_de_DatosPuntoInteresCriteria = new gestion_de_lineas.PuntoInteresCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_de_Base_de_DatosPuntoInteresCriteria.ID.eq();
		diagrama_de_Base_de_DatosPuntoInteresCriteria.setMaxResults(ROW_COUNT);
		gestion_de_lineas.PuntoInteres[] diagrama_de_Base_de_DatosPuntoIntereses = diagrama_de_Base_de_DatosPuntoInteresCriteria.listPuntoInteres();
		length =diagrama_de_Base_de_DatosPuntoIntereses== null ? 0 : Math.min(diagrama_de_Base_de_DatosPuntoIntereses.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_de_Base_de_DatosPuntoIntereses[i]);
		}
		System.out.println(length + " PuntoInteres record(s) retrieved."); 
		
		System.out.println("Listing Linea by Criteria...");
		gestion_de_lineas.LineaCriteria diagrama_de_Base_de_DatosLineaCriteria = new gestion_de_lineas.LineaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_de_Base_de_DatosLineaCriteria.ID.eq();
		diagrama_de_Base_de_DatosLineaCriteria.setMaxResults(ROW_COUNT);
		gestion_de_lineas.Linea[] diagrama_de_Base_de_DatosLineas = diagrama_de_Base_de_DatosLineaCriteria.listLinea();
		length =diagrama_de_Base_de_DatosLineas== null ? 0 : Math.min(diagrama_de_Base_de_DatosLineas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_de_Base_de_DatosLineas[i]);
		}
		System.out.println(length + " Linea record(s) retrieved."); 
		
		System.out.println("Listing Evento by Criteria...");
		gestion_de_lineas.EventoCriteria diagrama_de_Base_de_DatosEventoCriteria = new gestion_de_lineas.EventoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_de_Base_de_DatosEventoCriteria.ID.eq();
		diagrama_de_Base_de_DatosEventoCriteria.setMaxResults(ROW_COUNT);
		gestion_de_lineas.Evento[] diagrama_de_Base_de_DatosEventos = diagrama_de_Base_de_DatosEventoCriteria.listEvento();
		length =diagrama_de_Base_de_DatosEventos== null ? 0 : Math.min(diagrama_de_Base_de_DatosEventos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_de_Base_de_DatosEventos[i]);
		}
		System.out.println(length + " Evento record(s) retrieved."); 
		
		System.out.println("Listing Consulta by Criteria...");
		gestion_de_lineas.ConsultaCriteria diagrama_de_Base_de_DatosConsultaCriteria = new gestion_de_lineas.ConsultaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_de_Base_de_DatosConsultaCriteria.ID.eq();
		diagrama_de_Base_de_DatosConsultaCriteria.setMaxResults(ROW_COUNT);
		gestion_de_lineas.Consulta[] diagrama_de_Base_de_DatosConsultas = diagrama_de_Base_de_DatosConsultaCriteria.listConsulta();
		length =diagrama_de_Base_de_DatosConsultas== null ? 0 : Math.min(diagrama_de_Base_de_DatosConsultas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_de_Base_de_DatosConsultas[i]);
		}
		System.out.println(length + " Consulta record(s) retrieved."); 
		
		System.out.println("Listing Imagen by Criteria...");
		gestion_de_lineas.ImagenCriteria diagrama_de_Base_de_DatosImagenCriteria = new gestion_de_lineas.ImagenCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_de_Base_de_DatosImagenCriteria.ID.eq();
		diagrama_de_Base_de_DatosImagenCriteria.setMaxResults(ROW_COUNT);
		gestion_de_lineas.Imagen[] diagrama_de_Base_de_DatosImagens = diagrama_de_Base_de_DatosImagenCriteria.listImagen();
		length =diagrama_de_Base_de_DatosImagens== null ? 0 : Math.min(diagrama_de_Base_de_DatosImagens.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_de_Base_de_DatosImagens[i]);
		}
		System.out.println(length + " Imagen record(s) retrieved."); 
		
		System.out.println("Listing Usuario by Criteria...");
		gestion_de_lineas.UsuarioCriteria diagrama_de_Base_de_DatosUsuarioCriteria = new gestion_de_lineas.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//diagrama_de_Base_de_DatosUsuarioCriteria.ID.eq();
		diagrama_de_Base_de_DatosUsuarioCriteria.setMaxResults(ROW_COUNT);
		gestion_de_lineas.Usuario[] diagrama_de_Base_de_DatosUsuarios = diagrama_de_Base_de_DatosUsuarioCriteria.listUsuario();
		length =diagrama_de_Base_de_DatosUsuarios== null ? 0 : Math.min(diagrama_de_Base_de_DatosUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagrama_de_Base_de_DatosUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProyectoMDS2Data listProyectoMDS2Data = new ListProyectoMDS2Data();
			try {
				listProyectoMDS2Data.listTestData();
				//listProyectoMDS2Data.listByCriteria();
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
