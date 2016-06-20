package diagrama_de_clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

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

import diagrama_de_base_de_datos.Evento;
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
	public IAdministrador bd;
	public Parada[] paradas;
	
	public vincularPtosInteres(String key, JList listParadas) {
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
			//Lista incluidos
			DefaultListModel<String> modelIncluidos = (DefaultListModel<String>) listParadas.getModel();
			vincular.listIncluidos.setModel(modelIncluidos);
			//Lista excluidos
			paradas = bd_principal.getParadas();
			DefaultListModel<String> modelExcluidos = new DefaultListModel<>();
			for(int i = 0; i < paradas.length;i++){
				if(!modelIncluidos.contains(paradas[i].getNombreParada())){
					modelExcluidos.addElement(paradas[i].getNombreParada());
				}
			}
			vincular.listExcluidos.setModel(modelExcluidos);
		} else {
			
			try {
				paradas = bd_principal.getParadas();
				
				for(int i = 0; i < paradas.length;i++){
					model.addElement(paradas[i].getNombreParada());
				}
				vincular.listExcluidos.setModel(model);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
		

		// vincular.listIncluidos.setModel(listParadas.getModel());

		

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
		
		vincular.btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO
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
					//TODO
					//bd_principal.vincularPntoInteres(punto.getID(),parada.getID());
					
				}
				for(int i = 0; i < modelIncluidos.getSize();i++){
					//Metemos en la lista de incluidos
					modelExcluidos.removeElement(modelIncluidos.getElementAt(i));
				}
				vincular.listExcluidos.setModel(modelExcluidos);
				vincular.listIncluidos.setModel(modelIncluidos);
				
			}
		});
		
		vincular.btnVolver.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> arrIn =new ArrayList<String>();
				ArrayList<String> arrEx = new ArrayList<String>();
				if(modelIncluidos != null){
					for (int i = 0; i < modelIncluidos.size(); i++) {
						arrIn.add(modelIncluidos.get(i));
					}
				}
				
				if(modelExcluidos != null){
					for (int i = 0; i < modelExcluidos.size(); i++) {
						arrEx.add(modelExcluidos.get(i));
					}
				}
				
				bd_principal.vincularPtosInteres(arrIn, arrEx,key);
			}
		});
	}
}