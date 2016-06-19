package diagrama_de_clases;

import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class DescargasAdmin extends JFrame {
	public JPanel contentPane;
	public JButton btnCancelar;
	public JButton btnAceptar;
	public JTextArea txtDescripcion;
	public JLabel lblNombreDeLa;
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
						
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
	}
	
	public void agregarDescarga() {
		throw new UnsupportedOperationException();
	}
}