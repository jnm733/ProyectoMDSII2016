package diagrama_de_clases;

import java.util.ArrayList;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import diagrama_de_base_de_datos.Linea;
import diagrama_de_base_de_datos.LineaDAO;
import diagrama_de_base_de_datos.Linea_Parada;
import diagrama_de_base_de_datos.Linea_ParadaDAO;
import diagrama_de_base_de_datos.Parada;

public class BD_Lineas {
	public BD_Principal _bd_Principal;
	public Vector<Linea> _cont_lineas = new Vector<Linea>();

	public void addLinea(ArrayList<Object> aDatos) throws PersistentException {
		String id_linea = "-1";
		String numero = (String) aDatos.get(0);
		String nombre = (String) aDatos.get(1);
		String horario = (String) aDatos.get(2);
		String recorrido = (String) aDatos.get(3);
		double tarifa = Double.parseDouble((String) aDatos.get(4));
		String frecuencia = (String) aDatos.get(5);

		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession()
				.beginTransaction();
		try {
			Linea as = LineaDAO.createLinea();
			as.setNumeroLinea(numero);
			as.setNombreLinea(nombre);
			as.setHorario(horario);
			as.setRecorrido(recorrido);
			as.setTarifaLinea(tarifa);

			LineaDAO.save(as);
			id_linea = as.getORMID();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void borrarLinea_Parada(Linea linea,Parada parada) throws PersistentException {
		Linea_Parada linpar  = getLinea_Parada(linea, parada);
		
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession()
				.beginTransaction();
		try {
			diagrama_de_base_de_datos.Linea_ParadaDAO.delete(linpar);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

	}

	public void borrarLinea_Parada(Linea_Parada linpar) throws PersistentException {
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession()
				.beginTransaction();
		try {
			Linea linea = linpar.getLinea();
			Parada parada = linpar.getParada();
			
			diagrama_de_base_de_datos.Linea_ParadaDAO.delete(linpar);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
	}

	public void deleteLinea(Linea linea) throws PersistentException {
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession()
				.beginTransaction();
		try {
			linea.linea_Paradas.clear();
			diagrama_de_base_de_datos.LineaDAO.delete(linea);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

	}

	public Linea getLinea(String aNombre) throws PersistentException {
		Linea linea = null;
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession()
				.beginTransaction();
		try {
			linea = diagrama_de_base_de_datos.LineaDAO.getLineaByORMID(aNombre);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return linea;
	}

	public Linea_Parada getLinea_Parada(Linea linea, Parada parada) throws PersistentException {
		Linea_Parada linpar = null;
		Linea_Parada[] linpars = null;
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession()
				.beginTransaction();
		try {
			linpars = diagrama_de_base_de_datos.Linea_ParadaDAO.listLinea_ParadaByQuery(null, null);
			for (int i = 0; i < linpars.length; i++) {
				if (linpars[i].getLinea().equals(linea) && linpars[i].getParada().equals(parada)) {
					linpar = linpars[i];
				}
			}
			t.commit();
		} catch (PersistentException e) {
			t.rollback();
		}

		return linpar;
	}

	public Linea[] getLineas() throws PersistentException {
		Linea[] lineas = null;

		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession()
				.beginTransaction();
		try {
			lineas = diagrama_de_base_de_datos.LineaDAO.listLineaByQuery(null, null);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return lineas;
	}

	public Linea_Parada[] getLineas_Paradas() throws PersistentException{
		Linea_Parada[] linpars	= null;
		PersistentTransaction t2 = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession()
				.beginTransaction();
		try {
			linpars = diagrama_de_base_de_datos.Linea_ParadaDAO.listLinea_ParadaByQuery(null, null);

			t2.commit();
		} catch (Exception e) {
			t2.rollback();
		}
		return linpars;
	}

	public Linea[] getParada_Lineas(String nombreParada) throws PersistentException {
		ArrayList<Linea> arrLin = new ArrayList<>();
		Linea[] lineas = null;
		Linea_Parada[] linpars = null;
		BD_Principal bd = new BD_Principal();
		Parada parada = bd.getParada(nombreParada);
		linpars = getLineas_Paradas();
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession()
		.beginTransaction();
		try {
			
			for(int i = 0 ; i < linpars.length;i++){
				if(linpars[i].getParada().equals(parada)){
					arrLin.add(linpars[i].getLinea());
				}
			}
			if(arrLin.size()>0){
				lineas = new Linea[arrLin.size()];
				for (int i = 0; i < arrLin.size(); i++) {
					lineas[i] = arrLin.get(i);
				}
			}
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return lineas;
	}

	public Parada[] getParadas_Linea(String nombreLinea) throws PersistentException {
		ArrayList<Parada> arrPar = new ArrayList<>();
		Parada[] paradas = null;
		Linea_Parada[] linpars = null;
		Linea linea = getLinea(nombreLinea);
		linpars = getLineas_Paradas();
		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession()
		.beginTransaction();
		try {
			
			for(int i = 0 ; i < linpars.length;i++){
				if(linpars[i].getLinea().equals(linea)){
					arrPar.add(linpars[i].getParada());
				}
			}
			if(arrPar.size()>0){
				paradas = new Parada[arrPar.size()];
				for (int i = 0; i < arrPar.size(); i++) {
					paradas[i] = arrPar.get(i);
				}
			}
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return paradas;
	}

	public void vincularParada(Linea linea, Parada parada, ArrayList<String> datos) throws PersistentException {
		int id_parada_linea = -1;
		Double dist = Double.parseDouble(datos.get(1));
		String hora = datos.get(2);
		String pos = datos.get(3);

		PersistentTransaction t = diagrama_de_base_de_datos.ProyectoMDS2PersistentManager.instance().getSession()
				.beginTransaction();
		try {
			Linea_Parada as = Linea_ParadaDAO.createLinea_Parada();
			as.setDistancia(dist);
			as.setHoraPaso(hora);
			as.setPosicion(pos);
			as.setLinea(linea);
			as.setParada(parada);
			as.setNombreParada(linea.getNombreLinea());
			as.setNombreParada(parada.getNombreParada());

			Linea_ParadaDAO.save(as);
			id_parada_linea = as.getORMID();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}
}