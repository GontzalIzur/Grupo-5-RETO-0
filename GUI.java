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
		
		JButton TallerMantenimiento = new JButton("");
		TallerMantenimiento.setBackground(Color.RED);
		TallerMantenimiento.setBounds(354, 135, 18, 18);
		calefacciones.add(TallerMantenimiento);
		
		JButton Aula014 = new JButton("");
		Aula014.setBackground(Color.RED);
		Aula014.setBounds(260, 316, 18, 18);
		calefacciones.add(Aula014);
		
		JButton Aula012 = new JButton("");
		Aula012.setBackground(Color.RED);
		Aula012.setBounds(423, 304, 18, 18);
		calefacciones.add(Aula012);
		
		JButton Aula013 = new JButton("");
		Aula013.setBackground(Color.RED);
		Aula013.setBounds(342, 304, 18, 18);
		calefacciones.add(Aula013);
		
		JButton PasoAula013 = new JButton("");
		PasoAula013.setBackground(Color.RED);
		PasoAula013.setBounds(402, 347, 18, 18);
		calefacciones.add(PasoAula013);
		
		JButton Hall = new JButton("");
		Hall.setBackground(Color.RED);
		Hall.setBounds(454, 374, 18, 18);
		calefacciones.add(Hall);
		
		JButton Almacen1 = new JButton("");
		Almacen1.setBackground(Color.RED);
		Almacen1.setBounds(532, 374, 18, 18);
		calefacciones.add(Almacen1);
		
		JButton Almacen2 = new JButton("");
		Almacen2.setBackground(Color.RED);
		Almacen2.setBounds(585, 374, 18, 18);
		calefacciones.add(Almacen2);
		
		JButton Almacen3 = new JButton("");
		Almacen3.setBackground(Color.RED);
		Almacen3.setBounds(847, 374, 18, 18);
		calefacciones.add(Almacen3);
		
		JButton Aula015 = new JButton("");
		Aula015.setBackground(Color.RED);
		Aula015.setBounds(433, 485, 18, 18);
		calefacciones.add(Aula015);
		
		JButton Aula010 = new JButton("");
		Aula010.setBackground(Color.RED);
		Aula010.setBounds(532, 472, 18, 18);
		calefacciones.add(Aula010);
		
		JButton Aula016 = new JButton("");
		Aula016.setBackground(Color.RED);
		Aula016.setBounds(433, 562, 18, 18);
		calefacciones.add(Aula016);
		
		JButton Archivo = new JButton("");
		Archivo.setBackground(Color.RED);
		Archivo.setBounds(520, 543, 18, 18);
		calefacciones.add(Archivo);
		
		JButton PasoAula016 = new JButton("");
		PasoAula016.setBackground(Color.RED);
		PasoAula016.setBounds(489, 500, 18, 18);
		calefacciones.add(PasoAula016);
		
		JButton AseoMinusval = new JButton("");
		AseoMinusval.setBackground(Color.RED);
		AseoMinusval.setBounds(532, 511, 18, 18);
		calefacciones.add(AseoMinusval);
		
		JButton Aula007 = new JButton("");
		Aula007.setBackground(Color.RED);
		Aula007.setBounds(585, 579, 18, 18);
		calefacciones.add(Aula007);
		
		JButton Aula006 = new JButton("");
		Aula006.setBackground(Color.RED);
		Aula006.setBounds(683, 579, 18, 18);
		calefacciones.add(Aula006);
		
		JButton Vestibulo = new JButton("");
		Vestibulo.setBackground(Color.RED);
		Vestibulo.setBounds(671, 648, 18, 18);
		calefacciones.add(Vestibulo);
		
		JButton PasoVestibulo = new JButton("");
		PasoVestibulo.setBackground(Color.RED);
		PasoVestibulo.setBounds(561, 613, 18, 18);
		calefacciones.add(PasoVestibulo);
		
		JButton SalaAlumnos = new JButton("");
		SalaAlumnos.setBackground(Color.RED);
		SalaAlumnos.setBounds(768, 660, 18, 18);
		calefacciones.add(SalaAlumnos);
		
		JButton SalaProfesores = new JButton("");
		SalaProfesores.setBackground(Color.RED);
		SalaProfesores.setBounds(847, 660, 18, 18);
		calefacciones.add(SalaProfesores);
		
		JButton Aula003 = new JButton("");
		Aula003.setBackground(Color.RED);
		Aula003.setBounds(898, 660, 18, 18);
		calefacciones.add(Aula003);
		
		JButton DPTInformatica = new JButton("");
		DPTInformatica.setBackground(Color.RED);
		DPTInformatica.setBounds(898, 579, 18, 18);
		calefacciones.add(DPTInformatica);
		
		JButton DPTFOL = new JButton("");
		DPTFOL.setBackground(Color.RED);
		DPTFOL.setBounds(811, 579, 18, 18);
		calefacciones.add(DPTFOL);
		
		JButton Aula005B = new JButton("");
		Aula005B.setBackground(Color.RED);
		Aula005B.setBounds(768, 579, 18, 18);
		calefacciones.add(Aula005B);
		
		JButton VestuarioLimpieza = new JButton("");
		VestuarioLimpieza.setBackground(Color.RED);
		VestuarioLimpieza.setBounds(157, 579, 18, 18);
		calefacciones.add(VestuarioLimpieza);
		
		JButton AseoFem = new JButton("");
		AseoFem.setBackground(Color.RED);
		AseoFem.setBounds(219, 596, 18, 18);
		calefacciones.add(AseoFem);
		
		JButton AseoMasc = new JButton("");
		AseoMasc.setBackground(Color.RED);
		AseoMasc.setBounds(273, 596, 18, 18);
		calefacciones.add(AseoMasc);
		
		JButton Conserjeria = new JButton("");
		Conserjeria.setBackground(Color.RED);
		Conserjeria.setBounds(608, 667, 18, 18);
		calefacciones.add(Conserjeria);
		
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
