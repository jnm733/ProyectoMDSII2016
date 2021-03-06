package diagrama_de_clases;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.management.modelmbean.ModelMBean;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import org.orm.PersistentException;

import diagrama_de_base_de_datos.Barrio;
import diagrama_de_base_de_datos.Direccion;
import diagrama_de_base_de_datos.Linea;
import diagrama_de_base_de_datos.Linea_Parada;
import diagrama_de_base_de_datos.Parada;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Paradas extends JPanel {
	public IAdministrador bd;
	public BD_Paradas bdParadas;
	public JButton btnConsultarLinea;
	public JButton btnEliminarParada;
	public JButton btnIncluirParada;
	public InfoLinea infoLinea;
	public InfoParada infoParada;
	public JFrame jFrame;
	public JLabel lblDireccion;
	public JLabel lblHorario;
	public JLabel lblImagen;
	public JLabel lblInfoParada;
	public JLabel lblLineas;
	public JLabel lblNombreLinea;
	public JLabel lblNumeroLinea;
	public JLabel lblObservaciones;
	public JLabel lblParadas;
	public JList listLineas;
	public JList listParadas;
	public JPanel panel;
	public JPanel panel_1;
	public JPanel panel_2;
	public JPanel panel_3;
	public JPanel panel_4;
	public JPanel panel_5;
	public Parada parada;
	/**
	 * Create the panel.
	 */
	public Servicios servicios;
	public SpringLayout sl_panel;
	public SpringLayout sl_panel_5;
	public SpringLayout springLayout;
	public JTextArea textArea;
	public JTextArea textAreaHorario;
	public JTextField txtDireccion;
	public JTextField txtNombre;
	public JTextField txtNombreParada;
	public JTextField txtNumero;
	public BD_Principal bd_principal;

	public Paradas() {
		// TODO Cambiar
		bdParadas = new BD_Paradas();
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
		try {
			String nombre = "Servidor1";
			Registry registry = LocateRegistry.getRegistry(1099);
			bd = (IAdministrador) registry.lookup(nombre);

		} catch (Exception e) {
			System.err.println("Servidor no arrancado en lineas:");
			e.printStackTrace();
		}

		bd_principal = new BD_Principal();

		parada = new Parada();
		servicios = new Servicios();
		springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, servicios, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, servicios, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, servicios, 75, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, servicios, -1, SpringLayout.EAST, this);
		setLayout(springLayout);
		
		servicios.btnFiltrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> model = new DefaultListModel<>();
				Direccion[] direcciones = bd_principal.getDirecciones();
				if(servicios.rdbtnBarrio.isSelected()){
					Barrio barrio = bd_principal.getBarrio(servicios.txtText.getText());
					for (int i = 0; i < direcciones.length; i++) {
						if(direcciones[i].getContiene().equals(barrio)){
							model.addElement(direcciones[i].getParada_se_ubica().getNombreParada());
						}
					}
				}else if(servicios.rdbtnCalleYNumero.isSelected()){
					String direccion = "";
					for (int i = 0; i < direcciones.length; i++) {
						direccion = direcciones[i].getCalle();
						direccion +="," + direcciones[i].getNumero();
						if(direccion.equals(servicios.txtText.getText())){
							model.addElement(direcciones[i].getParada_se_ubica().getNombreParada());
						}
					}
				}
				listParadas.setModel(model);
				
			}
		});

		panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 6, SpringLayout.SOUTH, servicios);
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, servicios);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 450, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel, 187, SpringLayout.WEST, this);
		add(panel);
		sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);

		add(servicios);

		panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 0, SpringLayout.NORTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 6, SpringLayout.EAST, panel);

		lblParadas = new JLabel("Paradas");
		lblParadas.setHorizontalAlignment(SwingConstants.CENTER);
		lblParadas.setFont(new Font("Tahoma", Font.BOLD, 18));
		sl_panel.putConstraint(SpringLayout.NORTH, lblParadas, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblParadas, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblParadas, 47, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblParadas, 167, SpringLayout.WEST, panel);
		panel.add(lblParadas);

		listParadas = new JList();
		listParadas.setModel(new DefaultListModel());
		try {
			Parada[] arrParadas = bdParadas.getParadas();
			DefaultListModel<String> model = new DefaultListModel<>();
			for (int i = 0; i < arrParadas.length; i++) {
				model.addElement(arrParadas[i].getNombreParada());
			}
			listParadas.setModel(model);
		} catch (PersistentException e1) {
			e1.printStackTrace();
		}
		listParadas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				DefaultListModel<String> model = new DefaultListModel<>();
				Object[] select = listParadas.getSelectedValues();
				try {
					if (select[0].equals("Nueva parada")) {
						textAreaHorario.setText("");
						txtNombreParada.setText("Nombre Parada");
						txtDireccion.setText("Direccion");
						textArea.setText("Observaciones");
						txtNumero.setText("");
						listLineas.setModel(new DefaultListModel<String>());
						try {
							btnIncluirParada.setEnabled(true);
							btnEliminarParada.setEnabled(false);
						} catch (Exception e) {
						}

					} else {
						Parada parada = bdParadas.getParada(select[0] + "");
						// textAreaHorario.setText(parada.g);
						txtNombreParada.setText(parada.getNombreParada());
						txtDireccion.setText(parada.getDireccionParada());
						textArea.setText(parada.getObservaciones());
						// txtNumero.setText("");
						try {
							btnIncluirParada.setEnabled(false);
							btnEliminarParada.setEnabled(true);
						} catch (Exception e) {
						}
						Linea[] lineas = bd_principal.getLineas_Parada(parada.getNombreParada());
						try {
							for (int i = 0; i < lineas.length; i++) {
								model.addElement(lineas[i].getNombreLinea());
							}
						} catch (Exception e) {
						}
						listLineas.setModel(model);

					}

				} catch (PersistentException e) {
					e.printStackTrace();
				}
			}
		});

		sl_panel.putConstraint(SpringLayout.NORTH, listParadas, 6, SpringLayout.SOUTH, lblParadas);
		sl_panel.putConstraint(SpringLayout.WEST, listParadas, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, listParadas, -35, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, listParadas, -10, SpringLayout.EAST, panel);
		panel.add(listParadas);

		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 0, SpringLayout.SOUTH, this);
		add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);

		panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.EAST, panel_1, -6, SpringLayout.WEST, panel_2);
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 170, SpringLayout.SOUTH, servicios);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, 0, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 485, SpringLayout.WEST, this);

		lblInfoParada = new JLabel("Info Parada");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblInfoParada, 0, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblInfoParada, 75, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblInfoParada, -326, SpringLayout.SOUTH, panel_1);
		panel_1.add(lblInfoParada);
		lblInfoParada.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfoParada.setFont(new Font("Tahoma", Font.BOLD, 18));

		textArea = new JTextArea();
		sl_panel_1.putConstraint(SpringLayout.WEST, textArea, 10, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, textArea, -32, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, textArea, -10, SpringLayout.EAST, panel_1);
		textArea.setEditable(false);
		panel_1.add(textArea);
		springLayout.putConstraint(SpringLayout.EAST, panel_2, -1, SpringLayout.EAST, this);
		add(panel_2);

		panel_3 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_3, 6, SpringLayout.SOUTH, servicios);
		springLayout.putConstraint(SpringLayout.WEST, panel_3, 6, SpringLayout.EAST, panel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_3, -6, SpringLayout.NORTH, panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));

		panel_4 = new JPanel();
		panel_2.add(panel_4);
		SpringLayout sl_panel_4 = new SpringLayout();
		panel_4.setLayout(sl_panel_4);

		lblLineas = new JLabel("Lineas");
		sl_panel_4.putConstraint(SpringLayout.NORTH, lblLineas, 10, SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.WEST, lblLineas, 48, SpringLayout.WEST, panel_4);
		lblLineas.setHorizontalAlignment(SwingConstants.CENTER);
		lblLineas.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_4.add(lblLineas);

		listLineas = new JList();
		sl_panel_4.putConstraint(SpringLayout.NORTH, listLineas, 6, SpringLayout.SOUTH, lblLineas);
		sl_panel_4.putConstraint(SpringLayout.WEST, listLineas, 10, SpringLayout.WEST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, listLineas, 209, SpringLayout.WEST, panel_4);
		panel_4.add(listLineas);

		listLineas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO
				DefaultListModel<String> model = new DefaultListModel<>();
				Object[] select = listLineas.getSelectedValues();
				Linea linea = bd_principal.getLinea(select[0].toString());
				txtNumero.setText(linea.getNumeroLinea());
				txtNombre.setText(linea.getNombreLinea());
				textAreaHorario.setText(linea.getHorario());
			}
		});

		btnConsultarLinea = new JButton("Consultar linea");
		sl_panel_4.putConstraint(SpringLayout.SOUTH, listLineas, -6, SpringLayout.NORTH, btnConsultarLinea);
		sl_panel_4.putConstraint(SpringLayout.WEST, btnConsultarLinea, 0, SpringLayout.WEST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, btnConsultarLinea, 0, SpringLayout.SOUTH, panel_4);
		panel_4.add(btnConsultarLinea);

		panel_5 = new JPanel();
		panel_2.add(panel_5);
		sl_panel_5 = new SpringLayout();
		panel_5.setLayout(sl_panel_5);

		lblNumeroLinea = new JLabel("Numero Linea");
		sl_panel_5.putConstraint(SpringLayout.NORTH, lblNumeroLinea, 10, SpringLayout.NORTH, panel_5);
		sl_panel_5.putConstraint(SpringLayout.WEST, lblNumeroLinea, 10, SpringLayout.WEST, panel_5);
		panel_5.add(lblNumeroLinea);

		txtNumero = new JTextField();
		txtNumero.setEditable(false);
		txtNumero.setText("Numero");
		sl_panel_5.putConstraint(SpringLayout.NORTH, txtNumero, 6, SpringLayout.SOUTH, lblNumeroLinea);
		sl_panel_5.putConstraint(SpringLayout.WEST, txtNumero, 10, SpringLayout.WEST, panel_5);
		sl_panel_5.putConstraint(SpringLayout.EAST, txtNumero, 75, SpringLayout.WEST, panel_5);
		panel_5.add(txtNumero);
		txtNumero.setColumns(10);

		lblNombreLinea = new JLabel("Nombre Linea");
		sl_panel_5.putConstraint(SpringLayout.NORTH, lblNombreLinea, 8, SpringLayout.SOUTH, txtNumero);
		sl_panel_5.putConstraint(SpringLayout.WEST, lblNombreLinea, 0, SpringLayout.WEST, lblNumeroLinea);
		panel_5.add(lblNombreLinea);

		txtNombre = new JTextField();
		sl_panel_5.putConstraint(SpringLayout.NORTH, txtNombre, 6, SpringLayout.SOUTH, lblNombreLinea);
		sl_panel_5.putConstraint(SpringLayout.WEST, txtNombre, 10, SpringLayout.WEST, panel_5);
		txtNombre.setEditable(false);
		txtNombre.setText("Nombre");
		txtNombre.setColumns(10);
		panel_5.add(txtNombre);

		lblHorario = new JLabel("Horario");
		sl_panel_5.putConstraint(SpringLayout.NORTH, lblHorario, 0, SpringLayout.NORTH, lblNumeroLinea);
		sl_panel_5.putConstraint(SpringLayout.EAST, lblHorario, -39, SpringLayout.EAST, panel_5);
		panel_5.add(lblHorario);

		textAreaHorario = new JTextArea();
		sl_panel_5.putConstraint(SpringLayout.EAST, txtNombre, 0, SpringLayout.EAST, textAreaHorario);
		sl_panel_5.putConstraint(SpringLayout.NORTH, textAreaHorario, -2, SpringLayout.NORTH, txtNumero);
		sl_panel_5.putConstraint(SpringLayout.WEST, textAreaHorario, 25, SpringLayout.EAST, txtNumero);
		sl_panel_5.putConstraint(SpringLayout.SOUTH, textAreaHorario, 0, SpringLayout.SOUTH, lblNombreLinea);
		sl_panel_5.putConstraint(SpringLayout.EAST, textAreaHorario, -10, SpringLayout.EAST, panel_5);
		panel_5.add(textAreaHorario);

		lblDireccion = new JLabel("Direccion");
		panel_1.add(lblDireccion);

		lblObservaciones = new JLabel("Observaciones");
		sl_panel_1.putConstraint(SpringLayout.WEST, lblObservaciones, 10, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblObservaciones, -212, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.NORTH, textArea, 6, SpringLayout.SOUTH, lblObservaciones);
		panel_1.add(lblObservaciones);

		txtDireccion = new JTextField();

		sl_panel_1.putConstraint(SpringLayout.NORTH, lblDireccion, 3, SpringLayout.NORTH, txtDireccion);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblDireccion, -20, SpringLayout.WEST, txtDireccion);
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtDireccion, 6, SpringLayout.SOUTH, lblInfoParada);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtDireccion, 10, SpringLayout.WEST, lblInfoParada);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtDireccion, -16, SpringLayout.EAST, panel_1);
		txtDireccion.setEditable(false);
		txtDireccion.setText("Direccion");
		panel_1.add(txtDireccion);
		txtDireccion.setColumns(10);

		JLabel lblNombre = new JLabel("Nombre");
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNombre, 16, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNombre, -28, SpringLayout.NORTH, lblObservaciones);
		panel_1.add(lblNombre);

		txtNombreParada = new JTextField();

		sl_panel_1.putConstraint(SpringLayout.NORTH, txtNombreParada, -3, SpringLayout.NORTH, lblNombre);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtNombreParada, 31, SpringLayout.EAST, lblNombre);
		txtNombreParada.setEditable(false);
		txtNombreParada.setText("Nombre Parada");
		panel_1.add(txtNombreParada);
		txtNombreParada.setColumns(10);
		add(panel_3);
		SpringLayout sl_panel_3 = new SpringLayout();
		panel_3.setLayout(sl_panel_3);

		lblImagen = new JLabel("Imagen");
		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblImagen, 5, SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.WEST, lblImagen, 0, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, lblImagen, 158, SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, lblImagen, 430, SpringLayout.WEST, panel_3);
		panel_3.add(lblImagen);

		// servicios.btnLineas.setEnabled(true);
		// servicios.btnParadas.setEnabled(false);

		btnConsultarLinea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object[] select = listLineas.getSelectedValues();
				if (select.length < 1) {
					JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna parada", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					infoLinea = new InfoLinea(select[0].toString());
					jFrame = new JFrame();
					jFrame.setTitle("Informacion de linea");
					jFrame.setBounds(300, 300, 520, 305);
					jFrame.getContentPane().add(infoLinea.contentPane);
					jFrame.setVisible(true);
					infoLinea.btnAceptar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							jFrame.dispose();
						}
					});
				}
			}
		});

		servicios.btnFiltrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tipo = "";
				if (servicios.rdbtnBarrio.isSelected()) {
					tipo = "barrio";
				} else {
					tipo = "direccion";
				}
				filtrar(tipo, servicios.txtText.getText());
			}
		});
	}

	public void consultarLinea() {
		throw new UnsupportedOperationException();
	}

	public void filtrar(String tipo, String filtro) {

	}

	public void paradasAdmin() {

		btnEliminarParada = new JButton("Eliminar Parada");
		sl_panel.putConstraint(SpringLayout.NORTH, btnEliminarParada, 6, SpringLayout.SOUTH, listParadas);
		sl_panel.putConstraint(SpringLayout.WEST, btnEliminarParada, 0, SpringLayout.WEST, lblParadas);
		panel.add(btnEliminarParada);
		btnEliminarParada.setEnabled(false);

		btnEliminarParada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] select = listParadas.getSelectedValues();
				Parada parada = bd_principal.getParada(select[0].toString());
				bd_principal.borrarParada(parada);
				DefaultListModel<String> model = (DefaultListModel<String>) listParadas.getModel();
				model.removeElement(select[0].toString());
				listParadas.setModel(model);
				listLineas.setModel(new DefaultListModel<>());
			}
		});

		btnIncluirParada = new JButton("Incluir Parada");
		sl_panel_5.putConstraint(SpringLayout.SOUTH, btnIncluirParada, -10, SpringLayout.SOUTH, panel_5);
		sl_panel_5.putConstraint(SpringLayout.EAST, btnIncluirParada, 0, SpringLayout.EAST, txtNombre);
		panel_5.add(btnIncluirParada);
		springLayout.putConstraint(SpringLayout.EAST, panel_3, 436, SpringLayout.EAST, panel_1);

		txtDireccion.setEditable(true);

		txtNombreParada.setEditable(true);
		textArea.setEditable(true);

		// Obtenemos la lista de lineas que hay, a�adimos nueva linea y volcamos
		// de nuevo
		DefaultListModel<String> model = (DefaultListModel<String>) listParadas.getModel();
		model.addElement("Nueva parada");
		listParadas.setModel(model);

		txtNombreParada.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtNombreParada.getText().equals("Nombre Parada")) {
					txtNombreParada.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				if (txtNombreParada.getText().equals("")) {
					txtNombreParada.setText("Nombre Parada");
				}
			}
		});

		txtDireccion.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtDireccion.getText().equals("Direccion")) {
					txtDireccion.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				if (txtDireccion.getText().equals("")) {
					txtDireccion.setText("Direccion");
				}
			}
		});

		textArea.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (textArea.getText().equals("Observaciones")) {
					textArea.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				if (textArea.getText().equals("")) {
					textArea.setText("Observaciones");
				}
			}
		});
		// Acci�n boton incluir linea
		btnIncluirParada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String calle = "";
				String numero = "";
				String barrio = "";
				ArrayList<String> datos = new ArrayList<>();
				DefaultListModel<String> model = new DefaultListModel<String>();
				if (txtNombreParada.getText().equals("Nombre Parada")) {
					JOptionPane.showMessageDialog(null, "Introduzca el nombre de la parada", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else if (txtDireccion.getText().equals("Direccion")) {
					JOptionPane.showMessageDialog(null, "Introduzca la direccion de la parada", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					if (textArea.getText().equals("Observaciones") || textArea.getText().equals(""))
						textArea.setText("Sin observaciones");
					StringTokenizer st = new StringTokenizer(txtDireccion.getText(), ",");
					try {
						calle = st.nextToken();
						numero = st.nextToken();
						barrio = st.nextToken();
						datos.add(txtNombreParada.getText());
						datos.add(textArea.getText());
						datos.add(txtDireccion.getText());
						datos.add(calle);
						datos.add(numero);
						datos.add(barrio);

						if (!existe(datos)) {
							bdParadas.addParada(datos);

							model = (DefaultListModel<String>) listParadas.getModel();
							model.removeElement("Nueva parada");
							model.addElement(txtNombreParada.getText());
							model.addElement("Nueva parada");
							listParadas.setModel(model);

							JOptionPane.showMessageDialog(null, "Parada incluida con �xito", "Exito",
									JOptionPane.INFORMATION_MESSAGE);

							bd_principal.incluirDireccion(datos);
						} else {
							JOptionPane.showMessageDialog(null, "Esta parada ya existe", "Error",
									JOptionPane.ERROR_MESSAGE);
						}
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Introduzca una direccion valida (calle,numero,barrio)",
								"Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}

		});
	}

	private boolean existe(ArrayList<String> datos) {
		Parada[] paradas = bd_principal.getParadas();
		boolean existe = false;
		for (int i = 0; i < paradas.length; i++) {
			if (paradas[i].getNombreParada().toLowerCase().equals(datos.get(0).toLowerCase())) {
				existe = true;
				break;
			} else if (paradas[i].getDireccionParada().toLowerCase().equals(datos.get(1).toLowerCase())) {
				existe = true;
				break;
			}
		}
		return existe;
	}
}