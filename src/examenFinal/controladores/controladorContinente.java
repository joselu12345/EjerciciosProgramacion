package examenFinal.controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import examenFinal.ConnectionManager;
import examenFinal.modelo.Continente;

public class controladorContinente {
	
public static List<Continente> findAll(){
		
		List<Continente> lista = new ArrayList<Continente>();
		
		Continente con = null;
		
		try {
			
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from continente");
			
			while (rs.next()) {
				
				con = new Continente(rs.getInt("id"), rs.getString("descripcion"));
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

}
