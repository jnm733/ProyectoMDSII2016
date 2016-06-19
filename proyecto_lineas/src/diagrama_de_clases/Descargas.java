package diagrama_de_clases;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;
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

public class Descargas extends JFrame{
	public JButton btnDescargar;
	public JPanel panel;
	public JLabel lblDescarga;
	public JList listDescarga;
	public JFrame jFrame;
	public String sql;
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

	public Descarga() {

		conexion = ConexionDB.GetConnection();

		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10,
				SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, panel, 10,
				SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 490,
				SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel, 736,
				SpringLayout.WEST, this);
		add(panel);
		sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		

		lblDescarga = new JLabel("Zona de Descargas");
		lblDescarga.setFont(new Font("Tahoma", Font.BOLD, 18));
		sl_panel.putConstraint(SpringLayout.NORTH, lblDescarga, 10,
				SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblDescarga, 10,
				SpringLayout.WEST, panel);
		panel.add(lblDescarga);

		listDescarga = new JList();
		sl_panel.putConstraint(SpringLayout.NORTH, listDescarga, 6, SpringLayout.SOUTH, lblDescarga);
		sl_panel.putConstraint(SpringLayout.WEST, listDescarga, 10,
				SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, listDescarga, -199, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, listDescarga, 194, SpringLayout.WEST, panel);

		DefaultListModel<String> model = new DefaultListModel<>();
		if (conexion != null) {
			// Preparamos la consulta
			Statement s;
			try {
				// Obtenemos la linea elegida
				s = conexion.createStatement();
				ResultSet rs = s.executeQuery("select * from idescargas");
				while (rs.next()) {
					model.addElement(rs.getString(2));
				}
				listDescarga.setModel(model);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		panel.add(listDescarga);

		btnDescargar = new JButton("Descargar");
		sl_panel.putConstraint(SpringLayout.NORTH, btnDescargar, 6, SpringLayout.SOUTH, listDescarga);
		sl_panel.putConstraint(SpringLayout.EAST, btnDescargar, 0, SpringLayout.EAST, listDescarga);
		btnDescargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] select = listDescarga.getSelectedValues();
				if (select.length > 0) {
					panelDescarga = new PanelDescarga(select[0]);
					// TODO
					jFrame = new JFrame();
					jFrame.setTitle("Descargar");
					jFrame.setBounds(300, 300, 520, 305);
					jFrame.getContentPane().add(panelDescarga.contentPane);
					jFrame.setVisible(true);
					panelDescarga.btnCancelar
							.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									jFrame.dispose();
								}
							});
					panelDescarga.btnAceptar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							iDescargas = new IDescargas();
							iDescargas.descargar(null);
							jFrame.dispose();
						}
					});
				}else{
					JOptionPane.showMessageDialog(null, "Seleccione un archivo", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		panel.add(btnDescargar);
		
		
		
		
		
		
		
	}
	
	public void descargasAdmin(){
		txtTitulo = new JTextField("Titulo");
		txtTitulo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if(txtTitulo.getText().equals("Titulo")){
					txtTitulo.setText("");
				}
			}
			public void focusLost(FocusEvent arg0) {
				if(txtTitulo.getText().equals("")){
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
				if(txtrDescripcion.getText().equals("Descripcion")){
					txtrDescripcion.setText("");
				}
			}
			public void focusLost(FocusEvent arg0) {
				if(txtrDescripcion.getText().equals("")){
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
				if(txtUrl.getText().equals("Url")){
					txtUrl.setText("");
				}
			}
			public void focusLost(FocusEvent e) {
				if(txtUrl.getText().equals("")){
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
				if(txtSize.getText().equals("Size")){
					txtSize.setText("");
				}
			}
			public void focusLost(FocusEvent e) {
				if(txtSize.getText().equals("")){
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
				try {
					if(txtTitulo.getText().equals("Titulo")){
						JOptionPane.showMessageDialog(null, "El titulo no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
					}else if(txtrDescripcion.getText().equals("Descripcion")){
						JOptionPane.showMessageDialog(null, "La descripcion no puede estar vacia", "Error", JOptionPane.ERROR_MESSAGE);
					}else if(txtUrl.getText().equals("Url")){
						JOptionPane.showMessageDialog(null, "La url no puede estar vacia", "Error", JOptionPane.ERROR_MESSAGE);
					}else if(txtSize.getText().equals("Size")){
						JOptionPane.showMessageDialog(null, "El tamaño no puede estar vacio", "Error", JOptionPane.ERROR_MESSAGE);
					}else{
						ArrayList<String> datos = new ArrayList<String>();
						DefaultListModel<String> model = new DefaultListModel<String>();
						datos.add(txtTitulo.getText());
						datos.add(txtrDescripcion.getText());
						datos.add(txtUrl.getText());
						datos.add(txtSize.getText());
						iDescargas = new IDescargas();
						iDescargas.agregarDescarga(datos, null);
						if(iDescargas.exito){

							model = (DefaultListModel<String>) listDescarga.getModel();
							model.addElement(txtTitulo.getText());
							listDescarga.setModel(model);
						}
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
	}
	
	public ComenzarDescarga obtenerDescarga() {
		throw new UnsupportedOperationException();
	}
}