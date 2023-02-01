package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JList;

public class FrameHerramientas extends JFrame {

	private JPanel contentPane;
	private JTextField textNombreHerra;
	private JTextField CantidadHerra;
	private JTextField MarcaHerra;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameHerramientas frame = new FrameHerramientas();
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
	public FrameHerramientas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRegistroHerra = new JButton("Registrar");
		btnRegistroHerra.setBounds(49, 403, 175, 49);
		contentPane.add(btnRegistroHerra);
		
		textNombreHerra = new JTextField();
		textNombreHerra.setBounds(114, 76, 86, 20);
		contentPane.add(textNombreHerra);
		textNombreHerra.setColumns(10);
		
		CantidadHerra = new JTextField();
		CantidadHerra.setBounds(114, 123, 86, 20);
		contentPane.add(CantidadHerra);
		CantidadHerra.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(32, 79, 72, 14);
		contentPane.add(lblNombre);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCantidad.setBounds(32, 126, 72, 14);
		contentPane.add(lblCantidad);
		
		MarcaHerra = new JTextField();
		MarcaHerra.setBounds(114, 165, 86, 20);
		contentPane.add(MarcaHerra);
		MarcaHerra.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMarca.setBounds(32, 168, 53, 17);
		contentPane.add(lblMarca);
		
		JButton btnListaHerra = new JButton("Lista de Herramientas");
		btnListaHerra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnListaHerra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnListaHerra.setBounds(379, 61, 199, 30);
		contentPane.add(btnListaHerra);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(312, 102, 359, 222);
		contentPane.add(textArea);
		
		textField = new JTextField();
		textField.setBounds(32, 260, 168, 64);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Generar Cod Barra");
		btnNewButton.setBounds(33, 219, 123, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Imprimir");
		btnNewButton_1.setBounds(32, 335, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
	}

}
