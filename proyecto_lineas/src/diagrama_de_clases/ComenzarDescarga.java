package diagrama_de_clases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

import diagrama_de_base_de_datos.Descarga;

import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class ComenzarDescarga extends JFrame {
	/**
	 * Launch the application.
	 */
	public JPanel contentPane;
	public JButton btnCancelar;
	public JButton btnAceptar;
	public JTextArea txtDescripcion;
	public JLabel lblNombreDeLa;

	public ComenzarDescarga(Descarga descarga) {
		setTitle("Descarga");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		btnCancelar = new JButton("Cancelar");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnCancelar, 0, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCancelar, 0, SpringLayout.EAST, contentPane);
		contentPane.add(btnCancelar);
		
		lblNombreDeLa = new JLabel("Nombre de la descarga");
		lblNombreDeLa.setText(descarga.getTituloDescarga());
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNombreDeLa, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNombreDeLa, 0, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNombreDeLa, 23, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNombreDeLa, 298, SpringLayout.WEST, contentPane);
		contentPane.add(lblNombreDeLa);
		
		txtDescripcion = new JTextArea();
		txtDescripcion.setText(descarga.getDescripcionDescarga());
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtDescripcion, 14, SpringLayout.SOUTH, lblNombreDeLa);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtDescripcion, 5, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtDescripcion, 180, SpringLayout.SOUTH, lblNombreDeLa);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtDescripcion, 414, SpringLayout.WEST, contentPane);
		contentPane.add(txtDescripcion);
		
		btnAceptar = new JButton("Aceptar");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnAceptar, 0, SpringLayout.NORTH, btnCancelar);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnAceptar, -6, SpringLayout.WEST, btnCancelar);
		contentPane.add(btnAceptar);
	}
}