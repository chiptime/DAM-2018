import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practica {

	private JFrame frmPractica;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final JLabel lblTipoDePago = new JLabel("Tipo de Pago");
	private final JRadioButton rdbtnPaypal = new JRadioButton("Paypal");
	private final JRadioButton rdbtnEfectivo = new JRadioButton("Efectivo");
	private final JRadioButton rdbtnTarjeta = new JRadioButton("Tarjeta");
	private final JLabel lblNpiso = new JLabel("N\u00BA-Piso");
	private final JTextField textField_2 = new JTextField();
	private final JLabel lblEntrega = new JLabel("Entrega");
	private final JRadioButton rdbtnDomicilio = new JRadioButton("Domicilio");
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textField_3;
	private JPasswordField passwordField;
	private final JLabel lblEntraATu = new JLabel("Entra a tu cuenta");
	private final JButton btnRegistrarse = new JButton("Sign Up");
	private final JTextPane textPane = new JTextPane();
	private String usuario;
	private String contrasenia;
	

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
		textPane.setEditable(false);
		lblEntraATu.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEntrega.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_2.setColumns(10);
		lblTipoDePago.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmPractica = new JFrame();
		frmPractica.setForeground(Color.BLACK);
		frmPractica.setTitle("Practica");
		frmPractica.setBounds(100, 100, 635, 586);
		frmPractica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		//Radio Buttons Opciones de compra
		buttonGroup.add(rdbtnEfectivo);
		buttonGroup.add(rdbtnTarjeta);
		buttonGroup.add(rdbtnPaypal);
		
		//Botones varios
		JButton btnAceptar = new JButton("Ver factura");
		btnAceptar.setEnabled(false);
		
		JButton btnCancelar = new JButton("Cancelar");

		JButton btnSingIn = new JButton("Sign in");
		
		textPane.setText("Para poder realizar el pedido:\n\n debes logearte arriba,\n solo necesitara poner dos palabras iguales.");
		
		//Crear lo relacionado a pizzas
		
		Pizza margarita       = new Pizza("Margarita"			,"Tomate", 	  new String[] {"Queso",  "Oregano"}) ;
		Pizza hawaina         = new Pizza("Hawaina"				,"Tomate", 	  new String[] {"Queso",  "Oregano", "Piña", "Jamon"}) ;
		Pizza cuatroQuesos	  = new Pizza("Cuatro quesos"		,"Tomate",	  new String[] {"Queso",  "Oregano", "Cuatro Quesos"}) ;
		Pizza pepperoni 	  = new Pizza("Pepperoni"			,"Tomate", 	  new String[] {"Queso",  "Oregano", "Pepperoni"}) ;
		Pizza polloBarbacoa   = new Pizza("Pollo-Barbacoa"		,"Barbacoa",  new String[] {"Queso",  "Oregano", "Pollo"}) ;
		Pizza carbonara  	  = new Pizza("Carbonara"			,"Carbonara", new String[] {"Queso",  "Oregano", "Beacon", "Jamon"}) ;
		Pizza prosciutto      = new Pizza("Prosciutto"			,"Tomate",    new String[] {"Queso",  "Oregano", "Jamon"}) ;
		
		List<Pizza> listaPizzas = new ArrayList<>();
		listaPizzas.add(margarita);
		listaPizzas.add(hawaina);
		listaPizzas.add(cuatroQuesos);
		listaPizzas.add(pepperoni);
		listaPizzas.add(polloBarbacoa);
		listaPizzas.add(carbonara);
		listaPizzas.add(prosciutto);
		
		
		
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\u00BFDeseas a\u00F1adir algo a tu pizza?");
				
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] {margarita.getNombre(),hawaina.getNombre(),cuatroQuesos.getNombre(),pepperoni.getNombre(),polloBarbacoa.getNombre(),carbonara.getNombre(),prosciutto.getNombre()
						}));
		comboBox.setSelectedIndex(-1);
		comboBox.setEditable(true);
		
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
		comboBox_2.setSelectedIndex(-1);
		comboBox_2.setEnabled(false);
		
		///Array de CheckBoxs
		List<JCheckBox> buttons = new ArrayList<>();

		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Jamon York");
		buttons.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxBeacon = new JCheckBox("Beacon");
		buttons.add(chckbxBeacon);
		
		JCheckBox chckbxQuesoRulo = new JCheckBox("Queso Rulo");
		buttons.add(chckbxQuesoRulo);
		
		JCheckBox chckbxChampion = new JCheckBox("Champi\u00F1on");
		buttons.add(chckbxChampion);
		
		JCheckBox chckbxPolloMarinado = new JCheckBox("Pollo");
		buttons.add(chckbxPolloMarinado);
		
		JCheckBox chckbxCerdo = new JCheckBox("Cerdo");
		buttons.add(chckbxCerdo);
		
		JCheckBox chckbxQuesos = new JCheckBox("4 Quesos");
		buttons.add(chckbxQuesos);
		
		JCheckBox chckbxJalapeos = new JCheckBox("Jalape\u00F1os");
		buttons.add(chckbxJalapeos);
		
		//Desactiva los toppings al iniciar (se activa si se activa el checkBox "�desea a�adir algo a tu pizza?" )		
		for ( JCheckBox checkbox : buttons ) {
			checkbox.setEnabled(chckbxNewCheckBox.isSelected()); 
		}
		
		JRadioButton rdbtnTienda = new JRadioButton("Tienda");
		rdbtnDomicilio.setSelected(true);
		
		//List de Pagos
		List<JRadioButton> pagos = new ArrayList<>();

		pagos.add(rdbtnTarjeta);
		pagos.add(rdbtnEfectivo);
		pagos.add(rdbtnPaypal);		
		
		//List de Pagos
		List<JRadioButton> entregas = new ArrayList<>();
		entregas.add(rdbtnDomicilio);
		entregas.add(rdbtnTienda);
		
		rdbtnPaypal.setSelected(true);		
		
		//JLabels varios
		JLabel lblFactura = new JLabel("Factura");
		lblFactura.setFont(new Font("Tahoma", Font.BOLD, 18));
				
		JLabel lblUsuario = new JLabel("Usuario");
		
		JLabel lblPassword = new JLabel("Password");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		passwordField = new JPasswordField();
		
		

		//Radio Buttons Entrega
		buttonGroup_1.add(rdbtnDomicilio);
		buttonGroup_1.add(rdbtnTienda);
		
		
		
		GroupLayout groupLayout = new GroupLayout(frmPractica.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblenQuDireccin)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNombreDeLa)
								.addComponent(lblNpiso)
								.addComponent(lblLocalidad)
								.addComponent(lblVia))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_1)
								.addComponent(textField)
								.addComponent(textField_2)
								.addComponent(comboBox_1, 0, 119, Short.MAX_VALUE)))
						.addComponent(lblDa)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(lblBaseTopping)
							.addComponent(lblTopping)
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
								.addComponent(chckbxJalapeos, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
							.addComponent(lblEligeTuPizza)
							.addComponent(chckbxNewCheckBox, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(dateChooser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(comboBox_2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(51)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblFactura)
								.addContainerGap())
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(rdbtnTarjeta)
										.addComponent(rdbtnPaypal)
										.addComponent(rdbtnEfectivo)
										.addComponent(lblEntraATu)
										.addComponent(lblTipoDePago))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(rdbtnTienda)
										.addComponent(lblEntrega)
										.addComponent(rdbtnDomicilio, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
									.addContainerGap())
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnAceptar)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblUsuario)
												.addComponent(lblPassword))
											.addGap(33)
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(textField_3, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
												.addComponent(passwordField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(btnRegistrarse, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnSingIn, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
										.addComponent(btnCancelar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGap(97))))))
		);

		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(0)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(44)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblLocalidad)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblVia)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNpiso)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNombreDeLa)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblDa)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblEligeTuPizza)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxNewCheckBox)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblBaseTopping)
							.addGap(2)
							.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(22)
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
								.addComponent(chckbxJalapeos)))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblenQuDireccin, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblEntrega)
									.addComponent(lblTipoDePago))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(24)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(rdbtnPaypal)
										.addComponent(rdbtnDomicilio))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(rdbtnEfectivo)
										.addComponent(rdbtnTienda))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnTarjeta)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblEntraATu)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblUsuario)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSingIn, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnRegistrarse)
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPassword))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblFactura)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelar)
						.addComponent(btnAceptar))
					.addContainerGap())
		);

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Diversos accions

		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_2.setEnabled(chckbxNewCheckBox.isSelected());
				for ( JCheckBox checkbox : buttons ) {
				    checkbox.setEnabled(chckbxNewCheckBox.isSelected());
				}
			}
		});

		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				usuario 	  = JOptionPane.showInputDialog(frmPractica, "Usuario", null);
				contrasenia   = JOptionPane.showInputDialog(frmPractica, "Constraseña", null);
			}
		});
		
		
		btnSingIn.addActionListener(new ActionListener() {
			@SuppressWarnings("unlikely-arg-type")
			public void actionPerformed(ActionEvent e) {
				if(textField_3.getText().equals(usuario)&& (passwordField.getText().equals(contrasenia))){
					btnSingIn.setEnabled(false);
					btnAceptar.setEnabled(true);
				}
			}
		});

		/* Datos entregados por los elementos de la interfaz. Se usaran mas abajo.
		textField.getText();
		textField_1.getText();
		textField_2.getText();
		comboBox_1.getModel().getElementAt(comboBox_1.getSelectedIndex());
		dateChooser.getDate();
		comboBox.getModel().getElementAt(comboBox.getSelectedIndex());
		*/

    rdbtnTienda.addFocusListener(new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent arg0) {
          textField.setText("Madrid");
          textField_1.setText("123");
          textField_2.setText("Calle falsa");
      }
    });

    rdbtnDomicilio.addFocusListener(new FocusAdapter() {
      @Override
      public void focusGained(FocusEvent arg0) {
          textField.setText("");
          textField_1.setText("");
          textField_2.setText("");
      }
    });
    rdbtnTienda.requestFocus();

		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			  if(comboBox.getSelectedIndex() > -1) {
          //Seleccionar toppings
          String SelectedItemCB = "";

          // Añade los toppings basicos de la pizza seleccionada

          SelectedItemCB += Arrays.toString(
                  (listaPizzas.get(comboBox.getSelectedIndex()).getToppings())).replace("[", "").replace("]", "") + ", ";

          if (chckbxNewCheckBox.isSelected()) {
            //base
            //comboBox_2.getModel().getElementAt(comboBox_2.getSelectedIndex());
            //toppings
            for (JCheckBox checkbox : buttons) {
              checkbox.setEnabled(chckbxNewCheckBox.isSelected());
              if (checkbox.isSelected() && !Arrays.toString((listaPizzas.get(comboBox.getSelectedIndex()).getToppings())).contains(checkbox.getText())) { //Comparacion Toppings
                SelectedItemCB += checkbox.getText() + ", ";
              }
            }
          }
          //Pago Seleccionados
          String SelectedR = "";
          for (JRadioButton radioButton : pagos) {
            if (radioButton.isSelected()) {
              SelectedR += radioButton.getText();
            }
          }
          //Entrega Seleccionados
          String SelectedE = "";
          for (JRadioButton radioButton : entregas) {
            if (radioButton.isSelected()) {
              SelectedE += radioButton.getText();
            }
          }

          //Comparacion Base
          String base = "";

          if (!comboBox_2.isEnabled()) {
            base += listaPizzas.get(comboBox.getSelectedIndex()).getBase();
          } else {
            for (Pizza pizza : listaPizzas) {
              if (comboBox_2.getModel().getElementAt(comboBox_2.getSelectedIndex()).equals(pizza.getBase())) {
                base = pizza.getBase();
              }
            }
          }


          textPane.setText("Localidad: " + textField.getText() + "\n" +
                  "Vía:       " + comboBox_1.getModel().getElementAt(comboBox_1.getSelectedIndex()) + "\n" +
                  "Nº-Piso:   " + textField_2.getText() + "\n" +
                  "Dirección: " + textField_1.getText() + "\n" +
                  "Día:       " + dateChooser.getDate() + "\n" + "\n" +
                  "La pizza que has pedido es:" + "\n" +
                  "Base:      " + base + "\n" +
                  "Toppings:  " + SelectedItemCB + "\n" + "\n" +
                  "Método de Pago:" + "\n" +
                  SelectedR + "\n" +
                  "Lo recibirá:" + "\n" +
                  SelectedE + "\n"
          );
        }else{
			    textPane.setText("Porfavor selecciona una pizza o crea una dandole a añadir algo a tu pizza.");
        }
			}
		});

		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
			
		frmPractica.getContentPane().setLayout(groupLayout);
	}
}
