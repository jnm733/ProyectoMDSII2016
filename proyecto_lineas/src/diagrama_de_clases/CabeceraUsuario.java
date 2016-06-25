package diagrama_de_clases;

import javax.swing.JPanel;

import java.awt.FlowLayout;

import javax.swing.SpringLayout;

import javax.swing.BoxLayout;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CabeceraUsuario extends CabeceraComun{
	public CabeceraComun cabeceraComun;
	public JPanel panel;
	public JButton btnPagoServicios;
	public JButton btnSalir;
	public JLabel lblIdentificado;
	public JLabel lblUsuario;
	
	public CabeceraUsuario(String usuario){
		setBackground(Color.RED);
		cabeceraComun = new CabeceraComun();
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, cabeceraComun, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, cabeceraComun, 0, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, cabeceraComun, 102, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, cabeceraComun, -405, SpringLayout.EAST, this);
		setLayout(springLayout);
		
		panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, cabeceraComun);
		springLayout.putConstraint(SpringLayout.WEST, panel, 6, SpringLayout.EAST, cabeceraComun);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -1, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel, -5, SpringLayout.EAST, this);
		panel.setBackground(Color.RED);
		add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		btnPagoServicios = new JButton("Pago Servicios");
		btnPagoServicios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnPagoServicios.setEnabled(false);
				cabeceraComun.desactivarBtn(new JButton(""));
			}
		});
		
		sl_panel.putConstraint(SpringLayout.WEST, btnPagoServicios, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnPagoServicios, 0, SpringLayout.SOUTH, panel);
		panel.add(btnPagoServicios);
		
		btnSalir = new JButton("Salir");
		sl_panel.putConstraint(SpringLayout.WEST, btnSalir, -148, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnSalir, -63, SpringLayout.EAST, panel);
		panel.add(btnSalir);
		
		lblIdentificado = new JLabel("Identificado como");
		sl_panel.putConstraint(SpringLayout.NORTH, btnSalir, 10, SpringLayout.SOUTH, lblIdentificado);
		panel.add(lblIdentificado);
		
		lblUsuario = new JLabel(usuario);
		sl_panel.putConstraint(SpringLayout.NORTH, lblIdentificado, 0, SpringLayout.NORTH, lblUsuario);
		sl_panel.putConstraint(SpringLayout.EAST, lblIdentificado, -6, SpringLayout.WEST, lblUsuario);
		sl_panel.putConstraint(SpringLayout.NORTH, lblUsuario, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblUsuario, 298, SpringLayout.WEST, panel);
		panel.add(lblUsuario);
		
		cabeceraComun.btnServicios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnPagoServicios.setEnabled(true);
				cabeceraComun.desactivarBtn(btnPagoServicios);
			}
		});
		cabeceraComun.btnCalcularRuta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnPagoServicios.setEnabled(true);
				cabeceraComun.desactivarBtn(btnPagoServicios);
			}
		});
		cabeceraComun.btnDescargas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnPagoServicios.setEnabled(true);
				cabeceraComun.desactivarBtn(btnPagoServicios);
			}
		});
		
		
		add(cabeceraComun);
	}

	public void pagoServicios() {
		throw new UnsupportedOperationException();
	}
	
	public String getUsuario(){
		return lblUsuario.getText();
	}
}