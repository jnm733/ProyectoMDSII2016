package diagrama_de_clases;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;

public class PagoServicios extends JPanel{
	private JTextField txtNumero;
	private JTextField txtTitular;
	public JButton btnRealizarPago;
	public JRadioButton rdbtnVisa;
	public JRadioButton rdbtnPaypal;

	/**
	 * Create the panel.
	 */
	public PagoServicios() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0,
				SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, panel, 0,
				SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 202,
				SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel, 344,
				SpringLayout.WEST, this);
		add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);

		JLabel lblTitular = new JLabel("Titular");
		sl_panel.putConstraint(SpringLayout.NORTH, lblTitular, 83,
				SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblTitular, 10,
				SpringLayout.WEST, panel);
		panel.add(lblTitular);

		txtNumero = new JTextField();
		txtNumero.setText("Numero");
		panel.add(txtNumero);
		txtNumero.setColumns(10);
		
		txtNumero.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtNumero.getText().equals("Numero")) {
					txtNumero.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				if (txtNumero.getText().equals("")) {
					txtNumero.setText("Numero");
				}
			}
		});
		txtTitular = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, txtTitular, -3,
				SpringLayout.NORTH, lblTitular);
		sl_panel.putConstraint(SpringLayout.EAST, txtTitular, 0,
				SpringLayout.EAST, txtNumero);
		txtTitular.setText("Titular");
		txtTitular.setColumns(10);
		panel.add(txtTitular);
		
		txtTitular.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if (txtTitular.getText().equals("Titular")) {
					txtTitular.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				if (txtTitular.getText().equals("")) {
					txtTitular.setText("Titular");
				}
			}
		});

		JLabel lblFormaDePago = new JLabel("Forma de Pago");
		sl_panel.putConstraint(SpringLayout.WEST, lblFormaDePago, 10,
				SpringLayout.WEST, panel);
		panel.add(lblFormaDePago);

		rdbtnPaypal = new JRadioButton("Paypal");
		rdbtnPaypal.setSelected(true);
		rdbtnPaypal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtnVisa.setSelected(false);
			}
		});
		
		sl_panel.putConstraint(SpringLayout.WEST, txtTitular, 32,
				SpringLayout.WEST, rdbtnPaypal);
		sl_panel.putConstraint(SpringLayout.NORTH, rdbtnPaypal, -4,
				SpringLayout.NORTH, lblFormaDePago);
		panel.add(rdbtnPaypal);

		rdbtnVisa = new JRadioButton("Visa");
		rdbtnVisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtnPaypal.setSelected(false);
			}
		});
		sl_panel.putConstraint(SpringLayout.EAST, txtNumero, 0,
				SpringLayout.EAST, rdbtnVisa);
		sl_panel.putConstraint(SpringLayout.WEST, rdbtnVisa, 198,
				SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, rdbtnPaypal, -16,
				SpringLayout.WEST, rdbtnVisa);
		sl_panel.putConstraint(SpringLayout.NORTH, rdbtnVisa, -4,
				SpringLayout.NORTH, lblFormaDePago);
		panel.add(rdbtnVisa);

		JLabel lblNDeTarjeta = new JLabel("N\u00BA de Tarjeta");
		sl_panel.putConstraint(SpringLayout.NORTH, txtNumero, -3,
				SpringLayout.NORTH, lblNDeTarjeta);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNDeTarjeta, 57,
				SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNDeTarjeta, 10,
				SpringLayout.WEST, panel);
		panel.add(lblNDeTarjeta);

		btnRealizarPago = new JButton("Realizar Pago");
		btnRealizarPago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtNumero.getText().equals("") || txtTitular.getText()
						.equals("")
						|| txtNumero.getText().equals("Numero") || txtTitular
								.getText().equals("Titular")) {
					JOptionPane.showMessageDialog(null, "Introduzca todos los datos", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else if(rdbtnPaypal.isSelected()){
					JOptionPane.showMessageDialog(null,"Pagado con Paypal");
				}else{
					JOptionPane.showMessageDialog(null,"Pagado con visa");
				}
			}
		});

		sl_panel.putConstraint(SpringLayout.SOUTH, lblFormaDePago, -11,
				SpringLayout.NORTH, btnRealizarPago);
		sl_panel.putConstraint(SpringLayout.NORTH, btnRealizarPago, 135,
				SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btnRealizarPago, 4,
				SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnRealizarPago, -10,
				SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnRealizarPago, -140,
				SpringLayout.EAST, panel);
		panel.add(btnRealizarPago);

	}
}