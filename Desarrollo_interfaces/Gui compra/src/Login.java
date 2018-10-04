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
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Login {

	private JFrame frmLogin;
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 307, 301);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblUsuario = new JLabel("Usuario");
		
		JLabel lblPassword = new JLabel("Password");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		
		JRadioButton rdbtnSoyClienteRegistrado = new JRadioButton("Soy cliente registrado");
		buttonGroup.add(rdbtnSoyClienteRegistrado);
		
		JRadioButton rdbtnEntrarComoInvitado = new JRadioButton("Entrar como invitado");
		buttonGroup.add(rdbtnEntrarComoInvitado);
		
		JCheckBox chckbxAceptoLosTerminos = new JCheckBox("Acepto los terminos y condiciones");
		
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setEnabled(false);
		
		JButton btnSalir = new JButton("Salir");
		
		
		GroupLayout groupLayout = new GroupLayout(frmLogin.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(55)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblPassword)
										.addComponent(lblUsuario))
									.addGap(37)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(passwordField)
										.addComponent(textField)))
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(rdbtnEntrarComoInvitado)
									.addComponent(rdbtnSoyClienteRegistrado))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(41)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnAceptar)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnSalir))
								.addComponent(chckbxAceptoLosTerminos))))
					.addContainerGap(210, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsuario)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(rdbtnSoyClienteRegistrado)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(rdbtnEntrarComoInvitado)
					.addGap(18)
					.addComponent(chckbxAceptoLosTerminos)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAceptar)
						.addComponent(btnSalir))
					.addContainerGap(21, Short.MAX_VALUE))
		);
		
		

		chckbxAceptoLosTerminos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAceptar.setEnabled(chckbxAceptoLosTerminos.isSelected());	
			}
		});
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnEntrarComoInvitado.isSelected()) {
					callFrame(frmLogin);
				} 
										
				else
					if( textField.getText().equals(String.valueOf(passwordField.getPassword())) && !textField.getText().equals("") ) 
						callFrame(frmLogin);
				
			}
		});
		
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 
				if(JOptionPane.showConfirmDialog(null, "Estas seguro que quieres salir") == 0){
					frmLogin.dispose();
				}
				
			}
		});
		frmLogin.getContentPane().setLayout(groupLayout);
	}
	public void callFrame(JFrame frame) {
		Compra compra = new Compra(frmLogin, userName());
		compra.getFrame().setVisible(true);
		frame.setVisible(false);		
	}
	public String userName() {
		String user;
		if(!textField.getText().equals(""))
			user = textField.getText();
		else
			user = "Invitado";
		return user;
	}
}
