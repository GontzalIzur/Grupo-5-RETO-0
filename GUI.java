import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import obj.Sala;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class GUI extends JFrame {

	private HashMap<String, boolean[]> mapa = ConexionDB.getSalas();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1017, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1001, 729);
		contentPane.add(tabbedPane);
		
		JPanel calefacciones = new JPanel();
		tabbedPane.addTab("Calefacciones", null, calefacciones, null);
		calefacciones.setLayout(null);
		
		JLabel mapaCalefacciones = new JLabel("");
		mapaCalefacciones.setBounds(0, 0, 1009, 701);
		mapaCalefacciones.setIcon(new ImageIcon(GUI.class.getResource("/Media/PlanoEditado (Mediana).png")));
		calefacciones.add(mapaCalefacciones);
		
		JPanel alarmas = new JPanel();
		tabbedPane.addTab("Alarmas", null, alarmas, null);
		alarmas.setLayout(null);
		
		JLabel mapaAlarmas = new JLabel("");
		mapaAlarmas.setBounds(0, 0, 996, 701);
		mapaAlarmas.setIcon(new ImageIcon(GUI.class.getResource("/Media/PlanoEditado (Mediana).png")));
		alarmas.add(mapaAlarmas);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton boton = (JButton) e.getSource();
		String nombre = boton.getName();
		Sala salaActualizada = new Sala(nombre, !mapa.get(nombre)[0], mapa.get(nombre)[1]);
		if (ConexionDB.updateSala(salaActualizada)) {
			mapa = ConexionDB.getSalas();
		}
		//doing something
	}

}
