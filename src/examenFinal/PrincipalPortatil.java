package examenFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clasesRecuperacion.ConnectionManager;
import clasesRecuperacion.controladores.controladorContrato;
import clasesRecuperacion.controladores.controladorTipoContrato;
import clasesRecuperacion.modelo.Contrato;
import clasesRecuperacion.modelo.TipoContrato;
import clasesRecuperacion.modelo.Usuario;
import examenFinal.controladores.controladorMarca;
import examenFinal.controladores.controladorPortatil;
import examenFinal.modelo.Marca;
import examenFinal.modelo.Portatil;

import java.awt.GridBagLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class PrincipalPortatil extends JFrame {

	private JPanel contentPane;
	private JTextField tfId;
	private JTextField tfmodelo;
	private JTextField tfSerialLabel;
	private JTextField tfFechaVenta;
	
	private JButton btnPrimero;
	private JButton btnAnterior;
	private JButton btnSiguiente;
	private JButton btnUltimo;
	private JButton btnModificar;
	private JButton btnNuevo;
	private JButton btnEliminar;
	
	
	private JComboBox<Marca> jcbMarcaPortatil;
	private JRadioButton rdbtn1Procesador;
	private JRadioButton rdbtn2Procesadores;
	private JRadioButton rdbtn3Procesadores;
	private JRadioButton rdbtn4Procesadores;
	private ButtonGroup bgNumProcesadores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalPortatil frame = new PrincipalPortatil();
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
	public PrincipalPortatil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnPrimero = new JButton("primero");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				mostrarPortatil();
				compruebaEstadoBotones();
			}
		});
		GridBagConstraints gbc_btnPrimero = new GridBagConstraints();
		gbc_btnPrimero.insets = new Insets(0, 0, 5, 5);
		gbc_btnPrimero.gridx = 0;
		gbc_btnPrimero.gridy = 0;
		contentPane.add(btnPrimero, gbc_btnPrimero);
		
		JButton btnAnterior = new JButton("anterior");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				mostrarPortatilAnterior();
				compruebaEstadoBotones();
			}
		});
		GridBagConstraints gbc_btnAnterior = new GridBagConstraints();
		gbc_btnAnterior.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnterior.gridx = 1;
		gbc_btnAnterior.gridy = 0;
		contentPane.add(btnAnterior, gbc_btnAnterior);
		
		JButton btnSiguiente = new JButton("siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				mostrarContratoSiguiente();
				compruebaEstadoBotones();
			}
		});
		GridBagConstraints gbc_btnSiguiente = new GridBagConstraints();
		gbc_btnSiguiente.insets = new Insets(0, 0, 5, 5);
		gbc_btnSiguiente.gridx = 2;
		gbc_btnSiguiente.gridy = 0;
		contentPane.add(btnSiguiente, gbc_btnSiguiente);
		
		JButton btnUltimo = new JButton("ultimo");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				mostrarUltimoContrato();
				compruebaEstadoBotones();
			}
		});
		GridBagConstraints gbc_btnUltimo = new GridBagConstraints();
		gbc_btnUltimo.insets = new Insets(0, 0, 5, 5);
		gbc_btnUltimo.gridx = 3;
		gbc_btnUltimo.gridy = 0;
		contentPane.add(btnUltimo, gbc_btnUltimo);
		
		JButton btnNuevo = new JButton("nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				tfId.setText("0");
				tfmodelo.setText("");
				tfSerialLabel.setText("");
				tfFechaVenta.setText("");
				
				jcbMarcaPortatil.setSelectedIndex(0)    ;	
				
				
			}
		});
		GridBagConstraints gbc_btnNuevo = new GridBagConstraints();
		gbc_btnNuevo.insets = new Insets(0, 0, 5, 5);
		gbc_btnNuevo.gridx = 0;
		gbc_btnNuevo.gridy = 1;
		contentPane.add(btnNuevo, gbc_btnNuevo);
		
		JButton btnGuardar = new JButton("guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Portatil por = new Portatil();
				por.setModelo(tfmodelo.getText());
			
				
				por.setId ( Integer.parseInt(tfId.getText() ) );
				por.setSn ( tfSerialLabel.getText() );
				por.setFechaVenta(null);
				
				TipoContrato tipo = (TipoContrato) jcbMarcaPortatil.getSelectedItem();
				por.setIdMarca(ABORT);	
				
				
				if (por.getId() == 0) {
					nuevoPortatil(por);
				}
				else {
					modificarPortatil(por);
					
				}
				
				
				
				
				
				
			}
		});
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.gridx = 1;
		gbc_btnGuardar.gridy = 1;
		contentPane.add(btnGuardar, gbc_btnGuardar);
		
		JButton btnEliminar = new JButton("eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				eliminarPortatil(Integer.parseInt(tfId.getText()));
				
			}
		});
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.gridx = 2;
		gbc_btnEliminar.gridy = 1;
		contentPane.add(btnEliminar, gbc_btnEliminar);
		
		JLabel lblGestionDeOrdenadores = new JLabel("Gestion de Ordenadores Portatiles");
		GridBagConstraints gbc_lblGestionDeOrdenadores = new GridBagConstraints();
		gbc_lblGestionDeOrdenadores.insets = new Insets(0, 0, 5, 0);
		gbc_lblGestionDeOrdenadores.gridwidth = 5;
		gbc_lblGestionDeOrdenadores.gridx = 0;
		gbc_lblGestionDeOrdenadores.gridy = 2;
		contentPane.add(lblGestionDeOrdenadores, gbc_lblGestionDeOrdenadores);
		
		JLabel lblId = new JLabel("id");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 3;
		contentPane.add(lblId, gbc_lblId);
		
		tfId = new JTextField();
		GridBagConstraints gbc_tfId = new GridBagConstraints();
		gbc_tfId.insets = new Insets(0, 0, 5, 0);
		gbc_tfId.gridwidth = 4;
		gbc_tfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfId.gridx = 1;
		gbc_tfId.gridy = 3;
		contentPane.add(tfId, gbc_tfId);
		tfId.setColumns(10);
		
		JLabel lblMarca = new JLabel("marca");
		GridBagConstraints gbc_lblMarca = new GridBagConstraints();
		gbc_lblMarca.anchor = GridBagConstraints.EAST;
		gbc_lblMarca.insets = new Insets(0, 0, 5, 5);
		gbc_lblMarca.gridx = 0;
		gbc_lblMarca.gridy = 4;
		contentPane.add(lblMarca, gbc_lblMarca);
		
		JComboBox jcbMarca = new JComboBox();
		GridBagConstraints gbc_jcbMarca = new GridBagConstraints();
		gbc_jcbMarca.gridwidth = 2;
		gbc_jcbMarca.insets = new Insets(0, 0, 5, 5);
		gbc_jcbMarca.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbMarca.gridx = 1;
		gbc_jcbMarca.gridy = 4;
		contentPane.add(jcbMarca, gbc_jcbMarca);
		
		JButton btnVerMarca = new JButton("Ver Marca");
		btnVerMarca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnVerMarca = new GridBagConstraints();
		gbc_btnVerMarca.insets = new Insets(0, 0, 5, 5);
		gbc_btnVerMarca.gridx = 3;
		gbc_btnVerMarca.gridy = 4;
		contentPane.add(btnVerMarca, gbc_btnVerMarca);
		
		JLabel lblModelo = new JLabel("modelo");
		GridBagConstraints gbc_lblModelo = new GridBagConstraints();
		gbc_lblModelo.anchor = GridBagConstraints.EAST;
		gbc_lblModelo.insets = new Insets(0, 0, 5, 5);
		gbc_lblModelo.gridx = 0;
		gbc_lblModelo.gridy = 5;
		contentPane.add(lblModelo, gbc_lblModelo);
		
		tfmodelo = new JTextField();
		GridBagConstraints gbc_tfmodelo = new GridBagConstraints();
		gbc_tfmodelo.insets = new Insets(0, 0, 5, 0);
		gbc_tfmodelo.gridwidth = 4;
		gbc_tfmodelo.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfmodelo.gridx = 1;
		gbc_tfmodelo.gridy = 5;
		contentPane.add(tfmodelo, gbc_tfmodelo);
		tfmodelo.setColumns(10);
		
		JLabel lblSerialLabel = new JLabel("serial label");
		GridBagConstraints gbc_lblSerialLabel = new GridBagConstraints();
		gbc_lblSerialLabel.anchor = GridBagConstraints.EAST;
		gbc_lblSerialLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblSerialLabel.gridx = 0;
		gbc_lblSerialLabel.gridy = 6;
		contentPane.add(lblSerialLabel, gbc_lblSerialLabel);
		
		tfSerialLabel = new JTextField();
		GridBagConstraints gbc_tfSerialLabel = new GridBagConstraints();
		gbc_tfSerialLabel.insets = new Insets(0, 0, 5, 0);
		gbc_tfSerialLabel.gridwidth = 4;
		gbc_tfSerialLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfSerialLabel.gridx = 1;
		gbc_tfSerialLabel.gridy = 6;
		contentPane.add(tfSerialLabel, gbc_tfSerialLabel);
		tfSerialLabel.setColumns(10);
		
		JLabel lblNumProcesadores = new JLabel("num Procesadores");
		GridBagConstraints gbc_lblNumProcesadores = new GridBagConstraints();
		gbc_lblNumProcesadores.gridheight = 2;
		gbc_lblNumProcesadores.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumProcesadores.gridx = 0;
		gbc_lblNumProcesadores.gridy = 7;
		contentPane.add(lblNumProcesadores, gbc_lblNumProcesadores);
		
		
		
		
		
		
		
		
		
		
		
		
		
		bgNumProcesadores = new ButtonGroup();
		rdbtn1Procesador = new JRadioButton("1 procesador");
		GridBagConstraints gbc_rdbtn1Procesador = new GridBagConstraints();
		gbc_rdbtn1Procesador.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtn1Procesador.gridx = 1;
		gbc_rdbtn1Procesador.gridy = 7;
		bgNumProcesadores.add(rdbtn1Procesador);
		contentPane.add(rdbtn1Procesador, gbc_rdbtn1Procesador);
		
		rdbtn2Procesadores = new JRadioButton("2 procesadores");
		GridBagConstraints gbc_rdbtn2Procesadores = new GridBagConstraints();
		gbc_rdbtn2Procesadores.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtn2Procesadores.gridx = 2;
		gbc_rdbtn2Procesadores.gridy = 7;
		bgNumProcesadores.add(rdbtn2Procesadores);
		contentPane.add(rdbtn2Procesadores, gbc_rdbtn2Procesadores);
		
		rdbtn3Procesadores = new JRadioButton("3 procesadores");
		GridBagConstraints gbc_rdbtn3Procesadores = new GridBagConstraints();
		gbc_rdbtn3Procesadores.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtn3Procesadores.gridx = 1;
		gbc_rdbtn3Procesadores.gridy = 8;
		bgNumProcesadores.add(rdbtn3Procesadores);
		contentPane.add(rdbtn3Procesadores, gbc_rdbtn3Procesadores);
		
		rdbtn4Procesadores = new JRadioButton("4 procesadores");
		GridBagConstraints gbc_rdbtn4Procesadores = new GridBagConstraints();
		gbc_rdbtn4Procesadores.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtn4Procesadores.gridx = 2;
		gbc_rdbtn4Procesadores.gridy = 8;
		bgNumProcesadores.add(rdbtn4Procesadores);
		contentPane.add(rdbtn4Procesadores, gbc_rdbtn4Procesadores);
		
		JLabel lblVendido = new JLabel("vendido");
		GridBagConstraints gbc_lblVendido = new GridBagConstraints();
		gbc_lblVendido.insets = new Insets(0, 0, 5, 5);
		gbc_lblVendido.gridx = 0;
		gbc_lblVendido.gridy = 9;
		contentPane.add(lblVendido, gbc_lblVendido);
		
		JCheckBox cbVendido = new JCheckBox("");
		GridBagConstraints gbc_cbVendido = new GridBagConstraints();
		gbc_cbVendido.insets = new Insets(0, 0, 5, 5);
		gbc_cbVendido.gridx = 1;
		gbc_cbVendido.gridy = 9;
		contentPane.add(cbVendido, gbc_cbVendido);
		
		JLabel lblFechaDeVenta = new JLabel("fecha de venta");
		GridBagConstraints gbc_lblFechaDeVenta = new GridBagConstraints();
		gbc_lblFechaDeVenta.anchor = GridBagConstraints.EAST;
		gbc_lblFechaDeVenta.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaDeVenta.gridx = 0;
		gbc_lblFechaDeVenta.gridy = 10;
		contentPane.add(lblFechaDeVenta, gbc_lblFechaDeVenta);
		
		tfFechaVenta = new JTextField();
		GridBagConstraints gbc_tfFechaVenta = new GridBagConstraints();
		gbc_tfFechaVenta.gridwidth = 4;
		gbc_tfFechaVenta.insets = new Insets(0, 0, 5, 0);
		gbc_tfFechaVenta.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfFechaVenta.gridx = 1;
		gbc_tfFechaVenta.gridy = 10;
		contentPane.add(tfFechaVenta, gbc_tfFechaVenta);
		tfFechaVenta.setColumns(10);
		
		JButton btnNumeroTotalPortatiles = new JButton("Numero Total Portatiles");
		GridBagConstraints gbc_btnNumeroTotalPortatiles = new GridBagConstraints();
		gbc_btnNumeroTotalPortatiles.gridwidth = 5;
		gbc_btnNumeroTotalPortatiles.gridx = 0;
		gbc_btnNumeroTotalPortatiles.gridy = 12;
		contentPane.add(btnNumeroTotalPortatiles, gbc_btnNumeroTotalPortatiles);
		
		
		
		
		
		mostrarPortatil();
		
		
	}
	
