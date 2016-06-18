package diagrama_de_clases;

import javax.swing.ImageIcon;
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

public class InfoParada extends JFrame{
	public JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtHora;
	public JButton btnAceptar;
	public JLabel lblObservaciones;
	public JTextArea textAreaObservaciones;
	public JLabel lblImagen;
	public JLabel lblHoraPrevistaDe;
	public JLabel lblDirecicon;
	public JLabel lblNewLabel;
	public Object imagen;
	private boolean proximo;
	
	/**
	 * Create the frame.
	 */
	public InfoParada(Object key,String tiempoPaso,String numeroLineaLinea) {
		
		setTitle("Informacion Parada");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);

		lblNewLabel = new JLabel("Nombre");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 10,
				SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 0,
				SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, -343,
				SpringLayout.EAST, contentPane);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);

		txtNombre = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtNombre, 1,
				SpringLayout.NORTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtNombre, 20,
				SpringLayout.EAST, lblNewLabel);
		txtNombre.setEditable(false);
		txtNombre.setText("Nombre");
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtDireccion = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.EAST, txtDireccion, 0,
				SpringLayout.EAST, txtNombre);
		txtDireccion.setText("Direccion");
		txtDireccion.setEditable(false);
		txtDireccion.setColumns(10);
		contentPane.add(txtDireccion);

		lblObservaciones = new JLabel("Observaciones");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblObservaciones, 15,
				SpringLayout.WEST, contentPane);
		contentPane.add(lblObservaciones);

		textAreaObservaciones = new JTextArea();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textAreaObservaciones,
				129, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textAreaObservaciones,
				-29, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblObservaciones, -22,
				SpringLayout.NORTH, textAreaObservaciones);
		sl_contentPane.putConstraint(SpringLayout.WEST, textAreaObservaciones,
				5, SpringLayout.WEST, lblObservaciones);
		sl_contentPane.putConstraint(SpringLayout.EAST, textAreaObservaciones,
				0, SpringLayout.EAST, txtNombre);
		textAreaObservaciones.setEditable(false);
		contentPane.add(textAreaObservaciones);

		lblImagen = new JLabel("Imagen");
		sl_contentPane.putConstraint(SpringLayout.EAST, lblObservaciones, -94,
				SpringLayout.WEST, lblImagen);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblImagen, -88,
				SpringLayout.SOUTH, contentPane);
		lblImagen.setHorizontalAlignment(SwingConstants.CENTER);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblImagen, 38,
				SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblImagen, -229,
				SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblImagen, -5,
				SpringLayout.EAST, contentPane);
		contentPane.add(lblImagen);

		lblHoraPrevistaDe = new JLabel("Proximo paso");
		contentPane.add(lblHoraPrevistaDe);

		txtHora = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtHora, 202,
				SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtHora, -29,
				SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblHoraPrevistaDe, -6,
				SpringLayout.NORTH, txtHora);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblHoraPrevistaDe, 0,
				SpringLayout.EAST, txtHora);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtHora, 46,
				SpringLayout.EAST, textAreaObservaciones);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtHora, -85,
				SpringLayout.EAST, contentPane);
		txtHora.setEditable(false);
		contentPane.add(txtHora);
		txtHora.setColumns(10);

		btnAceptar = new JButton("Aceptar");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnAceptar, 0,
				SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnAceptar, 0,
				SpringLayout.EAST, contentPane);
		contentPane.add(btnAceptar);

		lblDirecicon = new JLabel("Direccion");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblObservaciones, 26,
				SpringLayout.SOUTH, lblDirecicon);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblDirecicon, 53,
				SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblDirecicon, 20,
				SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel, -20,
				SpringLayout.NORTH, lblDirecicon);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtDireccion, -3,
				SpringLayout.NORTH, lblDirecicon);
		contentPane.add(lblDirecicon);

	}
}