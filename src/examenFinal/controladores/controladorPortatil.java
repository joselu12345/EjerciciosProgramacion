package examenFinal.controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import examenFinal.ConnectionManager;
import examenFinal.modelo.Portatil;

public class controladorPortatil {
	
	public static Portatil findPrimero(){
		
		Portatil por = null;
		
		try {
			
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from portatil order by id limit 1");
			
			while (rs.next()) {
				
				por = new Portatil(rs.getInt("id"), rs.getString("modelo"), rs.getString("sn"), rs.getInt("numProcesadores"), rs.getBoolean("vendido"), rs.getDate("fechaVenta"), rs.getInt("idMarca"));
				
			}
			
			rs.close();
			s.close();
			
		}catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}

		
		return por;	
		
	}
		
		public static Portatil findAnterior(int id){
			
			Portatil por = null;
			
			try {
				
				Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
				
				ResultSet rs = s.executeQuery ("Select * from portatil where id <" + id +" order by id desc limit 1");
				
				while (rs.next()) {
					
					por = new Portatil(rs.getInt("id"), rs.getString("modelo"), rs.getString("sn"), rs.getInt("numProcesadores"), rs.getBoolean("vendido"), rs.getDate("fechaVenta"), rs.getInt("idMarca"));
					
				}
				
				rs.close();
				s.close();
				
			}catch (SQLException ex) {
				System.out.println("Error en la ejecución SQL: " + ex.getMessage());
				ex.printStackTrace();
			}

			
			return por;	
			
		}
		
		public static Portatil findSiguiente(int id){
			
			Portatil por = null;
			
			try {
				
				Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
				
				ResultSet rs = s.executeQuery ("Select * from portatil where id >" + id +" order by id limit 1");
				
				while (rs.next()) {
					
					por = new Portatil(rs.getInt("id"), rs.getString("modelo"), rs.getString("sn"), rs.getInt("numProcesadores"), rs.getBoolean("vendido"), rs.getDate("fechaVenta"), rs.getInt("idMarca"));
					
				}
				
				rs.close();
				s.close();
				
			}catch (SQLException ex) {
				System.out.println("Error en la ejecución SQL: " + ex.getMessage());
				ex.printStackTrace();
			}

			
			return por;	
			
		}
		
		public static Portatil findUltimo(){
			
			Portatil por = null;
			
			try {
				
				Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
				
				ResultSet rs = s.executeQuery ("select * from portatil order by id desc limit 1");
				
				while (rs.next()) {
					
					por = new Portatil(rs.getInt("id"), rs.getString("modelo"), rs.getString("sn"), rs.getInt("numProcesadores"), rs.getBoolean("vendido"), rs.getDate("fechaVenta"), rs.getInt("idMarca"));
					
				}
				
				rs.close();
				s.close();
				
			}catch (SQLException ex) {
				System.out.println("Error en la ejecución SQL: " + ex.getMessage());
				ex.printStackTrace();
			}

			
			return por;	
			
		}
		
		public static List<Portatil> findAll(){
			
			List<Portatil> lista = new ArrayList<Portatil>();
			
			Portatil por = null;
			
			try {
				
				Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
				
				ResultSet rs = s.executeQuery ("select * from portatil");
				
				while (rs.next()) {
					
					por = new Portatil(rs.getInt("id"), rs.getString("modelo"), rs.getString("sn"), rs.getInt("numProcesadores"), rs.getBoolean("vendido"), rs.getDate("fechaVenta"), rs.getInt("idMarca"));
					
					lista.add(por);
				}
				
				rs.close();
				s.close();
				
			}catch (SQLException ex) {
				System.out.println("Error en la ejecución SQL: " + ex.getMessage());
				ex.printStackTrace();
			}
		
			
			return lista;	
			
		}

}
