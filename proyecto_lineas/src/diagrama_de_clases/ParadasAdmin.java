package diagrama_de_clases;

import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import org.orm.PersistentException;

public class ParadasAdmin extends JPanel {
	/**
	 * Create the panel.
	 */
	public BD_Paradas bd_paradas;
	public Paradas paradas;
	public ParadasAdmin() {
		bd_paradas = new BD_Paradas();
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		paradas = new Paradas();
		paradas.paradasAdmin();
		paradas.servicios.panelAdmin();
		JPanel panel = new JPanel();
		add(paradas);
		

	}

	public void incluirParada() {
		try {
			bd_paradas.addParada(new ArrayList<String>());
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void consultarLinea() {
		throw new UnsupportedOperationException();
	}

	public void cambiarImagen() {
		throw new UnsupportedOperationException();
	}

	public void borrarParada() {
		throw new UnsupportedOperationException();
	}
}