import java.awt.EventQueue;
import java.awt.event.ActionListener;
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

public class GUI extends JFrame implements ActionListener {

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
		TallerMantenimiento.setName("TallerMantenimiento");
		TallerMantenimiento.setBackground(mapa.get("TallerMantenimiento")[0] ? Color.GREEN : Color.RED);
		TallerMantenimiento.addActionListener(this);
		TallerMantenimiento.setBounds(354, 135, 18, 18);
		calefacciones.add(TallerMantenimiento);
		
		JButton Aula014 = new JButton("");
		Aula014.setName("Aula014");
		Aula014.setBackground(mapa.get("Aula014")[0] ? Color.GREEN : Color.RED);
		Aula014.addActionListener(this);
		Aula014.setBounds(260, 316, 18, 18);
		calefacciones.add(Aula014);
		
		JButton Aula012 = new JButton("");
		Aula012.setName("Aula012");
		Aula012.setBackground(mapa.get("Aula012")[0] ? Color.GREEN : Color.RED);
		Aula012.addActionListener(this);
		Aula012.setBounds(423, 304, 18, 18);
		calefacciones.add(Aula012);
		
		JButton Aula013 = new JButton("");
		Aula013.setName("Aula013");
		Aula013.setBackground(mapa.get("Aula013")[0] ? Color.GREEN : Color.RED);
		Aula013.addActionListener(this);
		Aula013.setBounds(342, 304, 18, 18);
		calefacciones.add(Aula013);
		
		JButton PasoAula013 = new JButton("");
		PasoAula013.setName("PasoAula013");
		PasoAula013.setBackground(mapa.get("PasoAula013")[0] ? Color.GREEN : Color.RED);
		PasoAula013.addActionListener(this);
		PasoAula013.setBounds(402, 347, 18, 18);
		calefacciones.add(PasoAula013);
		
		JButton Hall = new JButton("");
		Hall.setName("Hall");
		Hall.setBackground(mapa.get("Hall")[0] ? Color.GREEN : Color.RED);
		Hall.addActionListener(this);
		Hall.setBounds(454, 374, 18, 18);
		calefacciones.add(Hall);
		
		JButton Almacen1 = new JButton("");
		Almacen1.setName("Almacen1");
		Almacen1.setBackground(mapa.get("Almacen1")[0] ? Color.GREEN : Color.RED);
		Almacen1.addActionListener(this);
		Almacen1.setBounds(532, 374, 18, 18);
		calefacciones.add(Almacen1);
		
		JButton Almacen2 = new JButton("");
		Almacen2.setName("Almacen2");
		Almacen2.setBackground(mapa.get("Almacen2")[0] ? Color.GREEN : Color.RED);
		Almacen2.addActionListener(this);
		Almacen2.setBounds(585, 374, 18, 18);
		calefacciones.add(Almacen2);
		
		JButton Almacen3 = new JButton("");
		Almacen3.setName("Almacen3");
		Almacen3.setBackground(mapa.get("Almacen3")[0] ? Color.GREEN : Color.RED);
		Almacen3.addActionListener(this);
		Almacen3.setBounds(847, 374, 18, 18);
		calefacciones.add(Almacen3);
		
		JButton Aula015 = new JButton("");
		Aula015.setName("Aula015");
		Aula015.setBackground(mapa.get("Aula015")[0] ? Color.GREEN : Color.RED);
		Aula015.addActionListener(this);
		Aula015.setBounds(433, 485, 18, 18);
		calefacciones.add(Aula015);
		
		JButton Aula010 = new JButton("");
		Aula010.setName("Aula010");
		Aula010.setBackground(mapa.get("Aula010")[0] ? Color.GREEN : Color.RED);
		Aula010.addActionListener(this);
		Aula010.setBounds(532, 472, 18, 18);
		calefacciones.add(Aula010);
		
		JButton Aula016 = new JButton("");
		Aula016.setName("Aula016");
		Aula016.setBackground(mapa.get("Aula016")[0] ? Color.GREEN : Color.RED);
		Aula016.addActionListener(this);
		Aula016.setBounds(433, 562, 18, 18);
		calefacciones.add(Aula016);
		
