package diagrama_de_clases;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
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
import javax.swing.table.DefaultTableModel;

import diagrama_de_base_de_datos.Linea;

public class Lineas extends JPanel {
	public Servicios servicios;
	public JTextField txtNombreLinea;
	public JTextField txtNumeroLinea;
	public InfoParada infoParada;
	public InfoPtoInteres infoPunto;
	public InfoEventos infoEvento;
	public JPanel panel;
	public JPanel panel_1;
	public JLabel lblLineas;
	public JList listLineas;
	public JList listEventos;
	public JPanel panel_2;
	public JLabel lblNewLabel;
	public JLabel lblInfoLineas;
	public JLabel lblNombreDeLinea;
	public JLabel lblHorario;
	public JTextArea textAreaHorario;
	public JLabel lblRecorrido;
	public JPanel panel_3;
	public JLabel lblParadas;
	public JList listParadas;
	public JButton btnConsultarParada;
	public JPanel panel_4;
	public JPanel panel_5;
	public JPanel panel_6;
	public JLabel lblPtosInteres;
	public JList listPtosInteres;
	public JList list_3;
	public JButton btnConsultarPunto;
	public JButton btnConsultarEvento;
	public JLabel lblEventos;
	public SpringLayout springLayout;
	public SpringLayout sl_panel_6;
	public SpringLayout sl_panel_1;
	public SpringLayout sl_panel_3;
	public SpringLayout sl_panel_4;
	public SpringLayout sl_panel_5;
	public SpringLayout sl_panel;
	public JButton btnEliminarLinea;
	public JButton btnIncluirLinea;
	public JButton btnVincularParada;
	public JTextField txtRecorrido;
	public JFrame jFrame;
	public String tiempoPaso;
	public JTextField txtTarifa;
	public JTextField txtFrecuencia;
	public vincularParadas vincularParadas;
	
