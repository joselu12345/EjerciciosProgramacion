package clasesRecuperacionSuper;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clasesRecuperacion.controladores.controladorContrato;
import clasesRecuperacion.modelo.Contrato;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField jtfID;
	private JTextField jtfDescripcion;
	private JTextField jtfSaldo;
	private JTextField jtfLimite;
	private JTextField jtfIdTipoContrato;
	private JTextField jtdIdUsuario;
	private JPanel panel;
	private JButton btnPrimero;
	private JButton btnAnterior;
	private JButton btnSiguiente;
	private JButton btnUltimo;
	private JButton btnModificar;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
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
		gbc_jtfID.insets = new Insets(0, 0, 5, 0);
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
		gbc_jtfDescripcion.insets = new Insets(0, 0, 5, 0);
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
		gbc_jtfSaldo.insets = new Insets(0, 0, 5, 0);
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
		gbc_jtfLimite.insets = new Insets(0, 0, 5, 0);
		gbc_jtfLimite.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfLimite.gridx = 1;
		gbc_jtfLimite.gridy = 3;
		contentPane.add(jtfLimite, gbc_jtfLimite);
		jtfLimite.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("id tipo contrato");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jtfIdTipoContrato = new JTextField();
		GridBagConstraints gbc_jtfIdTipoContrato = new GridBagConstraints();
		gbc_jtfIdTipoContrato.insets = new Insets(0, 0, 5, 0);
		gbc_jtfIdTipoContrato.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfIdTipoContrato.gridx = 1;
		gbc_jtfIdTipoContrato.gridy = 4;
		contentPane.add(jtfIdTipoContrato, gbc_jtfIdTipoContrato);
		jtfIdTipoContrato.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("id usuario");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		contentPane.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jtdIdUsuario = new JTextField();
		GridBagConstraints gbc_jtdIdUsuario = new GridBagConstraints();
		gbc_jtdIdUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_jtdIdUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtdIdUsuario.gridx = 1;
		gbc_jtdIdUsuario.gridy = 5;
		contentPane.add(jtdIdUsuario, gbc_jtdIdUsuario);
		jtdIdUsuario.setColumns(10);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 6;
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
		
		btnModificar = new JButton("modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				modificarContrato();
			}
		});
		panel.add(btnModificar);
		
		mostrarContrato();
	}
	
	private void mostrarContrato() {
		
		Contrato con = controladorContrato.findPrimero();
		jtfID.setText("" + con.getId());
		jtfDescripcion.setText("" + con.getDescripcion());
		jtfSaldo.setText("" + con.getSaldo());
		jtfLimite.setText("" + con.getLimite());
		jtfIdTipoContrato.setText("" + con.getIdTipoContrato());
		jtdIdUsuario.setText("" + con.getIdUsuario());
		//System.out.println(con.getId() + " " + con.getDescripcion());
		
	}
	
	private void mostrarContratoAnterior() {
		
		Contrato con = controladorContrato.findAnterior(Integer.parseInt(jtfID.getText()));
		jtfID.setText("" + con.getId());
		jtfDescripcion.setText("" + con.getDescripcion());
		jtfSaldo.setText("" + con.getSaldo());
		jtfLimite.setText("" + con.getLimite());
		jtfIdTipoContrato.setText("" + con.getIdTipoContrato());
		jtdIdUsuario.setText("" + con.getIdUsuario());
		
	}
	
	private void mostrarContratoSiguiente() {
		
		Contrato con = controladorContrato.findSiguiente(Integer.parseInt(jtfID.getText()));
		jtfID.setText("" + con.getId());
		jtfDescripcion.setText("" + con.getDescripcion());
		jtfSaldo.setText("" + con.getSaldo());
		jtfLimite.setText("" + con.getLimite());
		jtfIdTipoContrato.setText("" + con.getIdTipoContrato());
		jtdIdUsuario.setText("" + con.getIdUsuario());
		
	}
	
	private void mostrarUltimoContrato() {
		
		Contrato con = controladorContrato.findUltimo();
		jtfID.setText("" + con.getId());
		jtfDescripcion.setText("" + con.getDescripcion());
		jtfSaldo.setText("" + con.getSaldo());
		jtfLimite.setText("" + con.getLimite());
		jtfIdTipoContrato.setText("" + con.getIdTipoContrato());
		jtdIdUsuario.setText("" + con.getIdUsuario());
		
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
			Statement s = ConnectionManager.getConexion().createStatement();
			
			registrosAfectados = s.executeUpdate(
					"update contrato set descripcion='" + con.getDescripcion() + "', saldo='" + con.getSaldo() + "', limite='" + con.getLimite() + "', idTipoContrato='" + con.getIdTipoContrato() + "', idUsuario='" + con.getIdUsuario() 
					+ "' " + " where id=" + con.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return registrosAfectados;		
	}
	
	public static int eliminarContrato (int idEliminacion) {		
		int registrosAfectados = 0;
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			
			registrosAfectados = s.executeUpdate(
					"delete from contrato where id=" + idEliminacion);
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
						"insert into contrato values (" + con.getId() + ",'" + con.getDescripcion() + "', '" + con.getSaldo() + ",'" + con.getLimite() + " ,'" + con.getIdTipoContrato() + " ,'" + con.getIdUsuario() + "')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return registrosAfectados;
	}


}