		JButton Archivo = new JButton("");
		Archivo.setName("Archivo");
		Archivo.setBackground(mapa.get("Archivo")[0] ? Color.GREEN : Color.RED);
		Archivo.addActionListener(this);
		Archivo.setBounds(520, 543, 18, 18);
		calefacciones.add(Archivo);
		
		JButton PasoAula016 = new JButton("");
		PasoAula016.setName("PasoAula016");
		PasoAula016.setBackground(mapa.get("PasoAula016")[0] ? Color.GREEN : Color.RED);
		PasoAula016.addActionListener(this);
		PasoAula016.setBounds(489, 500, 18, 18);
		calefacciones.add(PasoAula016);
		
		JButton AseoMinusval = new JButton("");
		AseoMinusval.setName("AseoMinusval");
		AseoMinusval.setBackground(mapa.get("AseoMinusval")[0] ? Color.GREEN : Color.RED);
		AseoMinusval.addActionListener(this);
		AseoMinusval.setBounds(532, 511, 18, 18);
		calefacciones.add(AseoMinusval);
		
		JButton Aula007 = new JButton("");
		Aula007.setName("Aula007");
		Aula007.setBackground(mapa.get("Aula007")[0] ? Color.GREEN : Color.RED);
		Aula007.addActionListener(this);
		Aula007.setBounds(585, 579, 18, 18);
		calefacciones.add(Aula007);
		
		JButton Aula006 = new JButton("");
		Aula006.setName("Aula006");
		Aula006.setBackground(mapa.get("Aula006")[0] ? Color.GREEN : Color.RED);
		Aula006.addActionListener(this);
		Aula006.setBounds(683, 579, 18, 18);
		calefacciones.add(Aula006);
		
		JButton Vestibulo = new JButton("");
		Vestibulo.setName("Vestibulo");
		Vestibulo.setBackground(mapa.get("Vestibulo")[0] ? Color.GREEN : Color.RED);
		Vestibulo.addActionListener(this);
		Vestibulo.setBounds(671, 648, 18, 18);
		calefacciones.add(Vestibulo);
		
		JButton PasoVestibulo = new JButton("");
		PasoVestibulo.setName("PasoVestibulo");
		PasoVestibulo.setBackground(mapa.get("PasoVestibulo")[0] ? Color.GREEN : Color.RED);
		PasoVestibulo.addActionListener(this);
		PasoVestibulo.setBounds(561, 613, 18, 18);
		calefacciones.add(PasoVestibulo);
		
		JButton SalaAlumnos = new JButton("");
		SalaAlumnos.setName("SalaAlumnos");
		SalaAlumnos.setBackground(mapa.get("SalaAlumnos")[0] ? Color.GREEN : Color.RED);
		SalaAlumnos.addActionListener(this);
		SalaAlumnos.setBounds(768, 660, 18, 18);
		calefacciones.add(SalaAlumnos);
		
		JButton SalaProfesores = new JButton("");
		SalaProfesores.setName("SalaProfesores");
		SalaProfesores.setBackground(mapa.get("SalaProfesores")[0] ? Color.GREEN : Color.RED);
		SalaProfesores.addActionListener(this);
		SalaProfesores.setBounds(847, 660, 18, 18);
		calefacciones.add(SalaProfesores);
		
		JButton Aula003 = new JButton("");
		Aula003.setName("Aula003");
		Aula003.setBackground(mapa.get("Aula003")[0] ? Color.GREEN : Color.RED);
		Aula003.addActionListener(this);
		Aula003.setBounds(898, 660, 18, 18);
		calefacciones.add(Aula003);
		
		JButton DPTInformatica = new JButton("");
		DPTInformatica.setName("DPTInformatica");
		DPTInformatica.setBackground(mapa.get("DPTInformatica")[0] ? Color.GREEN : Color.RED);
		DPTInformatica.addActionListener(this);
		DPTInformatica.setBounds(898, 579, 18, 18);
		calefacciones.add(DPTInformatica);
		
		JButton DPTFOL = new JButton("");
		DPTFOL.setName("DPTFOL");
		DPTFOL.setBackground(mapa.get("DPTFOL")[0] ? Color.GREEN : Color.RED);
		DPTFOL.addActionListener(this);
		DPTFOL.setBounds(811, 579, 18, 18);
		calefacciones.add(DPTFOL);
		
