package diagrama_de_clases;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import diagrama_de_base_de_datos.*;

public class CalcularRutaInvitado extends JPanel{
	public JTextField txtOrigen;
	public JTextField txtDestino;
	public JTextField txtFecha;
	public JTextField txtHora;
	public JTextField txtConsulta;
	public JButton btnConsultarHistorial;
	public JLabel lblDestino;
	public JButton btnConsultar;
	public JRadioButton rdbtnCalleDestino;
	public JRadioButton rdbtnParadaDestino;
	public JRadioButton rdbtnBarrioDestino;
	public JRadioButton rdbtnEventoCultural;
	public JLabel lblFechaYHora;
	public JLabel lblOrdenarPor;
	public JRadioButton rdbtnMenorTiempo;
	public JRadioButton rdbtnMenorPrecio;
	public JLabel lblNumeroDeSoluciones;
	public JRadioButton rdbtn5;
	public JRadioButton rdbtn10;
	public JRadioButton rdbtn15;
	public JLabel lblOrigen;
	public JRadioButton rdbtnCalleOrigen;
	public JRadioButton rdbtnParadaOrigen;
	public JRadioButton rdbtnBarrioOrigen;
	public JLabel lblConsultarPorId;
	public JLabel lblId;
	public SolucionConsulta solucion;
	public ArrayList<String> lineas;
	public String nOrigen;
	public String nDestino;
	public String hora;
	public boolean exito;
	public SpringLayout sl_panel_3;
	public JPanel panel_3;

	public CalcularRutaInvitado(){
		/**
		 * Create the panel.
		 */
			SpringLayout springLayout = new SpringLayout();
			setLayout(springLayout);

			JPanel panel = new JPanel();
			springLayout.putConstraint(SpringLayout.NORTH, panel, 0,
					SpringLayout.NORTH, this);
			springLayout.putConstraint(SpringLayout.WEST, panel, 0,
					SpringLayout.WEST, this);
			springLayout.putConstraint(SpringLayout.SOUTH, panel, 226,
					SpringLayout.NORTH, this);
			springLayout.putConstraint(SpringLayout.EAST, panel, 308,
					SpringLayout.WEST, this);
			add(panel);

			JPanel panel_1 = new JPanel();
			springLayout.putConstraint(SpringLayout.NORTH, panel_1, 0,
					SpringLayout.NORTH, this);
			springLayout.putConstraint(SpringLayout.WEST, panel_1, 308,
					SpringLayout.WEST, this);
			springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 226,
					SpringLayout.NORTH, this);
			springLayout.putConstraint(SpringLayout.EAST, panel_1, 616,
					SpringLayout.WEST, this);
			add(panel_1);
			SpringLayout sl_panel_1 = new SpringLayout();
			panel_1.setLayout(sl_panel_1);

			lblDestino = new JLabel("Destino");
			sl_panel_1.putConstraint(SpringLayout.NORTH, lblDestino, 10,
					SpringLayout.NORTH, panel_1);
			sl_panel_1.putConstraint(SpringLayout.WEST, lblDestino, 10,
					SpringLayout.WEST, panel_1);
			sl_panel_1.putConstraint(SpringLayout.SOUTH, lblDestino, 58,
					SpringLayout.NORTH, panel_1);
			sl_panel_1.putConstraint(SpringLayout.EAST, lblDestino, -10,
					SpringLayout.EAST, panel_1);
			lblDestino.setHorizontalAlignment(SwingConstants.CENTER);
			lblDestino.setFont(new Font("Tahoma", Font.BOLD, 18));
			panel_1.add(lblDestino);

