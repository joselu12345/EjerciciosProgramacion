package clasesRecuperacion.controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import clasesRecuperacion.ConnectionManager;
import clasesRecuperacion.modelo.Usuario;

public class controladorUsuario {
	
public static List<Usuario> findAll(){
		
		List<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u = null;
		
		try {
			
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from usuario");
			
			while (rs.next()) {
				
				u = new Usuario(rs.getInt("id"), rs.getString("nombreUsuario"), rs.getString("password"), rs.getString("email"), rs.getString("colorPreferido"));
				lista.add(u);
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
