import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class framePrincipal {

	private JFrame frmLogin;
	private final JLabel lblUser = new JLabel("User");
	private final JLabel lblPassword = new JLabel("Password");
	private final JTextField textField = new JTextField();
	private final JPasswordField passwordField = new JPasswordField();
	private final JButton btnLogin = new JButton("Login");
	private final JButton btnClose = new JButton("Close");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					framePrincipal window = new framePrincipal();
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
	public framePrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textField.getText().equals(String.valueOf(passwordField.getPassword()))) {
					JOptionPane.showMessageDialog(null, "El usuario no es igual a la contraseña", "Login error", JOptionPane.ERROR_MESSAGE);
				}else {
					Hija hija = new Hija(textField.getText(),frmLogin);
					hija.getFrame().setVisible(true);
					frmLogin.setVisible(false);
				}
			}
		});
		textField.setColumns(10);
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 247, 209);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GroupLayout groupLayout = new GroupLayout(frmLogin.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(15)
							.addComponent(btnLogin)
							.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
							.addComponent(btnClose))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblUser)
								.addComponent(lblPassword))
							.addGap(27)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(passwordField)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(38))
		);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLogin.dispose();
			}
		});
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUser)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(45)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnClose)
						.addComponent(btnLogin))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		frmLogin.getContentPane().setLayout(groupLayout);
	}
}
