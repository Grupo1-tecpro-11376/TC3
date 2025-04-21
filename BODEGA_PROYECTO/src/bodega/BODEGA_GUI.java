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
		
		JButton btnNewButton_1 = new JButton("BORRAR CAMPOS");
		btnNewButton_1.setBounds(259, 143, 131, 21);
		contentPane.add(btnNewButton_1);
	}
}
