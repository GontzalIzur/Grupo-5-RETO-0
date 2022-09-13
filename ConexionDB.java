import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import obj.Sala;

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

	public static ArrayList<Sala> getSalas() {
		ArrayList<Sala> salas = new ArrayList<Sala>();
		String sql = "SELECT idAula, calefaccion, alarma FROM salas";
		if (conexion == null) {
			getConexion();
		}
		try (PreparedStatement pst = conexion.prepareStatement(sql)) {
			try (ResultSet rs = pst.executeQuery()) {
				while (rs.next()) {
					Sala sala = new Sala(rs.getString(1), rs.getBoolean(2), rs.getBoolean(3));
					salas.add(sala);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return salas;
	}

	public static void updateSala(Sala sala) {
		String sql = "UPDATE salas SET calefaccion = ?, alarma = ? WHERE idAula = ?";
		if (conexion == null) {
			getConexion();
		}
		try (PreparedStatement pst = conexion.prepareStatement(sql)) {
			pst.setBoolean(1, sala.isCalefaccion());
			pst.setBoolean(2, sala.isAlarma());
			pst.setString(3, sala.getidAula());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
