package diagrama_de_clases;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

import diagrama_de_base_de_datos.Usuario;

public class UsuarioRegistrado extends JFrame{
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
	public CalcularRutaInvitado calcularRuta;
	public HistorialConsultas consultaHistorial;
	public BD_Principal bd_Principal;
	public String email;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				String usuario;
				String email;
				try {
					try {
						usuario = args[0];
						email = args[1];
						} catch (Exception e) {
						usuario = "Default";
						email = "default@gmail.com";
					}
					UsuarioRegistrado frame = new UsuarioRegistrado(usuario,email);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public UsuarioRegistrado(String user,String email){
		bd_Principal = new BD_Principal();
		setEmail(email);
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
		cabeceraRegistrado(user);
	}
	
	public void cabeceraRegistrado(String usuario) {
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
				dispose();
				UsuarioInvitado.main(null);
				if (recordar) {
					
					//cabeceraInvitado.txtUsuario.setText(Index.this.usuario);
					//cabeceraInvitado.passwordField.setText(password);
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
	
	public void panelDescarga() {
		panel.removeAll();
		descarga = new Descargas();
		panel.add(descarga);

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
	
	public void panelPagoServicios() {
		panel.removeAll();

		panel.add(new PagoServicios());

		panel.repaint();
		panel.updateUI();
		repaint();
	}
	
	public void panelCalcularRutaUsuario() {
		// TODO borrar
		
		panelCalcularRuta();
		calcularRuta.usuario();
		calcularRuta.setUser(email);
		calcularRuta.btnConsultarHistorial
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						consultaHistorial = new HistorialConsultas(usuario);
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
	}
	
	public void panelSolucion() {
		if (calcularRuta.exito) {
			panel.removeAll();

			String usuario = "invitado";
			if (cabeceraUsuario != null) {
				usuario = cabeceraUsuario.getUsuario();
			}

			solucion = new SolucionConsulta(calcularRuta.nOrigen,
					calcularRuta.nDestino, usuario, calcularRuta.hora,
					calcularRuta.txtConsulta.getText());
			solucion.btnVolver.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
						panelCalcularRutaUsuario();
				}
			});
			panel.add(solucion);

			panel.repaint();
			panel.updateUI();
			repaint();
		}

	}
	
	public void panelCalcularRuta() {
		panel.removeAll();

		calcularRuta = new CalcularRutaInvitado();

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
	
	public void setEmail(String email){
		this.email = email;
	}
}