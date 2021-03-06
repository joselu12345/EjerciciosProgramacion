package clasesRecuperacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileFilter;

import clasesRecuperacion.controladores.controladorContrato;
import clasesRecuperacion.controladores.controladorTipoContrato;
import clasesRecuperacion.controladores.controladorUsuario;
import clasesRecuperacion.modelo.Contrato;
import clasesRecuperacion.modelo.TipoContrato;
import clasesRecuperacion.modelo.Usuario;
import clasesRecuperacion.vistas.CRUD_Usuario;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField jtfID;
	private JTextField jtfDescripcion;
	private JTextField jtfSaldo;
	private JTextField jtfLimite;
	private JPanel panel;
	private JButton btnPrimero;
	private JButton btnAnterior;
	private JButton btnSiguiente;
	private JButton btnUltimo;
	private JButton btnModificar;
	private JButton btnNuevo;
	private JButton btnEliminar;
	private JComboBox<TipoContrato> jcbTipoContrato;
	private JComboBox<Usuario> jcbIdUsuario;
	private JButton btnAbrirUsuario;
	private JRadioButton jrdCuenta;
	private JRadioButton jrdTarjetaDebito;
	private JRadioButton jrdTarjetaCredito;
	private JRadioButton jrdPrestamo;
	private ButtonGroup bgTipoContrato; // para agrupar los radio button
	private JLabel lblContratos;
	
	private byte[] documentoEnBytes = null;
	private JScrollPane spCuadroImagen;
	private JButton btnCambiarImagen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("id");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		jtfID = new JTextField();
		GridBagConstraints gbc_jtfID = new GridBagConstraints();
		gbc_jtfID.insets = new Insets(0, 0, 5, 5);
		gbc_jtfID.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfID.gridx = 1;
		gbc_jtfID.gridy = 0;
		contentPane.add(jtfID, gbc_jtfID);
		
		//getContentPane().add(jtfID, gbc_jtfID);
		//frmAltaDeUsuario.getContentPane().add(jtfEmail, gbc_jtfEmail);
		
		jtfID.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("descripcion");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfDescripcion = new JTextField();
		GridBagConstraints gbc_jtfDescripcion = new GridBagConstraints();
		gbc_jtfDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_jtfDescripcion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDescripcion.gridx = 1;
		gbc_jtfDescripcion.gridy = 1;
		contentPane.add(jtfDescripcion, gbc_jtfDescripcion);
		jtfDescripcion.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("saldo");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfSaldo = new JTextField();
		GridBagConstraints gbc_jtfSaldo = new GridBagConstraints();
		gbc_jtfSaldo.insets = new Insets(0, 0, 5, 5);
		gbc_jtfSaldo.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfSaldo.gridx = 1;
		gbc_jtfSaldo.gridy = 2;
		contentPane.add(jtfSaldo, gbc_jtfSaldo);
		jtfSaldo.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("limite");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtfLimite = new JTextField();
		GridBagConstraints gbc_jtfLimite = new GridBagConstraints();
		gbc_jtfLimite.insets = new Insets(0, 0, 5, 5);
		gbc_jtfLimite.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfLimite.gridx = 1;
		gbc_jtfLimite.gridy = 3;
		contentPane.add(jtfLimite, gbc_jtfLimite);
		jtfLimite.setColumns(10);
		
		bgTipoContrato = new ButtonGroup(); // agrupar los radio button
		jrdCuenta = new JRadioButton("cuenta");
		GridBagConstraints gbc_jrdCuenta = new GridBagConstraints();
		gbc_jrdCuenta.anchor = GridBagConstraints.WEST;
		gbc_jrdCuenta.insets = new Insets(0, 0, 5, 5);
		gbc_jrdCuenta.gridx = 1;
		gbc_jrdCuenta.gridy = 4;
		bgTipoContrato.add(jrdCuenta);
		contentPane.add(jrdCuenta, gbc_jrdCuenta);
		
		lblContratos = new JLabel("contratos");
		GridBagConstraints gbc_lblContratos = new GridBagConstraints();
		gbc_lblContratos.insets = new Insets(0, 0, 5, 5);
		gbc_lblContratos.gridx = 0;
		gbc_lblContratos.gridy = 5;
		contentPane.add(lblContratos, gbc_lblContratos);
		
		jrdTarjetaDebito = new JRadioButton("tarjeta debito");
		GridBagConstraints gbc_jrdTarjetaDebito = new GridBagConstraints();
		gbc_jrdTarjetaDebito.anchor = GridBagConstraints.WEST;
		gbc_jrdTarjetaDebito.insets = new Insets(0, 0, 5, 5);
		gbc_jrdTarjetaDebito.gridx = 1;
		gbc_jrdTarjetaDebito.gridy = 5;
		bgTipoContrato.add(jrdTarjetaDebito);
		contentPane.add(jrdTarjetaDebito, gbc_jrdTarjetaDebito);
		
		jrdTarjetaCredito = new JRadioButton("tarjeta credito");
		GridBagConstraints gbc_jrdTarjetaCredito = new GridBagConstraints();
		gbc_jrdTarjetaCredito.anchor = GridBagConstraints.WEST;
		gbc_jrdTarjetaCredito.insets = new Insets(0, 0, 5, 5);
		gbc_jrdTarjetaCredito.gridx = 1;
		gbc_jrdTarjetaCredito.gridy = 6;
		bgTipoContrato.add(jrdTarjetaCredito);
		contentPane.add(jrdTarjetaCredito, gbc_jrdTarjetaCredito);
		
		jrdPrestamo = new JRadioButton("prestamo");
		GridBagConstraints gbc_jrdPrestamo = new GridBagConstraints();
		gbc_jrdPrestamo.anchor = GridBagConstraints.WEST;
		gbc_jrdPrestamo.insets = new Insets(0, 0, 5, 5);
		gbc_jrdPrestamo.gridx = 1;
		gbc_jrdPrestamo.gridy = 7;
		bgTipoContrato.add(jrdPrestamo);
		contentPane.add(jrdPrestamo, gbc_jrdPrestamo);
		
		spCuadroImagen = new JScrollPane();
		GridBagConstraints gbc_spCuadroImagen = new GridBagConstraints();
		gbc_spCuadroImagen.gridheight = 5;
		gbc_spCuadroImagen.insets = new Insets(0, 0, 5, 0);
		gbc_spCuadroImagen.fill = GridBagConstraints.BOTH;
		gbc_spCuadroImagen.gridx = 2;
		gbc_spCuadroImagen.gridy = 4;
		contentPane.add(spCuadroImagen, gbc_spCuadroImagen);
		
		JLabel lblNewLabel_4 = new JLabel("tipo contrato");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 9;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jcbTipoContrato = new JComboBox<TipoContrato>();
		jcbTipoContrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/////////////////////////
			
			}
		});
		
		
		GridBagConstraints gbc_jcbTipoContrato = new GridBagConstraints();
		gbc_jcbTipoContrato.insets = new Insets(0, 0, 5, 5);
		gbc_jcbTipoContrato.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbTipoContrato.gridx = 1;
		gbc_jcbTipoContrato.gridy = 9;
		contentPane.add(jcbTipoContrato, gbc_jcbTipoContrato);
		
		btnCambiarImagen = new JButton("seleccionar imagen");
		btnCambiarImagen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				seleccionarFicheroImagen();
				
			}
		});
		GridBagConstraints gbc_btnCambiarImagen = new GridBagConstraints();
		gbc_btnCambiarImagen.insets = new Insets(0, 0, 5, 0);
		gbc_btnCambiarImagen.gridx = 2;
		gbc_btnCambiarImagen.gridy = 9;
		contentPane.add(btnCambiarImagen, gbc_btnCambiarImagen);
		
		JLabel lblNewLabel_5 = new JLabel("usuario");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 10;
		contentPane.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jcbIdUsuario = new JComboBox<Usuario>();
		jcbIdUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				////////////////////////////		
				
			}
		});
		GridBagConstraints gbc_jcbIdUsuario = new GridBagConstraints();
		gbc_jcbIdUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_jcbIdUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbIdUsuario.gridx = 1;
		gbc_jcbIdUsuario.gridy = 10;
		contentPane.add(jcbIdUsuario, gbc_jcbIdUsuario);
		
		btnAbrirUsuario = new JButton("abrir usuario");
		btnAbrirUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Usuario usuario = (Usuario) jcbIdUsuario.getSelectedItem();
				
				JDialog dialogo = new JDialog();
				// El usuario no puede redimensionar el di??logo
				dialogo.setResizable(true);
				
				String titulo = "CRUD USUARIO";
				
				// t??tulo del d??alogo
				dialogo.setTitle(titulo );
				// Introducimos el panel creado sobre el di??logo
				dialogo.setContentPane(new CRUD_Usuario(usuario) );
				// Empaquetar el di???logo hace que todos los componentes ocupen el espacio que deben y el lugar adecuado
				dialogo.pack();
				// El usuario no puede hacer clic sobre la ventana padre, si el Di???logo es modal
				dialogo.setModal(true);
				// Centro el di???logo en pantalla
				dialogo.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width)/2 - dialogo.getWidth()/2, 
						(Toolkit.getDefaultToolkit().getScreenSize().height)/2 - dialogo.getHeight()/2);
				// Muestro el di???logo en pantalla
				dialogo.setVisible(true);
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		GridBagConstraints gbc_btnAbrirUsuario = new GridBagConstraints();
		gbc_btnAbrirUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_btnAbrirUsuario.gridx = 0;
		gbc_btnAbrirUsuario.gridy = 11;
		contentPane.add(btnAbrirUsuario, gbc_btnAbrirUsuario);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.gridwidth = 2;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 12;
		contentPane.add(panel, gbc_panel);
		
		btnPrimero = new JButton("primero");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				mostrarContrato();
				compruebaEstadoBotones();
			}
		});
		panel.add(btnPrimero);
		
		btnAnterior = new JButton("anterior");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				mostrarContratoAnterior();
				compruebaEstadoBotones();
			}
		});
		panel.add(btnAnterior);
		
		btnSiguiente = new JButton("siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				mostrarContratoSiguiente();
				compruebaEstadoBotones();
			}
		});
		panel.add(btnSiguiente);
		
		btnUltimo = new JButton("ultimo");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				mostrarUltimoContrato();
				compruebaEstadoBotones();
			}
		});
		panel.add(btnUltimo);
		
		btnModificar = new JButton("guardar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			Contrato con = new Contrato();
			con.setDescripcion(jtfDescripcion.getText());
			
			if (jtfDescripcion.getText().length() < 4) {
				JOptionPane.showMessageDialog(null, "La descripcion debe tener al menos 4 caracteres");
				return;
			}
			
			con.setId ( Integer.parseInt(jtfID.getText() ) );
			con.setSaldo ( Float.parseFloat(jtfSaldo.getText()) );
			con.setLimite ( Float.parseFloat(jtfLimite.getText()) );			
			
			TipoContrato tipo = (TipoContrato) jcbTipoContrato.getSelectedItem();
			con.setIdTipoContrato (tipo.getId());	
			
			Usuario tipoU = (Usuario)jcbIdUsuario.getSelectedItem();
			con.setIdUsuario ( tipoU.getId() );
			
			con.setDocumento(documentoEnBytes);     /////////////////////////////////////
			
			if (con.getId() == 0) {
				nuevoContrato(con);
			}
			else {
				modificarContrato(con);
				
			}
		
			}
		});
		panel.add(btnModificar);
		
		btnNuevo = new JButton("nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Contrato con = controladorContrato.findAll();
				
				jtfID.setText("0");
				jtfDescripcion.setText("");
				jtfSaldo.setText("");
				jtfLimite.setText("");
				
				jcbTipoContrato.setSelectedIndex(0)    ;	
				
				jcbIdUsuario.setSelectedIndex(0)    ;
				
//				con.setDocumento(documentoEnBytes);      ////////////////////////////////////
							
			}
		});
		panel.add(btnNuevo);
		
		btnEliminar = new JButton("eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				eliminarContrato(Integer.parseInt(jtfID.getText()));
				
			}
		});
		panel.add(btnEliminar);
		
		mostrarContrato();
		cargarTipoContratoEnComboBox();
		cargarTipoUsuarioEnComboBox();
	}
	
	////////////////////////////////////// aqui termina Principal() constructor	
	
	private void mostrarContrato() {
		
		Contrato con = controladorContrato.findPrimero();
		jtfID.setText("" + con.getId());
		jtfDescripcion.setText("" + con.getDescripcion());
		jtfSaldo.setText("" + con.getSaldo());
		jtfLimite.setText("" + con.getLimite());
		//System.out.println(con.getId() + " " + con.getDescripcion());
		
		if(con.getIdTipoContrato() == 1){
			jrdCuenta.setSelected(true);		
		}
		else if (con.getIdTipoContrato() == 2) {
			jrdTarjetaDebito.setSelected(true);
		}
		else if (con.getIdTipoContrato() == 3) {
			jrdTarjetaCredito.setSelected(true);
		}
		else if (con.getIdTipoContrato() == 4) {
			jrdPrestamo.setSelected(true);
		}
		
		//para que en el comboBox se muestre el tipo de contrato de cada usuario
		for (int i = 0; i < jcbTipoContrato.getItemCount(); i++) {
			if (jcbTipoContrato.getItemAt(i).getId() == con.getIdTipoContrato()) {
				jcbTipoContrato.setSelectedIndex(i);
			}
		}
		//para que en el comboBox se muestre el nombre de cada usuario
		for (int i = 0; i < jcbIdUsuario.getItemCount(); i++) {
			if (jcbIdUsuario.getItemAt(i).getId() == con.getIdUsuario()) {
				jcbIdUsuario.setSelectedIndex(i);
			}
		}
		
		setImagen(con.getDocumento()); ////////////////////////////////////
		
		
	}
	
	private void mostrarContratoAnterior() {
		
		Contrato con = controladorContrato.findAnterior(Integer.parseInt(jtfID.getText()));
		jtfID.setText("" + con.getId());
		jtfDescripcion.setText("" + con.getDescripcion());
		jtfSaldo.setText("" + con.getSaldo());
		jtfLimite.setText("" + con.getLimite());
		
		if(con.getIdTipoContrato() == 1){
			jrdCuenta.setSelected(true);		
		}
		else if (con.getIdTipoContrato() == 2) {
			jrdTarjetaDebito.setSelected(true);
		}
		else if (con.getIdTipoContrato() == 3) {
			jrdTarjetaCredito.setSelected(true);
		}
		else if (con.getIdTipoContrato() == 4) {
			jrdPrestamo.setSelected(true);
		}
		
		for (int i = 0; i < jcbTipoContrato.getItemCount(); i++) {
			if (jcbTipoContrato.getItemAt(i).getId() == con.getIdTipoContrato()) {
				jcbTipoContrato.setSelectedIndex(i);
			}
		}
		for (int i = 0; i < jcbIdUsuario.getItemCount(); i++) {
			if (jcbIdUsuario.getItemAt(i).getId() == con.getIdUsuario()) {
				jcbIdUsuario.setSelectedIndex(i);
			}
		}
	}
	
	private void mostrarContratoSiguiente() {
		
		Contrato con = controladorContrato.findSiguiente(Integer.parseInt(jtfID.getText()));
		jtfID.setText("" + con.getId());
		jtfDescripcion.setText("" + con.getDescripcion());
		jtfSaldo.setText("" + con.getSaldo());
		jtfLimite.setText("" + con.getLimite());
		
		if(con.getIdTipoContrato() == 1){
			jrdCuenta.setSelected(true);		
		}
		else if (con.getIdTipoContrato() == 2) {
			jrdTarjetaDebito.setSelected(true);
		}
		else if (con.getIdTipoContrato() == 3) {
			jrdTarjetaCredito.setSelected(true);
		}
		else if (con.getIdTipoContrato() == 4) {
			jrdPrestamo.setSelected(true);
		}
		
		for (int i = 0; i < jcbTipoContrato.getItemCount(); i++) {
			if (jcbTipoContrato.getItemAt(i).getId() == con.getIdTipoContrato()) {
				jcbTipoContrato.setSelectedIndex(i);
			}
		}
		for (int i = 0; i < jcbIdUsuario.getItemCount(); i++) {
			if (jcbIdUsuario.getItemAt(i).getId() == con.getIdUsuario()) {
				jcbIdUsuario.setSelectedIndex(i);
			}
		}
	}
	
	private void mostrarUltimoContrato() {
		
		Contrato con = controladorContrato.findUltimo();
		jtfID.setText("" + con.getId());
		jtfDescripcion.setText("" + con.getDescripcion());
		jtfSaldo.setText("" + con.getSaldo());
		jtfLimite.setText("" + con.getLimite());
		
		if(con.getIdTipoContrato() == 1){
			jrdCuenta.setSelected(true);		
		}
		else if (con.getIdTipoContrato() == 2) {
			jrdTarjetaDebito.setSelected(true);
		}
		else if (con.getIdTipoContrato() == 3) {
			jrdTarjetaCredito.setSelected(true);
		}
		else if (con.getIdTipoContrato() == 4) {
			jrdPrestamo.setSelected(true);
		}
		
		for (int i = 0; i < jcbTipoContrato.getItemCount(); i++) {
			if (jcbTipoContrato.getItemAt(i).getId() == con.getIdTipoContrato()) {
				jcbTipoContrato.setSelectedIndex(i);
			}
		}
		for (int i = 0; i < jcbIdUsuario.getItemCount(); i++) {
			if (jcbIdUsuario.getItemAt(i).getId() == con.getIdUsuario()) {
				jcbIdUsuario.setSelectedIndex(i);
			}
		}
	}
	
	private void compruebaEstadoBotones() {
		
		if (controladorContrato.findSiguiente(Integer.parseInt(jtfID.getText())) == null) {
			
			btnSiguiente.setEnabled(false);
			btnUltimo.setEnabled(false);
			
		}else {
			btnSiguiente.setEnabled(true);
			btnUltimo.setEnabled(true);
		}
		
		if (controladorContrato.findAnterior(Integer.parseInt(jtfID.getText())) == null) {
			
			btnAnterior.setEnabled(false);
			btnPrimero.setEnabled(false);
			
		}else {
			btnAnterior.setEnabled(true);
			btnPrimero.setEnabled(true);
		}		
	}
	
