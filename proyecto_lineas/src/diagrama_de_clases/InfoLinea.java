package diagrama_de_clases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import diagrama_de_base_de_datos.*;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InfoLinea extends JFrame{
	public JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtNumero;
	private JTextField txtFrecuencia;
	public JButton btnAceptar;
	public JLabel lblRecorrido;
	public JTextArea textAreaRecorrido;
	public JLabel lblHoraPrevistaDe;
	public JLabel lblNumero;
	public JLabel lblNewLabel;
	public JTextArea textAreaHorario;
	
	/**
	 * Create the frame.
	 */
	public InfoLinea(Object key) {
		
		setTitle("Informacion Parada");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		lblNewLabel = new JLabel("Nombre");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, -343, SpringLayout.EAST, contentPane);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		txtNombre = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtNombre, 1, SpringLayout.NORTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtNombre, 20, SpringLayout.EAST, lblNewLabel);
		txtNombre.setEditable(false);
		txtNombre.setText("Nombre");
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtNumero = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.EAST, txtNumero, 0, SpringLayout.EAST, txtNombre);
		txtNumero.setText("Numero");
		txtNumero.setEditable(false);
		txtNumero.setColumns(10);
		contentPane.add(txtNumero);
		
		lblRecorrido = new JLabel("Recorrido");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblRecorrido, 23, SpringLayout.SOUTH, txtNumero);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblRecorrido, 20, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblRecorrido, -318, SpringLayout.EAST, contentPane);
		contentPane.add(lblRecorrido);
		
		textAreaRecorrido = new JTextArea();
		sl_contentPane.putConstraint(SpringLayout.WEST, textAreaRecorrido, 20, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textAreaRecorrido, -237, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblRecorrido, -22, SpringLayout.NORTH, textAreaRecorrido);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textAreaRecorrido, 129, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textAreaRecorrido, -29, SpringLayout.SOUTH, contentPane);
		textAreaRecorrido.setEditable(false);
		contentPane.add(textAreaRecorrido);
		
		lblHoraPrevistaDe = new JLabel("Frecuencia de paso");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblHoraPrevistaDe, 5, SpringLayout.NORTH, textAreaRecorrido);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblHoraPrevistaDe, -85, SpringLayout.EAST, contentPane);
		contentPane.add(lblHoraPrevistaDe);
		
		txtFrecuencia = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtFrecuencia, 14, SpringLayout.SOUTH, lblHoraPrevistaDe);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtFrecuencia, 0, SpringLayout.WEST, lblHoraPrevistaDe);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtFrecuencia, -69, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtFrecuencia, -72, SpringLayout.EAST, contentPane);
		txtFrecuencia.setEditable(false);
		txtFrecuencia.setText("Frecuencia");
		contentPane.add(txtFrecuencia);
		txtFrecuencia.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnAceptar, 0, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnAceptar, 0, SpringLayout.EAST, contentPane);
		contentPane.add(btnAceptar);
		
		lblNumero = new JLabel("Numero");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNumero, 53, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNumero, 20, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel, -20, SpringLayout.NORTH, lblNumero);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtNumero, -3, SpringLayout.NORTH, lblNumero);
		contentPane.add(lblNumero);
		
		JLabel lblHorario = new JLabel("Horario");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblHorario, 4, SpringLayout.NORTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblHorario, 179, SpringLayout.EAST, lblRecorrido);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblHorario, -93, SpringLayout.EAST, contentPane);
		contentPane.add(lblHorario);
		
		textAreaHorario = new JTextArea();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textAreaHorario, 3, SpringLayout.NORTH, txtNumero);
		sl_contentPane.putConstraint(SpringLayout.WEST, textAreaHorario, 63, SpringLayout.EAST, txtNumero);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textAreaHorario, 0, SpringLayout.SOUTH, lblRecorrido);
		sl_contentPane.putConstraint(SpringLayout.EAST, textAreaHorario, 0, SpringLayout.EAST, btnAceptar);
		contentPane.add(textAreaHorario);

	}
}