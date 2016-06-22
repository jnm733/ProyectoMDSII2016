package diagrama_de_clases;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

import diagrama_de_base_de_datos.Descarga;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Frame;
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;

//import diagrama_de_base_de_datos.Descargas;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Descargas extends JPanel {
	public JButton btnDescargar;
	public JPanel panel;
	public JLabel lblDescarga;
	public JList listDescarga;
	public JFrame jFrame;
	public SpringLayout sl_panel;
	public JTextField txtTitulo;
	public JLabel lblTituloDescarga;
	public JLabel lblDescripcion;
	public JTextField txtUrl;
	public JTextField txtSize;
	public JButton btnAgregarDescarga_1;
	public JTextArea txtrDescripcion;
	public BD_Principal bd_principal;

	public JPanel contentPane;
	public JButton btnCancelar;
	public JButton btnAceptar;
	public JTextArea txtDescripcion;
	public JLabel lblNombreDeLa;

	public IAdministrador bd;

	public Descargas() {
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

		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 490, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel, 736, SpringLayout.WEST, this);
		add(panel);
		sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);

		lblDescarga = new JLabel("Zona de Descargas");
		lblDescarga.setFont(new Font("Tahoma", Font.BOLD, 18));
		sl_panel.putConstraint(SpringLayout.NORTH, lblDescarga, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblDescarga, 10, SpringLayout.WEST, panel);
		panel.add(lblDescarga);

		listDescarga = new JList();

		sl_panel.putConstraint(SpringLayout.NORTH, listDescarga, 6, SpringLayout.SOUTH, lblDescarga);
		sl_panel.putConstraint(SpringLayout.WEST, listDescarga, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, listDescarga, -199, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, listDescarga, 194, SpringLayout.WEST, panel);

		DefaultListModel<String> model = new DefaultListModel<>();
		try {
			Descarga[] descargas = bd_principal.getDescargas();
			for (int i = 0; i < descargas.length; i++) {
				model.addElement(descargas[i].getTituloDescarga());
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		listDescarga.setModel(model);
		panel.add(listDescarga);

		listDescarga.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				DefaultListModel<String> model = new DefaultListModel<>();
				Object[] select = listDescarga.getSelectedValues();
				try {
					if (select[0].equals("Nueva Descarga")) {
						txtrDescripcion.setText("Descripcion");
						txtTitulo.setText("Titulo");
						txtUrl.setText("Url");
						txtSize.setText("Size");

						btnDescargar.setEnabled(false);
						btnAgregarDescarga_1.setEnabled(true);
					} else {
						Descarga descarga = bd_principal.getDescarga(select[0].toString());
						btnDescargar.setEnabled(true);
						btnAgregarDescarga_1.setEnabled(false);
						txtrDescripcion.setText(descarga.getDescripcionDescarga());
						txtSize.setText(descarga.getTamaño().toString());
						txtTitulo.setText(descarga.getTituloDescarga());
						txtUrl.setText(descarga.getUrlDescarga());
						
						
					}
				} catch (Exception e) {
					
				}
			}
		});
		btnDescargar = new JButton("Descargar");
		btnDescargar.setEnabled(false);
		sl_panel.putConstraint(SpringLayout.NORTH, btnDescargar, 6, SpringLayout.SOUTH, listDescarga);
		sl_panel.putConstraint(SpringLayout.EAST, btnDescargar, 0, SpringLayout.EAST, listDescarga);

		btnDescargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] select = listDescarga.getSelectedValues();
				if (select.length > 0) {
					Descarga descarga = bd_principal.getDescarga(select[0].toString());
					ComenzarDescarga comenzarDescarga= new ComenzarDescarga(descarga); 
					jFrame = new JFrame();
					jFrame.setTitle("Descargar");
					jFrame.setBounds(300, 300, 520, 305);
					jFrame.getContentPane().add(comenzarDescarga.contentPane);
					jFrame.setVisible(true);
					comenzarDescarga.btnCancelar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							jFrame.dispose();
						}
					});
					comenzarDescarga.btnAceptar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							JOptionPane.showMessageDialog(null, "Descarga realizada con éxito", "Descarga realizada", JOptionPane.INFORMATION_MESSAGE);
							jFrame.dispose();
						}
					});
				} else {
					JOptionPane.showMessageDialog(null, "Seleccione un archivo", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		panel.add(btnDescargar);
	}

	public void descargasAdmin() {
		DefaultListModel<String> model = (DefaultListModel<String>) listDescarga.getModel();
		model.add(0, "Nueva Descarga");
		listDescarga.setModel(model);

		txtTitulo = new JTextField("Titulo");
		txtTitulo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtTitulo.getText().equals("Titulo")) {
					txtTitulo.setText("");
				}
			}

			public void focusLost(FocusEvent arg0) {
				if (txtTitulo.getText().equals("")) {
					txtTitulo.setText("Titulo");
				}
			}
		});
		panel.add(txtTitulo);
		txtTitulo.setColumns(10);

		lblTituloDescarga = new JLabel("Titulo descarga");
		sl_panel.putConstraint(SpringLayout.NORTH, lblTituloDescarga, 48, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblTituloDescarga, 14, SpringLayout.EAST, listDescarga);
		sl_panel.putConstraint(SpringLayout.NORTH, txtTitulo, -3, SpringLayout.NORTH, lblTituloDescarga);
		panel.add(lblTituloDescarga);

		lblDescripcion = new JLabel("Descripcion");
		sl_panel.putConstraint(SpringLayout.NORTH, lblDescripcion, 33, SpringLayout.SOUTH, lblTituloDescarga);
		sl_panel.putConstraint(SpringLayout.WEST, lblDescripcion, 0, SpringLayout.WEST, lblTituloDescarga);
		panel.add(lblDescripcion);

		txtrDescripcion = new JTextArea();
		txtrDescripcion.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtrDescripcion.getText().equals("Descripcion")) {
					txtrDescripcion.setText("");
				}
			}

			public void focusLost(FocusEvent arg0) {
				if (txtrDescripcion.getText().equals("")) {
					txtrDescripcion.setText("Descripcion");
				}
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, txtrDescripcion, 22, SpringLayout.SOUTH, txtTitulo);
		sl_panel.putConstraint(SpringLayout.SOUTH, txtrDescripcion, -294, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, txtTitulo, 0, SpringLayout.WEST, txtrDescripcion);
		sl_panel.putConstraint(SpringLayout.WEST, txtrDescripcion, 61, SpringLayout.EAST, lblDescripcion);
		sl_panel.putConstraint(SpringLayout.EAST, txtrDescripcion, 308, SpringLayout.EAST, lblDescripcion);
		txtrDescripcion.setText("Descripcion");
		panel.add(txtrDescripcion);

		JLabel lblUrl = new JLabel("Url");
		sl_panel.putConstraint(SpringLayout.WEST, lblUrl, 0, SpringLayout.WEST, lblTituloDescarga);
		panel.add(lblUrl);

		txtUrl = new JTextField();
		txtUrl.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtUrl.getText().equals("Url")) {
					txtUrl.setText("");
				}
			}

			public void focusLost(FocusEvent e) {
				if (txtUrl.getText().equals("")) {
					txtUrl.setText("Url");
				}
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, lblUrl, 3, SpringLayout.NORTH, txtUrl);
		sl_panel.putConstraint(SpringLayout.NORTH, txtUrl, 21, SpringLayout.SOUTH, txtrDescripcion);
		sl_panel.putConstraint(SpringLayout.WEST, txtUrl, 0, SpringLayout.WEST, txtTitulo);
		sl_panel.putConstraint(SpringLayout.EAST, txtUrl, -55, SpringLayout.EAST, panel);
		txtUrl.setText("Url");
		panel.add(txtUrl);
		txtUrl.setColumns(10);

		JLabel lblSize = new JLabel("Size");
		sl_panel.putConstraint(SpringLayout.WEST, lblSize, 346, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, listDescarga, -6, SpringLayout.WEST, lblSize);
		sl_panel.putConstraint(SpringLayout.NORTH, lblSize, 30, SpringLayout.SOUTH, lblUrl);
		panel.add(lblSize);
		txtSize = new JTextField();
		txtSize.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtSize.getText().equals("Size")) {
					txtSize.setText("");
				}
			}

			public void focusLost(FocusEvent e) {
				if (txtSize.getText().equals("")) {
					txtSize.setText("Size");
				}
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, txtSize, -3, SpringLayout.NORTH, lblSize);
		sl_panel.putConstraint(SpringLayout.WEST, txtSize, 0, SpringLayout.WEST, txtTitulo);
		txtSize.setText("Size");
		panel.add(txtSize);
		txtSize.setColumns(10);

		btnAgregarDescarga_1 = new JButton("Agregar descarga");
		sl_panel.putConstraint(SpringLayout.NORTH, btnAgregarDescarga_1, 0, SpringLayout.NORTH, btnDescargar);
		sl_panel.putConstraint(SpringLayout.WEST, btnAgregarDescarga_1, 14, SpringLayout.EAST, btnDescargar);
		panel.add(btnAgregarDescarga_1);

		btnAgregarDescarga_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtTitulo.getText().equals("Titulo")) {
					JOptionPane.showMessageDialog(null, "El titulo no puede estar vacio", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else if (txtrDescripcion.getText().equals("Descripcion")) {
					JOptionPane.showMessageDialog(null, "La descripcion no puede estar vacia", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else if (txtUrl.getText().equals("Url")) {
					JOptionPane.showMessageDialog(null, "La url no puede estar vacia", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else if (txtSize.getText().equals("Size")) {
					JOptionPane.showMessageDialog(null, "El tamaño no puede estar vacio", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					ArrayList<String> datos = new ArrayList<String>();
					DefaultListModel<String> model = new DefaultListModel<String>();
					datos.add(txtTitulo.getText());
					datos.add(txtrDescripcion.getText());
					datos.add(txtUrl.getText());
					try {
						Double tam = Double.parseDouble(txtSize.getText());
						datos.add(txtSize.getText());
						bd_principal.agregarDescargas(datos, null);
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "El tamaño debe ser un valor decimal", "Error",
								JOptionPane.ERROR_MESSAGE);
					}

				}
			}
		});

	}

	public ComenzarDescarga obtenerDescarga() {
		throw new UnsupportedOperationException();
	}
}