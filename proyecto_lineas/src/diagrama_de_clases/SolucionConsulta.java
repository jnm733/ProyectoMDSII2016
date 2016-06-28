package diagrama_de_clases;

import javax.persistence.Id;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import javax.swing.JLabel;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import javax.swing.SwingConstants;

import diagrama_de_base_de_datos.Linea;
import diagrama_de_base_de_datos.Linea_Parada;
import diagrama_de_base_de_datos.Parada;

import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SolucionConsulta extends JPanel {

	/**
	 * Create the panel.
	 */
	public JButton btnVolver;
	public JLabel lblIdSolucion;
	public JLabel lblInfoSolucion;
	public JButton btnMapa;
	public JButton btnTexto;
	public JList listSolucion;
	public JLabel lblNewLabel;
	public Linea[] lineas;
	public String origen;
	public String destino;
	private JTextField txtIdSolucion;
	private JTextField txtPrecio;
	private JTextField txtDistancia;
	public String usuario;
	public String hora;
	public TreeMap<String, DefaultListModel<String>> mapa;
	private JList listParadas;
	private JLabel lblRecorrido;
	public Iterator<String> it;
	public DefaultListModel<String> paradas;
	public Double distancia;
	public ArrayList<Double>distancias;
	public ArrayList<Float> precios;
	public BD_Principal bd_principal;
	public Linea_Parada[] linpars;
	public Parada paradaOrigen;
	public Parada paradaDestino;
	public ArrayList<ArrayList<String>> soluciones;

	public SolucionConsulta(String origen, String destino, String usuario, String hora, String solucion) {

		bd_principal = new BD_Principal();
		lineas = bd_principal.getLineas();

		this.origen = origen;
		this.destino = destino;
		this.usuario = usuario;
		this.hora = hora;

		paradaOrigen = bd_principal.getParada(origen);
		paradaDestino = bd_principal.getParada(destino);

		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 450, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel, 251, SpringLayout.WEST, this);
		add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);

		JLabel lblSolucion = new JLabel("Solucion");
		sl_panel.putConstraint(SpringLayout.NORTH, lblSolucion, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblSolucion, 68, SpringLayout.WEST, panel);
		lblSolucion.setHorizontalAlignment(SwingConstants.CENTER);
		lblSolucion.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblSolucion);

		listSolucion = new JList();

		sl_panel.putConstraint(SpringLayout.NORTH, listSolucion, 64, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, listSolucion, -99, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblSolucion, -6, SpringLayout.NORTH, listSolucion);
		sl_panel.putConstraint(SpringLayout.EAST, lblSolucion, 0, SpringLayout.EAST, listSolucion);
		sl_panel.putConstraint(SpringLayout.WEST, listSolucion, 68, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, listSolucion, -31, SpringLayout.EAST, panel);
		panel.add(listSolucion);

		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 0, SpringLayout.EAST, panel);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 0, SpringLayout.SOUTH, panel);

		btnVolver = new JButton("Volver");
		sl_panel.putConstraint(SpringLayout.WEST, btnVolver, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnVolver, -10, SpringLayout.SOUTH, panel);
		panel.add(btnVolver);
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 559, SpringLayout.WEST, this);
		add(panel_1);

		JPanel panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 1, SpringLayout.EAST, panel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, 225, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel_2, -1, SpringLayout.EAST, this);
		add(panel_2);

		JPanel panel_3 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_3, 6, SpringLayout.SOUTH, panel_2);
		springLayout.putConstraint(SpringLayout.WEST, panel_3, 1, SpringLayout.EAST, panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);

		lblInfoSolucion = new JLabel("Info Solucion");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblInfoSolucion, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblInfoSolucion, 10, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblInfoSolucion, 59, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblInfoSolucion, 298, SpringLayout.WEST, panel_1);
		lblInfoSolucion.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfoSolucion.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_1.add(lblInfoSolucion);

		lblIdSolucion = new JLabel("ID Solucion");
		lblIdSolucion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblIdSolucion, 6, SpringLayout.SOUTH, lblInfoSolucion);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblIdSolucion, 0, SpringLayout.WEST, lblInfoSolucion);
		panel_1.add(lblIdSolucion);

		txtIdSolucion = new JTextField();
		txtIdSolucion.setEditable(false);
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtIdSolucion, 6, SpringLayout.SOUTH, lblInfoSolucion);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtIdSolucion, -154, SpringLayout.EAST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, txtIdSolucion, 25, SpringLayout.SOUTH, lblInfoSolucion);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtIdSolucion, 0, SpringLayout.EAST, lblInfoSolucion);
		panel_1.add(txtIdSolucion);
		txtIdSolucion.setColumns(10);

		JLabel lblPrecio = new JLabel("Precio Total");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblPrecio, 31, SpringLayout.SOUTH, lblIdSolucion);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblPrecio, 0, SpringLayout.WEST, lblInfoSolucion);
		panel_1.add(lblPrecio);

		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtPrecio, 32, SpringLayout.SOUTH, txtIdSolucion);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtPrecio, 0, SpringLayout.WEST, txtIdSolucion);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, txtPrecio, 2, SpringLayout.SOUTH, lblPrecio);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtPrecio, 0, SpringLayout.EAST, lblInfoSolucion);
		panel_1.add(txtPrecio);
		txtPrecio.setColumns(10);

		JLabel lblDistancia = new JLabel("Distancia Total");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblDistancia, 40, SpringLayout.SOUTH, lblPrecio);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblDistancia, 10, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblDistancia, 54, SpringLayout.SOUTH, lblPrecio);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblDistancia, 118, SpringLayout.WEST, panel_1);
		lblDistancia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblDistancia);

		txtDistancia = new JTextField();
		txtDistancia.setEditable(false);
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtDistancia, 37, SpringLayout.SOUTH, txtPrecio);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtDistancia, 0, SpringLayout.WEST, txtIdSolucion);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtDistancia, 0, SpringLayout.EAST, lblInfoSolucion);
		panel_1.add(txtDistancia);
		txtDistancia.setColumns(10);

		listParadas = new JList();
		sl_panel_1.putConstraint(SpringLayout.WEST, listParadas, 10, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, listParadas, -10, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, listParadas, 0, SpringLayout.EAST, lblDistancia);
		panel_1.add(listParadas);

		lblRecorrido = new JLabel("Recorrido");
		sl_panel_1.putConstraint(SpringLayout.NORTH, listParadas, 22, SpringLayout.SOUTH, lblRecorrido);
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblRecorrido, 22, SpringLayout.SOUTH, lblDistancia);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblRecorrido, -226, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblRecorrido, 0, SpringLayout.WEST, lblInfoSolucion);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblRecorrido, 118, SpringLayout.WEST, panel_1);
		lblRecorrido.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblRecorrido);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_3, 0, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel_3, 0, SpringLayout.EAST, panel_2);
		SpringLayout sl_panel_2 = new SpringLayout();
		panel_2.setLayout(sl_panel_2);

		btnMapa = new JButton("Mapa");
		sl_panel_2.putConstraint(SpringLayout.NORTH, btnMapa, 0, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, btnMapa, 0, SpringLayout.WEST, panel_2);
		panel_2.add(btnMapa);

		btnTexto = new JButton("Texto");
		sl_panel_2.putConstraint(SpringLayout.WEST, btnTexto, 2, SpringLayout.EAST, btnMapa);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, btnTexto, 0, SpringLayout.SOUTH, btnMapa);
		panel_2.add(btnTexto);

		lblNewLabel = new JLabel("Recorrido");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel, 1, SpringLayout.SOUTH, btnMapa);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, lblNewLabel, 192, SpringLayout.SOUTH, btnMapa);
		sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel, 354, SpringLayout.WEST, panel_2);
		panel_2.add(lblNewLabel);
		add(panel_3);

		try {
			boolean consultaExiste = false;
			if (solucion.equals("")) {
				// Obtenemos el email si estamos conectados

				// Creamos la consulta, si estamos realizando una nueva consulta
				if (!consultaExiste) {

				}

			} else {

			}

			createSolucion();
		} catch (Exception e) {
			e.printStackTrace();
		}

		listSolucion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int select = listSolucion.getSelectedIndex();
				txtIdSolucion.setText("" + (select + 1));
				it = mapa.keySet().iterator();
				int i = 0;
				while (it.hasNext()) {
					if (i == select) {
						String key = it.next();
						paradas = mapa.get(key);
						DefaultListModel<String> model = new DefaultListModel<String>();
						distancia = distancias.get(select);
						listParadas.setModel(paradas);
						txtDistancia.setText("" + distancia + " metros");
						txtPrecio.setText("1.05 euros");

						break;
					} else {
						it.next();
						i++;
					}

				}
			}
		});
	}

	public void createSolucion() {
		mapa = new TreeMap<String, DefaultListModel<String>>();
		distancias = new ArrayList<Double>();
		double distancia = 0;
		precios = new ArrayList<Float>();
		linpars = bd_principal.getLinas_Paradas();
		soluciones = new ArrayList<>();
		ArrayList<String> solucion = new ArrayList<>();
		DefaultListModel<String> model;
		try {
			model = new DefaultListModel<String>();
			boolean bolOrigen = false;
			boolean bolDestino = false;
			ArrayList<Parada> arrParadas;
			for (int i = 0; i < lineas.length; i++) {
				paradas = new DefaultListModel<String>();
				arrParadas = new ArrayList<>();
				for (int j = 0; j < linpars.length; j++) {
					if (linpars[j].getLinea().equals(lineas[i]) && linpars[j].getParada().equals(paradaOrigen)) {
						bolOrigen = true;
						paradas.addElement(linpars[j].getParada().getNombreParada());
						distancia += linpars[j].getDistancia();
					} else if (linpars[j].getLinea().equals(lineas[i])
							&& linpars[j].getParada().equals(paradaDestino)) {
						bolDestino = true;
						paradas.addElement(linpars[j].getParada().getNombreParada());
						distancia += linpars[j].getDistancia();
					}else if(bolOrigen && linpars[j].getLinea().equals(lineas[i])){
						paradas.addElement(linpars[j].getParada().getNombreParada());
						distancia += linpars[j].getDistancia();
					}
				}
				if (bolOrigen && bolDestino) {
					mapa.put(lineas[i].getNombreLinea(), paradas);
					model.addElement(lineas[i].getNombreLinea());
					distancias.add(distancia);
				}
				bolOrigen = false;
				bolDestino = false;
			}
			listSolucion.setModel(model);

		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}

	}
}