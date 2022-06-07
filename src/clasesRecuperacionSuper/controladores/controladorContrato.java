package clasesRecuperacionSuper.controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import clasesRecuperacion.modelo.Contrato;

import java.util.ArrayList;

public class controladorContrato extends SuperControlador {

	
	/**
	 * 
	 */
	public static Contrato findPrimero () {
		return find("select * from cliente order by id limit 1");
	}

	/**
	 * 
	 */
	public static Contrato findUltimo () {
		return find("select * from cliente order by id desc limit 1");
	}

	/**
	 * 
	 */
	public static Contrato findAnterior (int idActual) {
		return find("select * from cliente where id < " + idActual + " order by id desc limit 1");
	}

	/**
	 * 
	 */
	public static Contrato findSiguiente (int idActual) {
		return find("select * from cliente where id > " + idActual + " order by id limit 1");
	}



	/**
	 * 
	 */
	public static Contrato find (String sql) {
		Contrato con = null;
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery (sql);
		   
			// Navegación del objeto ResultSet
			if (rs.next()) {
				con = new Contrato(rs.getInt("id"), rs.getString("descripcion"), rs.getFloat("saldo"), rs.getFloat("limite"), rs.getInt("idTipoContrato"), rs.getInt("idUsuario"));
				
			}
			// Cierre de los elementos
			rs.close();
			s.close();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return con;
	}


	
	
	/**
	 * 
	 */
	public static List<Contrato> findAll () {
		List<Contrato> lista = new ArrayList<Contrato>();
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("Select * from cliente");
		   
			// Navegación del objeto ResultSet
			while (rs.next()) {
				Contrato con = new Contrato(rs.getInt("id"), rs.getString("descripcion"), rs.getFloat("saldo"), rs.getFloat("limite"), rs.getInt("idTipoContrato"), rs.getInt("idUsuario"));
				
				lista.add(con);
			}
			// Cierre de los elementos
			rs.close();
			s.close();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return lista;
	}


	
	
	/**
	 * 
	 * @param f
	 * @return
	 */
	public static int guardar(Contrato con) {
		if (con.getId() == 0) {
			return nuevo(con);
		}
		else {
			return modificar(con);
		}
	}
	
	
	/**
	 * 
	 */
	public static int modificar (Contrato con) {		
		int registrosAfectados = 0;
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			
			int activo = (con.isActivo())? 1 : 0; 			
			registrosAfectados = s.executeUpdate(
					"update contrato set descripcion='" + con.getDescripcion() + "', saldo='" + con.getSaldo() + "', limite='" + con.getLimite() + "', idTipoContrato='" + con.getIdTipoContrato() + "', idUsuario='" + con.getIdUsuario() 
					+ "' " + " where id=" + con.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return registrosAfectados;		
	}
	
	/**
	 * 
	 */
	public static int eliminar (int idEliminacion) {		
		int registrosAfectados = 0;
		try {
			Statement s = ConnectionManager.getConexion().createStatement();
			
			registrosAfectados = s.executeUpdate(
					"delete from cliente where id=" + idEliminacion);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return registrosAfectados;		
	}

	/**
	 * 
	 */
	public static int nuevo (Contrato con) {
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


	
	
	
	

