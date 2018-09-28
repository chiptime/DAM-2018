import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Canvas;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Label;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Interfaz {

	private JFrame frame;
	private JFrame frmlogin;
	private JTextField aTraducir;
	private JTextField traduccion;
	private String web = "http://www.spanishdict.com/traductor/";
	private JButton btnTraducir = new JButton("Traducir");
	private JLabel lblUrl = new JLabel("url");
	


	public Interfaz(JFrame frame) {
		initialize();
		this.frmlogin = frame;		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblTraductorInglesespaol = new JLabel("Traductor Ingles-Espa\u00F1ol");
		
		JLabel lblATraducir = new JLabel("Palabra a traducir");
		
		aTraducir = new JTextField();

		aTraducir.setColumns(10);
		
		JLabel lblTraduccion = new JLabel("Traduccion");
		
		traduccion = new JTextField();
		traduccion.setColumns(10);
		
		JLabel lblTrabajandoConEl = new JLabel("Trabajando con el traductor:");
		
		JLabel lblWeb = new JLabel("New label");
		lblWeb.setText(web);
		
		JLabel lblPaginaFinal = new JLabel("pagina final");
		
		JButton btnLogout = new JButton("Logout");
				


		
		

		
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(141)
							.addComponent(lblTraductorInglesespaol))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(31)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblATraducir)
										.addComponent(lblTraduccion)
										.addComponent(lblTrabajandoConEl)
										.addComponent(btnLogout))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblWeb)
										.addComponent(traduccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(aTraducir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnTraducir)))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblPaginaFinal)
									.addGap(54)
									.addComponent(lblUrl)))))
					.addContainerGap(58, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTraductorInglesespaol)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblATraducir)
						.addComponent(aTraducir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTraduccion)
						.addComponent(traduccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(62)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTrabajandoConEl)
						.addComponent(lblWeb))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(34)
							.addComponent(btnTraducir))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPaginaFinal)
								.addComponent(lblUrl))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnLogout)))
					.addContainerGap(30, Short.MAX_VALUE))
		);
		
		
		btnTraducir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				
				String html = "";
				
				lblUrl.setText(getURL(web,aTraducir.getText()));
				
				try {
					html = URLReader.obtenerHTML(new URL(getURL(web,aTraducir.getText())));
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String claveInicio = "\"translationText\":\"";
				String claveFinal = "\",\"translationContext\":\"\",\"";
				
				traduccion.setText(
						html.substring(
								html.indexOf(claveInicio) + claveInicio.length(), html.indexOf(claveFinal)
								));
			}
		});
		
		aTraducir.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					
                }
			}
		});
		
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				frmlogin.setVisible(true);
			}
		});
		
		
		frame.getContentPane().setLayout(groupLayout);
	}
	public String getURL(String web, String traduccion) {
		String url = web + traduccion;
		return url;
	}
	
	public void enterTraducir() {
		btnTraducir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				
				String html = "";
				
				lblUrl.setText(getURL(web,aTraducir.getText()));
				
				try {
					html = URLReader.obtenerHTML(new URL(getURL(web,aTraducir.getText())));
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String claveInicio = "\"translationText\":\"";
				String claveFinal = "\",\"translationContext\":\"\",\"";
				
				traduccion.setText(
						html.substring(
								html.indexOf(claveInicio) + claveInicio.length(), html.indexOf(claveFinal)
								));
			}
		});
	}
	public JFrame getFrame() {
		return frame;
	}
}
