package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class FrameUsuarios extends JFrame {

	private JPanel contentPane;
	private JTextField textCodUsuario;
	private JTextField textNomUsuario;
	private JTextField textApeUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameUsuarios frame = new FrameUsuarios();
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
	public FrameUsuarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRegistroUsuario = new JButton("Registar");
		btnRegistroUsuario.setBounds(52, 216, 135, 28);
		contentPane.add(btnRegistroUsuario);
		
		JButton btnListaUsuario = new JButton("Lista de Usuarios");
		btnListaUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnListaUsuario.setBounds(332, 42, 135, 28);
		contentPane.add(btnListaUsuario);
		
		JButton btnImportarUsuarios = new JButton("Importar Usuarios");
		btnImportarUsuarios.setBounds(26, 26, 122, 23);
		contentPane.add(btnImportarUsuarios);
		
		textCodUsuario = new JTextField();
		textCodUsuario.setBounds(103, 89, 103, 20);
		contentPane.add(textCodUsuario);
		textCodUsuario.setColumns(10);
		
		textNomUsuario = new JTextField();
		textNomUsuario.setBounds(103, 133, 103, 20);
		contentPane.add(textNomUsuario);
		textNomUsuario.setColumns(10);
		
		JLabel lblcodigo = new JLabel("CODIGO");
		lblcodigo.setBounds(31, 92, 46, 14);
		contentPane.add(lblcodigo);
		
		JLabel lblnombre = new JLabel("NOMBRE");
		lblnombre.setBounds(31, 136, 46, 14);
		contentPane.add(lblnombre);
		
		textApeUsuario = new JTextField();
		textApeUsuario.setBounds(103, 172, 103, 20);
		contentPane.add(textApeUsuario);
		textApeUsuario.setColumns(10);
		
		JLabel lblapellido = new JLabel("APELLIDO");
		lblapellido.setBounds(31, 175, 62, 14);
		contentPane.add(lblapellido);
		
		JTextArea textMostrarUsuarios = new JTextArea();
		textMostrarUsuarios.setBounds(277, 103, 300, 157);
		contentPane.add(textMostrarUsuarios);
	}
}
