package diagrama_de_clases;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JButton;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;

//import diagrama_de_base_de_datos.Descargas;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Descargas extends JPanel{
	public JButton btnDescargar;
	public JPanel panel;
	public JLabel lblDescarga;
	public JList listDescarga;
	public PanelDescarga panelDescarga;
	public JFrame jFrame;
	public Connection conexion;
	public Statement s;
	public ResultSet rs;
	public String sql;
	public SpringLayout sl_panel;
	public JTextField txtTitulo;
	public JLabel lblTituloDescarga;
	public JLabel lblDescripcion;
	public JTextField txtUrl;
	public JTextField txtSize;
	public JButton btnAgregarDescarga_1;
	public JTextArea txtrDescripcion;
	public IDescargas iDescargas;

	public Descargas() {

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
	
	public ComenzarDescarga obtenerDescarga() {
		throw new UnsupportedOperationException();
	}
}