	public BD_Principal bd_principal;
	public IAdministrador bd;
	
	
	public Lineas(){
		bd_principal = new BD_Principal();
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
        
        //Deberiamos pasarlo a un metodo
		servicios = new Servicios();
		servicios.btnLineas.setEnabled(false);
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

		panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 6,
				SpringLayout.SOUTH, servicios);
		springLayout.putConstraint(SpringLayout.WEST, panel, 0,
				SpringLayout.WEST, servicios);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 450,
				SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel, 187,
				SpringLayout.WEST, this);
		add(panel);
		sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);

		add(servicios);

		panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 6,
				SpringLayout.SOUTH, servicios);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 6,
				SpringLayout.EAST, panel);

		lblLineas = new JLabel("Lineas");
		lblLineas.setHorizontalAlignment(SwingConstants.CENTER);
		lblLineas.setFont(new Font("Tahoma", Font.BOLD, 18));
		sl_panel.putConstraint(SpringLayout.NORTH, lblLineas, 10,
				SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblLineas, 10,
				SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblLineas, 47,
				SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblLineas, 167,
				SpringLayout.WEST, panel);
		panel.add(lblLineas);

		listLineas = new JList<String>();
		listLineas.setModel(new DefaultListModel());
		listLineas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String numero = "";
				DefaultListModel<String> model = new DefaultListModel<>();
				Object[] select = listLineas.getSelectedValues();
				
					// Preparamos la consulta
					//TODO
					try {
						if (!select[0].equals("Nueva linea")) {
							// Obtenemos la linea elegida
							Linea linea = bd_principal.getLinea(select[0].toString());
								txtNombreLinea.setText(linea.getNombreLinea());
								txtNumeroLinea.setText(linea.getNumeroLinea());
								textAreaHorario.setText(linea.getHorario());
								txtRecorrido.setText(linea.getRecorrido());
								//txtFrecuencia.setText(linea.);
								txtTarifa.setText(linea.getTarifaLinea().toString());
								
								btnEliminarLinea.setEnabled(true);
								btnConsultarEvento.setEnabled(true);
								btnConsultarParada.setEnabled(true);
								btnConsultarPunto.setEnabled(true);
								btnVincularParada.setEnabled(true);
								btnIncluirLinea.setEnabled(false);
/*
							// Obtenemos las paradas asociadas a esa linea
							s = conexion.createStatement();
							rs = s.executeQuery("select * from ilineas_iparadas where ilineasnumerolinea = "
									+ numero + " order by id");
							while (rs.next()) {
								model.addElement(rs.getString(2));
							}
							listParadas.setModel(model);*/
						} else {
							textAreaHorario.setText("");
							txtNombreLinea.setText("Nombre Linea");
							txtNumeroLinea.setText("Numero Linea");
							txtRecorrido.setText("Recorrido");
							txtTarifa.setText("Tarifa");
							txtFrecuencia.setText("Frecuencia");
							
							btnEliminarLinea.setEnabled(false);
							btnConsultarEvento.setEnabled(false);
							btnConsultarParada.setEnabled(false);
							btnConsultarPunto.setEnabled(false);
							btnVincularParada.setEnabled(false);
							btnIncluirLinea.setEnabled(true);
						}
					} catch (Exception e) {
						
						e.printStackTrace();
					}

			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, listLineas, 6,
				SpringLayout.SOUTH, lblLineas);
		sl_panel.putConstraint(SpringLayout.WEST, listLineas, 10,
				SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, listLineas, -44,
				SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, listLineas, -10,
				SpringLayout.EAST, panel);

		DefaultListModel<String> model = new DefaultListModel<>();
		Linea[] lineas = bd_principal.getLineas();
		for(int i = 0; i < lineas.length;i++){
			model.addElement(lineas[i].getNombreLinea());
		}
		listLineas.setModel(model);
		
		servicios.btnFiltrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tipo = "";
				if (servicios.rdbtnBarrio.isSelected()) {
					tipo = "barrio";
				} else {
					tipo = "direccion";
				}
				filtrar(tipo, servicios.txtText.getText());
			}
		});


		panel.add(listLineas);

		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 0,
				SpringLayout.SOUTH, this);
		add(panel_1);
		sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);

		panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 6,
				SpringLayout.SOUTH, servicios);
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 485,
				SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, 0,
				SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel_1, -6,
				SpringLayout.WEST, panel_2);

		lblNewLabel = new JLabel("Numero de Linea");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel, 57,
				SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel, 10,
				SpringLayout.WEST, panel_1);
		panel_1.add(lblNewLabel);

		lblInfoLineas = new JLabel("Info Lineas");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblInfoLineas, 10,
				SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblInfoLineas, -6,
				SpringLayout.NORTH, lblNewLabel);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblInfoLineas, -87,
				SpringLayout.EAST, panel_1);
		panel_1.add(lblInfoLineas);
		lblInfoLineas.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfoLineas.setFont(new Font("Tahoma", Font.BOLD, 18));

		txtNombreLinea = new JTextField();
		txtNombreLinea.setEditable(false);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtNombreLinea, 0,
				SpringLayout.WEST, lblNewLabel);
		txtNombreLinea.setText("Nombre Linea");
		panel_1.add(txtNombreLinea);
		txtNombreLinea.setColumns(10);

		lblNombreDeLinea = new JLabel("Nombre de Linea");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNombreDeLinea, 41,
				SpringLayout.SOUTH, lblNewLabel);
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtNombreLinea, 6,
				SpringLayout.SOUTH, lblNombreDeLinea);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNombreDeLinea, 0,
				SpringLayout.WEST, lblNewLabel);
		panel_1.add(lblNombreDeLinea);

		txtNumeroLinea = new JTextField();
		txtNumeroLinea.setEditable(false);
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtNumeroLinea, 6,
				SpringLayout.SOUTH, lblNewLabel);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtNumeroLinea, 0,
				SpringLayout.WEST, lblNewLabel);
		txtNumeroLinea.setText("Numero Linea");
		txtNumeroLinea.setColumns(10);
		panel_1.add(txtNumeroLinea);

		lblHorario = new JLabel("Horario");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblHorario, 0,
				SpringLayout.NORTH, lblNewLabel);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblHorario, 51,
				SpringLayout.EAST, lblNewLabel);
		panel_1.add(lblHorario);

		textAreaHorario = new JTextArea();
		textAreaHorario.setText("Horario");
		sl_panel_1.putConstraint(SpringLayout.NORTH, textAreaHorario, 4,
				SpringLayout.SOUTH, lblHorario);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtNombreLinea, -6,
				SpringLayout.WEST, textAreaHorario);
		textAreaHorario.setEditable(false);
		sl_panel_1.putConstraint(SpringLayout.WEST, textAreaHorario, 42,
				SpringLayout.EAST, txtNumeroLinea);
		sl_panel_1.putConstraint(SpringLayout.EAST, textAreaHorario, 6,
				SpringLayout.EAST, panel_1);
		panel_1.add(textAreaHorario);

		lblRecorrido = new JLabel("Recorrido");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblRecorrido, 18,
				SpringLayout.SOUTH, txtNombreLinea);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblRecorrido, 0,
				SpringLayout.WEST, lblNewLabel);
		panel_1.add(lblRecorrido);

		txtRecorrido = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.SOUTH, textAreaHorario, -25,
				SpringLayout.NORTH, txtRecorrido);
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtRecorrido, 6,
				SpringLayout.SOUTH, lblRecorrido);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtRecorrido, 10,
				SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtRecorrido, -10,
				SpringLayout.EAST, panel_1);
		txtRecorrido.setEditable(false);
		txtRecorrido.setText("Recorrido");
		txtRecorrido.setColumns(10);
		panel_1.add(txtRecorrido);

		JLabel lblTarifa = new JLabel("Tarifa");
		sl_panel_1.putConstraint(SpringLayout.SOUTH, txtRecorrido, -19,
				SpringLayout.NORTH, lblTarifa);
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblTarifa, 45,
				SpringLayout.SOUTH, lblRecorrido);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblTarifa, 0,
				SpringLayout.WEST, lblNewLabel);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblTarifa, 65,
				SpringLayout.SOUTH, lblRecorrido);
		panel_1.add(lblTarifa);

		txtTarifa = new JTextField();
		txtTarifa.setEditable(false);
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtTarifa, 6,
				SpringLayout.SOUTH, lblTarifa);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtTarifa, 0,
				SpringLayout.WEST, lblNewLabel);
		txtTarifa.setText("1.05");
		panel_1.add(txtTarifa);
		txtTarifa.setColumns(10);

		JLabel lblFrecuenciaDePaso = new JLabel("Frecuencia de paso");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblFrecuenciaDePaso, 18,
				SpringLayout.SOUTH, txtTarifa);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblFrecuenciaDePaso, 0,
				SpringLayout.WEST, lblNewLabel);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblFrecuenciaDePaso, -29,
				SpringLayout.EAST, txtNombreLinea);
		panel_1.add(lblFrecuenciaDePaso);

		txtFrecuencia = new JTextField();
		txtFrecuencia.setEditable(false);
		txtFrecuencia.setText("Frecuencia");
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtFrecuencia, 6,
				SpringLayout.SOUTH, lblFrecuenciaDePaso);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtFrecuencia, 0,
				SpringLayout.WEST, lblNewLabel);
		panel_1.add(txtFrecuencia);
		txtFrecuencia.setColumns(10);
		springLayout.putConstraint(SpringLayout.EAST, panel_2, -1,
				SpringLayout.EAST, this);
		add(panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));

		panel_3 = new JPanel();
		panel_2.add(panel_3);
		sl_panel_3 = new SpringLayout();
		panel_3.setLayout(sl_panel_3);

		lblParadas = new JLabel("Paradas");
		sl_panel_3.putConstraint(SpringLayout.WEST, lblParadas, 52,
				SpringLayout.WEST, panel_3);
		lblParadas.setHorizontalAlignment(SwingConstants.CENTER);
		lblParadas.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_3.add(lblParadas);

		listParadas = new JList();
		listParadas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		sl_panel_3.putConstraint(SpringLayout.SOUTH, lblParadas, -6,
				SpringLayout.NORTH, listParadas);
		sl_panel_3.putConstraint(SpringLayout.NORTH, listParadas, 38,
				SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.WEST, listParadas, 10,
				SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, listParadas, 209,
				SpringLayout.WEST, panel_3);
		panel_3.add(listParadas);

		btnConsultarParada = new JButton("Consultar Parada");
		btnVincularParada = new JButton("Vincular Paradas");

		sl_panel_3.putConstraint(SpringLayout.WEST, btnConsultarParada, 10,
				SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, listParadas, -6,
				SpringLayout.NORTH, btnConsultarParada);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, btnConsultarParada, -10,
				SpringLayout.SOUTH, panel_3);
		panel_3.add(btnConsultarParada);

		panel_4 = new JPanel();
		panel_2.add(panel_4);
		sl_panel_4 = new SpringLayout();
		panel_4.setLayout(sl_panel_4);

		panel_5 = new JPanel();
		sl_panel_4.putConstraint(SpringLayout.NORTH, panel_5, 0,
				SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.WEST, panel_5, 0,
				SpringLayout.WEST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, panel_5, 175,
				SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, panel_5, 219,
				SpringLayout.WEST, panel_4);
		panel_4.add(panel_5);

		panel_6 = new JPanel();
		sl_panel_4.putConstraint(SpringLayout.NORTH, panel_6, 6,
				SpringLayout.SOUTH, panel_5);
		sl_panel_4.putConstraint(SpringLayout.WEST, panel_6, 0,
				SpringLayout.WEST, panel_4);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, panel_6, -10,
				SpringLayout.SOUTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, panel_6, 0,
				SpringLayout.EAST, panel_5);
		sl_panel_5 = new SpringLayout();
		panel_5.setLayout(sl_panel_5);

		lblPtosInteres = new JLabel("Ptos Interes");
		sl_panel_5.putConstraint(SpringLayout.NORTH, lblPtosInteres, 5,
				SpringLayout.NORTH, panel_5);
		sl_panel_5.putConstraint(SpringLayout.WEST, lblPtosInteres, 54,
				SpringLayout.WEST, panel_5);
		lblPtosInteres.setHorizontalAlignment(SwingConstants.CENTER);
		lblPtosInteres.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_5.add(lblPtosInteres);

		listPtosInteres = new JList();
		sl_panel_5.putConstraint(SpringLayout.NORTH, listPtosInteres, 6,
				SpringLayout.SOUTH, lblPtosInteres);
		sl_panel_5.putConstraint(SpringLayout.WEST, listPtosInteres, 10,
				SpringLayout.WEST, panel_5);
		sl_panel_5.putConstraint(SpringLayout.EAST, listPtosInteres, 209,
				SpringLayout.WEST, panel_5);
		panel_5.add(listPtosInteres);
		btnConsultarPunto = new JButton("Consultar Pto Interes");

		sl_panel_5.putConstraint(SpringLayout.SOUTH, listPtosInteres, -10,
				SpringLayout.NORTH, btnConsultarPunto);
		sl_panel_5.putConstraint(SpringLayout.WEST, btnConsultarPunto, 0,
				SpringLayout.WEST, panel_5);
		sl_panel_5.putConstraint(SpringLayout.SOUTH, btnConsultarPunto, 0,
				SpringLayout.SOUTH, panel_5);
		panel_5.add(btnConsultarPunto);
		panel_4.add(panel_6);
		sl_panel_6 = new SpringLayout();
		panel_6.setLayout(sl_panel_6);

		lblEventos = new JLabel("Eventos");
		sl_panel_6.putConstraint(SpringLayout.NORTH, lblEventos, 10,
				SpringLayout.NORTH, panel_6);
		sl_panel_6.putConstraint(SpringLayout.EAST, lblEventos, -53,
				SpringLayout.EAST, panel_6);
		lblEventos.setHorizontalAlignment(SwingConstants.CENTER);
		lblEventos.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_6.add(lblEventos);

		btnConsultarEvento = new JButton("Consultar Evento");
		sl_panel_6.putConstraint(SpringLayout.WEST, btnConsultarEvento, 0,
				SpringLayout.WEST, panel_6);
		sl_panel_6.putConstraint(SpringLayout.SOUTH, btnConsultarEvento, 0,
				SpringLayout.SOUTH, panel_6);
		panel_6.add(btnConsultarEvento);

		list_3 = new JList();
		panel_3.add(list_3);
		sl_panel_6.putConstraint(SpringLayout.NORTH, list_3, 7,
				SpringLayout.SOUTH, lblEventos);
		sl_panel_6.putConstraint(SpringLayout.WEST, list_3, 10,
				SpringLayout.WEST, panel_6);
		sl_panel_6.putConstraint(SpringLayout.EAST, list_3, 209,
				SpringLayout.WEST, panel_6);
		sl_panel_6.putConstraint(SpringLayout.SOUTH, list_3, -6,
				SpringLayout.NORTH, btnConsultarEvento);

		listEventos = new JList();
		sl_panel_6.putConstraint(SpringLayout.NORTH, listEventos, 13,
				SpringLayout.SOUTH, lblEventos);
		sl_panel_6.putConstraint(SpringLayout.WEST, listEventos, 10,
				SpringLayout.WEST, panel_6);
		sl_panel_6.putConstraint(SpringLayout.SOUTH, listEventos, -24,
				SpringLayout.NORTH, btnConsultarEvento);
		sl_panel_6.putConstraint(SpringLayout.EAST, listEventos, 209,
				SpringLayout.WEST, panel_6);
		panel_6.add(listEventos);
		// ActionListeners

		btnConsultarParada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object[] select = listParadas.getSelectedValues();
				if (select.length < 1) {
					JOptionPane.showMessageDialog(null,
							"No ha seleccionado ninguna parada", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					infoParada = new InfoParada(select[0], tiempoPaso,
							txtNumeroLinea.getText());
					jFrame = new JFrame();
					jFrame.setTitle("Informacion de parada");
					jFrame.setBounds(300, 300, 520, 305);
					jFrame.getContentPane().add(infoParada.contentPane);
					jFrame.setVisible(true);
					infoParada.btnAceptar
							.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									jFrame.dispose();
								}
							});
				}
			}
		});

		btnConsultarPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object[] select = listPtosInteres.getSelectedValues();
				if (select.length < 1) {
					JOptionPane.showMessageDialog(null,
							"No ha seleccionado ningun punto", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					infoPunto = new InfoPtoInteres(select[0]);
					jFrame = new JFrame();
					jFrame.setTitle("Informacion de punto");
					jFrame.setBounds(300, 300, 520, 305);
					jFrame.getContentPane().add(infoPunto.contentPane);
					jFrame.setVisible(true);
					infoPunto.btnAceptar
							.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									jFrame.dispose();
								}
							});
				}

			}
		});

		btnConsultarEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object[] select = listEventos.getSelectedValues();
				if (select.length < 1) {
					JOptionPane.showMessageDialog(null,
							"No ha seleccionado ningun evento", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					infoEvento = new InfoEventos(select[0]);
					jFrame = new JFrame();
					jFrame.setTitle("Informacion de evento");
					jFrame.setBounds(300, 300, 520, 305);
					jFrame.getContentPane().add(infoEvento.contentPane);
					jFrame.setVisible(true);
					infoEvento.btnAceptar
							.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									jFrame.dispose();
								}
							});
				}

			}
		});
	}

	public void consultarParada() {
		throw new UnsupportedOperationException();
	}

	public void consultarEvento() {
		throw new UnsupportedOperationException();
	}

	public void consultarPtoInteres() {
		throw new UnsupportedOperationException();
	}

	public void filtrar(String tipo, String filtro) {
		
	}

	public void lineasAdmin() {
		//TODO
		
				btnEliminarLinea = new JButton("Eliminar Linea");
				sl_panel.putConstraint(SpringLayout.WEST, btnEliminarLinea, 10,
						SpringLayout.WEST, panel);
				sl_panel.putConstraint(SpringLayout.SOUTH, btnEliminarLinea, -10,
						SpringLayout.SOUTH, panel);
				panel.add(btnEliminarLinea);
				btnEliminarLinea.setEnabled(false);

				btnEliminarLinea.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// TODO
						Object[] select = listLineas.getSelectedValues();
						try {
							bd.borrarLinea("0");
						} catch (RemoteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});

				panel_3.remove(btnConsultarParada);

				btnVincularParada = new JButton("Vincular Parada");
				btnVincularParada.setEnabled(false);

				sl_panel_3.putConstraint(SpringLayout.WEST, btnVincularParada, 10,
						SpringLayout.WEST, panel_3);
				sl_panel_3.putConstraint(SpringLayout.SOUTH, listParadas, -6,
						SpringLayout.NORTH, btnVincularParada);
				sl_panel_3.putConstraint(SpringLayout.SOUTH, btnVincularParada, -10,
						SpringLayout.SOUTH, panel_3);
				panel_3.add(btnVincularParada);

				btnIncluirLinea = new JButton("Incluir Linea");
				sl_panel_6.putConstraint(SpringLayout.WEST, btnIncluirLinea, 6,
						SpringLayout.EAST, btnConsultarEvento);
				sl_panel_6.putConstraint(SpringLayout.SOUTH, btnIncluirLinea, 0,
						SpringLayout.SOUTH, btnConsultarEvento);
				panel_6.add(btnIncluirLinea);

				textAreaHorario.setEditable(true);
				textAreaHorario.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent arg0) {
						if (textAreaHorario.getText().equals("Horario")) {
							textAreaHorario.setText("");
						}
					}

					@Override
					public void focusLost(FocusEvent arg0) {
						if (textAreaHorario.getText().equals("")) {
							textAreaHorario.setText("Horario");
						}
					}
				});

				txtNombreLinea.setEditable(true);
				txtNombreLinea.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent arg0) {
						if (txtNombreLinea.getText().equals("Nombre Linea")) {
							txtNombreLinea.setText("");
						}
					}

					@Override
					public void focusLost(FocusEvent arg0) {
						if (txtNombreLinea.getText().equals("")) {
							txtNombreLinea.setText("Nombre Linea");
						}
					}
				});

				txtNumeroLinea.setEditable(true);
				txtNumeroLinea.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent arg0) {
						if (txtNumeroLinea.getText().equals("Numero Linea")) {
							txtNumeroLinea.setText("");
						}
					}

					@Override
					public void focusLost(FocusEvent arg0) {
						if (txtNumeroLinea.getText().equals("")) {
							txtNumeroLinea.setText("Numero Linea");
						}
					}
				});

				txtRecorrido.setEditable(true);
				txtRecorrido.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent arg0) {
						if (txtRecorrido.getText().equals("Recorrido")) {
							txtRecorrido.setText("");
						}
					}

					@Override
					public void focusLost(FocusEvent arg0) {
						if (txtRecorrido.getText().equals("")) {
							txtRecorrido.setText("Recorrido");
						}
					}
				});

				txtTarifa.setEditable(true);
				txtTarifa.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent arg0) {
						if (txtTarifa.getText().equals("1.05")) {
							txtTarifa.setText("");
						}
					}

					@Override
					public void focusLost(FocusEvent arg0) {
						if (txtTarifa.getText().equals("")) {
							txtTarifa.setText("1.05");
						}
					}
				});

				txtFrecuencia.setEditable(true);
				txtFrecuencia.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent arg0) {
						if (txtFrecuencia.getText().equals("Frecuencia")) {
							txtFrecuencia.setText("");
						}
					}

					@Override
					public void focusLost(FocusEvent arg0) {
						if (txtFrecuencia.getText().equals("")) {
							txtFrecuencia.setText("Frecuencia");
						}
					}
				});

				// Obtenemos la lista de lineas que hay, a�adimos nueva linea y volcamos
				// de nuevo
				
				DefaultListModel<String> model = (DefaultListModel<String>) listLineas.getModel();
				model.addElement("Nueva linea");
				listLineas.setModel(model);

				// Cuando pulsamos el boton agregar linea, comprobamos si hemos dejado
				// algo sin completar
				btnIncluirLinea.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						ArrayList<String> datos = new ArrayList<String>();
						if (txtNumeroLinea.getText().equals("Numero Linea")) {
							JOptionPane.showMessageDialog(null,
									"Introduzca el numero de la linea", "Error",
									JOptionPane.ERROR_MESSAGE);
						} else if (txtNombreLinea.getText().equals("Nombre Linea")) {
							JOptionPane.showMessageDialog(null,
									"Introduzca el nombre de la linea", "Error",
									JOptionPane.ERROR_MESSAGE);
						} else if (txtRecorrido.getText().equals("Recorrido")) {
							JOptionPane.showMessageDialog(null,
									"Introduzca un recorrido para la linea", "Error",
									JOptionPane.ERROR_MESSAGE);
						} else if (txtTarifa.getText().equals("Tarifa")) {
							JOptionPane.showMessageDialog(null,
									"Introduzca la tarifa de la linea", "Error",
									JOptionPane.ERROR_MESSAGE);
						} else if (txtFrecuencia.getText().equals("Frecuencia")) {
							JOptionPane.showMessageDialog(null,
									"Introduzca la frecuencia de paso de la linea",
									"Error", JOptionPane.ERROR_MESSAGE);
						} else {
							DefaultListModel<String> model = new DefaultListModel<String>();
							datos.add(txtNumeroLinea.getText());
							datos.add(txtNombreLinea.getText());
							datos.add(textAreaHorario.getText());
							datos.add(txtRecorrido.getText());
							datos.add(txtTarifa.getText());
							datos.add(txtFrecuencia.getText());
							
							try {
								int frec = Integer.parseInt(txtFrecuencia.getText());
								double tar = Double.parseDouble(txtTarifa.getText());
								bd_principal.incluirLinea(datos);
								if (bd.incluirLinea(datos)) {
									model = (DefaultListModel<String>) listLineas.getModel();
									model.removeElement("Nueva linea");
									model.addElement(txtNombreLinea.getText());
									model.addElement("Nueva linea");
									listLineas.setModel(model);
								}
							} catch (Exception e) {
								JOptionPane.showMessageDialog(null,
										"Frecuencia y tarifa deben ser valores numericos",
										"Error", JOptionPane.ERROR_MESSAGE);
								//e.printStackTrace();
							}
						}
					}
				});
				listLineas.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) {
						String numero = "";
						DefaultListModel<String> model = new DefaultListModel<>();
						Object[] select = listLineas.getSelectedValues();
						
						
					}
				});
		
	}
	
	public void obtener_lineas(){
		Object[] fila = new Object[5];
		Linea[] lineas = null;
		try {
			lineas = bd.getLineas();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (lineas!=null){
			for (int i=0;i<lineas.length;i++){}
		}
		 
        
	}
}