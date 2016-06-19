package diagrama_de_clases;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

public class UsuarioAdministrador extends JFrame{
	
	public JPanel contentPane;
	public CabeceraInvitado cabeceraInvitado;
	public CabeceraUsuario cabeceraUsuario;
	public Descargas descarga;
	public DescargasAdmin descargaAdmin;
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
					UsuarioAdministrador frame = new UsuarioAdministrador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public UsuarioAdministrador(){
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
		cabeceraAdministrador();
		
	}
	
	public void cabeceraAdministrador() {
		contentPane.removeAll();
		cabeceraAdministrador = new CabeceraAdministrador();
		
		layout.putConstraint(SpringLayout.NORTH, cabeceraAdministrador, 0,
				SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.WEST, cabeceraAdministrador, 0,
				SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.SOUTH, cabeceraAdministrador, 102,
				SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.EAST, cabeceraAdministrador, 924,
				SpringLayout.WEST, contentPane);
		contentPane.add(cabeceraAdministrador);

		contentPane.setLayout(layout);
		
		cabeceraAdministrador.cabeceraComun.btnCalcularRuta
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//TODO
						/*if (cabeceraAdministrador.btnVistaUsuario.isEnabled()) {
							panelCalcularRutaUsuario();
						} else {
							panelCalcularRuta();
						}*/
					}
				});
		cabeceraAdministrador.btnPagoDeServicios
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panelPagoServicios();
						cabeceraAdministrador.cabeceraComun.btnCalcularRuta
								.setEnabled(true);
						cabeceraAdministrador.cabeceraComun.btnServicios
								.setEnabled(true);
						cabeceraAdministrador.cabeceraComun.btnDescargas
								.setEnabled(true);
						cabeceraAdministrador.btnPagoDeServicios
								.setEnabled(false);
					}
				});

		cabeceraAdministrador.cabeceraComun.btnServicios
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if (cabeceraAdministrador.btnVistaUsuario.isEnabled()) {
							panelLineasAdmin();
						} else {
							panelLineas();
						}
					}
				});

		cabeceraAdministrador.cabeceraComun.btnServicios.setEnabled(false);
		cabeceraAdministrador.cabeceraComun.btnDescargas
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						//TODO
						if (cabeceraAdministrador.btnVistaUsuario.isEnabled()) {
							panelDescarga();
						} else {
							panelDescargasAdmin();
						}

					}
				});

		cabeceraAdministrador.btnVistaAdministrador.setEnabled(false);

		cabeceraAdministrador.btnVistaUsuario
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						cabeceraAdministrador.btnVistaAdministrador
								.setEnabled(true);
						cabeceraAdministrador.btnVistaUsuario.setEnabled(false);
						cabeceraAdministrador.cabeceraComun.btnServicios
								.setEnabled(false);
						cabeceraAdministrador.cabeceraComun.btnCalcularRuta
								.setEnabled(true);
						cabeceraAdministrador.cabeceraComun.btnDescargas
								.setEnabled(true);
						cabeceraAdministrador.btnPagoDeServicios
								.setEnabled(true);
						panelLineas();
					}
				});

		cabeceraAdministrador.btnVistaAdministrador
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						cabeceraAdministrador.btnVistaAdministrador
								.setEnabled(false);
						cabeceraAdministrador.btnVistaUsuario.setEnabled(true);
						cabeceraAdministrador.cabeceraComun.btnServicios
								.setEnabled(false);
						cabeceraAdministrador.cabeceraComun.btnCalcularRuta
								.setEnabled(true);
						cabeceraAdministrador.cabeceraComun.btnDescargas
								.setEnabled(true);
						cabeceraAdministrador.btnPagoDeServicios
								.setEnabled(true);
						panelLineasAdmin();
					}
				});

		cabeceraAdministrador.btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TODO
				/*contentPane.remove(cabeceraAdministrador);
				cabeceraInvitado();
				if (recordar) {
					cabeceraInvitado.txtUsuario.setText(Index.this.usuario);
					cabeceraInvitado.passwordField.setText(password);
				}
				repaint();*/
			}
		});

		cabeceraAdministrador.cabeceraComun.btnCalcularRuta
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						cabeceraAdministrador.btnPagoDeServicios
								.setEnabled(true);
					}
				});
		cabeceraAdministrador.cabeceraComun.btnServicios
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						cabeceraAdministrador.btnPagoDeServicios
								.setEnabled(true);
					}
				});
		//TODO
		/*cabeceraAdministrador.cabeceraComun.btnDescargas
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						cabeceraAdministrador.btnPagoDeServicios
								.setEnabled(true);
						descarga = new Descargas();
						descarga.descargasAdmin();
						
					}
				});*/

		panelLineasAdmin();
		layout.putConstraint(SpringLayout.NORTH, panel, 6, SpringLayout.SOUTH,
				cabeceraAdministrador);
		layout.putConstraint(SpringLayout.WEST, panel, 5, SpringLayout.WEST,
				contentPane);
		layout.putConstraint(SpringLayout.SOUTH, panel, 494,
				SpringLayout.SOUTH, cabeceraAdministrador);
		layout.putConstraint(SpringLayout.EAST, panel, 0, SpringLayout.EAST,
				cabeceraAdministrador);
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		
		lineasAdmin.lineas.btnVincularParada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TODO
				lineasAdmin.lineas.vincularParadas = new vincularParadas(lineasAdmin.lineas.txtNumeroLinea.getText(),
						lineasAdmin.lineas.listParadas);
				jFrame = new JFrame();
				jFrame.setTitle("Vincular Paradas");
				jFrame.setBounds(300, 300, 520, 305);
				jFrame.getContentPane().add(lineasAdmin.lineas.vincularParadas.contentPane);
				jFrame.setVisible(true);
				lineasAdmin.lineas.vincularParadas.vincular.btnVolver
						.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								lineasAdmin.lineas.listParadas
										.setModel(lineasAdmin.lineas.vincularParadas.vincular.listIncluidos
												.getModel());
								jFrame.dispose();
							}
						});

				lineasAdmin.lineas.vincularParadas.btnCrearParada
						.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								panelParadasAdmin();
								jFrame.dispose();
							}
						});
			}

		});

		contentPane.repaint();
		contentPane.updateUI();
		repaint();
	}

	/*public void panelDescargasAdmin() {
		panel.removeAll();
		descarga = new Descarga();
		descarga.descargasAdmin();
		panel.add(descarga);
		panel.repaint();
		panel.updateUI();
		repaint();

	}*/
	
	public void panelPagoServicios() {
		panel.removeAll();

		panel.add(new PagoServicios());

		panel.repaint();
		panel.updateUI();
		repaint();
	}
	//TODO Descomentar
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
	}
	*/
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
	
	public void panelLineasAdmin() {
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
	}
	
	public void panelParadasAdmin() {
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
	}
	
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
				eventosAdmin.vincularParadas = new vincularEventos(eventosAdmin.txtNombre.getText(),
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
	}
	
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
				ptosInteres.vincularParadas = new vincularPtosInteres(ptosInteres.txtNombre.getText(),
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
	}
	
	public void panelDescarga() {
		panel.removeAll();
		descarga = new Descargas();
		panel.add(descarga);

		panel.repaint();
		panel.updateUI();
		repaint();
	}
	
	public void panelDescargasAdmin() {
		panel.removeAll();
		descargaAdmin = new DescargasAdmin();
		panel.add(descargaAdmin);

		panel.repaint();
		panel.updateUI();
		repaint();
	}
	
	
}