		JButton Aula005B = new JButton("");
		Aula005B.setName("Aula005B");
		Aula005B.setBackground(mapa.get("Aula005B")[0] ? Color.GREEN : Color.RED);
		Aula005B.addActionListener(this);
		Aula005B.setBounds(768, 579, 18, 18);
		calefacciones.add(Aula005B);
		
		JButton VestuarioLimpieza = new JButton("");
		VestuarioLimpieza.setName("VestuarioLimpieza");
		VestuarioLimpieza.setBackground(mapa.get("VestuarioLimpieza")[0] ? Color.GREEN : Color.RED);
		VestuarioLimpieza.addActionListener(this);
		VestuarioLimpieza.setBounds(157, 579, 18, 18);
		calefacciones.add(VestuarioLimpieza);
		
		JButton AseoFem = new JButton("");
		AseoFem.setName("AseoFem");
		AseoFem.setBackground(mapa.get("AseoFem")[0] ? Color.GREEN : Color.RED);
		AseoFem.addActionListener(this);
		AseoFem.setBounds(219, 596, 18, 18);
		calefacciones.add(AseoFem);
		
		JButton AseoMasc = new JButton("");
		AseoMasc.setName("AseoMasc");
		AseoMasc.setBackground(mapa.get("AseoMasc")[0] ? Color.GREEN : Color.RED);
		AseoMasc.addActionListener(this);
		AseoMasc.setBounds(273, 596, 18, 18);
		calefacciones.add(AseoMasc);
		
		JButton Conserjeria = new JButton("");
		Conserjeria.setName("Conserjeria");
		Conserjeria.setBackground(mapa.get("Conserjeria")[0] ? Color.GREEN : Color.RED);
		Conserjeria.addActionListener(this);
		Conserjeria.setBounds(608, 667, 18, 18);
		calefacciones.add(Conserjeria);
		
		JLabel mapaCalefacciones = new JLabel("");
		mapaCalefacciones.setBounds(0, 0, 1009, 701);
		mapaCalefacciones.setIcon(new ImageIcon(GUI.class.getResource("/Media/PlanoEditado (Mediana).png")));
		calefacciones.add(mapaCalefacciones);
		
		JPanel alarmas = new JPanel();
		tabbedPane.addTab("Alarmas", null, alarmas, null);
		alarmas.setLayout(null);
		
		JButton TallerMantenimiento_1 = new JButton("");
		TallerMantenimiento_1.setName("TallerMantenimiento");
		TallerMantenimiento_1.setBackground(mapa.get("TallerMantenimiento")[1] ? Color.GREEN : Color.RED);
		TallerMantenimiento_1.setBounds(354, 135, 18, 18);
		alarmas.add(TallerMantenimiento_1);
		
		JButton Aula014_1 = new JButton("");
		Aula014_1.setName("Aula014");
		Aula014_1.setBackground(mapa.get("Aula014")[1] ? Color.GREEN : Color.RED);
		Aula014_1.setBounds(260, 316, 18, 18);
		alarmas.add(Aula014_1);
		
		JButton Aula012_1 = new JButton("");
		Aula012_1.setName("Aula012");
		Aula012_1.setBackground(mapa.get("Aula012")[1] ? Color.GREEN : Color.RED);
		Aula012_1.setBounds(423, 304, 18, 18);
		alarmas.add(Aula012_1);
		
		JButton Aula013_1 = new JButton("");
		Aula013_1.setName("Aula013");
		Aula013_1.setBackground(mapa.get("Aula013")[1] ? Color.GREEN : Color.RED);
		Aula013_1.setBounds(342, 304, 18, 18);
		alarmas.add(Aula013_1);
		
		JButton PasoAula013_1 = new JButton("");
		PasoAula013_1.setName("PasoAula013");
		PasoAula013_1.setBackground(mapa.get("PasoAula013")[1] ? Color.GREEN : Color.RED);
		PasoAula013_1.setBounds(402, 347, 18, 18);
		alarmas.add(PasoAula013_1);
		
		JButton Hall_1 = new JButton("");
		Hall_1.setName("Hall");
		Hall_1.setBackground(mapa.get("Hall")[1] ? Color.GREEN : Color.RED);
		Hall_1.setBounds(454, 374, 18, 18);
		alarmas.add(Hall_1);
		
