package diagrama_de_clases;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import diagrama_de_base_de_datos.*;

public class InfoPtoInteres extends JFrame{
	public JPanel contentPane;
	public JTextField txtNombre;
	public JTextField txtDireccion;
	public JTextField paradaCercana;
	public JButton btnAceptar;
	
	public IAdministrador bd;
	public BD_Principal bd_principal;

	public InfoPtoInteres(String key) {

		bd_principal = new BD_Principal();
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
		
		PuntoInteres punto = bd_principal.getPtoInteres(key);
		
		setTitle("Informacion Punto de Interes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnAceptar, 0,
				SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnAceptar, 0,
				SpringLayout.EAST, contentPane);
		contentPane.add(btnAceptar);

		JLabel lblPuntoDeInteres = new JLabel("Punto de Interes");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblPuntoDeInteres, 3,
				SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblPuntoDeInteres, 73,
				SpringLayout.WEST, contentPane);
		contentPane.add(lblPuntoDeInteres);

		JLabel lblDescripcion = new JLabel("Descripcion");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblDescripcion, 0,
				SpringLayout.WEST, lblPuntoDeInteres);
		contentPane.add(lblDescripcion);

		JLabel lblDireccion = new JLabel("Direccion");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblDireccion, 12,
				SpringLayout.SOUTH, lblPuntoDeInteres);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblDescripcion, 29,
				SpringLayout.SOUTH, lblDireccion);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblDireccion, 0,
				SpringLayout.WEST, lblPuntoDeInteres);
		contentPane.add(lblDireccion);

		txtNombre = new JTextField();
		txtNombre.setText(punto.getNombrePunto());
		txtNombre.setEditable(false);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtNombre, -3,
				SpringLayout.NORTH, lblPuntoDeInteres);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtDireccion = new JTextField();
		txtDireccion.setText(punto.getDireccionPunto());
		txtDireccion.setEditable(false);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtNombre, 0,
				SpringLayout.WEST, txtDireccion);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtDireccion, -3,
				SpringLayout.NORTH, lblDireccion);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);

		JTextArea textAreaDescripcion = new JTextArea();
		//textAreaDescripcion.setText(punto.ge);
		textAreaDescripcion.setEditable(false);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textAreaDescripcion,
				6, SpringLayout.SOUTH, txtDireccion);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtDireccion, 0,
				SpringLayout.WEST, textAreaDescripcion);
		sl_contentPane.putConstraint(SpringLayout.EAST, textAreaDescripcion,
				-146, SpringLayout.EAST, contentPane);
		contentPane.add(textAreaDescripcion);

		JLabel lblParadaCercana = new JLabel("Parada Cercana");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblParadaCercana, 45,
				SpringLayout.SOUTH, lblDescripcion);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblParadaCercana, 0,
				SpringLayout.WEST, lblPuntoDeInteres);
		contentPane.add(lblParadaCercana);

		Parada[] paradas = bd_principal.getParadas();
		String paradacercana = "";
		for (int i = 0; i < paradas.length; i++) {
			if(paradas[i].pertenece.contains(punto)){
				paradacercana = paradas[i].getNombreParada();
			}
		}
		
		paradaCercana = new JTextField();
		paradaCercana.setText(paradacercana);
		paradaCercana.setEditable(false);
		sl_contentPane.putConstraint(SpringLayout.WEST, textAreaDescripcion, 0,
				SpringLayout.WEST, paradaCercana);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textAreaDescripcion,
				-17, SpringLayout.NORTH, paradaCercana);
		sl_contentPane.putConstraint(SpringLayout.NORTH, paradaCercana, -3,
				SpringLayout.NORTH, lblParadaCercana);
		sl_contentPane.putConstraint(SpringLayout.WEST, paradaCercana, 42,
				SpringLayout.EAST, lblParadaCercana);
		contentPane.add(paradaCercana);
		paradaCercana.setColumns(20);
	}
	
	public InfoPtoInteres getPtoInteres(String aNombre) {
		throw new UnsupportedOperationException();
	}
}