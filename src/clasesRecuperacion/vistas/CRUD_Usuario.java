package clasesRecuperacion.vistas;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

import clasesRecuperacion.ConnectionManager;
import clasesRecuperacion.modelo.Contrato;
import clasesRecuperacion.modelo.TipoContrato;
import clasesRecuperacion.modelo.Usuario;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;

public class CRUD_Usuario extends JPanel {
	private JTextField tfIdUsuario;
	private JTextField tfNombreUsuario;
	private JTextField tfEmail;
	Usuario usuario;
	private JPasswordField tfPassword;
	private JComboBox jcbColorPreferido;
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
		
		tfPassword = new JPasswordField();
		tfPassword.setText("password");
		GridBagConstraints gbc_tfPassword = new GridBagConstraints();
		gbc_tfPassword.insets = new Insets(0, 0, 5, 0);
		gbc_tfPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfPassword.gridx = 2;
		gbc_tfPassword.gridy = 3;
		add(tfPassword, gbc_tfPassword);
		
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
		
		JButton btnGuardar = new JButton("guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String email = tfEmail.getText();
				if (! (email.lastIndexOf('.') > 0 && email.lastIndexOf('@') > 0 && 
						email.lastIndexOf('.') > email.lastIndexOf('@') )) {
					JOptionPane.showMessageDialog(null, "El email no es válido");
					return;
				}
				
				String nombreUsuario = tfNombreUsuario.getText();
				
				String password = tfPassword.getText();	
				//String password = new String(tfPassword.getPassword()); //para que getText() no este deprecaso
 				
				if (nombreUsuario.equals("") ||  password.equals("") ) { 
					JOptionPane.showMessageDialog(null, "El Nombre de usuario y/o la contraseña estan vacios");
					return;
				}
				boolean minuscula = false, mayuscula = false, numero = false;
				for (int i = 0; i < password.length(); i++) {
				if (Character.isLowerCase(password.charAt(i))) minuscula = true;
				else if (Character.isUpperCase(password.charAt(i))) mayuscula = true;
				else if (Character.isDigit(password.charAt(i))) numero = true;
				
				}		
				
				if (minuscula == false || mayuscula == false || numero == false) {
					JOptionPane.showMessageDialog(null, "La contraseña debe contener una letra minuscula, una mayuscula y un numero");
					return;
				}
				
				Usuario usuario = new Usuario();
				usuario.setId ( Integer.parseInt(tfIdUsuario.getText() ) );				
				usuario.setNombreUsuario(tfNombreUsuario.getText());			
				usuario.setPassword(tfPassword.getText());
				usuario.setEmail(tfEmail.getText());	
				//usuario.setColorPreferido(tfColorPreferido.getText());
				
				//TipoContrato tipo = (TipoContrato) jcbTipoContrato.getSelectedItem();
				//con.setIdTipoContrato (tipo.getId());
				
				Usuario cp = (Usuario) jcbColorPreferido.getSelectedItem();
			//	cp.setColorPreferido(cp.getId());
				
				modificarUsuario(usuario);				
			}
		});
		
		jcbColorPreferido = new JComboBox();
		jcbColorPreferido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_jcbColorPreferido = new GridBagConstraints();
		gbc_jcbColorPreferido.insets = new Insets(0, 0, 5, 0);
		gbc_jcbColorPreferido.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbColorPreferido.gridx = 2;
		gbc_jcbColorPreferido.gridy = 5;
		add(jcbColorPreferido, gbc_jcbColorPreferido);
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.gridx = 2;
		gbc_btnGuardar.gridy = 6;
		add(btnGuardar, gbc_btnGuardar);
		
		this.setBackground(Color.decode(usuario.getColorPreferido()));
		
		this.usuario.getEmail().lastIndexOf("@");
		
		cargarColoresComboBox();

	}
	
	public void cargarColoresComboBox() {
		
		jcbColorPreferido.addItem("#FF00FF");
		jcbColorPreferido.addItem("#9890A5");
		jcbColorPreferido.addItem("#765456");
		jcbColorPreferido.addItem("#879876");
		
	}

	public static int modificarUsuario(Usuario usuario) {		
		int registrosAfectados = 0;
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			
			registrosAfectados = s.executeUpdate(
					"update usuario set nombreUsuario='" + usuario.getNombreUsuario() + "', password='" + usuario.getPassword() + "', email='" + usuario.getEmail() + "', colorPreferido='" + usuario.getColorPreferido() 
					+ "' " + " where id=" + usuario.getId());
			
			JOptionPane.showMessageDialog(null, "Se ha guardado correctamente la modificacion del usuario ");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return registrosAfectados;		
	}
	
	

}
