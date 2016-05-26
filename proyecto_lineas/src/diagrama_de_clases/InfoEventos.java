package diagrama_de_clases;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class InfoEventos extends JFrame {

	public JPanel contentPane;
	public JTextField txtNombre;
	public JTextField txtDireccion;
	public JTextField txtInicio;
	public JTextField txtFin;
	public JTextField txtParada;
	public JButton btnAceptar;

	/**
	 * Create the frame.
	 */
	public InfoEventos(Object key) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);

		txtNombre = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtNombre, 11,
				SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtNombre, -117,
				SpringLayout.EAST, contentPane);
		txtNombre.setEditable(false);
		txtNombre.setText("Nombre");
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtDireccion = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtDireccion, 19,
				SpringLayout.SOUTH, txtNombre);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtDireccion, 0,
				SpringLayout.EAST, txtNombre);
		txtDireccion.setText("Direccion");
		txtDireccion.setEditable(false);
		txtDireccion.setColumns(10);
		contentPane.add(txtDireccion);

		JLabel lblInicio = new JLabel("Inicio");
		contentPane.add(lblInicio);

		btnAceptar = new JButton("Aceptar");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnAceptar, 0,
				SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnAceptar, 0,
				SpringLayout.EAST, contentPane);
		contentPane.add(btnAceptar);

		JLabel lblDireccion = new JLabel("Direccion");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblInicio, 0,
				SpringLayout.WEST, lblDireccion);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblDireccion, 92,
				SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblDireccion, 3,
				SpringLayout.NORTH, txtDireccion);
		contentPane.add(lblDireccion);

		txtInicio = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtInicio, 12,
				SpringLayout.SOUTH, txtDireccion);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblInicio, 3,
				SpringLayout.NORTH, txtInicio);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtInicio, 0,
				SpringLayout.EAST, txtNombre);
		txtInicio.setEditable(false);
		txtInicio.setText("Inicio");
		contentPane.add(txtInicio);
		txtInicio.setColumns(10);

		JLabel lblFin = new JLabel("Fin");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblFin, 0,
				SpringLayout.WEST, lblInicio);
		contentPane.add(lblFin);

		txtFin = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtFin, 16,
				SpringLayout.SOUTH, txtInicio);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblFin, 3,
				SpringLayout.NORTH, txtFin);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtFin, 0,
				SpringLayout.EAST, txtNombre);
		txtFin.setEditable(false);
		txtFin.setText("Fin");
		contentPane.add(txtFin);
		txtFin.setColumns(10);

		JLabel lblParadaCercana = new JLabel("Parada Cercana");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblParadaCercana, 28,
				SpringLayout.SOUTH, lblFin);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblParadaCercana, 0,
				SpringLayout.WEST, lblInicio);
		contentPane.add(lblParadaCercana);

		JLabel lblEvento = new JLabel("Evento");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblEvento, 3,
				SpringLayout.NORTH, txtNombre);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblEvento, 0,
				SpringLayout.WEST, lblInicio);
		contentPane.add(lblEvento);

		txtParada = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtParada, -3,
				SpringLayout.NORTH, lblParadaCercana);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtParada, 0,
				SpringLayout.WEST, txtNombre);
		txtParada.setEditable(false);
		txtParada.setText("Parada");
		contentPane.add(txtParada);
		txtParada.setColumns(20);
	}
	
	public InfoEventos getEvento(String aNombre) {
		throw new UnsupportedOperationException();
	}
}