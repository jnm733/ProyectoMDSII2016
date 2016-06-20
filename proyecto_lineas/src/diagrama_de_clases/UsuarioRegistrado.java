package diagrama_de_clases;

import java.awt.EventQueue;

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
	
	
}