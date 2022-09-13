import java.util.ArrayList;
import java.util.HashMap;

import obj.Sala;

public class testConn {
	public static void main(String[] args) {
		ConexionDB.getConexion();
		HashMap<String, boolean[]> salas = ConexionDB.getSalas();
		for (String key : salas.keySet()) {
			boolean[] values = salas.get(key);
			System.out.println(key + " " + values[0] + " " + values[1]);
		}
		Sala prueba = new Sala("Aula006", true, true);
		ConexionDB.updateSala(prueba);
		salas = ConexionDB.getSalas();
		System.out.println("Aula006 " + salas.get("Aula006")[0] + " " + salas.get("Aula006")[1]);
	}
}
