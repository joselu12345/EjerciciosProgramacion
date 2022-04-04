package capitulo08;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;

public class kkprueba {

	private JFrame frame;
	private JTextField textFieldID;
	private JTextField textFieldCIF;
	private JTextField textFieldNombre;
	private JPanel panel;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JPanel panel_1;
	private JButton btnNuevo;
	private JButton btnGuardar;
	private JButton btnEliminar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kkprueba window = new kkprueba();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public kkprueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblId = new JLabel("ID:");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 1;
		gbc_lblId.gridy = 1;
		frame.getContentPane().add(lblId, gbc_lblId);
		
		textFieldID = new JTextField();
		GridBagConstraints gbc_textFieldID = new GridBagConstraints();
		gbc_textFieldID.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldID.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldID.gridx = 2;
		gbc_textFieldID.gridy = 1;
		frame.getContentPane().add(textFieldID, gbc_textFieldID);
		textFieldID.setColumns(10);
		
		JLabel lblCif = new JLabel("CIF:");
		GridBagConstraints gbc_lblCif = new GridBagConstraints();
		gbc_lblCif.anchor = GridBagConstraints.EAST;
		gbc_lblCif.insets = new Insets(0, 0, 5, 5);
		gbc_lblCif.gridx = 1;
		gbc_lblCif.gridy = 2;
		frame.getContentPane().add(lblCif, gbc_lblCif);
		
		textFieldCIF = new JTextField();
		GridBagConstraints gbc_textFieldCIF = new GridBagConstraints();
		gbc_textFieldCIF.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldCIF.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldCIF.gridx = 2;
		gbc_textFieldCIF.gridy = 2;
		frame.getContentPane().add(textFieldCIF, gbc_textFieldCIF);
		textFieldCIF.setColumns(10);
		
		JLabel lblNombre = new JLabel("NOMBRE:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 3;
		frame.getContentPane().add(lblNombre, gbc_lblNombre);
		
		textFieldNombre = new JTextField();
		GridBagConstraints gbc_textFieldNombre = new GridBagConstraints();
		gbc_textFieldNombre.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNombre.gridx = 2;
		gbc_textFieldNombre.gridy = 3;
		frame.getContentPane().add(textFieldNombre, gbc_textFieldNombre);
		textFieldNombre.setColumns(10);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridwidth = 3;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 4;
		frame.getContentPane().add(panel, gbc_panel);
		
		button = new JButton("<<");
		panel.add(button);
		
		button_1 = new JButton("<");
		panel.add(button_1);
		
		button_2 = new JButton(">");
		panel.add(button_2);
		
		button_3 = new JButton(">>");
		panel.add(button_3);
		
		panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 3;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 5;
		frame.getContentPane().add(panel_1, gbc_panel_1);
		
		btnNuevo = new JButton("Nuevo");
		panel_1.add(btnNuevo);
		
		btnGuardar = new JButton("Guardar");
		panel_1.add(btnGuardar);
		
		btnEliminar = new JButton("Eliminar");
		panel_1.add(btnEliminar);
	}

}
