package diagrama_de_clases;


import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import org.orm.PersistentException;

import diagrama_de_base_de_datos.Evento;
import diagrama_de_base_de_datos.Parada;
import diagrama_de_base_de_datos.PuntoInteres;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JTextArea;

public class PtosInteresAdmin extends JPanel{
	public Servicios servicios;
	public InfoParada infoParada;
	public JPanel panel_2;
	public JPanel panel_4;
	public SpringLayout springLayout;
	private JPanel panel;
	private JLabel lblPtosInteres;
	private JLabel lblParadas;
	public JTextField txtNombre;
	private JTextField txtDireccion;
	public JTextField txtParadaCercana;
	public JList listPtos;
	private JLabel lblDescripcion;
	public JTextArea txtrDescripcion;
	public JFrame jFrame;
	public vincularParadas vincularParadas;
	public JList listParadas;
	public JButton btnVincularParadas;
	public JButton btnEliminarPto;
	public JButton btnIncluirPuntoDe;
	public ArrayList<String> datos;
	public DefaultListModel<String> model;
	public BD_PuntosInteres bd_puntos;

	/**
	 * Create the panel.
	 */
	public PtosInteresAdmin() {
		bd_puntos = new BD_PuntosInteres();
		
		servicios = new Servicios();
		springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, servicios, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, servicios, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, servicios, 75, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, servicios, -1, SpringLayout.EAST, this);
		setLayout(springLayout);
		servicios.panelAdmin();
		add(servicios);
		
		panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 6, SpringLayout.SOUTH, servicios);
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 485, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, 0, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel_2, -1, SpringLayout.EAST, this);
		add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		panel_4 = new JPanel();
		panel_2.add(panel_4);
		SpringLayout sl_panel_4 = new SpringLayout();
		panel_4.setLayout(sl_panel_4);
		
		lblParadas = new JLabel("Paradas");
		sl_panel_4.putConstraint(SpringLayout.NORTH, lblParadas, 0, SpringLayout.NORTH, panel_4);
		lblParadas.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_4.add(lblParadas);
		
		//Cargar paradas
		
		listParadas = new JList();
		sl_panel_4.putConstraint(SpringLayout.WEST, lblParadas, 0, SpringLayout.WEST, listParadas);
		sl_panel_4.putConstraint(SpringLayout.NORTH, listParadas, 32, SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.WEST, listParadas, 23, SpringLayout.WEST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, listParadas, 281, SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, listParadas, 173, SpringLayout.WEST, panel_4);
		panel_4.add(listParadas);
		

		btnVincularParadas = new JButton("Vincular Paradas");
		btnVincularParadas.setEnabled(false);
		sl_panel_4.putConstraint(SpringLayout.WEST, btnVincularParadas, 0, SpringLayout.WEST, listParadas);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, btnVincularParadas, -10, SpringLayout.SOUTH, panel_4);
		panel_4.add(btnVincularParadas);
		
		btnIncluirPuntoDe = new JButton("Incluir punto de interes");
		
		sl_panel_4.putConstraint(SpringLayout.SOUTH, btnIncluirPuntoDe, 0, SpringLayout.SOUTH, btnVincularParadas);
		sl_panel_4.putConstraint(SpringLayout.EAST, btnIncluirPuntoDe, -10, SpringLayout.EAST, panel_4);
		panel_4.add(btnIncluirPuntoDe);
		
		panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 6, SpringLayout.SOUTH, servicios);
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 0, SpringLayout.SOUTH, panel_2);
		springLayout.putConstraint(SpringLayout.EAST, panel, -6, SpringLayout.WEST, panel_2);
		add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		lblPtosInteres = new JLabel("Puntos de interes");
		lblPtosInteres.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblPtosInteres);
		
		listPtos = new JList();
		sl_panel.putConstraint(SpringLayout.WEST, lblPtosInteres, 0, SpringLayout.WEST, listPtos);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblPtosInteres, -3, SpringLayout.NORTH, listPtos);
		sl_panel.putConstraint(SpringLayout.NORTH, listPtos, 35, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, listPtos, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, listPtos, -309, SpringLayout.EAST, panel);
		panel.add(listPtos);
		
		listPtos.setModel(new DefaultListModel());
		try {
			PuntoInteres[] arrPuntos = bd_puntos.getPuntosInteres();
			DefaultListModel<String> model = new DefaultListModel<>();
			for(int i = 0; i < arrPuntos.length;i++){
				model.addElement(arrPuntos[i].getNombrePunto());
			}
			model.addElement("Nuevo punto");
			listPtos.setModel(model);
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		btnEliminarPto = new JButton("Eliminar Punto");
		sl_panel.putConstraint(SpringLayout.SOUTH, listPtos, -6, SpringLayout.NORTH, btnEliminarPto);
		sl_panel.putConstraint(SpringLayout.WEST, btnEliminarPto, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnEliminarPto, -10, SpringLayout.SOUTH, panel);
		panel.add(btnEliminarPto);
		btnEliminarPto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] select = listPtos.getSelectedValues();
				//TODO
			}
		});
		btnEliminarPto.setEnabled(false);
		
		JLabel lblNombre = new JLabel("Nombre");
		sl_panel.putConstraint(SpringLayout.WEST, lblNombre, 36, SpringLayout.EAST, listPtos);
		panel.add(lblNombre);
		
		txtNombre = new JTextField();
		
		sl_panel.putConstraint(SpringLayout.NORTH, txtNombre, -3, SpringLayout.NORTH, lblNombre);
		sl_panel.putConstraint(SpringLayout.WEST, txtNombre, 28, SpringLayout.EAST, lblNombre);
		txtNombre.setText("Nombre");
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion");
		sl_panel.putConstraint(SpringLayout.NORTH, lblDireccion, 80, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNombre, -15, SpringLayout.NORTH, lblDireccion);
		sl_panel.putConstraint(SpringLayout.WEST, lblDireccion, 0, SpringLayout.WEST, lblNombre);
		panel.add(lblDireccion);
		
		txtDireccion = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, txtDireccion, -3, SpringLayout.NORTH, lblDireccion);
		sl_panel.putConstraint(SpringLayout.WEST, txtDireccion, 0, SpringLayout.WEST, txtNombre);
		txtDireccion.setText("Direccion");
		panel.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		JLabel lblParadaMasCercana = new JLabel("Parada mas cercana");
		sl_panel.putConstraint(SpringLayout.NORTH, lblParadaMasCercana, 21, SpringLayout.SOUTH, lblDireccion);
		sl_panel.putConstraint(SpringLayout.WEST, lblParadaMasCercana, 0, SpringLayout.WEST, lblNombre);
		panel.add(lblParadaMasCercana);
		
		txtParadaCercana = new JTextField();
		txtParadaCercana.setText("Parada cercana");
		sl_panel.putConstraint(SpringLayout.NORTH, txtParadaCercana, 6, SpringLayout.SOUTH, lblParadaMasCercana);
		sl_panel.putConstraint(SpringLayout.WEST, txtParadaCercana, 35, SpringLayout.EAST, listPtos);
		panel.add(txtParadaCercana);
		txtParadaCercana.setColumns(10);
		
		lblDescripcion = new JLabel("Descripcion");
		sl_panel.putConstraint(SpringLayout.NORTH, lblDescripcion, 16, SpringLayout.SOUTH, txtParadaCercana);
		sl_panel.putConstraint(SpringLayout.WEST, lblDescripcion, 0, SpringLayout.WEST, lblNombre);
		panel.add(lblDescripcion);
		
		txtrDescripcion = new JTextArea();
		sl_panel.putConstraint(SpringLayout.NORTH, txtrDescripcion, 6, SpringLayout.SOUTH, lblDescripcion);
		sl_panel.putConstraint(SpringLayout.WEST, txtrDescripcion, 36, SpringLayout.EAST, listPtos);
		sl_panel.putConstraint(SpringLayout.SOUTH, txtrDescripcion, -50, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, txtrDescripcion, 75, SpringLayout.EAST, txtNombre);
		txtrDescripcion.setText("Descripcion");
		panel.add(txtrDescripcion);
		
		JLabel lblInformacion = new JLabel("Informacion");
		lblInformacion.setFont(new Font("Tahoma", Font.BOLD, 18));
		sl_panel.putConstraint(SpringLayout.NORTH, lblInformacion, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblInformacion, 28, SpringLayout.EAST, lblPtosInteres);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblInformacion, 33, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblInformacion, 262, SpringLayout.EAST, lblPtosInteres);
		panel.add(lblInformacion);
		
		//Accion para los textos
		
		txtNombre.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtNombre.getText().equals("Nombre")){
					txtNombre.setText("");
				}
			}
			public void focusLost(FocusEvent e) {
				if(txtNombre.getText().equals("")){
					txtNombre.setText("Nombre");
				}
			}
		});
		txtrDescripcion.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtrDescripcion.getText().equals("Descripcion")){
					txtrDescripcion.setText("");
				}
			}
			public void focusLost(FocusEvent e) {
				if(txtrDescripcion.getText().equals("")){
					txtrDescripcion.setText("Descripcion");
				}
			}
		});
		txtParadaCercana.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtParadaCercana.getText().equals("Parada cercana")){
					txtParadaCercana.setText("");
				}
			}
			public void focusLost(FocusEvent e) {
				if(txtParadaCercana.getText().equals("")){
					txtParadaCercana.setText("Parada cercana");
				}
			}
		});
		txtDireccion.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtDireccion.getText().equals("Direccion")){
					txtDireccion.setText("");
				}
			}
			public void focusLost(FocusEvent e) {
				if(txtDireccion.getText().equals("")){
					txtDireccion.setText("Direccion");
				}
			}
		});
		
		txtParadaCercana.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtParadaCercana.getText().equals("Parada cercana")){
					txtParadaCercana.setText("");
				}
			}
			public void focusLost(FocusEvent e) {
				if(txtParadaCercana.getText().equals("")){
					txtParadaCercana.setText("Parada cercana");
				}
			}
		});
		
		//Accion para incluir punto de interes
		
		btnIncluirPuntoDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtNombre.getText().equals("Nombre")){
					JOptionPane.showMessageDialog(null, "Introduzca el nombre del punto de interes","Error",JOptionPane.ERROR_MESSAGE);
				}else if(txtDireccion.getText().equals("Direccion")){
					JOptionPane.showMessageDialog(null, "Introduzca la direccion del punto de interes","Error",JOptionPane.ERROR_MESSAGE);
				}else if(txtParadaCercana.getText().equals("Parada cercana")){
					JOptionPane.showMessageDialog(null, "Introduzca una parada de referencia para el punto de interes","Error",JOptionPane.ERROR_MESSAGE);
				}else{

					datos = new ArrayList<String>();
					datos.add(txtNombre.getText());
					datos.add(txtDireccion.getText());
					datos.add(txtParadaCercana.getText());
					incluirPtoInteres();
					
				}
			}
		});
		
		//Accion para vincular paradas
		
		btnVincularParadas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vincularPtosInteres vincular = new vincularPtosInteres(txtNombre.getText(),
						listParadas);
				/*vincularParadas = new vincularParadas("punto",txtNombre.getText(),
						listParadas);*/
				/*jFrame = new JFrame();
				jFrame.setTitle("Vincular Paradas");
				jFrame.setBounds(300, 300, 520, 305);
				jFrame.getContentPane().add(vincularParadas.contentPane);
				jFrame.setVisible(true);*/
				/*vincularParadas.vincular.btnVolver
						.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								listParadas
										.setModel(vincularParadas.vincular.listIncluidos
												.getModel());
								if(listParadas.getModel().getSize()>0){
									txtParadaCercana.setText(""+listParadas.getModel().getElementAt(0));
								}
								jFrame.dispose();
							}
						});*/
			}

		});
		
		
		listPtos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				DefaultListModel<String> model = new DefaultListModel<>();
				Object[] select = listPtos.getSelectedValues();
				try {
					if(select[0].equals("Nuevo punto")){
						txtNombre.setText("Nombre");
						txtrDescripcion.setText("Descripcion");
						txtDireccion.setText("Direccion");
						txtParadaCercana.setText("Parada cercana");
						//btnIncluirPuntoDe.setText("Incluir punto");
						btnIncluirPuntoDe.setEnabled(true);
						btnEliminarPto.setEnabled(false);
						btnVincularParadas.setEnabled(false);
					}else{
						PuntoInteres punto = consultarPunto(select[0].toString());
						txtNombre.setText(punto.getNombrePunto());
						txtDireccion.setText(punto.getDireccionPunto());
						//txtParadaCercana.setText("");
						//txtNombreParada.setText(parada.getNombreParada());
						//txtDireccion.setText(parada.getDireccionParada());
						//textArea.setText(parada.getObservaciones());
						btnEliminarPto.setEnabled(true);
						btnVincularParadas.setEnabled(true);
						//btnIncluirPuntoDe.setText("Modificar punto");
						btnIncluirPuntoDe.setEnabled(false);
					}
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		//lineasAdmin();
		//servicios.btnLineas.setEnabled(false);
		//servicios.btnParadas.setEnabled(true);
	}
	
	public void incluirPtoInteres() {
		BD_PuntosInteres ptosinteres = new BD_PuntosInteres();
		try {
			ptosinteres.incluirPtoInteres(datos);
			
			model = (DefaultListModel<String>) listPtos.getModel();
			model.removeElement("Nuevo Punto");
			model.addElement(txtNombre.getText());
			model.addElement("Nuevo Punto");
			listPtos.setModel(model);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public PuntoInteres consultarPunto(String aNombre){
		PuntoInteres[] puntosInteres;
		PuntoInteres puntoInteres = null;
		int id = 0;
		try {
			puntosInteres = bd_puntos.getPuntosInteres();
			for(int i = 0; i < puntosInteres.length;i++){
				if(puntosInteres[i].getNombrePunto().equals(aNombre)){
					id = puntosInteres[i].getID();
					break;
				}
			}
			puntoInteres = bd_puntos.getPtoInteres(id);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return puntoInteres;
	}
	
	public void borrarPtoInteres() {
		throw new UnsupportedOperationException();
	}
}