package diagrama_de_clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

import diagrama_de_base_de_datos.*;

public class Registrarse extends JFrame{
	public JPanel contentPane;
	public JTextField txtUsuario;
	public JTextField txtEmail;
	public JButton btnRegistrarse;
	public JButton btnCancelar;
	public JPasswordField passwordField;
	public Usuario iUsuarios;
	public boolean exito;
	IAdministrador bd;
	BD_Principal bd_principal = new BD_Principal();
	
public Registrarse() {
	
	if (System.getSecurityManager() == null) {
        System.setSecurityManager(new SecurityManager());
    }
    try {
        String nombre = "Servidor1";
        Registry registry = LocateRegistry.getRegistry(1099);
        bd = (IAdministrador) registry.lookup(nombre);
         
        
    } catch (Exception e) {
        System.err.println("Servidor no arrancado:");
        e.printStackTrace();
    }
    
    
		iUsuarios = new Usuario();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblUsuario = new JLabel("Usuario");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblUsuario, 43, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblUsuario, 45, SpringLayout.WEST, contentPane);
		contentPane.add(lblUsuario);
		
		txtUsuario = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtUsuario, -3, SpringLayout.NORTH, lblUsuario);
		txtUsuario.setText("Usuario");
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		txtUsuario.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtUsuario.getText().equals("Usuario")){
					txtUsuario.setText("");
				}
			}
			public void focusLost(FocusEvent e) {
				if(txtUsuario.getText().equals("")){
					txtUsuario.setText("Usuario");
				}
			}
		});
		
		
		JLabel lblPassword = new JLabel("Password");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblPassword, 67, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblPassword, 45, SpringLayout.WEST, contentPane);
		contentPane.add(lblPassword);
		
		JLabel lblEmail = new JLabel("Email");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblEmail, 91, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblEmail, 45, SpringLayout.WEST, contentPane);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, txtUsuario, 0, SpringLayout.WEST, txtEmail);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtEmail, 88, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtEmail, 165, SpringLayout.WEST, contentPane);
		txtEmail.setText("Email");
		txtEmail.setColumns(10);
		contentPane.add(txtEmail);
		txtEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtEmail.getText().equals("Email")){
					txtEmail.setText("");
				}
			}
			public void focusLost(FocusEvent e) {
				if(txtEmail.getText().equals("")){
					txtEmail.setText("Email");
				}
			}
		});
		
		btnCancelar = new JButton("Cancelar");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnCancelar, 0, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCancelar, -2, SpringLayout.EAST, contentPane);
		
		btnRegistrarse = new JButton("Registrarse");
		
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnRegistrarse, 0, SpringLayout.NORTH, btnCancelar);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnRegistrarse, -6, SpringLayout.WEST, btnCancelar);
		contentPane.add(btnRegistrarse);
		contentPane.add(btnCancelar);
		
		passwordField = new JPasswordField();
		passwordField.setText("password");
		sl_contentPane.putConstraint(SpringLayout.NORTH, passwordField, -22, SpringLayout.NORTH, txtEmail);
		sl_contentPane.putConstraint(SpringLayout.WEST, passwordField, 74, SpringLayout.EAST, lblPassword);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, passwordField, -2, SpringLayout.NORTH, txtEmail);
		sl_contentPane.putConstraint(SpringLayout.EAST, passwordField, 160, SpringLayout.EAST, lblPassword);
		contentPane.add(passwordField);
		
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(passwordField.getText().equals("password")){
					passwordField.setText("");
				}
			}
			public void focusLost(FocusEvent e) {
				if(passwordField.getText().equals("")){
					passwordField.setText("password");
				}
			}
		});
		
	}

	public void registrarse() {
		String usuario = txtUsuario.getText();
		String password = passwordField.getText();
		String email = txtEmail.getText();
		
		try {
			Usuario User = bd_principal.getUsuario(email);
			if(User == null){
				bd_principal.registrarse(usuario, password, email);
				JOptionPane.showMessageDialog(null,
						"Usuario registrado con éxito",
						"Exito", JOptionPane.INFORMATION_MESSAGE);
				exito = true;
			}else{
				JOptionPane.showMessageDialog(null, "Usuario ya registrado","Error",JOptionPane.ERROR_MESSAGE);
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}
}