		JButton Almacen1_1 = new JButton("");
		Almacen1_1.setName("Almacen1");
		Almacen1_1.setBackground(mapa.get("Almacen1")[1] ? Color.GREEN : Color.RED);
		Almacen1_1.setBounds(532, 374, 18, 18);
		alarmas.add(Almacen1_1);
		
		JButton Almacen2_1 = new JButton("");
		Almacen2_1.setName("Almacen2");
		Almacen2_1.setBackground(mapa.get("Almacen2")[1] ? Color.GREEN : Color.RED);
		Almacen2_1.setBounds(585, 374, 18, 18);
		alarmas.add(Almacen2_1);
		
		JButton Almacen3_1 = new JButton("");
		Almacen3_1.setName("Almacen3");
		Almacen3_1.setBackground(mapa.get("Almacen3")[1] ? Color.GREEN : Color.RED);
		Almacen3_1.setBounds(847, 374, 18, 18);
		alarmas.add(Almacen3_1);
		
		JButton Aula015_1 = new JButton("");
		Aula015_1.setName("Aula015");
		Aula015_1.setBackground(mapa.get("Aula015")[1] ? Color.GREEN : Color.RED);
		Aula015_1.setBounds(433, 485, 18, 18);
		alarmas.add(Aula015_1);
		
		JButton Aula010_1 = new JButton("");
		Aula010_1.setName("Aula010");
		Aula010_1.setBackground(mapa.get("Aula010")[1] ? Color.GREEN : Color.RED);
		Aula010_1.setBounds(532, 472, 18, 18);
		alarmas.add(Aula010_1);
		
		JButton Aula016_1 = new JButton("");
		Aula016_1.setName("Aula016");
		Aula016_1.setBackground(mapa.get("Aula016")[1] ? Color.GREEN : Color.RED);
		Aula016_1.setBounds(433, 562, 18, 18);
		alarmas.add(Aula016_1);
		
		JButton Archivo_1 = new JButton("");
		Archivo_1.setName("Archivo");
		Archivo_1.setBackground(mapa.get("Archivo")[1] ? Color.GREEN : Color.RED);
		Archivo_1.setBounds(520, 543, 18, 18);
		alarmas.add(Archivo_1);
		
		JButton PasoAula016_1 = new JButton("");
		PasoAula016_1.setName("PasoAula016");
		PasoAula016_1.setBackground(mapa.get("PasoAula016")[1] ? Color.GREEN : Color.RED);
		PasoAula016_1.setBounds(489, 500, 18, 18);
		alarmas.add(PasoAula016_1);
		
		JButton AseoMinusval_1 = new JButton("");
		AseoMinusval_1.setName("AseoMinusval");
		AseoMinusval_1.setBackground(mapa.get("AseoMinusval")[1] ? Color.GREEN : Color.RED);
		AseoMinusval_1.setBounds(532, 511, 18, 18);
		alarmas.add(AseoMinusval_1);
		
		JButton Aula007_1 = new JButton("");
		Aula007_1.setName("Aula007");
		Aula007_1.setBackground(mapa.get("Aula007")[1] ? Color.GREEN : Color.RED);
		Aula007_1.setBounds(585, 579, 18, 18);
		alarmas.add(Aula007_1);
		
		JButton Aula006_1 = new JButton("");
		Aula006_1.setName("Aula006");
		Aula006_1.setBackground(mapa.get("Aula006")[1] ? Color.GREEN : Color.RED);
		Aula006_1.setBounds(683, 579, 18, 18);
		alarmas.add(Aula006_1);
		
		JButton Vestibulo_1 = new JButton("");
		Vestibulo_1.setName("Vestibulo");
		Vestibulo_1.setBackground(mapa.get("Vestibulo")[1] ? Color.GREEN : Color.RED);
		Vestibulo_1.setBounds(671, 648, 18, 18);
		alarmas.add(Vestibulo_1);
		
		JButton PasoVestibulo_1 = new JButton("");
		PasoVestibulo_1.setName("PasoVestibulo");
		PasoVestibulo_1.setBackground(mapa.get("PasoVestibulo")[1] ? Color.GREEN : Color.RED);
		PasoVestibulo_1.setBounds(561, 613, 18, 18);
		alarmas.add(PasoVestibulo_1);
		