			rdbtnCalleDestino = new JRadioButton("Calle y Numero");
			sl_panel_1.putConstraint(SpringLayout.WEST, rdbtnCalleDestino, 0,
					SpringLayout.WEST, lblDestino);
			rdbtnCalleDestino.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnCalleDestino.setSelected(true);
					rdbtnParadaDestino.setSelected(false);
					rdbtnBarrioDestino.setSelected(false);
					rdbtnEventoCultural.setSelected(false);
				}
			});
			panel_1.add(rdbtnCalleDestino);

			rdbtnParadaDestino = new JRadioButton("Parada");
			sl_panel_1.putConstraint(SpringLayout.NORTH, rdbtnParadaDestino, 6,
					SpringLayout.SOUTH, lblDestino);
			sl_panel_1.putConstraint(SpringLayout.WEST, rdbtnParadaDestino, 0,
					SpringLayout.WEST, lblDestino);
			rdbtnParadaDestino.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnParadaDestino.setSelected(true);
					rdbtnCalleDestino.setSelected(false);
					rdbtnBarrioDestino.setSelected(false);
					rdbtnEventoCultural.setSelected(false);
				}
			});
			panel_1.add(rdbtnParadaDestino);
			rdbtnParadaDestino.setSelected(true);

			rdbtnBarrioDestino = new JRadioButton("Barrio");
			sl_panel_1.putConstraint(SpringLayout.SOUTH, rdbtnCalleDestino, -6,
					SpringLayout.NORTH, rdbtnBarrioDestino);
			sl_panel_1.putConstraint(SpringLayout.NORTH, rdbtnBarrioDestino, 34,
					SpringLayout.SOUTH, rdbtnParadaDestino);
			rdbtnBarrioDestino.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnBarrioDestino.setSelected(true);
					rdbtnParadaDestino.setSelected(false);
					rdbtnCalleDestino.setSelected(false);
					rdbtnEventoCultural.setSelected(false);
				}
			});
			sl_panel_1.putConstraint(SpringLayout.WEST, rdbtnBarrioDestino, 0,
					SpringLayout.WEST, lblDestino);
			panel_1.add(rdbtnBarrioDestino);

			txtDestino = new JTextField();
			sl_panel_1.putConstraint(SpringLayout.NORTH, txtDestino, -45,
					SpringLayout.SOUTH, panel_1);
			sl_panel_1.putConstraint(SpringLayout.WEST, txtDestino, 0,
					SpringLayout.WEST, lblDestino);
			sl_panel_1.putConstraint(SpringLayout.SOUTH, txtDestino, -10,
					SpringLayout.SOUTH, panel_1);
			sl_panel_1.putConstraint(SpringLayout.EAST, txtDestino, 0,
					SpringLayout.EAST, lblDestino);
			txtDestino.setColumns(10);
			panel_1.add(txtDestino);

			rdbtnEventoCultural = new JRadioButton("Evento Cultural");
			rdbtnEventoCultural.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnEventoCultural.setSelected(true);
					rdbtnParadaDestino.setSelected(false);
					rdbtnBarrioDestino.setSelected(false);
					rdbtnCalleDestino.setSelected(false);
				}
			});
			sl_panel_1.putConstraint(SpringLayout.WEST, rdbtnEventoCultural, 0,
					SpringLayout.WEST, lblDestino);
			sl_panel_1.putConstraint(SpringLayout.SOUTH, rdbtnEventoCultural, -6,
					SpringLayout.NORTH, txtDestino);
			panel_1.add(rdbtnEventoCultural);

			JPanel panel_2 = new JPanel();
			springLayout.putConstraint(SpringLayout.NORTH, panel_2, 0,
					SpringLayout.NORTH, this);
			springLayout.putConstraint(SpringLayout.WEST, panel_2, 616,
					SpringLayout.WEST, this);
			springLayout.putConstraint(SpringLayout.SOUTH, panel_2, 226,
					SpringLayout.NORTH, this);
			springLayout.putConstraint(SpringLayout.EAST, panel_2, 924,
					SpringLayout.WEST, this);
			add(panel_2);
			SpringLayout sl_panel_2 = new SpringLayout();
			panel_2.setLayout(sl_panel_2);

			lblFechaYHora = new JLabel("Fecha y Hora");
			lblFechaYHora.setFont(new Font("Tahoma", Font.PLAIN, 14));
			sl_panel_2.putConstraint(SpringLayout.NORTH, lblFechaYHora, 10,
					SpringLayout.NORTH, panel_2);
			sl_panel_2.putConstraint(SpringLayout.WEST, lblFechaYHora, 10,
					SpringLayout.WEST, panel_2);
			panel_2.add(lblFechaYHora);

			lblOrdenarPor = new JLabel("Ordenar Por:");
			lblOrdenarPor.setFont(new Font("Tahoma", Font.PLAIN, 14));
			sl_panel_2.putConstraint(SpringLayout.NORTH, lblOrdenarPor, 40,
					SpringLayout.SOUTH, lblFechaYHora);
			sl_panel_2.putConstraint(SpringLayout.WEST, lblOrdenarPor, 10,
					SpringLayout.WEST, panel_2);
			panel_2.add(lblOrdenarPor);

			rdbtnMenorTiempo = new JRadioButton("Menor Tiempo");
			sl_panel_2.putConstraint(SpringLayout.NORTH, rdbtnMenorTiempo, -1,
					SpringLayout.NORTH, lblOrdenarPor);
			sl_panel_2.putConstraint(SpringLayout.EAST, rdbtnMenorTiempo, -10,
					SpringLayout.EAST, panel_2);
			panel_2.add(rdbtnMenorTiempo);

			rdbtnMenorPrecio = new JRadioButton("Menor Precio");
			sl_panel_2.putConstraint(SpringLayout.NORTH, rdbtnMenorPrecio, 19,
					SpringLayout.SOUTH, rdbtnMenorTiempo);
			sl_panel_2.putConstraint(SpringLayout.EAST, rdbtnMenorPrecio, 0,
					SpringLayout.EAST, rdbtnMenorTiempo);
			panel_2.add(rdbtnMenorPrecio);

			lblNumeroDeSoluciones = new JLabel("Numero de Soluciones: ");
			lblNumeroDeSoluciones.setFont(new Font("Tahoma", Font.PLAIN, 14));
			sl_panel_2.putConstraint(SpringLayout.NORTH, lblNumeroDeSoluciones, 61,
					SpringLayout.SOUTH, lblOrdenarPor);
			sl_panel_2.putConstraint(SpringLayout.WEST, lblNumeroDeSoluciones, 10,
					SpringLayout.WEST, panel_2);
			panel_2.add(lblNumeroDeSoluciones);

			txtFecha = new JTextField();
			sl_panel_2.putConstraint(SpringLayout.SOUTH, txtFecha, 0,
					SpringLayout.SOUTH, lblFechaYHora);
			sl_panel_2.putConstraint(SpringLayout.EAST, txtFecha, 0,
					SpringLayout.EAST, rdbtnMenorTiempo);
			panel_2.add(txtFecha);
			txtFecha.setColumns(10);

			txtHora = new JTextField();
			sl_panel_2.putConstraint(SpringLayout.NORTH, txtHora, 6,
					SpringLayout.SOUTH, txtFecha);
			sl_panel_2.putConstraint(SpringLayout.EAST, txtHora, 0,
					SpringLayout.EAST, rdbtnMenorTiempo);
			panel_2.add(txtHora);
			txtHora.setColumns(10);

			rdbtn5 = new JRadioButton("5");
			sl_panel_2.putConstraint(SpringLayout.NORTH, rdbtn5, 6,
					SpringLayout.SOUTH, lblNumeroDeSoluciones);
			sl_panel_2.putConstraint(SpringLayout.WEST, rdbtn5, 0,
					SpringLayout.WEST, lblFechaYHora);
			panel_2.add(rdbtn5);

			rdbtn10 = new JRadioButton("10");
			sl_panel_2.putConstraint(SpringLayout.WEST, rdbtn10, 6,
					SpringLayout.EAST, rdbtn5);
			sl_panel_2.putConstraint(SpringLayout.SOUTH, rdbtn10, 0,
					SpringLayout.SOUTH, rdbtn5);
			panel_2.add(rdbtn10);

			rdbtn15 = new JRadioButton("15");
			sl_panel_2.putConstraint(SpringLayout.NORTH, rdbtn15, 0,
					SpringLayout.NORTH, rdbtn5);
			sl_panel_2.putConstraint(SpringLayout.WEST, rdbtn15, 6,
					SpringLayout.EAST, rdbtn10);
			panel_2.add(rdbtn15);

			rdbtn15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					rdbtn10.setSelected(false);
					rdbtn5.setSelected(false);
				}
			});
			rdbtn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					rdbtn10.setSelected(false);
					rdbtn15.setSelected(false);
				}
			});
			rdbtn10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					rdbtn15.setSelected(false);
					rdbtn5.setSelected(false);
				}
			});
			rdbtn15.setSelected(true);
			
			panel_3 = new JPanel();
			springLayout.putConstraint(SpringLayout.NORTH, panel_3, 3,
					SpringLayout.SOUTH, panel);
			springLayout.putConstraint(SpringLayout.WEST, panel_3, 0,
					SpringLayout.WEST, this);
			springLayout.putConstraint(SpringLayout.SOUTH, panel_3, 214,
					SpringLayout.SOUTH, panel);
			SpringLayout sl_panel = new SpringLayout();
			panel.setLayout(sl_panel);

			lblOrigen = new JLabel("Origen");
			lblOrigen.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblOrigen.setHorizontalAlignment(SwingConstants.CENTER);
			sl_panel.putConstraint(SpringLayout.NORTH, lblOrigen, 10,
					SpringLayout.NORTH, panel);
			sl_panel.putConstraint(SpringLayout.WEST, lblOrigen, 10,
					SpringLayout.WEST, panel);
			sl_panel.putConstraint(SpringLayout.SOUTH, lblOrigen, 57,
					SpringLayout.NORTH, panel);
			sl_panel.putConstraint(SpringLayout.EAST, lblOrigen, 298,
					SpringLayout.WEST, panel);
			panel.add(lblOrigen);

			rdbtnCalleOrigen = new JRadioButton("Calle y Numero");
			sl_panel.putConstraint(SpringLayout.WEST, rdbtnCalleOrigen, 22,
					SpringLayout.WEST, panel);
			rdbtnCalleOrigen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnCalleOrigen.setSelected(true);
					rdbtnParadaOrigen.setSelected(false);
					rdbtnBarrioOrigen.setSelected(false);
				}
			});
			panel.add(rdbtnCalleOrigen);

			rdbtnParadaOrigen = new JRadioButton("Parada");
			sl_panel.putConstraint(SpringLayout.NORTH, rdbtnParadaOrigen, 15,
					SpringLayout.SOUTH, lblOrigen);
			sl_panel.putConstraint(SpringLayout.WEST, rdbtnParadaOrigen, 20,
					SpringLayout.WEST, panel);
			rdbtnParadaOrigen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnParadaOrigen.setSelected(true);
					rdbtnCalleOrigen.setSelected(false);
					rdbtnBarrioOrigen.setSelected(false);
				}
			});
			panel.add(rdbtnParadaOrigen);
			rdbtnParadaOrigen.setSelected(true);
			rdbtnBarrioOrigen = new JRadioButton("Barrio");
			sl_panel.putConstraint(SpringLayout.SOUTH, rdbtnCalleOrigen, -10,
					SpringLayout.NORTH, rdbtnBarrioOrigen);
			sl_panel.putConstraint(SpringLayout.WEST, rdbtnBarrioOrigen, 20,
					SpringLayout.WEST, panel);
			rdbtnBarrioOrigen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnBarrioOrigen.setSelected(true);
					rdbtnParadaOrigen.setSelected(false);
					rdbtnCalleOrigen.setSelected(false);
				}
			});
			panel.add(rdbtnBarrioOrigen);

			txtOrigen = new JTextField();
			sl_panel.putConstraint(SpringLayout.NORTH, txtOrigen, 181,
					SpringLayout.NORTH, panel);
			sl_panel.putConstraint(SpringLayout.SOUTH, txtOrigen, -10,
					SpringLayout.SOUTH, panel);
			sl_panel.putConstraint(SpringLayout.SOUTH, rdbtnBarrioOrigen, -13,
					SpringLayout.NORTH, txtOrigen);
			sl_panel.putConstraint(SpringLayout.WEST, txtOrigen, 20,
					SpringLayout.WEST, panel);
			sl_panel.putConstraint(SpringLayout.EAST, txtOrigen, -10,
					SpringLayout.EAST, panel);
			panel.add(txtOrigen);
			txtOrigen.setColumns(10);
			springLayout.putConstraint(SpringLayout.EAST, panel_3, -427,
					SpringLayout.EAST, this);
			add(panel_3);
			sl_panel_3 = new SpringLayout();
			panel_3.setLayout(sl_panel_3);

			lblConsultarPorId = new JLabel("Consultar por ID");
			sl_panel_3.putConstraint(SpringLayout.NORTH, lblConsultarPorId, 10, SpringLayout.NORTH, panel_3);
			sl_panel_3.putConstraint(SpringLayout.WEST, lblConsultarPorId, 10, SpringLayout.WEST, panel_3);
			lblConsultarPorId.setFont(new Font("Tahoma", Font.BOLD, 18));
			panel_3.add(lblConsultarPorId);

			lblId = new JLabel("ID");
			sl_panel_3.putConstraint(SpringLayout.NORTH, lblId, 33, SpringLayout.SOUTH, lblConsultarPorId);
			sl_panel_3.putConstraint(SpringLayout.WEST, lblId, 0, SpringLayout.WEST, lblConsultarPorId);
			lblId.setFont(new Font("Tahoma", Font.PLAIN, 15));
			panel_3.add(lblId);

			txtConsulta = new JTextField();
			sl_panel_3.putConstraint(SpringLayout.NORTH, txtConsulta, 1, SpringLayout.NORTH, lblId);
			sl_panel_3.putConstraint(SpringLayout.WEST, txtConsulta, 6, SpringLayout.EAST, lblId);
			sl_panel_3.putConstraint(SpringLayout.EAST, txtConsulta, -380,
					SpringLayout.EAST, panel_3);
			panel_3.add(txtConsulta);
			txtConsulta.setColumns(10);

			Calendar calendar = Calendar.getInstance();
			txtFecha.setText(calendar.get(calendar.DATE)+"/"+calendar.get(calendar.MONTH)+"/"+calendar.get(calendar.YEAR));
			txtHora.setText(calendar.get(calendar.HOUR_OF_DAY)+":"+calendar.get(calendar.MINUTE));

			btnConsultar = new JButton("Consultar");
			btnConsultar.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent arg0) {
					
					/*if(nOrigen==null){
						exito = false;
						JOptionPane.showMessageDialog(null, "Punto de origen incorrecto","Error",JOptionPane.ERROR_MESSAGE);
						txtOrigen.setBackground(Color.red);
					}else if(nDestino==null){
						exito = false;
						JOptionPane.showMessageDialog(null, "Punto de destino incorrecto","Error",JOptionPane.ERROR_MESSAGE);
						txtDestino.setBackground(Color.red);
					}*/

				}
			});
			springLayout.putConstraint(SpringLayout.SOUTH, btnConsultar, -10,
					SpringLayout.SOUTH, this);
			springLayout.putConstraint(SpringLayout.EAST, btnConsultar, -10,
					SpringLayout.EAST, this);
			add(btnConsultar);
	}
	
	//TODO Traspasar a calcular ruta usuario
	public void usuario(){
		btnConsultarHistorial = new JButton("Consultar Historial");
		sl_panel_3.putConstraint(SpringLayout.NORTH, btnConsultarHistorial, 17, SpringLayout.SOUTH, txtConsulta);
		sl_panel_3.putConstraint(SpringLayout.WEST, btnConsultarHistorial, 0, SpringLayout.WEST, lblConsultarPorId);
		sl_panel_3.putConstraint(SpringLayout.EAST, btnConsultarHistorial, -335, SpringLayout.EAST, panel_3);
		panel_3.add(btnConsultarHistorial);
	}
	
	public void consultarID() {
		throw new UnsupportedOperationException();
	}

	public void consultarRuta() {
		throw new UnsupportedOperationException();
	}
}