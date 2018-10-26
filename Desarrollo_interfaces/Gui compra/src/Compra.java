import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;

public class Compra {

	private JFrame frame;
	private JFrame frmLogin;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel label = new JLabel("<dynamic>");
	private double sumTotal;
	private JComboBox comboBox;


	


	public Compra(JFrame frame, String user) {
		initialize();
		this.frmLogin = frame;
		label.setText(user);
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 929, 353);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblIdentificacinDelUsuario = new JLabel("Identificaci\u00F3n del usuario:");
		
		
		
		JLabel lblTotalAPagar = new JLabel("Total a pagar(\u20AC):");
		
		JLabel label_1 = new JLabel("0.0");
		
		JLabel lblProducto = new JLabel("Producto");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblCantidadYPreciounidad = new JLabel("Cantidad y precio/unidad");
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox.setToolTipText("");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton btnAadirProductoCreado = new JButton("A\u00F1adir producto creado");
		
		JButton btnFinalizarCompra = new JButton("Finalizar compra");
		
		JLabel label_2 = new JLabel("\u20AC");
		
		JScrollPane scrollPane = new JScrollPane();
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblIdentificacinDelUsuario)
								.addGap(18)
								.addComponent(label)
								.addGap(32)
								.addComponent(lblTotalAPagar))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblProducto)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(lblCantidadYPreciounidad)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 371, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(53)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(btnAadirProductoCreado)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(label_1)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(label_2))
							.addComponent(btnFinalizarCompra)))
					.addContainerGap(312, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_1)
								.addComponent(label_2))
							.addGap(18)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(btnAadirProductoCreado)
								.addGap(94)
								.addComponent(btnFinalizarCompra)
								.addGap(0, 0, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblIdentificacinDelUsuario)
								.addComponent(label)
								.addComponent(lblTotalAPagar))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblProducto)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCantidadYPreciounidad)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setText("Los productos son: \n");
		
		

		btnAadirProductoCreado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double precio = getTotal(textField_1.getText(),comboBox.getSelectedIndex());
				sumTotal += precio;
				
				textArea.append(
						comboBox.getSelectedIndex()+" X "+textField.getText() + "  =" + precio + "€"+ "\n" + "\n"

		        );
				label_1.setText(String.valueOf(sumTotal));
				resetAll();
			}
		});
		
		btnFinalizarCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "La compra costará: "+ sumTotal + "€"+"\n"+"Hasta luego. ", "Finalizar Compra", JOptionPane.INFORMATION_MESSAGE);
				frame.setVisible(false);
				frmLogin.setVisible(true);							
			}
		});
		
		frame.getContentPane().setLayout(groupLayout);
	}
	

		public JFrame getFrame() {
			return frame;
		}
		
		public double getTotal(String precioU, int unidades) {
			double a = 0;
			
			if(precioU.equals(""))
				JOptionPane.showMessageDialog(null, "Porfavor elige un precio para el producto", "Error Precio", JOptionPane.ERROR_MESSAGE);
			else
				a = Double.parseDouble(precioU);
			
			return a*unidades;
		}
		public void resetAll() {
			textField.setText("");
			textField_1.setText("");
			comboBox.setSelectedIndex(0);
		}
}


