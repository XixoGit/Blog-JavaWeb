package com.agenda.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.agenda.util.Conexion2;


public class UsuarioServices {

	
	//********  INSERT   *********** 
		public void INSERT(Usuario user) {
			//Uso prepared statament para insertar datos!!
			 
			try {
				Connection conexion = Conexion2.getConexion();
				String sql = "insert into contactos values(?,?,?,?,?)";
				PreparedStatement pstm = conexion.prepareStatement(sql);
			 
				pstm.setString(1, user.getNombre());
				pstm.setString(2, user.getApellido());
				pstm.setString(3, user.getEdad());
				pstm.setString(4, user.getTelefono());
				pstm.setString(5, user.getCiudad());
				pstm.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
	
		
	   
		
		public ArrayList<Usuario> mostrarUsuarios(){
			ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
			Connection conexion = Conexion2.getConexion();
			String sql = "select * from contactos";
			try {
				PreparedStatement pst = conexion.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();
			 
				 
				 
				 while( rs.next()){
					 Usuario u=new Usuario();
					 u.setNombre(rs.getString("nombre"));
					 u.setApellido(rs.getString("apellido"));
					 u.setEdad(rs.getString("edad"));
					 u.setTelefono(rs.getString("telefono"));
					 u.setCiudad(rs.getString("ciudad"));
					 usuarios.add(u);		 
							 
				 }
				 rs.close();
				
			} catch (SQLException e) {
				System.err.println("Error METODO AGREGARCONTACTO() (" + e + ")");
			}
			
			return usuarios;
		}
	
}


 

