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
import java.awt.Color;

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
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(354, 135, 18, 18);
		calefacciones.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(260, 316, 18, 18);
		calefacciones.add(btnNewButton_1);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setBackground(Color.RED);
		btnNewButton_1_1_1.setBounds(423, 304, 18, 18);
		calefacciones.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setBackground(Color.RED);
		btnNewButton_1_1.setBounds(342, 304, 18, 18);
		calefacciones.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("");
		btnNewButton_1_1_2.setBackground(Color.RED);
		btnNewButton_1_1_2.setBounds(402, 347, 18, 18);
		calefacciones.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_3 = new JButton("");
		btnNewButton_1_1_3.setBackground(Color.RED);
		btnNewButton_1_1_3.setBounds(454, 374, 18, 18);
		calefacciones.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1_1_4 = new JButton("");
		btnNewButton_1_1_4.setBackground(Color.RED);
		btnNewButton_1_1_4.setBounds(532, 374, 18, 18);
		calefacciones.add(btnNewButton_1_1_4);
		
		JButton btnNewButton_1_1_5 = new JButton("");
		btnNewButton_1_1_5.setBackground(Color.RED);
		btnNewButton_1_1_5.setBounds(585, 374, 18, 18);
		calefacciones.add(btnNewButton_1_1_5);
		
		JButton btnNewButton_1_1_6 = new JButton("");
		btnNewButton_1_1_6.setBackground(Color.RED);
		btnNewButton_1_1_6.setBounds(847, 374, 18, 18);
		calefacciones.add(btnNewButton_1_1_6);
		
		JButton btnNewButton_1_1_7 = new JButton("");
		btnNewButton_1_1_7.setBackground(Color.RED);
		btnNewButton_1_1_7.setBounds(433, 485, 18, 18);
		calefacciones.add(btnNewButton_1_1_7);
		
		JButton btnNewButton_1_1_8 = new JButton("");
		btnNewButton_1_1_8.setBackground(Color.RED);
		btnNewButton_1_1_8.setBounds(532, 472, 18, 18);
		calefacciones.add(btnNewButton_1_1_8);
		
		JButton btnNewButton_1_1_9 = new JButton("");
		btnNewButton_1_1_9.setBackground(Color.RED);
		btnNewButton_1_1_9.setBounds(433, 562, 18, 18);
		calefacciones.add(btnNewButton_1_1_9);
		
		JButton btnNewButton_1_1_10 = new JButton("");
		btnNewButton_1_1_10.setBackground(Color.RED);
		btnNewButton_1_1_10.setBounds(520, 543, 18, 18);
		calefacciones.add(btnNewButton_1_1_10);
		
		JButton btnNewButton_1_1_11 = new JButton("");
		btnNewButton_1_1_11.setBackground(Color.RED);
		btnNewButton_1_1_11.setBounds(489, 500, 18, 18);
		calefacciones.add(btnNewButton_1_1_11);
		
		JButton btnNewButton_1_1_7_1 = new JButton("");
		btnNewButton_1_1_7_1.setBackground(Color.RED);
		btnNewButton_1_1_7_1.setBounds(532, 511, 18, 18);
		calefacciones.add(btnNewButton_1_1_7_1);
		
		JButton btnNewButton_1_1_7_2 = new JButton("");
		btnNewButton_1_1_7_2.setBackground(Color.RED);
		btnNewButton_1_1_7_2.setBounds(585, 579, 18, 18);
		calefacciones.add(btnNewButton_1_1_7_2);
		
		JButton btnNewButton_1_1_7_3 = new JButton("");
		btnNewButton_1_1_7_3.setBackground(Color.RED);
		btnNewButton_1_1_7_3.setBounds(683, 579, 18, 18);
		calefacciones.add(btnNewButton_1_1_7_3);
		
		JButton btnNewButton_1_1_7_4 = new JButton("");
		btnNewButton_1_1_7_4.setBackground(Color.RED);
		btnNewButton_1_1_7_4.setBounds(671, 648, 18, 18);
		calefacciones.add(btnNewButton_1_1_7_4);
		
		JButton btnNewButton_1_1_7_5 = new JButton("");
		btnNewButton_1_1_7_5.setBackground(Color.RED);
		btnNewButton_1_1_7_5.setBounds(561, 613, 18, 18);
		calefacciones.add(btnNewButton_1_1_7_5);
		
		JButton btnNewButton_1_1_7_6 = new JButton("");
		btnNewButton_1_1_7_6.setBackground(Color.RED);
		btnNewButton_1_1_7_6.setBounds(768, 660, 18, 18);
		calefacciones.add(btnNewButton_1_1_7_6);
		
		JButton btnNewButton_1_1_7_7 = new JButton("");
		btnNewButton_1_1_7_7.setBackground(Color.RED);
		btnNewButton_1_1_7_7.setBounds(847, 660, 18, 18);
		calefacciones.add(btnNewButton_1_1_7_7);
		
		JButton btnNewButton_1_1_7_8 = new JButton("");
		btnNewButton_1_1_7_8.setBackground(Color.RED);
		btnNewButton_1_1_7_8.setBounds(898, 660, 18, 18);
		calefacciones.add(btnNewButton_1_1_7_8);
		
		JButton btnNewButton_1_1_7_9 = new JButton("");
		btnNewButton_1_1_7_9.setBackground(Color.RED);
		btnNewButton_1_1_7_9.setBounds(898, 579, 18, 18);
		calefacciones.add(btnNewButton_1_1_7_9);
		
		JButton btnNewButton_1_1_7_10 = new JButton("");
		btnNewButton_1_1_7_10.setBackground(Color.RED);
		btnNewButton_1_1_7_10.setBounds(811, 579, 18, 18);
		calefacciones.add(btnNewButton_1_1_7_10);
		
		JButton btnNewButton_1_1_7_11 = new JButton("");
		btnNewButton_1_1_7_11.setBackground(Color.RED);
		btnNewButton_1_1_7_11.setBounds(768, 579, 18, 18);
		calefacciones.add(btnNewButton_1_1_7_11);
		
		JButton btnNewButton_1_1_7_12 = new JButton("");
		btnNewButton_1_1_7_12.setBackground(Color.RED);
		btnNewButton_1_1_7_12.setBounds(157, 579, 18, 18);
		calefacciones.add(btnNewButton_1_1_7_12);
		
		JButton btnNewButton_1_1_7_13 = new JButton("");
		btnNewButton_1_1_7_13.setBackground(Color.RED);
		btnNewButton_1_1_7_13.setBounds(219, 596, 18, 18);
		calefacciones.add(btnNewButton_1_1_7_13);
		
		JButton btnNewButton_1_1_7_14 = new JButton("");
		btnNewButton_1_1_7_14.setBackground(Color.RED);
		btnNewButton_1_1_7_14.setBounds(273, 596, 18, 18);
		calefacciones.add(btnNewButton_1_1_7_14);
		
		JButton btnNewButton_1_1_7_15 = new JButton("");
		btnNewButton_1_1_7_15.setBackground(Color.RED);
		btnNewButton_1_1_7_15.setBounds(608, 667, 18, 18);
		calefacciones.add(btnNewButton_1_1_7_15);
		
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