private void mostrarPortatil() {
		
		Portatil por = controladorPortatil.findPrimero();
		//Marca mar = controladorMarca.findAll();
		tfId.setText("" + por.getId());
		tfmodelo.setText("" + por.getModelo());
		tfSerialLabel.setText("" + por.getSn());
		tfFechaVenta.setText("" + por.getFechaVenta());
		
		if(por.getNumProcesadores() == 1){
			rdbtn1Procesador.setSelected(true);		
		}
		else if (por.getNumProcesadores() == 2) {
			rdbtn2Procesadores.setSelected(true);
		}
		else if (por.getNumProcesadores() == 3) {
			rdbtn3Procesadores.setSelected(true);
		}
		else if (por.getNumProcesadores() == 4) {
			rdbtn4Procesadores.setSelected(true);
		}
		
		for (int i = 0; i < jcbMarcaPortatil.getItemCount(); i++) {
			if (jcbMarcaPortatil.getItemAt(i).getId() == por.getIdMarca()) {
				jcbMarcaPortatil.setSelectedIndex(i);
			}
		}
		
		
		
	}
	
	private void mostrarPortatilAnterior() {
		
		Portatil por = controladorPortatil.findAnterior(Integer.parseInt(tfId.getText()));
		tfId.setText("" + por.getId());
		tfmodelo.setText("" + por.getModelo());
		tfSerialLabel.setText("" + por.getSn());
		tfFechaVenta.setText("" + por.getFechaVenta());
		
		if(por.getNumProcesadores() == 1){
			rdbtn1Procesador.setSelected(true);		
		}
		else if (por.getNumProcesadores() == 2) {
			rdbtn2Procesadores.setSelected(true);
		}
		else if (por.getNumProcesadores() == 3) {
			rdbtn3Procesadores.setSelected(true);
		}
		else if (por.getNumProcesadores() == 4) {
			rdbtn4Procesadores.setSelected(true);
		}
		
		for (int i = 0; i < jcbMarcaPortatil.getItemCount(); i++) {
			if (jcbMarcaPortatil.getItemAt(i).getId() == por.getIdMarca()) {
				jcbMarcaPortatil.setSelectedIndex(i);
			}
		}	
		
	}
	
	private void mostrarContratoSiguiente() {
		
		Portatil por = controladorPortatil.findSiguiente(Integer.parseInt(tfId.getText()));
		tfmodelo.setText("" + por.getModelo());
		tfSerialLabel.setText("" + por.getSn());
		tfFechaVenta.setText("" + por.getFechaVenta());
		
		if(por.getNumProcesadores() == 1){
			rdbtn1Procesador.setSelected(true);		
		}
		else if (por.getNumProcesadores() == 2) {
			rdbtn2Procesadores.setSelected(true);
		}
		else if (por.getNumProcesadores() == 3) {
			rdbtn3Procesadores.setSelected(true);
		}
		else if (por.getNumProcesadores() == 4) {
			rdbtn4Procesadores.setSelected(true);
		}
		
		for (int i = 0; i < jcbMarcaPortatil.getItemCount(); i++) {
			if (jcbMarcaPortatil.getItemAt(i).getId() == por.getIdMarca()) {
				jcbMarcaPortatil.setSelectedIndex(i);
			}
		}
	}
	
	private void mostrarUltimoContrato() {
		
		Portatil por = controladorPortatil.findUltimo();
		tfmodelo.setText("" + por.getModelo());
		tfSerialLabel.setText("" + por.getSn());
		tfFechaVenta.setText("" + por.getFechaVenta());
		
		if(por.getNumProcesadores() == 1){
			rdbtn1Procesador.setSelected(true);		
		}
		else if (por.getNumProcesadores() == 2) {
			rdbtn2Procesadores.setSelected(true);
		}
		else if (por.getNumProcesadores() == 3) {
			rdbtn3Procesadores.setSelected(true);
		}
		else if (por.getNumProcesadores() == 4) {
			rdbtn4Procesadores.setSelected(true);
		}
		
		for (int i = 0; i < jcbMarcaPortatil.getItemCount(); i++) {
			if (jcbMarcaPortatil.getItemAt(i).getId() == por.getIdMarca()) {
				jcbMarcaPortatil.setSelectedIndex(i);
			}
		}
		
	}
	
	private void compruebaEstadoBotones() {
		
		if (controladorPortatil.findSiguiente(Integer.parseInt(tfId.getText())) == null) {
			
			btnSiguiente.setEnabled(false);
			btnUltimo.setEnabled(false);
			
		}else {
			btnSiguiente.setEnabled(true);
			btnUltimo.setEnabled(true);
		}
		
		if (controladorPortatil.findAnterior(Integer.parseInt(tfId.getText())) == null) {
			
			btnAnterior.setEnabled(false);
			btnPrimero.setEnabled(false);
			
		}else {
			btnAnterior.setEnabled(true);
			btnPrimero.setEnabled(true);
		}		
	}
	
	
	
	
	
	
	
	public static int guardarPortatil(Portatil por) {
		if (por.getId() == 0) {
			
			return nuevoPortatil(por);
		}
		else {
			
			return modificarPortatil(por);
		}
	}
	
	public static int modificarPortatil(Portatil por) {		
		int registrosAfectados = 0;
		try {
			PreparedStatement ps = ConnectionManager.getConexion().prepareStatement("update portatil set modelo=?, sn=?, "
					+ "numProcesadores=?, vendido=?, fechaVenta=?, idMarca=? where id=?");
			
			ps.setString(1, por.getModelo());
			ps.setString(2, por.getSn());
			ps.setInt(3, por.getNumProcesadores());
			ps.setBoolean(4, por.isVendido());
			ps.setDate(5, por.getFechaVenta());
			ps.setInt(6, por.getIdMarca());
			
			registrosAfectados = ps.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Se ha guardado correctamente la modificacion del portatil ");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return registrosAfectados;		
	}
	
	public static int eliminarPortatil (int idEliminacion) {
		int registrosAfectados = 0;
		
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			
			registrosAfectados = s.executeUpdate(
					"delete from portatil where id=" + idEliminacion);
			
			JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente el portatil con id " + idEliminacion +" ");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return registrosAfectados;		
	}

	public static int nuevoPortatil (Portatil por) {
		int registrosAfectados = 0;
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			por.setId(siguienteIdEnTabla("portatil"));
			registrosAfectados = s.executeUpdate(
						"insert into portatil values (" + por.getId() + ",'" + por.getModelo() + "', " + por.getSn() + "," + por.getNumProcesadores() + " ," + por.isVendido() + " ," + por.getFechaVenta() + " ," + por.getIdMarca() + ")");
			
			JOptionPane.showMessageDialog(null, "Se ha guardado correctamente el nuevo portatil ");
			
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
	
	private void cargarMarcaEnComboBox() {
		List<Marca> mar = controladorMarca.findAll();
		for (Marca m : mar) {
			this.jcbMarcaPortatil.addItem(m);
		}
	}
	
	
	
	
	

}
