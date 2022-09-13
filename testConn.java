import java.util.ArrayList;

import obj.Sala;

public class testConn {
	public static void main(String[] args) {
		ConexionDB.getConexion();
		ArrayList<Sala> salas = ConexionDB.getSalas();
		for (Sala sala : salas) {
			System.out.println(sala.getidAula() + " " + sala.isCalefaccion() + " " + sala.isAlarma());
			if (sala.getidAula().equals("Aula003")) {
				sala.setCalefaccion(true);
				sala.setAlarma(true);
				ConexionDB.updateSala(sala);
			}
		}
		salas = ConexionDB.getSalas();
		for (Sala sala : salas) {
			if (sala.getidAula().equals("Aula003")) {
				System.out.println(sala.getidAula() + " " + sala.isCalefaccion() + " " + sala.isAlarma());
			}
		}
	}
}
