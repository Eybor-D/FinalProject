package pe.autonoma.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.conexion;
import pe.autonoma.entity.Persona;

public class PersonaModel {
	
	Connection cn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public String registrar_usuario(Persona persona) {
		String message = "";
		String sql = "INSERT INTO sistema_usuario.persona(nombres, apellidos, nro_contacto, edad, fecha_nacimiento, user, password) VALUES (?,?,?,?,?,?,?)";
		try {
			cn = conexion.getConnection();
			ps = cn.prepareStatement(sql);
			ps.setString(1, persona.getNombres());
			ps.setString(2, persona.getApellidos());
			ps.setString(3, persona.getNro_contacto());
			ps.setString(4, persona.getEdad());
			ps.setString(5, persona.getFecha_nacimiento());
			ps.setString(6, persona.getUser());
			ps.setString(7, persona.getPassword());
			ps.executeUpdate();
			ps.close();
			cn.close();
			message = "Se ha registrado correctamente";
		} catch (Exception e) {
			System.out.print("Hubo un error");
			System.out.print("Error: "+e);
		}
		return message;
	}
	
	public Persona iniciar_sesion(Persona persona) {
		Persona pers = new Persona();
		String sql = "SELECT id_persona, nombres, apellidos, nro_contacto, edad, fecha_nacimiento FROM sistema_usuario.persona WHERE user = ? and password = ?";
		try {
			cn = conexion.getConnection();
			ps = cn.prepareStatement(sql);
			ps.setString(1, persona.getUser());
			ps.setString(2, persona.getPassword());
			rs = ps.executeQuery();
			if(rs.next()) {
				int i = 1;
				pers.setId_persona(rs.getInt(i++));
				pers.setNombres(rs.getString(i++));
				pers.setApellidos(rs.getString(i++));
				pers.setNro_contacto(rs.getString(i++));
				pers.setEdad(rs.getString(i++));
				pers.setFecha_nacimiento(rs.getString(i++));
			}
			ps.close();
			cn.close();
		} catch (Exception e) {
			System.out.print("Error: "+e.getMessage());
		}
		return pers;
	}
	
}