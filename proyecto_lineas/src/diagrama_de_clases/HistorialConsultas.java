package diagrama_de_clases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import diagrama_de_base_de_datos.*;

public class HistorialConsultas extends JFrame{
	public JPanel contentPane;
	public JButton btnConsultar;
	public JLabel lblOrigen;
	public JLabel lblDestino;
	public JTextField txtOrigen;
	public JTextField txtDestino;
	public JButton btnCancelar;
	public JList listId;
	
	/**
	 * Create the frame.
	 */
	public HistorialConsultas(String aId) {
		DefaultListModel<String> model = new DefaultListModel<String>();
		String email;
		
		setTitle("Historial de Consultas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		btnConsultar = new JButton("Consultar");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnConsultar, 0, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnConsultar, 0, SpringLayout.EAST, contentPane);
		contentPane.add(btnConsultar);
		
		listId = new JList();
		sl_contentPane.putConstraint(SpringLayout.NORTH, listId, 20, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, listId, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, listId, 0, SpringLayout.SOUTH, btnConsultar);
		sl_contentPane.putConstraint(SpringLayout.EAST, listId, 181, SpringLayout.WEST, contentPane);
		contentPane.add(listId);
		
		lblOrigen = new JLabel("Origen");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblOrigen, 23, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblOrigen, 23, SpringLayout.EAST, listId);
		contentPane.add(lblOrigen);
		
		lblDestino = new JLabel("Destino");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblDestino, 42, SpringLayout.SOUTH, lblOrigen);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblDestino, 19, SpringLayout.EAST, listId);
		contentPane.add(lblDestino);
		
		txtOrigen = new JTextField();
		txtOrigen.setText("Origen");
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtOrigen, -2, SpringLayout.NORTH, listId);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtOrigen, 43, SpringLayout.EAST, lblOrigen);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtOrigen, 1, SpringLayout.SOUTH, lblOrigen);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtOrigen, -59, SpringLayout.EAST, contentPane);
		contentPane.add(txtOrigen);
		txtOrigen.setColumns(10);
		
		txtDestino = new JTextField();
		txtDestino.setText("Destino");
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtDestino, 0, SpringLayout.NORTH, lblDestino);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtDestino, 0, SpringLayout.WEST, txtOrigen);
		contentPane.add(txtDestino);
		txtDestino.setColumns(10);
		
		btnCancelar = new JButton("Cancelar");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCancelar, -23, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCancelar, -95, SpringLayout.WEST, btnConsultar);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnCancelar, 0, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCancelar, -6, SpringLayout.WEST, btnConsultar);
		contentPane.add(btnCancelar);
		
		//TODO Iniciar la lista de consultas
		try {
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//TODO Cuando se seleccina una consulta
		listId.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
					try {
						Object select[] = listId.getSelectedValues();
						if(select.length>0){
							
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
			}
		});
	}
}