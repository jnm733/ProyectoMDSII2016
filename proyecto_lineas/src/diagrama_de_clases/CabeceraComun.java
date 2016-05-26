package diagrama_de_clases;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ArrayList;

public class CabeceraComun extends JPanel {

	public JButton btnCalcularRuta = new JButton("Calcular Ruta");
	public JButton btnDescargas = new JButton("Descargas");
	public JButton btnServicios = new JButton("Servicios");
	public ArrayList<JButton> btns = apilarBotones();
	
	/**
	 * Create the panel.
	 */
	public ArrayList<JButton> apilarBotones(){
		ArrayList<JButton> btnsArrayList = new ArrayList<JButton>();
		btnsArrayList.add(btnServicios);
		btnsArrayList.add(btnCalcularRuta);
		btnsArrayList.add(btnDescargas);
		return btnsArrayList;
	}
	
	public CabeceraComun() {
		setBackground(Color.RED);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 0, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel, 0, SpringLayout.EAST, this);
		panel.setBackground(Color.RED);
		add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		
		ImageIcon icon = new ImageIcon("img/surbus.jpg");  
		JLabel lblNewLabel = new JLabel("");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, panel);
		lblNewLabel.setIcon(icon);
		panel.add(lblNewLabel);
		
		btnServicios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				desactivarBtn(btnServicios);
				
			}
		});
		sl_panel.putConstraint(SpringLayout.WEST, btnServicios, 0, SpringLayout.EAST, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnServicios, 0, SpringLayout.SOUTH, lblNewLabel);
		panel.add(btnServicios);
		
		sl_panel.putConstraint(SpringLayout.NORTH, btnCalcularRuta, 0, SpringLayout.NORTH, btnServicios);
		sl_panel.putConstraint(SpringLayout.WEST, btnCalcularRuta, 0, SpringLayout.EAST, btnServicios);
		btnCalcularRuta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				desactivarBtn(btnCalcularRuta);
			}
		});
		panel.add(btnCalcularRuta);
		
		
		sl_panel.putConstraint(SpringLayout.WEST, btnDescargas, 0, SpringLayout.EAST, btnCalcularRuta);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnDescargas, 0, SpringLayout.SOUTH, lblNewLabel);
		btnDescargas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				desactivarBtn(btnDescargas);
			}
		});
		panel.add(btnDescargas);

	}

	public void desactivarBtn(JButton boton){
		for (int i = 0; i < btns.size(); i++) {
			if(btns.get(i).equals(boton)){
				boton.setEnabled(false);
			}else{
				btns.get(i).setEnabled(true);
			}
		}
	}
}
