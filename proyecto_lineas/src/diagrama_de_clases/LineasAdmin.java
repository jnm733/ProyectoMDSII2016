package diagrama_de_clases;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LineasAdmin extends JPanel {
	public Lineas lineas;
	
	public LineasAdmin(){
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		lineas = new Lineas();
		lineas.lineasAdmin();
		lineas.servicios.panelAdmin();
		JPanel panel = new JPanel();
		add(lineas);
	}

	public void borrarLinea() {
		throw new UnsupportedOperationException();
	}

	public void incluirLinea() {
		throw new UnsupportedOperationException();
	}
}