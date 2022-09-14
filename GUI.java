import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class GUI extends JFrame {

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
		
		JLabel mapaCalefacciones = new JLabel("");
		mapaCalefacciones.setBounds(0, 0, 1009, 701);
		mapaCalefacciones.setIcon(new ImageIcon(GUI.class.getResource("/Media/PlanoEditado (Mediana).png")));
		calefacciones.add(mapaCalefacciones);
		
		JPanel alarmas = new JPanel();
		tabbedPane.addTab("Alarmas", null, alarmas, null);
		alarmas.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(454, 382, 18, 18);
		alarmas.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setBounds(393, 347, 18, 18);
		alarmas.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setBackground(Color.RED);
		btnNewButton_1_1.setBounds(683, 645, 18, 18);
		alarmas.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setBackground(Color.RED);
		btnNewButton_1_1_1.setBounds(489, 462, 18, 18);
		alarmas.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("");
		btnNewButton_1_1_1_1.setBackground(Color.RED);
		btnNewButton_1_1_1_1.setBounds(845, 611, 18, 18);
		alarmas.add(btnNewButton_1_1_1_1);
		
		JLabel mapaAlarmas = new JLabel("");
		mapaAlarmas.setBounds(0, 0, 996, 701);
		mapaAlarmas.setIcon(new ImageIcon(GUI.class.getResource("/Media/PlanoEditado (Mediana).png")));
		alarmas.add(mapaAlarmas);
	}
}
