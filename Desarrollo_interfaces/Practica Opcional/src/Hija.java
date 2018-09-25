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

public class Hija {

	private JFrame frmHija;
	private JFrame frmPadre;
	private final JLabel lblBienvenido = new JLabel("Welcome");
	private final JLabel lblUsuario = new JLabel("User");
	private final JLabel lbluser = new JLabel("{{User}}");
	private final JButton btnLogout = new JButton("Logout");
	private final JButton btnNewButton = new JButton("Nieta");

	public Hija(String user,JFrame frame) {
		initialize();
		this.frmPadre = frame;
		setUser(user);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHija.setVisible(false);
				frmPadre.setVisible(true);
			}
		});
		lblBienvenido.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmHija = new JFrame();
		frmHija.setTitle("Hija");
		frmHija.setBounds(100, 100, 272, 228);
		frmHija.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GroupLayout groupLayout = new GroupLayout(frmHija.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton)
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Nieta nieta = new Nieta(lbluser.getText(),frmHija);
				nieta.getFrame().setVisible(true);
				frmHija.setVisible(false);
			}
		});
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
						.addComponent(btnLogout)
						.addComponent(btnNewButton))
					.addGap(28))
		);
		frmHija.getContentPane().setLayout(groupLayout);
	}
	public JFrame getFrame() {
		return frmHija;
	}
	public void setUser(String user){
		lbluser.setText(user);
	}
}
