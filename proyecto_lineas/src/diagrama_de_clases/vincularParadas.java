package diagrama_de_clases;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.persistence.Id;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.orm.PersistentException;

import diagrama_de_base_de_datos.Parada;
import diagrama_de_base_de_datos.PuntoInteres;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.SpringLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;

import javax.swing.JTextField;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class vincularParadas extends JFrame {
	public JPanel contentPane;
	public Vincular vincular;
	public JButton btnCrearParada;
	public DefaultListModel<String> modelIncluidos;
	public DefaultListModel<String> modelExcluidos;
	public DefaultListModel<String> modelParadas;
	private JTextField txtDistancia;
	private JTextField txtHoraPaso;
	public String key;
	private JTextField txtId;
	private BD_Principal bd_principal;
	public ArrayList<String> datos;
	public ArrayList<ArrayList<String>> arrIn;
	public ArrayList<String> arrEx;
	/**
	 * Create the frame.
	 * 
	 * @param listParadas
	 */
	public vincularParadas(String key, JList listParadas) {

		datos = new ArrayList<>();
		arrIn =new ArrayList<ArrayList<String>>();
		arrEx = new ArrayList<String>();
		
		this.key = key;
		
		bd_principal = new BD_Principal();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		setResizable(false);
		vincular = new Vincular();
		SpringLayout springLayout = (SpringLayout) vincular.getLayout();
		contentPane.add(vincular);

		
		DefaultListModel<String> model = new DefaultListModel<String>();
		Parada[] arrPar = null;
		arrPar = bd_principal.getParadas();
		
		if (listParadas.getModel().getSize() > 0) {
			model = (DefaultListModel<String>) listParadas.getModel();
			vincular.listIncluidos.setModel(model);
			DefaultListModel<String> modelEx = new DefaultListModel<>();
			for (int i = 0; i < arrPar.length; i++) {
				if(!model.contains(arrPar[i].getNombreParada())){
					modelEx.addElement(arrPar[i].getNombreParada());
				}
			}
			vincular.listExcluidos.setModel(modelEx);
		} else {
			
			try {
				for(int i = 0; i < arrPar.length;i++){
					model.addElement(arrPar[i].getNombreParada());
				}
				vincular.listExcluidos.setModel(model);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
		

		vincular.listIncluidos.setModel(listParadas.getModel());

		vincular.btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PuntoInteres puntoInteres = null;
				puntoInteres = bd_principal.getPtoInteres(key);
				
				Parada parada = null;
				
				if(vincular.listIncluidos.getModel().getSize()>0){
					modelIncluidos = (DefaultListModel<String>) vincular.listIncluidos.getModel();
				}else{
					modelIncluidos = new DefaultListModel<String>();
				}
				
				if(vincular.listExcluidos.getModel().getSize()>0){
					modelExcluidos = (DefaultListModel<String>) vincular.listExcluidos.getModel();
				}else{
					modelExcluidos = new DefaultListModel<String>();
				}
				
				int[] select = vincular.listIncluidos.getSelectedIndices();
				for(int i = 0; i < select.length;i++){
					//Sacamos de la lista de excluidos
					modelExcluidos.addElement(modelIncluidos.get(select[i]));
					
					//Obtenemos la parada
					parada = bd_principal.getParada(modelIncluidos.get(select[i]));
					
					//Añadimos en la base de datos
					//bd_principal.vincularPntoInteres(evento.getID(),parada.getID());
				}
				for(int i = 0; i < modelExcluidos.getSize();i++){
					//Metemos en la lista de incluidos
					modelIncluidos.removeElement(modelExcluidos.getElementAt(i));
				}
				vincular.listIncluidos.setModel(modelIncluidos);
				vincular.listExcluidos.setModel(modelExcluidos);
			}
		});
		
		vincular.btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean ok = true;
				//Si la lista de excluidos está vacia se inicializa
				if(vincular.listExcluidos.getModel().getSize()>0){
					modelExcluidos = (DefaultListModel<String>) vincular.listExcluidos.getModel();
				}
				//Si no está vacia se copia
				else{
					modelExcluidos = new DefaultListModel<String>();
				}
				//Si la lista de incluidos está vacia se inicializa
				if(vincular.listIncluidos.getModel().getSize()>0){
					modelIncluidos = (DefaultListModel<String>) vincular.listIncluidos.getModel();
				}
				//Si no está vacia se copia
				else{
					modelIncluidos = new DefaultListModel<String>();
				}
				
				//Se cogen los nombres de los elegidos
				int[] select = vincular.listExcluidos.getSelectedIndices();
				//Y se añaden al modelo de la lista de incluidos
				for(int i = 0; i < select.length;i++){
					modelIncluidos.addElement(modelExcluidos.get(select[i]));
					datos = new ArrayList<>();
					try {
						//Parseamos la distancia, si no falla seguimos recorriendo
						Double.parseDouble(txtDistancia.getText());
						try {
							//Parseamos la posicion
							Integer.parseInt(txtId.getText());
							//Comprobamos el horario
							if(txtHoraPaso.getText().equals("Hora Paso")){
								JOptionPane.showMessageDialog(null, "Introduzca la primera hora de paso de la linea por la parada", "Error",
										JOptionPane.ERROR_MESSAGE);
								ok = false;
							}else{
								datos.add(modelExcluidos.get(select[i]));
								datos.add(txtDistancia.getText());
								datos.add(txtHoraPaso.getText());
								datos.add(txtId.getText());
								arrIn.add(datos);
								
								ok = true;
							}
							
						} catch (Exception e3) {
							JOptionPane.showMessageDialog(null, "Introduzca el número de la parada en la línea", "Error",
									JOptionPane.ERROR_MESSAGE);
							ok = false;
						}
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Introduzca distancia de la parada a la anterior (en numero)", "Error",
								JOptionPane.ERROR_MESSAGE);
						ok = false;
					}
					
				}
				//Si no hay errores
				if(ok){
					//Se borra del modelo de la lista de excluidos
					for(int i = 0; i < select.length;i++){
						modelExcluidos.remove(select[i]);
					}
					//Se cambian las listas
					vincular.listExcluidos.setModel(modelExcluidos);
					vincular.listIncluidos.setModel(modelIncluidos);
				}
				
			}
		});

		btnCrearParada = new JButton("Crear Parada");
		springLayout.putConstraint(SpringLayout.NORTH, btnCrearParada, 0,
				SpringLayout.NORTH, vincular.btnVolver);
		springLayout.putConstraint(SpringLayout.WEST, btnCrearParada, 262,
				SpringLayout.WEST, vincular);
		springLayout.putConstraint(SpringLayout.EAST, btnCrearParada, -6,
				SpringLayout.WEST, vincular.btnVolver);
		vincular.add(btnCrearParada);
		btnCrearParada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
			txtDistancia = new JTextField();
			txtDistancia.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					if (txtDistancia.getText().equals("Distancia")) {
						txtDistancia.setText("");
					}
				}

				public void focusLost(FocusEvent e) {
					if (txtDistancia.getText().equals("")) {
						txtDistancia.setText("Distancia");
					}
				}
			});
			txtDistancia.setText("Distancia");
			springLayout.putConstraint(SpringLayout.NORTH, txtDistancia, 11,
					SpringLayout.SOUTH, vincular.listExcluidos);
			springLayout.putConstraint(SpringLayout.WEST, txtDistancia, 0,
					SpringLayout.WEST, vincular.listExcluidos);
			vincular.add(txtDistancia);
			txtDistancia.setColumns(10);

			txtHoraPaso = new JTextField();
			txtHoraPaso.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					if (txtHoraPaso.getText().equals("Hora Paso")) {
						txtHoraPaso.setText("");
					}
				}

				public void focusLost(FocusEvent e) {
					if (txtHoraPaso.getText().equals("")) {
						txtHoraPaso.setText("Hora Paso");
					}
				}
			});
			springLayout.putConstraint(SpringLayout.NORTH, txtHoraPaso, 10,
					SpringLayout.SOUTH, txtDistancia);
			springLayout.putConstraint(SpringLayout.WEST, txtHoraPaso, 0,
					SpringLayout.WEST, vincular.listExcluidos);
			txtHoraPaso.setText("Hora Paso");
			txtHoraPaso.setColumns(10);
			vincular.add(txtHoraPaso);

			txtId = new JTextField();
			txtId.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					if (txtId.getText().equals("Id")) {
						txtId.setText("");
					}
				}

				@Override
				public void focusLost(FocusEvent e) {
					if (txtId.getText().equals("")) {
						txtId.setText("Id");
					}
				}
			});
			springLayout.putConstraint(SpringLayout.NORTH, txtId, 11,
					SpringLayout.SOUTH, vincular.listExcluidos);
			springLayout.putConstraint(SpringLayout.WEST, txtId, 6,
					SpringLayout.EAST, txtDistancia);
			springLayout.putConstraint(SpringLayout.EAST, txtId, 48,
					SpringLayout.EAST, txtDistancia);
			txtId.setText("Id");
			vincular.add(txtId);
			txtId.setColumns(10);
		
			vincular.btnVolver.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					if(modelExcluidos != null){
						for (int i = 0; i < modelExcluidos.size(); i++) {
							arrEx.add(modelExcluidos.get(i));
						}
					}
					
					bd_principal.vincularParada(arrIn, arrEx,key);
				}
			});
	}
}