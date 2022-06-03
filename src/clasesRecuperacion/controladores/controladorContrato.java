package clasesRecuperacion.controladores;



import clasesRecuperacion.ConnectionManager;
import clasesRecuperacion.modelo.Contrato;


import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

public class controladorContrato {

//	public static Contrato find(){
//		
//		Contrato con = null;
//		
//		try {
//			
//			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
//			
//			ResultSet rs = s.executeQuery ("select * from contrato");
//			
//			while (rs.next()) {
//				
//				con = new Contrato(rs.getInt("id"), rs.getString("descripcion"), rs.getFloat("saldo"), rs.getFloat("limite"), rs.getInt("idTipoContrato"), rs.getInt("idUsuario"));
//				
//			}
//			
//			rs.close();
//			s.close();
//			
//		}catch (SQLException ex) {
//			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
//			ex.printStackTrace();
//		}
//	
//		
//		return con;	
//		
//	}
	
	public static Contrato findPrimero(){
	
	Contrato con = null;
	
	try {
		
		Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
		
		ResultSet rs = s.executeQuery ("select * from contrato order by id limit 1");
		
		while (rs.next()) {
			
			con = new Contrato(rs.getInt("id"), rs.getString("descripcion"), rs.getFloat("saldo"), rs.getFloat("limite"), rs.getInt("idTipoContrato"), rs.getInt("idUsuario"));
			
		}
		
		rs.close();
		s.close();
		
	}catch (SQLException ex) {
		System.out.println("Error en la ejecución SQL: " + ex.getMessage());
		ex.printStackTrace();
	}

	
	return con;	
	
}
	
	public static Contrato findAnterior(int id){
		
		Contrato con = null;
		
		try {
			
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			ResultSet rs = s.executeQuery ("Select * from contrato where id <" + id +" order by id desc limit 1");
			
			while (rs.next()) {
				
				con = new Contrato(rs.getInt("id"), rs.getString("descripcion"), rs.getFloat("saldo"), rs.getFloat("limite"), rs.getInt("idTipoContrato"), rs.getInt("idUsuario"));
				
			}
			
			rs.close();
			s.close();
			
		}catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}

		
		return con;	
		
	}
	
	public static Contrato findSiguiente(int id){
		
		Contrato con = null;
		
		try {
			
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			ResultSet rs = s.executeQuery ("Select * from contrato where id >" + id +" order by id limit 1");
			
			while (rs.next()) {
				
				con = new Contrato(rs.getInt("id"), rs.getString("descripcion"), rs.getFloat("saldo"), rs.getFloat("limite"), rs.getInt("idTipoContrato"), rs.getInt("idUsuario"));
				
			}
			
			rs.close();
			s.close();
			
		}catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}

		
		return con;	
		
	}
	
	public static Contrato findUltimo(){
		
		Contrato con = null;
		
		try {
			
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from contrato order by id desc limit 1");
			
			while (rs.next()) {
				
				con = new Contrato(rs.getInt("id"), rs.getString("descripcion"), rs.getFloat("saldo"), rs.getFloat("limite"), rs.getInt("idTipoContrato"), rs.getInt("idUsuario"));
				
			}
			
			rs.close();
			s.close();
			
		}catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}

		
		return con;	
		
	}
	
	public static List<Contrato> findAll(){
		
		List<Contrato> lista = new ArrayList<Contrato>();
		
		Contrato con = null;
		
		try {
			
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from contrato");
			
			while (rs.next()) {
				
				con = new Contrato(rs.getInt("id"), rs.getString("descripcion"), rs.getFloat("saldo"), rs.getFloat("limite"), rs.getInt("idTipoContrato"), rs.getInt("idUsuario"));
				lista.add(con);
			}
			
			rs.close();
			s.close();
			
		}catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	
		
		return lista;	
		
	}
	
	public static void main (String[] args) {
		
//		Contrato con = find();
//		System.out.println(con.getId() + " " + con.getDescripcion());
		
		Contrato con = findPrimero();
		System.out.println(con.getId() + " " + con.getDescripcion());
		
		
//		List<Contrato> lista = findAll();
		
//		for (Contrato con : lista) {
//			System.out.println(con);
//		}
//		
//		for (int i = 0 ; i < lista.size() ; i++) {
//			System.out.println(lista.get(i));
//		}
		
		
		
		
	
	}

	
	
	
	
	
	
}
