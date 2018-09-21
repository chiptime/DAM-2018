import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;

public class Practica {

	private JFrame frmPractica;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Practica window = new Practica();
					window.frmPractica.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Practica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPractica = new JFrame();
		frmPractica.setForeground(Color.BLACK);
		frmPractica.setTitle("Practica");
		frmPractica.setBounds(100, 100, 851, 551);
		frmPractica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		
		JButton btnCancelar = new JButton("Cancelar");
		
		JButton btnNiodsfijfds = new JButton("niodsfijfds");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\u00BFDeseas a\u00F1adir cosas a tu pizza?");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Magarita", "Hawaina", "quattro formaggi", "Pepperoni", "pollo y barbacoa", "Carbonara", "prosciutto"}));
		comboBox.setSelectedIndex(-1);
		comboBox.setEditable(true);
		
		JTextArea textArea = new JTextArea();
		
		JDateChooser dateChooser = new JDateChooser();
		
		JLabel lblenQuDireccin = new JLabel("\u00BFEn qu\u00E9 direcci\u00F3n?");
		lblenQuDireccin.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblLocalidad = new JLabel("Localidad");
		
		JLabel lblVia = new JLabel("V\u00EDa");
		
		JLabel lblNombreDeLa = new JLabel("Direcci\u00F3n");
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Calle", "Avenida", "Rotonda"}));
		
		JLabel lblDa = new JLabel("D\u00EDa");
		lblDa.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblEligeTuPizza = new JLabel("Elige tu Pizza");
		lblEligeTuPizza.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblBaseTopping = new JLabel("Base");
		
		JLabel lblTopping = new JLabel("Topping");
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Tomate", "Barbacoa", "Carbonara"}));
		comboBox.setSelectedIndex(-1);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Jamon York");
		
		JCheckBox chckbxBeacon = new JCheckBox("Beacon");
		
		JCheckBox chckbxQuesoRulo = new JCheckBox("Queso Rulo");
		
		JCheckBox chckbxChampion = new JCheckBox("Champi\u00F1on");
		
		JCheckBox chckbxPolloMarinado = new JCheckBox("Pollo");
		
		JCheckBox chckbxCerdo = new JCheckBox("Cerdo");
		
		JCheckBox chckbxQuesos = new JCheckBox("4 Quesos");
		
		JCheckBox chckbxJalapeos = new JCheckBox("Jalape\u00F1os");
		
		GroupLayout groupLayout = new GroupLayout(frmPractica.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(91)
							.addComponent(btnAceptar)
							.addGap(18)
							.addComponent(btnCancelar)
							.addGap(30)
							.addComponent(btnNiodsfijfds))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(26)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblLocalidad)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNombreDeLa)
									.addGap(58)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(textField_1)
										.addComponent(comboBox_1, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addComponent(lblenQuDireccin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(comboBox, 0, 187, Short.MAX_VALUE)
								.addComponent(lblBaseTopping)
								.addComponent(lblEligeTuPizza)
								.addComponent(lblVia)
								.addComponent(chckbxNewCheckBox)
								.addComponent(comboBox_2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblTopping)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(chckbxNewCheckBox_1)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(chckbxBeacon, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(chckbxQuesoRulo, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(chckbxChampion, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(chckbxPolloMarinado, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(chckbxCerdo, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(chckbxQuesos, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(chckbxJalapeos, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(384)
									.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(58)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblDa)
										.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))))))
					.addGap(126))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblenQuDireccin, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDa))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(dateChooser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblLocalidad)
									.addComponent(textField)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblVia)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNombreDeLa))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblEligeTuPizza)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxNewCheckBox)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblBaseTopping)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblTopping)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(chckbxNewCheckBox_1)
								.addComponent(chckbxBeacon))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(chckbxQuesoRulo)
								.addComponent(chckbxChampion))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(chckbxPolloMarinado)
								.addComponent(chckbxCerdo))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(chckbxQuesos)
								.addComponent(chckbxJalapeos))
							.addGap(94)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnAceptar)
								.addComponent(btnCancelar)
								.addComponent(btnNiodsfijfds)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(114)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		frmPractica.getContentPane().setLayout(groupLayout);
	}
}
