package login;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Container;

import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Font;

public class formtest extends JFrame {
	JPanel pnCenter = new JPanel();
	JLabel lblEmail = new JLabel("Email");
	JTextField tfEmail = new JTextField(20);
	JLabel lblPass = new JLabel("Password");
	JPasswordField tflPass = new JPasswordField(20);
	JButton button1 = new JButton("Register");
	private final JLabel label = new JLabel("");
	
	public formtest () {
		Container cont = this.getContentPane();
		getContentPane().setLayout(new GridLayout(3, 2, 7, 7));
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblEmail.setForeground(Color.RED);
		
		cont.add(lblEmail);
		tfEmail.setBackground(new Color(255, 255, 255));
		cont.add(tfEmail);
		lblPass.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPass.setForeground(Color.GREEN);
		cont.add(lblPass);
		cont.add(tflPass);
		cont.add(button1);
		
		
		cont.setSize(300,700);
		
		getContentPane().add(label);
		pack();
		setVisible(true);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new formtest();
	}

	/**
	 * Create the frame.
	 */
	

}
