import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 353, 302);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblUser = new JLabel("User");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		
		passwordField = new JPasswordField();
		
		JRadioButton rdbtnEntrarComoInvitado = new JRadioButton("Entrar como invitado");
		buttonGroup.add(rdbtnEntrarComoInvitado);
		
		JRadioButton rdbtnEntrarComoUsuario = new JRadioButton("Entrar como usuario");
		rdbtnEntrarComoUsuario.setSelected(true);
		buttonGroup.add(rdbtnEntrarComoUsuario);
		
		JButton btnLogin = new JButton("Login");
		
		JButton btnExit = new JButton("Exit");
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(76)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnEntrarComoUsuario)
						.addComponent(rdbtnEntrarComoInvitado)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
								.addComponent(btnLogin)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnExit))
							.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(lblUser)
									.addComponent(lblPassword))
								.addGap(32)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(passwordField)
									.addComponent(textField)))))
					.addContainerGap(194, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUser)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(rdbtnEntrarComoInvitado)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnEntrarComoUsuario)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLogin)
						.addComponent(btnExit))
					.addContainerGap(62, Short.MAX_VALUE))
		);
		
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!rdbtnEntrarComoInvitado.isSelected())
					if(textField.getText().equals(String.valueOf(passwordField.getPassword())) && !textField.getText().equals("")) {
						callFrame(frame, textField.getText());
					}else {
						JOptionPane.showMessageDialog(null, "El password o la contraseña son incorrectas", "Login error", JOptionPane.ERROR_MESSAGE);						
					}
				else {
					callFrame(frame,"Invitado");
				}
					
			}
		});
		
		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, "¿Sure to exit?","Exit", JOptionPane.INFORMATION_MESSAGE) == 0)
					frame.dispose();
			}
		});
		
		frame.getContentPane().setLayout(groupLayout);
	}
	private void callFrame(JFrame frame, String user) {
		Compra compra = new Compra(frame, user);
		frame.setVisible(false);
		compra.getFrame().setVisible(true);
	}
}
