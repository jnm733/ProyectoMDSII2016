package diagrama_de_clases;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import org.orm.PersistentException;

import diagrama_de_base_de_datos.*;

public class EventosAdmin extends JPanel{
	public Servicios servicios;
	public InfoParada infoParada;
	public JPanel panel_2;
	public JPanel panel_4;
	public SpringLayout springLayout;
	public JButton btnBorrarParada;
	private JPanel panel;
	private JLabel lblEventos;
	private JLabel lblParadas;
	public JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtFechaInicio;
	private JTextField txtFechaFin;
	public JList listEventos;
	public JTextField txtParadaCercana;
	private JLabel lblParada;
	public JButton btnEliminarEvento;
	public JButton btnVincularParadas;
	public JList listParadas;
	public JFrame jFrame;
	public vincularParadas vincularParadas;
	public JButton btnEvento;
	public ArrayList<String> datos;
	public DefaultListModel<String> model;
	public BD_Eventos bd_eventos;
	
	public IAdministrador bd;

	/**
	 * Create the panel.
	 */
	public EventosAdmin() {
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
		bd_eventos = new BD_Eventos();
		servicios = new Servicios();
		servicios.panelAdmin();
		springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, servicios, 0,
				SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, servicios, 10,
				SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, servicios, 75,
				SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, servicios, -1,
				SpringLayout.EAST, this);
		setLayout(springLayout);

		add(servicios);

		panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 6,
				SpringLayout.SOUTH, servicios);
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 485,
				SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, 0,
				SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel_2, -1,
				SpringLayout.EAST, this);
		add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));

		panel_4 = new JPanel();
		panel_2.add(panel_4);
		SpringLayout sl_panel_4 = new SpringLayout();
		panel_4.setLayout(sl_panel_4);

		lblParadas = new JLabel("Paradas");
		sl_panel_4.putConstraint(SpringLayout.NORTH, lblParadas, 0,
				SpringLayout.NORTH, panel_4);
		lblParadas.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_4.add(lblParadas);

		listParadas = new JList();
		sl_panel_4.putConstraint(SpringLayout.WEST, lblParadas, 0,
				SpringLayout.WEST, listParadas);
		sl_panel_4.putConstraint(SpringLayout.NORTH, listParadas, 32,
				SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.WEST, listParadas, 23,
				SpringLayout.WEST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, listParadas, 281,
				SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, listParadas, 173,
				SpringLayout.WEST, panel_4);
		panel_4.add(listParadas);

		btnVincularParadas = new JButton("Vincular Paradas");
		btnVincularParadas.setEnabled(false);
		sl_panel_4.putConstraint(SpringLayout.WEST, btnVincularParadas, 0,
				SpringLayout.WEST, listParadas);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, btnVincularParadas, -10,
				SpringLayout.SOUTH, panel_4);
		panel_4.add(btnVincularParadas);

		btnEvento = new JButton("Incluir Evento");
		sl_panel_4.putConstraint(SpringLayout.SOUTH, btnEvento, 0,
				SpringLayout.SOUTH, btnVincularParadas);
		sl_panel_4.putConstraint(SpringLayout.EAST, btnEvento, -10,
				SpringLayout.EAST, panel_4);
		panel_4.add(btnEvento);

		panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 6,
				SpringLayout.SOUTH, servicios);
		springLayout.putConstraint(SpringLayout.WEST, panel, 10,
				SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 0,
				SpringLayout.SOUTH, panel_2);
		springLayout.putConstraint(SpringLayout.EAST, panel, -6,
				SpringLayout.WEST, panel_2);
		add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);

		lblEventos = new JLabel("Eventos");
		lblEventos.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblEventos);

		listEventos = new JList();
		sl_panel.putConstraint(SpringLayout.WEST, lblEventos, 0,
				SpringLayout.WEST, listEventos);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblEventos, -6,
				SpringLayout.NORTH, listEventos);
		sl_panel.putConstraint(SpringLayout.NORTH, listEventos, 35,
				SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, listEventos, 10,
				SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, listEventos, -309,
				SpringLayout.EAST, panel);
		panel.add(listEventos);
		
		//Cuando se inicia el panel, cargamos el modelo de la base de datos
		listEventos.setModel(new DefaultListModel());
		try {
			Evento[] arrEventos = bd_eventos.getEventos();
			DefaultListModel<String> model = new DefaultListModel<>();
			for(int i = 0; i < arrEventos.length;i++){
				model.addElement(arrEventos[i].getNombreEvento());
			}
			model.addElement("Nuevo evento");
			listEventos.setModel(model);
		} catch (PersistentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		btnEliminarEvento = new JButton("Eliminar Evento");
		
		//accion borrar evento
		
		btnEliminarEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
				Object[] select = listEventos.getSelectedValues();
				
			}
		});
		btnEliminarEvento.setEnabled(false);
		sl_panel.putConstraint(SpringLayout.SOUTH, listEventos, -6,
				SpringLayout.NORTH, btnEliminarEvento);
		sl_panel.putConstraint(SpringLayout.WEST, btnEliminarEvento, 10,
				SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnEliminarEvento, -10,
				SpringLayout.SOUTH, panel);
		panel.add(btnEliminarEvento);

		//Nombre
		
		JLabel lblNombre = new JLabel("Nombre");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNombre, 36,
				SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNombre, 36,
				SpringLayout.EAST, listEventos);
		panel.add(lblNombre);

		txtNombre = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, txtNombre, 36,
				SpringLayout.NORTH, panel);
		txtNombre.setText("Nombre");
		sl_panel.putConstraint(SpringLayout.WEST, txtNombre, 28,
				SpringLayout.EAST, lblNombre);
		panel.add(txtNombre);
		txtNombre.setColumns(10);

		//Direccion
		
		JLabel lblDireccion = new JLabel("Direccion");
		sl_panel.putConstraint(SpringLayout.NORTH, lblDireccion, 39,
				SpringLayout.SOUTH, lblNombre);
		sl_panel.putConstraint(SpringLayout.WEST, lblDireccion, 0,
				SpringLayout.WEST, lblNombre);
		panel.add(lblDireccion);

		txtDireccion = new JTextField();
		txtDireccion.setText("Direccion");
		sl_panel.putConstraint(SpringLayout.NORTH, txtDireccion, 0,
				SpringLayout.NORTH, lblDireccion);
		sl_panel.putConstraint(SpringLayout.WEST, txtDireccion, 0,
				SpringLayout.WEST, txtNombre);
		panel.add(txtDireccion);
		txtDireccion.setColumns(10);

		//Informacion
		
		JLabel lblNewLabel = new JLabel("Info Evento");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 0,
				SpringLayout.NORTH, lblEventos);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 82,
				SpringLayout.EAST, lblEventos);
		panel.add(lblNewLabel);

		//Fecha de inicio
		
		JLabel lblFechaInicio = new JLabel("Fecha Inicio");
		sl_panel.putConstraint(SpringLayout.WEST, lblFechaInicio, 0,
				SpringLayout.WEST, lblNombre);
		panel.add(lblFechaInicio);

		txtFechaInicio = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, txtFechaInicio, -3,
				SpringLayout.NORTH, lblFechaInicio);
		sl_panel.putConstraint(SpringLayout.EAST, txtFechaInicio, 0,
				SpringLayout.EAST, txtNombre);
		txtFechaInicio.setText("Fecha Inicio");
		panel.add(txtFechaInicio);
		txtFechaInicio.setColumns(10);

		//Fecha de fin
		
		JLabel lblFechaFin = new JLabel("Fecha Fin");
		sl_panel.putConstraint(SpringLayout.WEST, lblFechaFin, 0, SpringLayout.WEST, lblNombre);
		panel.add(lblFechaFin);

		txtFechaFin = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, lblFechaFin, 3, SpringLayout.NORTH, txtFechaFin);
		sl_panel.putConstraint(SpringLayout.NORTH, txtFechaFin, 21, SpringLayout.SOUTH, txtFechaInicio);
		sl_panel.putConstraint(SpringLayout.WEST, txtFechaFin, 0, SpringLayout.WEST, txtNombre);
		txtFechaFin.setText("Fecha Fin");
		panel.add(txtFechaFin);
		txtFechaFin.setColumns(10);

		//Parada mas cercana
		
		txtParadaCercana = new JTextField();
		sl_panel.putConstraint(SpringLayout.WEST, txtParadaCercana, 0,
				SpringLayout.WEST, txtNombre);
		txtParadaCercana.setText("Parada cercana");
		panel.add(txtParadaCercana);
		txtParadaCercana.setColumns(10);

		lblParada = new JLabel("Parada");
		sl_panel.putConstraint(SpringLayout.NORTH, lblFechaInicio, 40,
				SpringLayout.SOUTH, lblParada);
		sl_panel.putConstraint(SpringLayout.NORTH, txtParadaCercana, -3,
				SpringLayout.NORTH, lblParada);
		sl_panel.putConstraint(SpringLayout.NORTH, lblParada, 35,
				SpringLayout.SOUTH, lblDireccion);
		sl_panel.putConstraint(SpringLayout.WEST, lblParada, 0,
				SpringLayout.WEST, lblNombre);
		panel.add(lblParada);

		//Creo que no sirve
		//model = new DefaultListModel<>();
		
		
		txtNombre.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtNombre.getText().equals("Nombre")){
					txtNombre.setText("");
				}
			}
			public void focusLost(FocusEvent e) {
				if(txtNombre.getText().equals("")){
					txtNombre.setText("Nombre");
				}
			}
		});
		
		txtDireccion.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtDireccion.getText().equals("Direccion")){
					txtDireccion.setText("");
				}
			}
			public void focusLost(FocusEvent e) {
				if(txtDireccion.getText().equals("")){
					txtDireccion.setText("Direccion");
				}
			}
		});
		
		txtParadaCercana.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtParadaCercana.getText().equals("Parada cercana")){
					txtParadaCercana.setText("");
				}
			}
			public void focusLost(FocusEvent e) {
				if(txtParadaCercana.getText().equals("")){
					txtParadaCercana.setText("Parada cercana");
				}
			}
		});
		
		txtFechaInicio.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtFechaInicio.getText().equals("Fecha Inicio")){
					txtFechaInicio.setText("");
				}
			}
			public void focusLost(FocusEvent e) {
				if(txtFechaInicio.getText().equals("")){
					txtFechaInicio.setText("Fecha Inicio");
				}
			}
		});
		
		txtFechaFin.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtFechaFin.getText().equals("Fecha Fin")){
					txtFechaFin.setText("");
				}
			}
			public void focusLost(FocusEvent e) {
				if(txtFechaFin.getText().equals("")){
					txtFechaFin.setText("Fecha Fin");
				}
			}
		});
		
		
		//Accion incluir evento
		
		btnEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean ok = true;
				if(txtNombre.getText().equals("Nombre")){
					JOptionPane.showMessageDialog(null, "Introduzca el nombre del evento","Error",JOptionPane.ERROR_MESSAGE);
				}else if(txtDireccion.getText().equals("Direccion")){
					JOptionPane.showMessageDialog(null, "Introduzca la direccion del evento","Error",JOptionPane.ERROR_MESSAGE);
				}else if(txtParadaCercana.getText().equals("Parada cercana")){
					JOptionPane.showMessageDialog(null, "Introduzca una parada de referencia para el evento","Error",JOptionPane.ERROR_MESSAGE);
				}else if(txtFechaInicio.getText().equals("Fecha Inicio")){
					JOptionPane.showMessageDialog(null, "Introduzca una fecha de inicio para el evento. Formato dd/mm/aa","Error",JOptionPane.ERROR_MESSAGE);	
				}else if(txtFechaFin.getText().equals("Fecha Fin")){
					JOptionPane.showMessageDialog(null, "Introduzca una fecha de fin para el evento. Formato dd/mm/aa","Error",JOptionPane.ERROR_MESSAGE);
				}else{
					StringTokenizer tokenInicio = new StringTokenizer(txtFechaInicio.getText(), "/");
					if(tokenInicio.countTokens()!=3){
						ok = false;
						JOptionPane.showMessageDialog(null, "Formato inválido en fecha inicio. Formato dd/mm/aa","Error",JOptionPane.ERROR_MESSAGE);
					}else{
						while(tokenInicio.hasMoreTokens()){
							try{
								int aux = Integer.parseInt(tokenInicio.nextToken());
							}catch(Exception ee){
								ok = false;
								JOptionPane.showMessageDialog(null, "Formato inválido en fecha inicio. Formato dd/mm/aa","Error",JOptionPane.ERROR_MESSAGE);
							}
						}
					}
					StringTokenizer tokenFin = new StringTokenizer(txtFechaFin.getText(), "/");
					if(tokenFin.countTokens()!=3){
						ok = false;
						JOptionPane.showMessageDialog(null, "Formato inválido en fecha fin. Formato dd/mm/aa","Error",JOptionPane.ERROR_MESSAGE);
					}else{
						while(tokenFin.hasMoreTokens()){
							try{
								int aux = Integer.parseInt(tokenFin.nextToken());
							}catch(Exception ee){
								ok = false;
								JOptionPane.showMessageDialog(null, "Formato inválido en fecha fin. Formato dd/mm/aa","Error",JOptionPane.ERROR_MESSAGE);
							}
						}
					}
					if(ok){
						//TODO
						datos = new ArrayList<String>();
						datos.add(txtNombre.getText());
						datos.add(txtDireccion.getText());
						datos.add(txtParadaCercana.getText());
						datos.add(txtFechaInicio.getText());
						datos.add(txtFechaFin.getText());
						incluirEvento();

						model = (DefaultListModel<String>) listEventos.getModel();
						model.removeElement("Nuevo Evento");
						model.addElement(txtNombre.getText());
						model.addElement("Nuevo evento");
						listEventos.setModel(model);
					}
				}
			}
		});
		
		//Accion elegir un evento
		
		listEventos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				DefaultListModel<String> model = new DefaultListModel<>();
				Object[] select = listEventos.getSelectedValues();
				try {
					if(select[0].equals("Nuevo evento")){
						txtNombre.setText("Nombre");
						txtFechaFin.setText("Fecha de fin");
						txtFechaInicio.setText("Fecha inicio");
						txtDireccion.setText("Direccion");
						txtParadaCercana.setText("Parada Cercana");
					}else{
						Evento evento = consultarEvento(select[0].toString());
						txtNombre.setText(evento.getNombreEvento());
						txtFechaFin.setText(evento.getFechaFin().toString());
						txtFechaInicio.setText(evento.getFechaInicio().toString());
						txtDireccion.setText(evento.getDireccionEvento());
						//txtParadaCercana.setText("");
						//txtNombreParada.setText(parada.getNombreParada());
						//txtDireccion.setText(parada.getDireccionParada());
						//textArea.setText(parada.getObservaciones());
						
					}
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		/*btnVincularParadas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vincularParadas = new VincularParadas("evento",txtNombre.getText(),
						listParadas);
				jFrame = new JFrame();
				jFrame.setTitle("Vincular Paradas");
				jFrame.setBounds(300, 300, 520, 305);
				jFrame.getContentPane().add(vincularParadas.contentPane);
				jFrame.setVisible(true);
				vincularParadas.vincular.btnVolver
						.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								listParadas
										.setModel(vincularParadas.vincular.listIncluidos
												.getModel());
								if(listParadas.getModel().getSize()>0){
									txtParadaCercana.setText(""+listParadas.getModel().getElementAt(0));
								}
								jFrame.dispose();
							}
						});

				vincularParadas.btnCrearParada
						.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								Index index = new Index();
								index.cabeceraAdministrador();
								index.panelParadasAdmin();
								index.contentPane.repaint();
								index.contentPane.updateUI();
								index.repaint();

							}
						});
			}

		});*/
		// lineasAdmin();
		// servicios.btnLineas.setEnabled(false);
		// servicios.btnParadas.setEnabled(true);
	}
	
	public Evento consultarEvento(String aNombre) {
		Evento[] eventos;
		Evento evento = null;
		int id = 0;
		try {
			eventos = bd_eventos.getEventos();
			for(int i = 0; i < eventos.length;i++){
				if(eventos[i].getNombreEvento().equals(aNombre)){
					id = eventos[i].getID();
					break;
				}
			}
			evento = bd_eventos.getEvento(id);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return evento;
	}

	public void incluirEvento() {
		BD_Eventos evento = new BD_Eventos();
		try {
			evento.incluirEvento(datos);
			
			model = (DefaultListModel<String>) listEventos.getModel();
			model.removeElement("Nueva parada");
			model.addElement(txtNombre.getText());
			model.addElement("Nueva parada");
			listParadas.setModel(model);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void borrarEvento() {
		throw new UnsupportedOperationException();
	}
}