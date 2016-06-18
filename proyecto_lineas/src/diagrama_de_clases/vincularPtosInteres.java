package diagrama_de_clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

import org.orm.PersistentException;

import diagrama_de_base_de_datos.Parada;
import diagrama_de_base_de_datos.PuntoInteres;

public class vincularPtosInteres extends JFrame{
	public JPanel contentPane;
	public Vincular vincular;
	public JButton btnCrearParada;
	public DefaultListModel<String> modelIncluidos;
	public DefaultListModel<String> modelExcluidos;
	public DefaultListModel<String> modelParadas;
	private JTextField txtDistancia;
	private JTextField txtHoraPaso;
	public String key;
	public int tipoInt;
	private JTextField txtId;
	public BD_Principal bd_principal;
	//private BD_Paradas bd_paradas;	
	
	public vincularPtosInteres(String key, JList listParadas) {
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
		
		bd_principal = new BD_Principal();

		
		DefaultListModel<String> model = new DefaultListModel<String>();
		
		if (listParadas.getModel().getSize() > 0) {
			model = (DefaultListModel<String>) listParadas.getModel();
			vincular.listIncluidos.setModel(model);
		} else {
			Parada[] arrPar = null;
			try {
				arrPar = bd_principal.getParadas();
				
				for(int i = 0; i < arrPar.length;i++){
					model.addElement(arrPar[i].getNombreParada());
				}
				vincular.listExcluidos.setModel(model);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
		

		// vincular.listIncluidos.setModel(listParadas.getModel());

		vincular.btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO
				Object[] select = vincular.listIncluidos.getSelectedValues();
				
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
		
		/*
		 if(tipo.equals("linea")){
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
		}*/
		
		vincular.btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO
				PuntoInteres punto = null;
				punto = bd_principal.getPtoInteres(key);
				
				Parada parada = null;
				
				if(vincular.listExcluidos.getModel().getSize()>0)
				modelExcluidos = (DefaultListModel<String>) vincular.listExcluidos.getModel();
				else
					modelExcluidos = new DefaultListModel<String>();
				if(vincular.listIncluidos.getModel().getSize()>0)
				modelIncluidos = (DefaultListModel<String>) vincular.listIncluidos.getModel();
				else
					modelIncluidos = new DefaultListModel<String>();
				//modelParadas = new DefaultListModel<String>();
				
				int[] select = vincular.listExcluidos.getSelectedIndices();
				for(int i = 0; i < select.length;i++){
					//Sacamos de la lista de excluidos
					modelIncluidos.addElement(modelExcluidos.get(select[i]));
					
					//Obtenemos la parada
					parada = bd_principal.getParada(modelExcluidos.get(select[i]));
					
					//Añadimos en la base de datos
					bd_principal.vincularPntoInteres(punto.getID(),parada.getID());
					
				}
				for(int i = 0; i < select.length;i++){
					//Metemos en la lista de incluidos
					modelExcluidos.remove(select[i]);
				}
				vincular.listExcluidos.setModel(modelExcluidos);
				vincular.listIncluidos.setModel(modelIncluidos);
				
			}
		});
	}
}