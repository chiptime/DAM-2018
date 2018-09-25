import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Conectado {

	private JFrame frame;
	private JLabel lblUser;
	private JButton btnLogout;
	private JFrame framePrincipal;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the application.
	 */
	public Conectado(String lb, JFrame frame) {
		initialize();	
		setUser(lb);
		this.framePrincipal = frame;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblBienvenido = new JLabel("Bienvenido");
		lblBienvenido.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblUsuarioConectado = new JLabel("Usuario conectado:");
		
		lblUser = new JLabel("New label");
		
		btnLogout = new JButton("LogOut");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				framePrincipal.setVisible(true);
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(155)
							.addComponent(lblBienvenido))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(122)
							.addComponent(lblUsuarioConectado)
							.addGap(51)
							.addComponent(lblUser)))
					.addContainerGap(113, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(335, Short.MAX_VALUE)
					.addComponent(btnLogout)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblBienvenido)
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUser)
						.addComponent(lblUsuarioConectado))
					.addPreferredGap(ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
					.addComponent(btnLogout)
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
		
		
	}
	public void setUser(String lbl) {
		lblUser.setText(lbl);
	}
	public JFrame getframe() {
		return frame;
	}
}
