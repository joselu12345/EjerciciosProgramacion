package examenFinal.controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import examenFinal.ConnectionManager;
import examenFinal.modelo.Marca;

public class controladorMarca {
	
public static List<Marca> findAll(){
		
		List<Marca> lista = new ArrayList<Marca>();
		
		Marca mar = null;
		
		try {
			
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from marca");
			
			while (rs.next()) {
				
				mar = new Marca(rs.getInt("id"), rs.getString("denominacion"), rs.getInt("idPais"));
				lista.add(mar);
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
