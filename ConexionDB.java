import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDB {
	
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String DIRECCION = "jdbc:mysql://localhost:3306/ElorrietaDatos";
	private static final String USUARIO = "Admin";
	private static final String PASS = "elorrieta";
	
	private static Connection conexion = null;
	
	public static Connection getConexion() {
			try {
				Class.forName(DRIVER);
				conexion = DriverManager.getConnection(DIRECCION, USUARIO, PASS);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return conexion;
	}

}
