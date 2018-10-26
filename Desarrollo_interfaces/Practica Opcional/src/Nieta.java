import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Nieta {

	private JFrame frmNieta;
	private JFrame frmHija;
	private final JLabel lblBienvenido = new JLabel("Welcome");
	private final JLabel lblUsuario = new JLabel("User");
	private final JLabel lbluser = new JLabel("{{User}}");
	private final JButton btnLogout = new JButton("Logout");	

	public Nieta(String user,JFrame frame) {
		initialize();
		this.frmHija = frame;
		setUser(user);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmNieta.setVisible(false);
				frmHija.setVisible(true);
			}
		});
		lblBienvenido.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmNieta = new JFrame();
		frmNieta.setTitle("Hija");
		frmNieta.setBounds(100, 100, 272, 228);
		frmNieta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GroupLayout groupLayout = new GroupLayout(frmNieta.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()							
							.addGap(43))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(73)
							.addComponent(lblUsuario)
							.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE)))
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lbluser)
							.addContainerGap(65, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnLogout)
							.addGap(27))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(91)
					.addComponent(lblBienvenido)
					.addContainerGap(81, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblBienvenido)
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsuario)
						.addComponent(lbluser))
					.addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLogout))
					.addGap(28))
		);
		frmNieta.getContentPane().setLayout(groupLayout);
	}
	public JFrame getFrame() {
		return frmNieta;
	}
	public void setUser(String user){
		lbluser.setText(user);
	}
}
