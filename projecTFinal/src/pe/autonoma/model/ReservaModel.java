package pe.autonoma.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.conexion;
import pe.autonoma.entity.Reserva;

public class ReservaModel {

	Connection cn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public String reserva (Reserva reserva) {
		System.out.print("Entrando");
		System.out.print(reserva.getLocal());
		System.out.print(reserva.getFecha_reserva());
		System.out.print(reserva.getHora());
		String message = "";
		String sql = "INSERT INTO sistema_usuario.reservacion(local, fecha_reserva, hora, cantidad, detalles, activo) VALUES (?,?,?,?,?,'1')";
		try {
			cn = conexion.getConnection();
			ps = cn.prepareStatement(sql);
			ps.setString(1, reserva.getLocal());
			ps.setString(2, reserva.getFecha_reserva());
			ps.setString(3, reserva.getHora());
			ps.setString(4, reserva.getCantidad());
			ps.setString(5, reserva.getDetalles());
			ps.executeUpdate();
			ps.close();
			cn.close();
			System.out.print("Se registro");
		} catch (Exception e) {
			System.out.print("Hubo un error \n");
			System.out.print("Error:"+e.getMessage());
		}
		return message;
	}
	
}
