package diagrama_de_clases;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

import org.apache.log4j.Layout;

import diagrama_de_base_de_datos.Usuario;

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
	}
	
	public void cabeceraInvitado() {

		contentPane.removeAll();
		cabeceraInvitado = new CabeceraInvitado();
		// Calcular Ruta
		cabeceraInvitado.cabeceraComun.btnCalcularRuta
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panelCalcularRuta();
					}
				});
		// Servicios
		cabeceraInvitado.cabeceraComun.btnServicios
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						panelLineas();
					}
				});
		// Descargas
		cabeceraInvitado.cabeceraComun.btnDescargas
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						panelDescarga();
					}
				});
		// Identificarse
		cabeceraInvitado.btnIdentificarse
				.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						usuario = cabeceraInvitado.txtUsuario.getText();
						password = cabeceraInvitado.passwordField.getText();
						if (cabeceraInvitado.checkRecordarme.isSelected()) {
							recordar = true;
						}
						Identificarse iden = new Identificarse();
						Usuario user = iden.identificarse(usuario, password);
						if(user == null){
							JOptionPane.showMessageDialog(null, "Usuario no registrado","Error",JOptionPane.ERROR_MESSAGE);
						}else{
							dispose();
							UsuarioRegistrado usuario = new UsuarioRegistrado(user.getNombre());
							usuario.main(null);
						}
						
						
						
					}
				});
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
	public void panelSolucion() {
		if (calcularRuta.exito) {
			panel.removeAll();

			String usuario = "invitado";
			if (cabeceraUsuario != null) {
				usuario = cabeceraUsuario.getUsuario();
			}

			solucion = new SolucionConsulta(calcularRuta.lineas, calcularRuta.nOrigen,
					calcularRuta.nDestino, usuario, calcularRuta.hora,
					calcularRuta.txtConsulta.getText());
			solucion.btnVolver.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
						panelCalcularRuta();
				}
			});
			panel.add(solucion);

			panel.repaint();
			panel.updateUI();
			repaint();
		}

	}
}