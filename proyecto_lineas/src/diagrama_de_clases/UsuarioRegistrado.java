package diagrama_de_clases;

import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

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
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsuarioRegistrado frame = new UsuarioRegistrado();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public UsuarioRegistrado(){
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
		cabeceraRegistrado();
	}
	
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
	
	
}