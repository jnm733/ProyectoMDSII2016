package diagrama_de_clases;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Servicios extends JPanel {
	public JTextField txtText;
	public JButton btnLineas = new JButton("Lineas");
	public JButton btnParadas = new JButton("Paradas");
	public JPanel panel;
	public JRadioButton rdbtnCalleYNumero;
	public JRadioButton rdbtnBarrio;
	public JButton btnFiltrar;
	public JButton btnPtosInteres = new JButton("Ptos Interes");
	public JButton btnEventos = new JButton("Eventos");
	public SpringLayout springLayout;
	public ArrayList<JButton> btns;
	public ParadasAdmin paradasAdmin;
	public LineasAdmin lineasAdmin;
	public EventosAdmin eventos;
	
	public void apilarBotones(){
		btns = new ArrayList<JButton>();
		btns.add(btnLineas);
		btns.add(btnParadas);
		btns.add(btnPtosInteres);
		btns.add(btnEventos);
	}

	public Servicios() {
		apilarBotones();
		springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, btnPtosInteres, 0, SpringLayout.NORTH, btnLineas);
		springLayout.putConstraint(SpringLayout.EAST, btnPtosInteres, -6, SpringLayout.WEST, btnEventos);
		springLayout.putConstraint(SpringLayout.NORTH, btnEventos, 0, SpringLayout.NORTH, btnLineas);
		setLayout(springLayout);
		
		
		springLayout.putConstraint(SpringLayout.NORTH, btnLineas, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnLineas, 0, SpringLayout.WEST, this);
		add(btnLineas);
		
		
		springLayout.putConstraint(SpringLayout.NORTH, btnParadas, 0, SpringLayout.NORTH, btnLineas);
		springLayout.putConstraint(SpringLayout.WEST, btnParadas, 6, SpringLayout.EAST, btnLineas);
		add(btnParadas);
		
		panel = new JPanel();
		springLayout.putConstraint(SpringLayout.EAST, btnEventos, -6, SpringLayout.WEST, panel);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, panel, -280, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 75, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel, 0, SpringLayout.EAST, this);
		panel.setBackground(Color.LIGHT_GRAY);
		add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		rdbtnCalleYNumero = new JRadioButton("Calle y Numero");
		rdbtnCalleYNumero.setSelected(true);
		rdbtnCalleYNumero.setBackground(Color.LIGHT_GRAY);
		sl_panel.putConstraint(SpringLayout.NORTH, rdbtnCalleYNumero, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, rdbtnCalleYNumero, 10, SpringLayout.WEST, panel);
		panel.add(rdbtnCalleYNumero);
		
		rdbtnBarrio = new JRadioButton("Barrio");
		rdbtnBarrio.setBackground(Color.LIGHT_GRAY);
		sl_panel.putConstraint(SpringLayout.NORTH, rdbtnBarrio, 6, SpringLayout.SOUTH, rdbtnCalleYNumero);
		sl_panel.putConstraint(SpringLayout.WEST, rdbtnBarrio, 0, SpringLayout.WEST, rdbtnCalleYNumero);
		panel.add(rdbtnBarrio);
		
		txtText = new JTextField();
		txtText.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if(txtText.getText().equals("Text")){
					txtText.setText("");
				}
			}
		});
		txtText.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if(txtText.getText().equals("")){
					txtText.setText("Text");
				}
			}
		});
		
		txtText.setText("Text");
		sl_panel.putConstraint(SpringLayout.NORTH, txtText, -20, SpringLayout.SOUTH, rdbtnCalleYNumero);
		sl_panel.putConstraint(SpringLayout.WEST, txtText, 6, SpringLayout.EAST, rdbtnCalleYNumero);
		sl_panel.putConstraint(SpringLayout.SOUTH, txtText, 0, SpringLayout.SOUTH, rdbtnCalleYNumero);
		sl_panel.putConstraint(SpringLayout.EAST, txtText, 163, SpringLayout.EAST, rdbtnCalleYNumero);
		panel.add(txtText);
		txtText.setColumns(10);
		
		btnFiltrar = new JButton("Filtrar");
		
		sl_panel.putConstraint(SpringLayout.NORTH, btnFiltrar, 6, SpringLayout.SOUTH, txtText);
		sl_panel.putConstraint(SpringLayout.WEST, btnFiltrar, -99, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnFiltrar, 29, SpringLayout.SOUTH, txtText);
		sl_panel.putConstraint(SpringLayout.EAST, btnFiltrar, -10, SpringLayout.EAST, panel);
		panel.add(btnFiltrar);
		
		rdbtnCalleYNumero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtnBarrio.setSelected(false);
			}
		});
		
		rdbtnBarrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtnCalleYNumero.setSelected(false);
			}
		});
		
		btnLineas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				desactivarBtn(btnLineas);
				panelLineas();
				repaint();
			}
		});
		
		btnParadas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				desactivarBtn(btnParadas);
				panelParadas();
				repaint();
			}
		});
	}
	public void panelParadas(){
		paradasAdmin = new ParadasAdmin();
		
	}
	public void panelLineas(){
		lineasAdmin = new LineasAdmin();
		
	}

	public void panelAdmin(){
		btnPtosInteres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				desactivarBtn(btnPtosInteres);
			}
		});
		
		add(btnPtosInteres);
		btnEventos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				desactivarBtn(btnEventos);
			}
		});
		add(btnEventos);
	}
	
	public void panelEventos(){
		eventos = new EventosAdmin();
		
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