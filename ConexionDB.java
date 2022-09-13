import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import obj.Sala;

/**
 * Clase que se encarga de la conexion con la base de datos
 */
public class ConexionDB {

	/**
	 * Nombre del driver que realiza la conexion con la base de datos
	 */
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	/**
	 * URL de la base de datos
	 */
	private static final String DIRECCION = "jdbc:mysql://localhost:3306/ElorrietaDatos";
	/**
	 * Usuario de la base de datos
	 */
	private static final String USUARIO = "Admin";
	/**
	 * Contraseña de la base de datos
	 */
	private static final String PASS = "elorrieta";
	/**
	 * Conexion con la base de datos
	 */
	private static Connection conexion = null;

	/**
	 * Metodo que se encarga de realizar la conexion con la base de datos
	 * 
	 * @return conexion con la base de datos
	 */
	public static Connection getConexion() {
		try {
			Class.forName(DRIVER);
			conexion = DriverManager.getConnection(DIRECCION, USUARIO, PASS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conexion;
	}

	/**
	 * Metodo que recupera todas las salas de la base de datos
	 * 
	 * @return ArrayList con todas las salas
	 */
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

	/**
	 * Metodo que actualiza los datos de una sala en la base de datos
	 * 
	 * @param sala sala a actualizar
	 */
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
