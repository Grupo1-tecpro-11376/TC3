package bodega;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class BODEGA_GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BODEGA_GUI frame = new BODEGA_GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BODEGA_GUI() {
		setTitle("PANEL PRINCIPAL - SISTEMA DE GESTION ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1015, 616);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PRODUCTOS");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 10, 133, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblCdigo = new JLabel("Código: ");
		lblCdigo.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblCdigo.setBounds(10, 52, 59, 13);
		contentPane.add(lblCdigo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNombre.setBounds(10, 75, 74, 13);
		contentPane.add(lblNombre);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblCantidad.setBounds(10, 98, 74, 13);
		contentPane.add(lblCantidad);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblPrecio.setBounds(10, 120, 59, 13);
		contentPane.add(lblPrecio);
		
		JLabel lblCategora = new JLabel("Categoría:");
		lblCategora.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblCategora.setBounds(10, 145, 74, 13);
		contentPane.add(lblCategora);
		
		textField = new JTextField();
		textField.setBounds(87, 51, 131, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(87, 74, 131, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(87, 97, 43, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(87, 119, 66, 19);
		contentPane.add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(87, 143, 131, 21);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("AGREGAR PRODUCTO");
		btnNewButton.setBounds(259, 50, 131, 21);
		contentPane.add(btnNewButton);
		
		JButton btnStockDisponible = new JButton("STOCK DISPONIBLE");
		btnStockDisponible.setBounds(259, 73, 131, 21);
		contentPane.add(btnStockDisponible);
		
		JButton btnEditarProducto = new JButton("EDITAR PRODUCTO");
		btnEditarProducto.setBounds(259, 96, 131, 21);
		contentPane.add(btnEditarProducto);
		
		JButton btnEliminarProducto = new JButton("ELIMINAR PRODUCTO");
		btnEliminarProducto.setBounds(259, 118, 131, 21);
		contentPane.add(btnEliminarProducto);
		
		JLabel lblNewLabel_1 = new JLabel("* CAMPOS OBLIGATORIOS");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(87, 168, 131, 13);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 194, 380, 360);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel lblEmpleado = new JLabel("EMPLEADO");
		lblEmpleado.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblEmpleado.setBounds(577, 10, 133, 19);
		contentPane.add(lblEmpleado);
		
		JLabel lblCdigo_1 = new JLabel("Código: ");
		lblCdigo_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblCdigo_1.setBounds(543, 39, 59, 13);
		contentPane.add(lblCdigo_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(607, 39, 131, 19);
		contentPane.add(textField_4);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblDni.setBounds(543, 75, 74, 13);
		contentPane.add(lblDni);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(607, 74, 131, 19);
		contentPane.add(textField_5);
		
		JLabel lblNombre_1_1 = new JLabel("Nombre:");
		lblNombre_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNombre_1_1.setBounds(543, 100, 74, 13);
		contentPane.add(lblNombre_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(607, 97, 131, 19);
		contentPane.add(textField_6);
		
		JLabel lblNombre_1_1_1 = new JLabel("Apellido:");
		lblNombre_1_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNombre_1_1_1.setBounds(543, 122, 74, 13);
		contentPane.add(lblNombre_1_1_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(607, 119, 131, 19);
		contentPane.add(textField_7);
		
		JLabel lblNombre_1_1_1_1 = new JLabel("Sexo:");
		lblNombre_1_1_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNombre_1_1_1_1.setBounds(543, 147, 74, 13);
		contentPane.add(lblNombre_1_1_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(607, 143, 131, 21);
		contentPane.add(comboBox_1);
		
		JLabel lblNombre_1_1_1_1_1 = new JLabel("Sueldo:");
		lblNombre_1_1_1_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		lblNombre_1_1_1_1_1.setBounds(543, 181, 74, 13);
		contentPane.add(lblNombre_1_1_1_1_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(607, 180, 131, 19);
		contentPane.add(textField_8);
		
		JButton btnAgregarEmpleado = new JButton("AGREGAR EMPLEADO");
		btnAgregarEmpleado.setBounds(543, 209, 195, 21);
		contentPane.add(btnAgregarEmpleado);
		
		JButton btnEditarEmpleado = new JButton("EDITAR EMPLEADO");
		btnEditarEmpleado.setBounds(543, 228, 195, 21);
		contentPane.add(btnEditarEmpleado);
		
		JButton btnBuscarempleado = new JButton("BUSCAR EMPLEADO");
		btnBuscarempleado.setBounds(543, 248, 195, 21);
		contentPane.add(btnBuscarempleado);
		
		JButton btnEliminarEmpleado = new JButton("ELIMINAR EMPLEADO");
		btnEliminarEmpleado.setBounds(543, 267, 195, 21);
		contentPane.add(btnEliminarEmpleado);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(748, 39, 243, 374);
		contentPane.add(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setViewportView(textArea_1);
	}
}
