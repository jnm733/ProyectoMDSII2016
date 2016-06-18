package diagrama_de_clases;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class CabeceraAdministrador extends CabeceraUsuario {
	public CabeceraComun cabeceraComun;
	public JButton btnPagoDeServicios;
	public JButton btnVistaUsuario;
	public JButton btnVistaAdministrador;
	public JButton btnSalir;
	
	public CabeceraAdministrador() {
		setBackground(Color.RED);
		cabeceraComun = new CabeceraComun();
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, cabeceraComun, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, cabeceraComun, 0, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, cabeceraComun, 102, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, cabeceraComun, -405, SpringLayout.EAST, this);
		setLayout(springLayout);
		
		add(cabeceraComun);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, panel, 6, SpringLayout.EAST, cabeceraComun);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 0, SpringLayout.SOUTH, cabeceraComun);
		springLayout.putConstraint(SpringLayout.EAST, panel, -10, SpringLayout.EAST, this);
		add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		btnPagoDeServicios = new JButton("Pago Servicios");
		sl_panel.putConstraint(SpringLayout.WEST, btnPagoDeServicios, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnPagoDeServicios, 0, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.NORTH, btnPagoDeServicios, 5, SpringLayout.NORTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, btnPagoDeServicios, 17, SpringLayout.WEST, panel);
		panel.add(btnPagoDeServicios);
		
		JLabel lblIdentificadoComo = new JLabel("Identificado como");
		sl_panel.putConstraint(SpringLayout.SOUTH, lblIdentificadoComo, -79, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.SOUTH, lblIdentificadoComo, -6, SpringLayout.NORTH, btnPagoDeServicios);
		springLayout.putConstraint(SpringLayout.EAST, lblIdentificadoComo, -10, SpringLayout.EAST, panel);
		panel.add(lblIdentificadoComo);
		springLayout.putConstraint(SpringLayout.EAST, btnPagoDeServicios, -10, SpringLayout.EAST, lblIdentificadoComo);
		
		btnVistaUsuario = new JButton("Vista Usuario");
		sl_panel.putConstraint(SpringLayout.NORTH, btnVistaUsuario, 0, SpringLayout.NORTH, btnPagoDeServicios);
		sl_panel.putConstraint(SpringLayout.EAST, btnVistaUsuario, -10, SpringLayout.EAST, panel);
		panel.add(btnVistaUsuario);
		
		btnVistaAdministrador = new JButton("Vista Administrador");
		sl_panel.putConstraint(SpringLayout.NORTH, btnVistaAdministrador, 0, SpringLayout.NORTH, btnPagoDeServicios);
		sl_panel.putConstraint(SpringLayout.EAST, btnVistaAdministrador, -6, SpringLayout.WEST, btnVistaUsuario);
		springLayout.putConstraint(SpringLayout.NORTH, btnVistaAdministrador, -4, SpringLayout.NORTH, lblIdentificadoComo);
		springLayout.putConstraint(SpringLayout.WEST, btnVistaAdministrador, 0, SpringLayout.WEST, btnVistaUsuario);
		panel.add(btnVistaAdministrador);
		
		btnSalir = new JButton("Salir");
		sl_panel.putConstraint(SpringLayout.NORTH, btnSalir, 29, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btnSalir, 0, SpringLayout.WEST, lblIdentificadoComo);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnSalir, 29, SpringLayout.SOUTH, lblIdentificadoComo);
		sl_panel.putConstraint(SpringLayout.EAST, btnSalir, 0, SpringLayout.EAST, lblIdentificadoComo);
		panel.add(btnSalir);
		
		JLabel lblAdministrador = new JLabel("Administrador");
		sl_panel.putConstraint(SpringLayout.WEST, lblAdministrador, 298, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblIdentificadoComo, -6, SpringLayout.WEST, lblAdministrador);
		sl_panel.putConstraint(SpringLayout.NORTH, lblAdministrador, 0, SpringLayout.NORTH, lblIdentificadoComo);
		panel.add(lblAdministrador);
	}
}