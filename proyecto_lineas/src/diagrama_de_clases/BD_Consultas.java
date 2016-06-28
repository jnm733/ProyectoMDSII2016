package diagrama_de_clases;

import java.rmi.RemoteException;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_de_base_de_datos.*;

public class BD_Consultas {
	public BD_Principal bd_Principal;
	public Vector<Consulta> _cont_consultas = new Vector<Consulta>();

	public Consulta getSolucionConsulta(int aId) throws PersistentException {
		Consulta consulta = null;
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession()
				.beginTransaction();
		try {
			consulta = diagrama_de_base_de_datos.ConsultaDAO.getConsultaByORMID(aId);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return consulta;
	}

	public void addConsulta(String email,String nOrigen, String nDestino) throws PersistentException {
		int id_consulta = -1;
		Usuario user = null;
		bd_Principal = new BD_Principal();
		try {
			user = bd_Principal.getUsuario(email);
		} catch (RemoteException e1) {
			e1.printStackTrace();
		}
		
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession().beginTransaction();
		try {
			Consulta as = ConsultaDAO.createConsulta();
			as.setDestinoConsulta(nDestino);
			as.setOrigenConsulta(nOrigen);
			as.setRealiza(user);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}

	public Consulta[] getConsultas()throws PersistentException {
		Consulta[] consultas = null;

		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession()
				.beginTransaction();
		try {
			consultas = diagrama_de_base_de_datos.ConsultaDAO.listConsultaByQuery(null, null);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return consultas;
	}
}