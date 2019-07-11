package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {

	public static Connection getConnection() {
        Connection cn = null;
        String url = "jdbc:mysql://127.0.0.1:3306/sistema_usuario?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "root";
        String pass = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexion Exitosa");
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        return cn;
    }
	
}
