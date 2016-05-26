package diagrama_de_clases;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

import org.apache.log4j.Layout;

public class UsuarioInvitado extends JFrame {
	public JPanel contentPane;
	public CabeceraInvitado cabeceraInvitado;
	public CabeceraUsuario cabeceraUsuario;
	public Descargas descarga;
	public PagoServicios pagoservicios;
	public String tipoCabecera;
	public SpringLayout layout;
	public JPanel panel;
	public JPanel panel_1;
	public JPanel cabecera;
	public InfoParada infoParada;
	public Lineas lineas;
	public InfoPtoInteres infoPunto;
	public InfoEventos infoEvento;
	//public PanelDescarga panelDescarga;
	//public CalcularRuta calcularRuta;
	//public Historial consultaHistorial;
	public SolucionConsulta solucion;
	public Paradas paradas;
	public CabeceraAdministrador cabeceraAdministrador;
	public Registrarse registrarse;
	public ParadasAdmin paradasAdmin;
	public LineasAdmin lineasAdmin;
	public JFrame jFrame;
	public PtosInteresAdmin ptosInteres;
	public EventosAdmin eventosAdmin;
	public String usuario;
	public String password;
	public boolean recordar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsuarioInvitado frame = new UsuarioInvitado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public UsuarioInvitado() {
		recordar = false;
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel_1 = new JPanel();

		setBounds(200, 75, 950, 650);
		setTitle("Surbus APP");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		layout = new SpringLayout();
		cabeceraInvitado();
		// cabeceraAdministrador();
	}
	
