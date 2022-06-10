package clasesRecuperacion.vistas;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

import clasesRecuperacion.modelo.Usuario;

import javax.swing.JButton;

public class CRUD_Usuario extends JPanel {
	private JTextField tfIdUsuario;
	private JTextField tfNombreUsuario;
	private JTextField tfPassword;
	private JTextField tfEmail;
	private JTextField tfColorPreferido;
	Usuario usuario;

	/**
	 * Create the panel.
	 */
	public CRUD_Usuario(Usuario usuario) {
		this.usuario = usuario;
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblIdUsuario = new JLabel("id Usuario");
		GridBagConstraints gbc_lblIdUsuario = new GridBagConstraints();
		gbc_lblIdUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblIdUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdUsuario.gridx = 1;
		gbc_lblIdUsuario.gridy = 1;
		add(lblIdUsuario, gbc_lblIdUsuario);
		
		tfIdUsuario = new JTextField("" + usuario.getId());       
		GridBagConstraints gbc_tfIdUsuario = new GridBagConstraints();
		gbc_tfIdUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_tfIdUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfIdUsuario.gridx = 2;
		gbc_tfIdUsuario.gridy = 1;
		add(tfIdUsuario, gbc_tfIdUsuario);
		tfIdUsuario.setColumns(10);
		
		JLabel lblNombreUsuario = new JLabel("nombre Usuario");
		GridBagConstraints gbc_lblNombreUsuario = new GridBagConstraints();
		gbc_lblNombreUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblNombreUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreUsuario.gridx = 1;
		gbc_lblNombreUsuario.gridy = 2;
		add(lblNombreUsuario, gbc_lblNombreUsuario);
		
		tfNombreUsuario = new JTextField(usuario.getNombreUsuario());
		GridBagConstraints gbc_tfNombreUsuario = new GridBagConstraints();
		gbc_tfNombreUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_tfNombreUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNombreUsuario.gridx = 2;
		gbc_tfNombreUsuario.gridy = 2;
		add(tfNombreUsuario, gbc_tfNombreUsuario);
		tfNombreUsuario.setColumns(10);
		
		JLabel lblPassword = new JLabel("password");
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.EAST;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 1;
		gbc_lblPassword.gridy = 3;
		add(lblPassword, gbc_lblPassword);
		
		tfPassword = new JTextField(usuario.getPassword());
		GridBagConstraints gbc_tfPassword = new GridBagConstraints();
		gbc_tfPassword.insets = new Insets(0, 0, 5, 0);
		gbc_tfPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfPassword.gridx = 2;
		gbc_tfPassword.gridy = 3;
		add(tfPassword, gbc_tfPassword);
		tfPassword.setColumns(10);
		
		JLabel lblEmail = new JLabel("eMail");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 4;
		add(lblEmail, gbc_lblEmail);
		
		tfEmail = new JTextField(usuario.getEmail());
		GridBagConstraints gbc_tfEmail = new GridBagConstraints();
		gbc_tfEmail.insets = new Insets(0, 0, 5, 0);
		gbc_tfEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfEmail.gridx = 2;
		gbc_tfEmail.gridy = 4;
		add(tfEmail, gbc_tfEmail);
		tfEmail.setColumns(10);
		
		JLabel lblColorPreferido = new JLabel("Color Preferido");
		GridBagConstraints gbc_lblColorPreferido = new GridBagConstraints();
		gbc_lblColorPreferido.anchor = GridBagConstraints.EAST;
		gbc_lblColorPreferido.insets = new Insets(0, 0, 5, 5);
		gbc_lblColorPreferido.gridx = 1;
		gbc_lblColorPreferido.gridy = 5;
		add(lblColorPreferido, gbc_lblColorPreferido);
		
		tfColorPreferido = new JTextField(usuario.getColorPreferido());
		GridBagConstraints gbc_tfColorPreferido = new GridBagConstraints();
		gbc_tfColorPreferido.insets = new Insets(0, 0, 5, 0);
		gbc_tfColorPreferido.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfColorPreferido.gridx = 2;
		gbc_tfColorPreferido.gridy = 5;
		add(tfColorPreferido, gbc_tfColorPreferido);
		tfColorPreferido.setColumns(10);
		
		JButton btnGuardar = new JButton("guardar");
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.gridx = 2;
		gbc_btnGuardar.gridy = 6;
		add(btnGuardar, gbc_btnGuardar);

	}

}