//	private void modificarContrato() {
//		
//		Contrato con = new Contrato();
//		
//		jtfID.getText();		
//	}
	
	public static int guardarContrato(Contrato con) {
		if (con.getId() == 0) {
			
			return nuevoContrato(con);
		}
		else {
			
			return modificarContrato(con);
		}
	}
	
	public static int modificarContrato(Contrato con) {		
		int registrosAfectados = 0;
		try {
			PreparedStatement ps = ConnectionManager.getConexion().prepareStatement("update contrato set descripcion=?, saldo=?, "
					+ "limite=?, idTipoContrato=?, idUsuario=?, documento=? where id=?");
			
			ps.setString(1, con.getDescripcion());
			ps.setFloat(2, con.getSaldo());
			ps.setFloat(3, con.getLimite());
			ps.setInt(4, con.getIdTipoContrato());
			ps.setInt(5, con.getIdTipoContrato());
			ps.setBytes(6, con.getDocumento());
			ps.setInt(7, con.getId());
			
			registrosAfectados = ps.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Se ha guardado correctamente la modificacion del contrato ");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return registrosAfectados;		
	}
	
	public static int eliminarContrato (int idEliminacion) {
		int registrosAfectados = 0;
		
//		Scanner sc = new Scanner(System.in);
//		int id = 0;
//		
//		System.out.println("Introduce id del contrato para su eliminaci??n: ");
//		id = sc.nextInt();
//		
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			
			registrosAfectados = s.executeUpdate(
					"delete from contrato where id=" + idEliminacion);
			
			//System.out.println("Se ha eliminado correctamente el contrato con id " + idEliminacion +" ");
			
			JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente el contrato con id " + idEliminacion +" ");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return registrosAfectados;		
	}

	public static int nuevoContrato (Contrato con) {
		int registrosAfectados = 0;
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			con.setId(siguienteIdEnTabla("contrato"));
			registrosAfectados = s.executeUpdate(
						"insert into contrato values (" + con.getId() + ",'" + con.getDescripcion() + "', " + con.getSaldo() + "," + con.getLimite() + " ," + con.getIdTipoContrato() + " ," + con.getIdUsuario() + " ," + con.getDocumento() + ")");
			
			JOptionPane.showMessageDialog(null, "Se ha guardado correctamente el nuevo contrato ");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return registrosAfectados;
	}
	
	protected static int siguienteIdEnTabla(String nombreTabla) {
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			ResultSet rs = s.executeQuery("Select max(id) from " + nombreTabla);
			
			if (rs.next()) {
				return rs.getInt(1) + 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return -1; 		
	}
	
	private void cargarTipoContratoEnComboBox() {
		List<TipoContrato> ticon = controladorTipoContrato.findAll();
		for (TipoContrato tc : ticon) {
			this.jcbTipoContrato.addItem(tc);
		}
	}
	
	private void cargarTipoUsuarioEnComboBox() {
		List<Usuario> u = controladorUsuario.findAll();
		for (Usuario i : u) {
			this.jcbIdUsuario.addItem(i);
		}
	}
	
	private void seleccionarFicheroImagen() {
		JFileChooser jfileChooser = new JFileChooser();
		
		// Configurando el componente
		
		// Tipo de selecci??n que se hace en el di??logo
		jfileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); // S??lo selecciona ficheros

		// Filtro del tipo de ficheros que puede abrir
		jfileChooser.setFileFilter(new FileFilter() {
			
			@Override
			public String getDescription() {
				return "Archivos de imagen *.jpg *.png *.gif";
			}
			
			@Override
			public boolean accept(File f) {
				if (f.isDirectory() || (f.isFile() &&
						(f.getAbsolutePath().endsWith(".jpg") || 
								f.getAbsolutePath().endsWith(".jpeg")|| 
								f.getAbsolutePath().endsWith(".png")|| 
								f.getAbsolutePath().endsWith(".gif"))))
					return true;
				return false;
			}
		});
		
		// Abro el di??logo para la elecci??n del usuario
		int seleccionUsuario = jfileChooser.showOpenDialog(null);
		
		if (seleccionUsuario == JFileChooser.APPROVE_OPTION) {
			File fichero = jfileChooser.getSelectedFile();
			
			if (fichero.isFile()) {
				try {
					setImagen(Files.readAllBytes(fichero.toPath()));
				}
				catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}
	
	
	
	public void setImagen (byte[] newimagen) {
		this.documentoEnBytes = newimagen;
		if (newimagen != null && newimagen.length > 0) {
			ImageIcon icono = new ImageIcon(newimagen);
			JLabel lblIcono = new JLabel(icono);
			this.spCuadroImagen.setViewportView(lblIcono);
		}
		else {
			JLabel lblIcono = new JLabel("Sin imagen");
			this.spCuadroImagen.setViewportView(lblIcono);
		}

	}

	


}
