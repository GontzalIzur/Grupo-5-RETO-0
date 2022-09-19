import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import obj.Sala;

/**
 * Clase que se encarga de la conexion con la base de datos
 */
public class ConexionDB {

	/**
	 * Nombre del driver que realiza la conexion con la base de datos
	 */
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
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
	 * Constructor privado
	 * 
	 * @return
	 */
	private ConexionDB() {
	}

	/**
	 * Metodo que se encarga de realizar la conexion con la base de datos
	 * 
	 * @return conexion con la base de datos
	 */
	public static Connection getConexion() {
		try {
			Class.forName(DRIVER);
		} catch (Exception e) {
			System.out.println("No se ha encontrado el driver");
			e.printStackTrace();
		}
		try {
			conexion = DriverManager.getConnection(DIRECCION, USUARIO, PASS);
		} catch (SQLException e) {
			System.out.println("No se ha podido conectar con la base de datos");
			e.printStackTrace();
		}
		return conexion;
	}

	/**
	 * Metodo que recupera todas las salas de la base de datos, el mapa utilizara el
	 * id de la sala como clave y el objeto de la sala como valor
	 * 
	 * @return HashMap<String id, Sala sala> con todas las salas
	 */
	public static HashMap<String, Sala> getSalas() {
		HashMap<String, Sala> salas = new HashMap<String, Sala>();
		String sql = "SELECT idSala, calefaccion, alarma FROM salas";
		if (conexion == null) {
			getConexion();
		}
		try (PreparedStatement pst = conexion.prepareStatement(sql)) {
			try (ResultSet rs = pst.executeQuery()) {
				while (rs.next()) {
					String id = rs.getString("idSala");
					boolean calefaccion = rs.getBoolean("calefaccion");
					boolean alarma = rs.getBoolean("alarma");
					Sala sala = new Sala(id, calefaccion, alarma);
					salas.put(id, sala);
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
	public static boolean updateSala(Sala sala) {
		String sql = "UPDATE salas SET calefaccion = ?, alarma = ? WHERE idSala = ?";
		if (conexion == null) {
			getConexion();
		}
		try (PreparedStatement pst = conexion.prepareStatement(sql)) {
			pst.setBoolean(1, sala.isCalefaccion());
			pst.setBoolean(2, sala.isAlarma());
			pst.setString(3, sala.getIdSala());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
