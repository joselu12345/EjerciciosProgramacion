package clasesRecuperacion.controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import clasesRecuperacion.ConnectionManager;

import clasesRecuperacion.modelo.TipoContrato;

public class controladorTipoContrato {
	
public static List<TipoContrato> findAll(){
		
		List<TipoContrato> lista = new ArrayList<TipoContrato>();
		
		TipoContrato ticon = null;
		
		try {
			
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			ResultSet rs = s.executeQuery ("select * from tipocontrato");
			
			while (rs.next()) {
				
				ticon = new TipoContrato(rs.getInt("id"), rs.getString("descripcion"));
				lista.add(ticon);
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