	public void cabeceraInvitado() {

		contentPane.removeAll();
		cabeceraInvitado = new CabeceraInvitado();
		// Calcular Ruta
		/*cabeceraInvitado.cabeceraComun.btnCalcularRuta
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panelCalcularRuta();
					}
				});*/
		// Servicios
		/*cabeceraInvitado.cabeceraComun.btnServicios
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						panelLineas();
					}
				});*/
		// Descargas
		/*cabeceraInvitado.cabeceraComun.btnDescargas
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						panelDescarga();
					}
				});*/
		// Identificarse
		/*cabeceraInvitado.btnIdentificarse
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						usuario = cabeceraInvitado.txtUsuario.getText();
						password = cabeceraInvitado.passwordField.getText();
						if (cabeceraInvitado.checkRecordarme.isSelected()) {
							recordar = true;
						}
						
					}
				});*/
		// Añadir al panel
		layout.putConstraint(SpringLayout.NORTH, cabeceraInvitado, 0,
				SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.WEST, cabeceraInvitado, 0,
				SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.SOUTH, cabeceraInvitado, 100,
				SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.EAST, cabeceraInvitado, 925,
				SpringLayout.WEST, contentPane);
		contentPane.add(cabeceraInvitado);

		contentPane.setLayout(layout);

		// Por defecto se abre el panel de lineas
		panelLineas();
		cabeceraInvitado.cabeceraComun.btnServicios.setEnabled(false);
		// Se coloca en el JFrame
		layout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.SOUTH,
				cabeceraInvitado);
		layout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST,
				contentPane);
		layout.putConstraint(SpringLayout.SOUTH, panel, 495,
				SpringLayout.SOUTH, cabeceraInvitado);
		layout.putConstraint(SpringLayout.EAST, panel, 0, SpringLayout.EAST,
				cabeceraInvitado);
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		contentPane.repaint();
		contentPane.updateUI();
		repaint();

	}
	
	public void panelLineas() {
		panel.removeAll();
		lineas = new Lineas();
		panel.add(lineas);
		lineas.servicios.btnParadas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelParadas();
			}
		});
		panel.repaint();
		panel.updateUI();
		repaint();
	}
	
	/*public void panelCalcularRuta() {
		panel.removeAll();

		calcularRuta = new CalcularRuta();

		calcularRuta.btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					panelSolucion();	
				
			}
		});
		panel.add(calcularRuta);

		panel.repaint();
		panel.updateUI();
		repaint();
	}*/

	/*public void panelCalcularRutaUsuario() {
		// TODO borrar
		usuario = "admin";
		panelCalcularRuta();
		calcularRuta.usuario();
		calcularRuta.btnConsultarHistorial
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						consultaHistorial = new Historial(usuario);
						jFrame = new JFrame();
						jFrame.setTitle("Historial de consultas");
						jFrame.setBounds(300, 300, 520, 305);
						jFrame.getContentPane().add(
								consultaHistorial.contentPane);
						jFrame.setVisible(true);
						consultaHistorial.btnCancelar
								.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent arg0) {
										jFrame.dispose();
									}
								});
						consultaHistorial.btnConsultar
								.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent arg0) {
										String origen = consultaHistorial.txtOrigen
												.getText();
										calcularRuta.txtOrigen.setText(origen);
										String destino = consultaHistorial.txtDestino
												.getText();
										calcularRuta.txtDestino
												.setText(destino);
										jFrame.dispose();
										calcularRuta.btnConsultar.doClick();
										panelSolucion();
									}
								});
					}
				});
	}*/

	/*public void panelDescarga() {
		panel.removeAll();
		descarga = new Descarga();
		panel.add(descarga);

		panel.repaint();
		panel.updateUI();
		repaint();
	}*/

	/*public void panelDescargasAdmin() {
		panel.removeAll();
		descarga = new Descarga();
		descarga.descargasAdmin();
		panel.add(descarga);
		panel.repaint();
		panel.updateUI();
		repaint();

	}*/

	/*public void panelPagoServicios() {
		panel.removeAll();

		panel.add(new PagoServicios());

		panel.repaint();
		panel.updateUI();
		repaint();
	}*/

	public void panelParadas() {
		panel.removeAll();

		paradas = new Paradas();
		panel.add(paradas);
		paradas.servicios.btnParadas.setEnabled(false);
		lineas.servicios.btnLineas.setEnabled(true);
		paradas.servicios.btnLineas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelLineas();
			}
		});

		panel.repaint();
		panel.updateUI();
		repaint();
	}

	/*public void panelLineasAdmin() {
		panel.removeAll();

		lineasAdmin = new LineasAdmin();
		panel.add(lineasAdmin);
		lineasAdmin.lineas.servicios.btnPtosInteres
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						panelPtosInteres();
					}
				});
		lineasAdmin.lineas.servicios.btnParadas
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						panelParadasAdmin();
					}
				});
		lineasAdmin.lineas.servicios.btnEventos
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						panelEventos();
					}
				});

		panel.repaint();
		panel.updateUI();
		repaint();
	}*/

	/*public void panelParadasAdmin() {
		panel.removeAll();

		paradasAdmin = new ParadasAdmin();
		panel.add(paradasAdmin);

		paradasAdmin.paradas.servicios.btnLineas
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						panelLineasAdmin();
					}
				});
		paradasAdmin.paradas.servicios.btnPtosInteres
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						panelPtosInteres();
					}
				});
		paradasAdmin.paradas.servicios.btnEventos
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						panelEventos();
					}
				});

		panel.repaint();
		panel.updateUI();
		repaint();
	}*/
/*
	public void panelPtosInteres() {
		panel.removeAll();

		ptosInteres = new PtosInteresAdmin();
		panel.add(ptosInteres);

		ptosInteres.servicios.btnLineas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelLineasAdmin();
			}
		});
		ptosInteres.btnVincularParadas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ptosInteres.vincularParadas = new VincularParadas("punto",ptosInteres.txtNombre.getText(),
						ptosInteres.listParadas);
				jFrame = new JFrame();
				jFrame.setTitle("Vincular Paradas");
				jFrame.setBounds(300, 300, 520, 305);
				jFrame.getContentPane().add(ptosInteres.vincularParadas.contentPane);
				jFrame.setVisible(true);
				ptosInteres.vincularParadas.vincular.btnVolver
						.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								ptosInteres.listParadas
										.setModel(ptosInteres.vincularParadas.vincular.listIncluidos
												.getModel());
								if(ptosInteres.listParadas.getModel().getSize()>0){
									ptosInteres.txtParadaCercana.setText(""+ptosInteres.listParadas.getModel().getElementAt(0));
								}
								jFrame.dispose();
							}
						});
				ptosInteres.vincularParadas.btnCrearParada
						.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								panelParadasAdmin();
								jFrame.dispose();
							}
						});
			}

		});
		ptosInteres.servicios.btnParadas
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						panelParadasAdmin();
					}
				});
		ptosInteres.servicios.btnEventos
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						panelEventos();
					}
				});

		panel.repaint();
		panel.updateUI();
		repaint();
	}*/
