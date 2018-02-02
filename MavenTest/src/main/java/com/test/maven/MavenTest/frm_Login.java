package com.test.maven.MavenTest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frm_Login {

	private JFrame frmLogin;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_Login window = new frm_Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frm_Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("LOGIN");
		frmLogin.setResizable(false);
		frmLogin.setBounds(100, 100, 300, 150);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(49, 34, 75, 14);
		frmLogin.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(49, 59, 75, 14);
		frmLogin.getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(134, 31, 150, 20);
		frmLogin.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(134, 56, 150, 20);
		frmLogin.getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Username = txtUsername.getText();
				@SuppressWarnings("deprecation")
				String Password = txtPassword.getText();
				if (Username.equals("daniel") && Password.equals("saluta")) {
					JOptionPane.showMessageDialog(null, "Login Success","Login Success",JOptionPane.DEFAULT_OPTION);
					
				}else {
					JOptionPane.showMessageDialog(null, "Invalid Login Details","Login Error",JOptionPane.ERROR_MESSAGE);
					txtUsername.setText(null);
					txtPassword.setText(null);
				}
			}
		});
		btnLogin.setBounds(195, 87, 89, 23);
		frmLogin.getContentPane().add(btnLogin);
	}
}
