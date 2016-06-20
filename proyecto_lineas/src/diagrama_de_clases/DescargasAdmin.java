package diagrama_de_clases;

import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

import diagrama_de_base_de_datos.Descarga;

import javax.swing.JTextArea;

public class DescargasAdmin extends JPanel {
	
	public DescargasAdmin(){
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		Descargas descarga= new Descargas();
		
		descarga.descargasAdmin();
		JPanel panel = new JPanel();
		add(descarga);
		
	}
	
	public void agregarDescarga() {
		throw new UnsupportedOperationException();
	}
}