		JButton SalaAlumnos_1 = new JButton("");
		SalaAlumnos_1.setName("SalaAlumnos");
		SalaAlumnos_1.setBackground(mapa.get("SalaAlumnos")[1] ? Color.GREEN : Color.RED);
		SalaAlumnos_1.setBounds(768, 660, 18, 18);
		alarmas.add(SalaAlumnos_1);
		
		JButton SalaProfesores_1 = new JButton("");
		SalaProfesores_1.setName("SalaProfesores");
		SalaProfesores_1.setBackground(mapa.get("SalaProfesores")[1] ? Color.GREEN : Color.RED);
		SalaProfesores_1.setBounds(847, 660, 18, 18);
		alarmas.add(SalaProfesores_1);
		
		JButton Aula003_1 = new JButton("");
		Aula003_1.setName("Aula003");
		Aula003_1.setBackground(mapa.get("Aula003")[1] ? Color.GREEN : Color.RED);
		Aula003_1.setBounds(898, 660, 18, 18);
		alarmas.add(Aula003_1);
		
		JButton DPTInformatica_1 = new JButton("");
		DPTInformatica_1.setName("DPTInformatica");
		DPTInformatica_1.setBackground(mapa.get("DPTInformatica")[1] ? Color.GREEN : Color.RED);
		DPTInformatica_1.setBounds(898, 579, 18, 18);
		alarmas.add(DPTInformatica_1);
		
		JButton DPTFOL_1 = new JButton("");
		DPTFOL_1.setName("DPTFOL");
		DPTFOL_1.setBackground(mapa.get("DPTFOL")[1] ? Color.GREEN : Color.RED);
		DPTFOL_1.setBounds(811, 579, 18, 18);
		alarmas.add(DPTFOL_1);
		
		JButton Aula005B_1 = new JButton("");
		Aula005B_1.setName("Aula005B");
		Aula005B_1.setBackground(mapa.get("Aula005B")[1] ? Color.GREEN : Color.RED);
		Aula005B_1.setBounds(768, 579, 18, 18);
		alarmas.add(Aula005B_1);
		
		JButton VestuarioLimpieza_1 = new JButton("");
		VestuarioLimpieza_1.setName("VestuarioLimpieza");
		VestuarioLimpieza_1.setBackground(mapa.get("VestuarioLimpieza")[1] ? Color.GREEN : Color.RED);
		VestuarioLimpieza_1.setBounds(157, 579, 18, 18);
		alarmas.add(VestuarioLimpieza_1);
		
		JButton AseoFem_1 = new JButton("");
		AseoFem_1.setName("AseoFem");
		AseoFem_1.setBackground(mapa.get("AseoFem")[1] ? Color.GREEN : Color.RED);
		AseoFem_1.setBounds(219, 596, 18, 18);
		alarmas.add(AseoFem_1);
		
		JButton AseoMasc_1 = new JButton("");
		AseoMasc_1.setName("AseoMasc");
		AseoMasc_1.setBackground(mapa.get("AseoMasc")[1] ? Color.GREEN : Color.RED);
		AseoMasc_1.setBounds(273, 596, 18, 18);
		alarmas.add(AseoMasc_1);
		
		JButton Conserjeria_1 = new JButton("");
		Conserjeria_1.setName("Conserjeria");
		Conserjeria_1.setBackground(mapa.get("Conserjeria")[1] ? Color.GREEN : Color.RED);
		Conserjeria_1.setBounds(608, 667, 18, 18);
		alarmas.add(Conserjeria_1);
		
		JLabel mapaAlarmas = new JLabel("");
		mapaAlarmas.setBounds(0, 0, 996, 701);
		mapaAlarmas.setIcon(new ImageIcon(GUI.class.getResource("/Media/PlanoEditado (Mediana).png")));
		alarmas.add(mapaAlarmas);
	}

	// Método que actualiza el estado de las calefacciones
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton boton = (JButton) e.getSource();
		String nombre = boton.getName();
		Sala salaActualizada = new Sala(nombre, !mapa.get(nombre)[0], mapa.get(nombre)[1]);
		if (ConexionDB.updateSala(salaActualizada)) {
			mapa = ConexionDB.getSalas();
			boton.setBackground(mapa.get(nombre)[0] ? Color.GREEN : Color.RED);
		}
	}
}
