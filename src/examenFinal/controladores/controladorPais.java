package examenFinal.controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import examenFinal.ConnectionManager;
import examenFinal.modelo.Pais;

public class controladorPais {
	
public static List<Pais> findAll(){
		
		List<Pais> lista = new ArrayList<Pais>();
		
		Pais pa = null;
		
		try {
			
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from pais");
			
			while (rs.next()) {
				
				pa = new Pais(rs.getInt("id"), rs.getString("descripcion"), rs.getInt("idContinente"));
				lista.add(pa);
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
