package diagrama_de_clases;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class CabeceraInvitado extends CabeceraComun {
	public JTextField txtUsuario;
	public JPasswordField passwordField;
	public JButton btnIdentificarse;
	public JCheckBox checkRecordarme;
	public CabeceraComun cabeceraComun;
	public JButton btnRegistrarse;
	public JFrame jFrame;
	public Registrarse registrarse;
	
	public CabeceraInvitado() {
		setBackground(Color.RED);
		cabeceraComun = new CabeceraComun();
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, cabeceraComun, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, cabeceraComun, 0, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, cabeceraComun, 100, SpringLayout.NORTH, this);
		setLayout(springLayout);
		
		add(cabeceraComun);
		
		txtUsuario = new JTextField();
		txtUsuario.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if(txtUsuario.getText().equals("Usuario")){
					txtUsuario.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				if(txtUsuario.getText().equals("")){
					txtUsuario.setText("Usuario");
				}
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, txtUsuario, 508, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, cabeceraComun, -6, SpringLayout.WEST, txtUsuario);
		springLayout.putConstraint(SpringLayout.NORTH, txtUsuario, 10, SpringLayout.NORTH, this);
		txtUsuario.setText("Usuario");
		add(txtUsuario);
		txtUsuario.setColumns(10);
		
		
		
		passwordField = new JPasswordField();
		passwordField.setText("password");
		springLayout.putConstraint(SpringLayout.EAST, txtUsuario, -29, SpringLayout.WEST, passwordField);
		springLayout.putConstraint(SpringLayout.SOUTH, passwordField, 0, SpringLayout.SOUTH, txtUsuario);
		springLayout.putConstraint(SpringLayout.NORTH, passwordField, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, passwordField, 670, SpringLayout.WEST, this);
		add(passwordField);
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if(passwordField.getText().equals("password")){
					passwordField.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				if(passwordField.getText().equals("")){
					passwordField.setText("password");
				}
			}
		});
		
		btnIdentificarse = new JButton("Identificarse");
		springLayout.putConstraint(SpringLayout.EAST, passwordField, -6, SpringLayout.WEST, btnIdentificarse);
		springLayout.putConstraint(SpringLayout.NORTH, btnIdentificarse, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnIdentificarse, 809, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, btnIdentificarse, -10, SpringLayout.EAST, this);
		add(btnIdentificarse);
		
		checkRecordarme = new JCheckBox("Recordarme");
		springLayout.putConstraint(SpringLayout.NORTH, checkRecordarme, 36, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, checkRecordarme, 10, SpringLayout.WEST, txtUsuario);
		checkRecordarme.setBackground(Color.RED);
		add(checkRecordarme);
		
		btnRegistrarse = new JButton("Registrarse");
		springLayout.putConstraint(SpringLayout.NORTH, btnRegistrarse, 6, SpringLayout.SOUTH, btnIdentificarse);
		springLayout.putConstraint(SpringLayout.WEST, btnRegistrarse, 0, SpringLayout.WEST, btnIdentificarse);
		add(btnRegistrarse);
	
		
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registrarse = new Registrarse();
				jFrame = new JFrame();
				jFrame.setTitle("Registrate");
				jFrame.setBounds(300, 300, 520, 305);
				jFrame.getContentPane().add(registrarse.contentPane);
				jFrame.setVisible(true);
				registrarse.btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						jFrame.dispose();
					}
				});
				registrarse.btnRegistrarse.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						registrarse.registrarse();
						if(registrarse.exito){
							jFrame.dispose();
						}
					}
				});
			}
		});
	}

	public void identificarse() {
		throw new UnsupportedOperationException();
	}

	public void registrarse() {
		throw new UnsupportedOperationException();
	}
}