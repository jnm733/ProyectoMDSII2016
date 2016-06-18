package diagrama_de_clases;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.awt.event.ActionEvent;

public class Vincular extends JPanel {
	public JButton btnVolver;
	public JList listExcluidos;
	public JList listIncluidos;
	public JButton btnIncluir;
	public JButton btnExcluir;
	public IAdministrador bd;

	public Vincular() {
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
		
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblNoAadidos = new JLabel("No A\u00F1adidos");
		springLayout.putConstraint(SpringLayout.NORTH, lblNoAadidos, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblNoAadidos, 33, SpringLayout.WEST, this);
		lblNoAadidos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(lblNoAadidos);
		
		JLabel lblAadidos = new JLabel("A\u00F1adidos");
		springLayout.putConstraint(SpringLayout.NORTH, lblAadidos, 1, SpringLayout.NORTH, lblNoAadidos);
		springLayout.putConstraint(SpringLayout.EAST, lblAadidos, -97, SpringLayout.EAST, this);
		lblAadidos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		add(lblAadidos);
		
		listExcluidos = new JList();
		springLayout.putConstraint(SpringLayout.NORTH, listExcluidos, 6, SpringLayout.SOUTH, lblNoAadidos);
		springLayout.putConstraint(SpringLayout.WEST, listExcluidos, 0, SpringLayout.WEST, lblNoAadidos);
		springLayout.putConstraint(SpringLayout.SOUTH, listExcluidos, -113, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, listExcluidos, -65, SpringLayout.EAST, this);
		add(listExcluidos);
		springLayout.putConstraint(SpringLayout.NORTH, listExcluidos, 21, SpringLayout.SOUTH, lblNoAadidos);
		springLayout.putConstraint(SpringLayout.WEST, listExcluidos, 33, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, listExcluidos, -83, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, listExcluidos, -292, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, lblNoAadidos, 0, SpringLayout.WEST, listExcluidos);
		
		listIncluidos = new JList();
		springLayout.putConstraint(SpringLayout.NORTH, listIncluidos, 0, SpringLayout.NORTH, listExcluidos);
		springLayout.putConstraint(SpringLayout.EAST, listIncluidos, -28, SpringLayout.EAST, this);
		add(listIncluidos);
		
		btnIncluir = new JButton("");
		springLayout.putConstraint(SpringLayout.EAST, btnIncluir, -194, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.WEST, listIncluidos, 23, SpringLayout.EAST, btnIncluir);
		springLayout.putConstraint(SpringLayout.NORTH, btnIncluir, 45, SpringLayout.NORTH, this);
		
		ImageIcon icon1 = new ImageIcon("img/flechaDerecha.png");  
		btnIncluir.setIcon(icon1);
		btnIncluir.setOpaque(false);
		btnIncluir.setContentAreaFilled(false);
		btnIncluir.setBorderPainted(false);
		add(btnIncluir);
		
		btnExcluir = new JButton("");
		springLayout.putConstraint(SpringLayout.WEST, btnExcluir, 0, SpringLayout.WEST, btnIncluir);
		springLayout.putConstraint(SpringLayout.SOUTH, btnExcluir, -83, SpringLayout.SOUTH, this);
		
		ImageIcon icon2 = new ImageIcon("img/flechaIzp.png");
		btnExcluir.setIcon(icon2);
		//btnExcluir.setText("excluir");
		btnExcluir.setOpaque(false);
		btnExcluir.setContentAreaFilled(false);
		btnExcluir.setBorderPainted(false);
		add(btnExcluir);
		
		btnVolver = new JButton("Volver");
		springLayout.putConstraint(SpringLayout.SOUTH, listIncluidos, -50, SpringLayout.NORTH, btnVolver);
		
		springLayout.putConstraint(SpringLayout.SOUTH, btnVolver, -10, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnVolver, -10, SpringLayout.EAST, this);
		add(btnVolver);
	}
	
	public void vincularParadas() {
		throw new UnsupportedOperationException();
	}

	public void vincularPtosInteres() {
		throw new UnsupportedOperationException();
	}

	public void vincularEventos() {
		throw new UnsupportedOperationException();
	}
}