/*
	public void panelEventos() {
		panel.removeAll();

		eventosAdmin = new EventosAdmin();
		panel.add(eventosAdmin);

		eventosAdmin.servicios.btnLineas
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						panelLineasAdmin();
					}
				});
		eventosAdmin.servicios.btnParadas
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						panelParadasAdmin();
					}
				});
		eventosAdmin.servicios.btnPtosInteres
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						panelPtosInteres();
					}
				});
		eventosAdmin.btnVincularParadas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				eventosAdmin.vincularParadas = new VincularParadas("evento",eventosAdmin.txtNombre.getText(),
						eventosAdmin.listParadas);
				jFrame = new JFrame();
				jFrame.setTitle("Vincular Paradas");
				jFrame.setBounds(300, 300, 520, 305);
				jFrame.getContentPane().add(eventosAdmin.vincularParadas.contentPane);
				jFrame.setVisible(true);
				eventosAdmin.vincularParadas.vincular.btnVolver
						.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								eventosAdmin.listParadas
										.setModel(eventosAdmin.vincularParadas.vincular.listIncluidos
												.getModel());
								if(eventosAdmin.listParadas.getModel().getSize()>0){
									eventosAdmin.txtParadaCercana.setText(""+eventosAdmin.listParadas.getModel().getElementAt(0));
								}
								jFrame.dispose();
							}
						});
				eventosAdmin.vincularParadas.btnCrearParada
						.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								panelParadasAdmin();
								jFrame.dispose();
							}
						});
			}

		});

		panel.repaint();
		panel.updateUI();
		repaint();
	}*/
/*
	public void panelSolucion() {
		if (calcularRuta.exito) {
			panel.removeAll();

			String usuario = "invitado";
			if (cabeceraUsuario != null) {
				usuario = cabeceraUsuario.getUsuario();
			}

			solucion = new Solucion(calcularRuta.lineas, calcularRuta.nOrigen,
					calcularRuta.nDestino, usuario, calcularRuta.hora,
					calcularRuta.txtConsulta.getText());
			solucion.btnVolver.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (Index.this.usuario == "admin")
						panelCalcularRutaUsuario();
					else
						panelCalcularRuta();
				}
			});
			panel.add(solucion);

			panel.repaint();
			panel.updateUI();
			repaint();
		}

	}*/

	/*
	public void cabeceraUsuario(String usuario) {
		contentPane.removeAll();
		cabeceraUsuario = new CabeceraUsuario(usuario);
		cabeceraUsuario.cabeceraComun.btnCalcularRuta
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panelCalcularRutaUsuario();
					}
				});

		cabeceraUsuario.cabeceraComun.btnServicios
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						panelLineas();
					}
				});

		cabeceraUsuario.cabeceraComun.btnServicios.setEnabled(false);
		cabeceraUsuario.cabeceraComun.btnDescargas
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						panelDescarga();
					}
				});

		cabeceraUsuario.btnPagoServicios
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						panelPagoServicios();
					}
				});

		cabeceraUsuario.btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cabeceraInvitado();
				if (recordar) {
					cabeceraInvitado.txtUsuario.setText(Index.this.usuario);
					cabeceraInvitado.passwordField.setText(password);
				}

			}
		});
		layout.putConstraint(SpringLayout.NORTH, cabeceraUsuario, 0,
				SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.WEST, cabeceraUsuario, 0,
				SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.SOUTH, cabeceraUsuario, 102,
				SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.EAST, cabeceraUsuario, 924,
				SpringLayout.WEST, contentPane);
		contentPane.add(cabeceraUsuario);

		contentPane.setLayout(layout);

		// Se coloca en el JFrame

		layout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.SOUTH,
				cabeceraUsuario);
		layout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST,
				contentPane);
		layout.putConstraint(SpringLayout.SOUTH, panel, 495,
				SpringLayout.SOUTH, cabeceraUsuario);
		layout.putConstraint(SpringLayout.EAST, panel, 0, SpringLayout.EAST,
				cabeceraUsuario);
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		panelLineas();

		contentPane.repaint();
		contentPane.updateUI();
		repaint();
	}
	*/
}