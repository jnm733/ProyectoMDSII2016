package diagrama_de_clases;

import java.sql.Date;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_de_base_de_datos.*;

public class BD_Eventos {
	public BD_Principal _bd_Principal;
	public Vector<Evento> _cont_eventos = new Vector<Evento>();

	public Evento getEvento(int ID)throws PersistentException {
		Evento evento = null;

		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession()
				.beginTransaction();
		try {
			evento = diagrama_de_base_de_datos.EventoDAO.loadEventoByORMID(ID);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return evento;
	}

	public Evento[] getEventos()throws PersistentException {
		Evento[] eventos = null;

		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession()
				.beginTransaction();
		try {
			eventos = diagrama_de_base_de_datos.EventoDAO.listEventoByQuery(null, null);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return eventos;
	}
	
	public void vincularEventos(ArrayList aIncluidos, ArrayList aExcluidos) throws PersistentException{
		throw new UnsupportedOperationException();
	}

	public void incluirEvento(ArrayList aDatos)throws PersistentException {
		int id_evento = -1;
		int dia = 0;
		int mes = 0;
		int anyo = 0;
		
		String nombre =(String)aDatos.get(0);
		String direccion =(String)aDatos.get(1);
		String paradaCercana =(String)aDatos.get(2);
		String fechainicio =(String)aDatos.get(3);
		String fechafin =(String)aDatos.get(4);
		
		StringTokenizer st = new StringTokenizer(fechainicio,"/");
		dia = Integer.parseInt(st.nextToken());
		mes = Integer.parseInt(st.nextToken());
		anyo = Integer.parseInt(st.nextToken());
		
		Date fechaIn = new Date(dia,mes,anyo);
		
		st = new StringTokenizer(fechafin,"/");
		dia = Integer.parseInt(st.nextToken());
		mes = Integer.parseInt(st.nextToken());
		anyo = Integer.parseInt(st.nextToken());
		Date fechaFin = new Date(dia,mes,anyo);
		
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			 Evento as = EventoDAO.createEvento();
			 as.setNombreEvento(nombre);
			 as.setDireccionEvento(direccion);
			 as.setFechaFin(fechaFin);
			 as.setFechaInicio(fechaIn);
			 
			 EventoDAO.save(as);
			 id_evento = as.getORMID();
			 t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
	}

	public void borrarEvento(String aId)throws PersistentException {
		throw new UnsupportedOperationException();
	}
}