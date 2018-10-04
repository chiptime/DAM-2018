import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Compra {

	private JFrame frame;
	private JFrame frmLogin;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel label;
	private double totalPagar;

	public Compra(JFrame frame, String user) {
		initialize();
		this.frmLogin = frame;
		label.setText(user);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 558, 332);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblUser = new JLabel("Active User:");
		
		label = new JLabel("<dynamic>");
		
		JLabel lblTotalAPagar = new JLabel("Total a pagar(\u20AC):");
		
		JLabel label_1 = new JLabel("0.0");
		
		JLabel lblProducto = new JLabel("Producto:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblCantidadYPreciounidad = new JLabel("Cantidad y precio/unidad:");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton btnAadirProductoCreado = new JButton("A\u00F1adir producto creado");
		
		JButton btnFinalizarCompra = new JButton("Finalizar compra");
		
		
		JTextArea textArea = new JTextArea();
		textArea.setText("Los productos son:\n");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblUser)
								.addComponent(lblProducto))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(label))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCantidadYPreciounidad)
								.addComponent(lblTotalAPagar)))
						.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1)
						.addComponent(btnAadirProductoCreado)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnFinalizarCompra))
					.addGap(167))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUser)
						.addComponent(label)
						.addComponent(lblTotalAPagar)
						.addComponent(label_1))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE, false)
						.addComponent(lblProducto)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCantidadYPreciounidad)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnAadirProductoCreado)
							.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
							.addComponent(btnFinalizarCompra)
							.addGap(47)))
					.addGap(73))
		);
		
		
		btnAadirProductoCreado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalPagar += precioProducto(comboBox.getSelectedIndex(),textField_1.getText()); 
				textArea.append(comboBox.getSelectedIndex()+ " * " +  textField.getText() + " = " + 
						precioProducto(comboBox.getSelectedIndex(),textField_1.getText()) + "€\n"
						);
				label_1.setText(String.valueOf(totalPagar));
			}
		});
		
		
		btnFinalizarCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Tu compra es de: " + totalPagar + "€", "Hasta pronto", JOptionPane.INFORMATION_MESSAGE);
				frame.setVisible(false);
				frmLogin.setVisible(true);
			}
		});
		
		frame.getContentPane().setLayout(groupLayout);
	}
	
	public double precioProducto(int unidad, String precio) {
		return unidad * Double.parseDouble(precio);
	}
	
	public JFrame getFrame() {
		return frame;
	}
}
