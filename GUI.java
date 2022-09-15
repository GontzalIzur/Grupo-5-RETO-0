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
import javax.swing.JOptionPane;
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
		setTitle("Mapa de salas");
		setResizable(false);
		setIconImage(new ImageIcon(getClass().getResource("Media/Plano.jpg")).getImage());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1001, 729);
		contentPane.add(tabbedPane);

		JPanel calefacciones = new JPanel();
		calefacciones.setName("Calefacciones");
		tabbedPane.addTab("Calefacciones", null, calefacciones, null);
		calefacciones.setLayout(null);

		JButton TallerMantenimientoCalefaccion = new JButton("");
		TallerMantenimientoCalefaccion.setName("TallerMantenimiento");
		TallerMantenimientoCalefaccion.setBackground(mapa.get("TallerMantenimiento")[0] ? Color.GREEN : Color.RED);
		TallerMantenimientoCalefaccion.addActionListener(this);
		TallerMantenimientoCalefaccion.setBounds(354, 135, 18, 18);
		calefacciones.add(TallerMantenimientoCalefaccion);

		JButton Aula014Calefaccion = new JButton("");
		Aula014Calefaccion.setName("Aula014");
		Aula014Calefaccion.setBackground(mapa.get("Aula014")[0] ? Color.GREEN : Color.RED);
		Aula014Calefaccion.addActionListener(this);
		Aula014Calefaccion.setBounds(260, 316, 18, 18);
		calefacciones.add(Aula014Calefaccion);

		JButton Aula012Calefaccion = new JButton("");
		Aula012Calefaccion.setName("Aula012");
		Aula012Calefaccion.setBackground(mapa.get("Aula012")[0] ? Color.GREEN : Color.RED);
		Aula012Calefaccion.addActionListener(this);
		Aula012Calefaccion.setBounds(423, 304, 18, 18);
		calefacciones.add(Aula012Calefaccion);

		JButton Aula013Calefaccion = new JButton("");
		Aula013Calefaccion.setName("Aula013");
		Aula013Calefaccion.setBackground(mapa.get("Aula013")[0] ? Color.GREEN : Color.RED);
		Aula013Calefaccion.addActionListener(this);
		Aula013Calefaccion.setBounds(342, 304, 18, 18);
		calefacciones.add(Aula013Calefaccion);

		JButton PasoAula013Calefaccion = new JButton("");
		PasoAula013Calefaccion.setName("PasoAula013");
		PasoAula013Calefaccion.setBackground(mapa.get("PasoAula013")[0] ? Color.GREEN : Color.RED);
		PasoAula013Calefaccion.addActionListener(this);
		PasoAula013Calefaccion.setBounds(402, 347, 18, 18);
		calefacciones.add(PasoAula013Calefaccion);

		JButton HallCalefaccion = new JButton("");
		HallCalefaccion.setName("Hall");
		HallCalefaccion.setBackground(mapa.get("Hall")[0] ? Color.GREEN : Color.RED);
		HallCalefaccion.addActionListener(this);
		HallCalefaccion.setBounds(454, 374, 18, 18);
		calefacciones.add(HallCalefaccion);

		JButton Almacen1Calefaccion = new JButton("");
		Almacen1Calefaccion.setName("Almacen1");
		Almacen1Calefaccion.setBackground(mapa.get("Almacen1")[0] ? Color.GREEN : Color.RED);
		Almacen1Calefaccion.addActionListener(this);
		Almacen1Calefaccion.setBounds(532, 374, 18, 18);
		calefacciones.add(Almacen1Calefaccion);

		JButton Almacen2Calefaccion = new JButton("");
		Almacen2Calefaccion.setName("Almacen2");
		Almacen2Calefaccion.setBackground(mapa.get("Almacen2")[0] ? Color.GREEN : Color.RED);
		Almacen2Calefaccion.addActionListener(this);
		Almacen2Calefaccion.setBounds(585, 374, 18, 18);
		calefacciones.add(Almacen2Calefaccion);

		JButton Almacen3Calefaccion = new JButton("");
		Almacen3Calefaccion.setName("Almacen3");
		Almacen3Calefaccion.setBackground(mapa.get("Almacen3")[0] ? Color.GREEN : Color.RED);
		Almacen3Calefaccion.addActionListener(this);
		Almacen3Calefaccion.setBounds(847, 374, 18, 18);
		calefacciones.add(Almacen3Calefaccion);

		JButton Aula015Calefaccion = new JButton("");
		Aula015Calefaccion.setName("Aula015");
		Aula015Calefaccion.setBackground(mapa.get("Aula015")[0] ? Color.GREEN : Color.RED);
		Aula015Calefaccion.addActionListener(this);
		Aula015Calefaccion.setBounds(433, 485, 18, 18);
		calefacciones.add(Aula015Calefaccion);

		JButton Aula010Calefaccion = new JButton("");
		Aula010Calefaccion.setName("Aula010");
		Aula010Calefaccion.setBackground(mapa.get("Aula010")[0] ? Color.GREEN : Color.RED);
		Aula010Calefaccion.addActionListener(this);
		Aula010Calefaccion.setBounds(532, 472, 18, 18);
		calefacciones.add(Aula010Calefaccion);

		JButton Aula016Calefaccion = new JButton("");
		Aula016Calefaccion.setName("Aula016");
		Aula016Calefaccion.setBackground(mapa.get("Aula016")[0] ? Color.GREEN : Color.RED);
		Aula016Calefaccion.addActionListener(this);
		Aula016Calefaccion.setBounds(433, 562, 18, 18);
		calefacciones.add(Aula016Calefaccion);

		JButton ArchivoCalefaccion = new JButton("");
		ArchivoCalefaccion.setName("Archivo");
		ArchivoCalefaccion.setBackground(mapa.get("Archivo")[0] ? Color.GREEN : Color.RED);
		ArchivoCalefaccion.addActionListener(this);
		ArchivoCalefaccion.setBounds(520, 543, 18, 18);
		calefacciones.add(ArchivoCalefaccion);

		JButton PasoAula016Calefaccion = new JButton("");
		PasoAula016Calefaccion.setName("PasoAula016");
		PasoAula016Calefaccion.setBackground(mapa.get("PasoAula016")[0] ? Color.GREEN : Color.RED);
		PasoAula016Calefaccion.addActionListener(this);
		PasoAula016Calefaccion.setBounds(489, 500, 18, 18);
		calefacciones.add(PasoAula016Calefaccion);

		JButton AseoMinusvalCalefaccion = new JButton("");
		AseoMinusvalCalefaccion.setName("AseoMinusval");
		AseoMinusvalCalefaccion.setBackground(mapa.get("AseoMinusval")[0] ? Color.GREEN : Color.RED);
		AseoMinusvalCalefaccion.addActionListener(this);
		AseoMinusvalCalefaccion.setBounds(532, 511, 18, 18);
		calefacciones.add(AseoMinusvalCalefaccion);

		JButton Aula007Calefaccion = new JButton("");
		Aula007Calefaccion.setName("Aula007");
		Aula007Calefaccion.setBackground(mapa.get("Aula007")[0] ? Color.GREEN : Color.RED);
		Aula007Calefaccion.addActionListener(this);
		Aula007Calefaccion.setBounds(585, 579, 18, 18);
		calefacciones.add(Aula007Calefaccion);

		JButton Aula006Calefaccion = new JButton("");
		Aula006Calefaccion.setName("Aula006");
		Aula006Calefaccion.setBackground(mapa.get("Aula006")[0] ? Color.GREEN : Color.RED);
		Aula006Calefaccion.addActionListener(this);
		Aula006Calefaccion.setBounds(683, 579, 18, 18);
		calefacciones.add(Aula006Calefaccion);

		JButton VestibuloCalefaccion = new JButton("");
		VestibuloCalefaccion.setName("Vestibulo");
		VestibuloCalefaccion.setBackground(mapa.get("Vestibulo")[0] ? Color.GREEN : Color.RED);
		VestibuloCalefaccion.addActionListener(this);
		VestibuloCalefaccion.setBounds(671, 648, 18, 18);
		calefacciones.add(VestibuloCalefaccion);

		JButton PasoVestibuloCalefaccion = new JButton("");
		PasoVestibuloCalefaccion.setName("PasoVestibulo");
		PasoVestibuloCalefaccion.setBackground(mapa.get("PasoVestibulo")[0] ? Color.GREEN : Color.RED);
		PasoVestibuloCalefaccion.addActionListener(this);
		PasoVestibuloCalefaccion.setBounds(561, 613, 18, 18);
		calefacciones.add(PasoVestibuloCalefaccion);

		JButton SalaAlumnosCalefaccion = new JButton("");
		SalaAlumnosCalefaccion.setName("SalaAlumnos");
		SalaAlumnosCalefaccion.setBackground(mapa.get("SalaAlumnos")[0] ? Color.GREEN : Color.RED);
		SalaAlumnosCalefaccion.addActionListener(this);
		SalaAlumnosCalefaccion.setBounds(768, 660, 18, 18);
		calefacciones.add(SalaAlumnosCalefaccion);

		JButton SalaProfesoresCalefaccion = new JButton("");
		SalaProfesoresCalefaccion.setName("SalaProfesores");
		SalaProfesoresCalefaccion.setBackground(mapa.get("SalaProfesores")[0] ? Color.GREEN : Color.RED);
		SalaProfesoresCalefaccion.addActionListener(this);
		SalaProfesoresCalefaccion.setBounds(847, 660, 18, 18);
		calefacciones.add(SalaProfesoresCalefaccion);

		JButton Aula003Calefaccion = new JButton("");
		Aula003Calefaccion.setName("Aula003");
		Aula003Calefaccion.setBackground(mapa.get("Aula003")[0] ? Color.GREEN : Color.RED);
		Aula003Calefaccion.addActionListener(this);
		Aula003Calefaccion.setBounds(898, 660, 18, 18);
		calefacciones.add(Aula003Calefaccion);

		JButton DPTInformaticaCalefaccion = new JButton("");
		DPTInformaticaCalefaccion.setName("DPTInformatica");
		DPTInformaticaCalefaccion.setBackground(mapa.get("DPTInformatica")[0] ? Color.GREEN : Color.RED);
		DPTInformaticaCalefaccion.addActionListener(this);
		DPTInformaticaCalefaccion.setBounds(898, 579, 18, 18);
		calefacciones.add(DPTInformaticaCalefaccion);

		JButton DPTFOLCalefaccion = new JButton("");
		DPTFOLCalefaccion.setName("DPTFOL");
		DPTFOLCalefaccion.setBackground(mapa.get("DPTFOL")[0] ? Color.GREEN : Color.RED);
		DPTFOLCalefaccion.addActionListener(this);
		DPTFOLCalefaccion.setBounds(811, 579, 18, 18);
		calefacciones.add(DPTFOLCalefaccion);

		JButton Aula005BCalefaccion = new JButton("");
		Aula005BCalefaccion.setName("Aula005B");
		Aula005BCalefaccion.setBackground(mapa.get("Aula005B")[0] ? Color.GREEN : Color.RED);
		Aula005BCalefaccion.addActionListener(this);
		Aula005BCalefaccion.setBounds(768, 579, 18, 18);
		calefacciones.add(Aula005BCalefaccion);

		JButton VestuarioLimpiezaCalefaccion = new JButton("");
		VestuarioLimpiezaCalefaccion.setName("VestuarioLimpieza");
		VestuarioLimpiezaCalefaccion.setBackground(mapa.get("VestuarioLimpieza")[0] ? Color.GREEN : Color.RED);
		VestuarioLimpiezaCalefaccion.addActionListener(this);
		VestuarioLimpiezaCalefaccion.setBounds(157, 579, 18, 18);
		calefacciones.add(VestuarioLimpiezaCalefaccion);

		JButton AseoFemCalefaccion = new JButton("");
		AseoFemCalefaccion.setName("AseoFem");
		AseoFemCalefaccion.setBackground(mapa.get("AseoFem")[0] ? Color.GREEN : Color.RED);
		AseoFemCalefaccion.addActionListener(this);
		AseoFemCalefaccion.setBounds(219, 596, 18, 18);
		calefacciones.add(AseoFemCalefaccion);

		JButton AseoMascCalefaccion = new JButton("");
		AseoMascCalefaccion.setName("AseoMasc");
		AseoMascCalefaccion.setBackground(mapa.get("AseoMasc")[0] ? Color.GREEN : Color.RED);
		AseoMascCalefaccion.addActionListener(this);
		AseoMascCalefaccion.setBounds(273, 596, 18, 18);
		calefacciones.add(AseoMascCalefaccion);

		JButton ConserjeriaCalefaccion = new JButton("");
		ConserjeriaCalefaccion.setName("Conserjeria");
		ConserjeriaCalefaccion.setBackground(mapa.get("Conserjeria")[0] ? Color.GREEN : Color.RED);
		ConserjeriaCalefaccion.addActionListener(this);
		ConserjeriaCalefaccion.setBounds(608, 667, 18, 18);
		calefacciones.add(ConserjeriaCalefaccion);

		JLabel mapaCalefacciones = new JLabel("");
		mapaCalefacciones.setBounds(0, 0, 1009, 701);
		mapaCalefacciones.setIcon(new ImageIcon(GUI.class.getResource("/Media/PlanoEditado (Mediana).png")));
		calefacciones.add(mapaCalefacciones);

		JPanel alarmas = new JPanel();
		alarmas.setName("Alarmas");
		tabbedPane.addTab("Alarmas", null, alarmas, null);
		alarmas.setLayout(null);

		JButton TallerMantenimiento_1 = new JButton("");
		TallerMantenimiento_1.setName("TallerMantenimiento");
		TallerMantenimiento_1.setBackground(mapa.get("TallerMantenimiento")[1] ? Color.GREEN : Color.RED);
		TallerMantenimiento_1.addActionListener(this);
		TallerMantenimiento_1.setBounds(354, 135, 18, 18);
		alarmas.add(TallerMantenimiento_1);

		JButton Aula014_1 = new JButton("");
		Aula014_1.setName("Aula014");
		Aula014_1.setBackground(mapa.get("Aula014")[1] ? Color.GREEN : Color.RED);
		Aula014_1.addActionListener(this);
		Aula014_1.setBounds(260, 316, 18, 18);
		alarmas.add(Aula014_1);

		JButton Aula012_1 = new JButton("");
		Aula012_1.setName("Aula012");
		Aula012_1.setBackground(mapa.get("Aula012")[1] ? Color.GREEN : Color.RED);
		Aula012_1.addActionListener(this);
		Aula012_1.setBounds(423, 304, 18, 18);
		alarmas.add(Aula012_1);

		JButton Aula013_1 = new JButton("");
		Aula013_1.setName("Aula013");
		Aula013_1.setBackground(mapa.get("Aula013")[1] ? Color.GREEN : Color.RED);
		Aula013_1.addActionListener(this);
		Aula013_1.setBounds(342, 304, 18, 18);
		alarmas.add(Aula013_1);

		JButton PasoAula013_1 = new JButton("");
		PasoAula013_1.setName("PasoAula013");
		PasoAula013_1.setBackground(mapa.get("PasoAula013")[1] ? Color.GREEN : Color.RED);
		PasoAula013_1.addActionListener(this);
		PasoAula013_1.setBounds(402, 347, 18, 18);
		alarmas.add(PasoAula013_1);

		JButton Hall_1 = new JButton("");
		Hall_1.setName("Hall");
		Hall_1.setBackground(mapa.get("Hall")[1] ? Color.GREEN : Color.RED);
		Hall_1.addActionListener(this);
		Hall_1.setBounds(454, 374, 18, 18);
		alarmas.add(Hall_1);

		JButton Almacen1_1 = new JButton("");
		Almacen1_1.setName("Almacen1");
		Almacen1_1.setBackground(mapa.get("Almacen1")[1] ? Color.GREEN : Color.RED);
		Almacen1_1.addActionListener(this);
		Almacen1_1.setBounds(532, 374, 18, 18);
		alarmas.add(Almacen1_1);

		JButton Almacen2_1 = new JButton("");
		Almacen2_1.setName("Almacen2");
		Almacen2_1.setBackground(mapa.get("Almacen2")[1] ? Color.GREEN : Color.RED);
		Almacen2_1.addActionListener(this);
		Almacen2_1.setBounds(585, 374, 18, 18);
		alarmas.add(Almacen2_1);

		JButton Almacen3_1 = new JButton("");
		Almacen3_1.setName("Almacen3");
		Almacen3_1.setBackground(mapa.get("Almacen3")[1] ? Color.GREEN : Color.RED);
		Almacen3_1.addActionListener(this);
		Almacen3_1.setBounds(847, 374, 18, 18);
		alarmas.add(Almacen3_1);

		JButton Aula015_1 = new JButton("");
		Aula015_1.setName("Aula015");
		Aula015_1.setBackground(mapa.get("Aula015")[1] ? Color.GREEN : Color.RED);
		Aula015_1.addActionListener(this);
		Aula015_1.setBounds(433, 485, 18, 18);
		alarmas.add(Aula015_1);

		JButton Aula010_1 = new JButton("");
		Aula010_1.setName("Aula010");
		Aula010_1.setBackground(mapa.get("Aula010")[1] ? Color.GREEN : Color.RED);
		Aula010_1.addActionListener(this);
		Aula010_1.setBounds(532, 472, 18, 18);
		alarmas.add(Aula010_1);

		JButton Aula016_1 = new JButton("");
		Aula016_1.setName("Aula016");
		Aula016_1.setBackground(mapa.get("Aula016")[1] ? Color.GREEN : Color.RED);
		Aula016_1.addActionListener(this);
		Aula016_1.setBounds(433, 562, 18, 18);
		alarmas.add(Aula016_1);

		JButton Archivo_1 = new JButton("");
		Archivo_1.setName("Archivo");
		Archivo_1.setBackground(mapa.get("Archivo")[1] ? Color.GREEN : Color.RED);
		Archivo_1.addActionListener(this);
		Archivo_1.setBounds(520, 543, 18, 18);
		alarmas.add(Archivo_1);

		JButton PasoAula016_1 = new JButton("");
		PasoAula016_1.setName("PasoAula016");
		PasoAula016_1.setBackground(mapa.get("PasoAula016")[1] ? Color.GREEN : Color.RED);
		PasoAula016_1.addActionListener(this);
		PasoAula016_1.setBounds(489, 500, 18, 18);
		alarmas.add(PasoAula016_1);

		JButton AseoMinusval_1 = new JButton("");
		AseoMinusval_1.setName("AseoMinusval");
		AseoMinusval_1.setBackground(mapa.get("AseoMinusval")[1] ? Color.GREEN : Color.RED);
		AseoMinusval_1.addActionListener(this);
		AseoMinusval_1.setBounds(532, 511, 18, 18);
		alarmas.add(AseoMinusval_1);

		JButton Aula007_1 = new JButton("");
		Aula007_1.setName("Aula007");
		Aula007_1.setBackground(mapa.get("Aula007")[1] ? Color.GREEN : Color.RED);
		Aula007_1.addActionListener(this);
		Aula007_1.setBounds(585, 579, 18, 18);
		alarmas.add(Aula007_1);

		JButton Aula006_1 = new JButton("");
		Aula006_1.setName("Aula006");
		Aula006_1.setBackground(mapa.get("Aula006")[1] ? Color.GREEN : Color.RED);
		Aula006_1.addActionListener(this);
		Aula006_1.setBounds(683, 579, 18, 18);
		alarmas.add(Aula006_1);

		JButton Vestibulo_1 = new JButton("");
		Vestibulo_1.setName("Vestibulo");
		Vestibulo_1.setBackground(mapa.get("Vestibulo")[1] ? Color.GREEN : Color.RED);
		Vestibulo_1.addActionListener(this);
		Vestibulo_1.setBounds(671, 648, 18, 18);
		alarmas.add(Vestibulo_1);

		JButton PasoVestibulo_1 = new JButton("");
		PasoVestibulo_1.setName("PasoVestibulo");
		PasoVestibulo_1.setBackground(mapa.get("PasoVestibulo")[1] ? Color.GREEN : Color.RED);
		PasoVestibulo_1.addActionListener(this);
		PasoVestibulo_1.setBounds(561, 613, 18, 18);
		alarmas.add(PasoVestibulo_1);

		JButton SalaAlumnos_1 = new JButton("");
		SalaAlumnos_1.setName("SalaAlumnos");
		SalaAlumnos_1.setBackground(mapa.get("SalaAlumnos")[1] ? Color.GREEN : Color.RED);
		SalaAlumnos_1.addActionListener(this);
		SalaAlumnos_1.setBounds(768, 660, 18, 18);
		alarmas.add(SalaAlumnos_1);

		JButton SalaProfesores_1 = new JButton("");
		SalaProfesores_1.setName("SalaProfesores");
		SalaProfesores_1.setBackground(mapa.get("SalaProfesores")[1] ? Color.GREEN : Color.RED);
		SalaProfesores_1.addActionListener(this);
		SalaProfesores_1.setBounds(847, 660, 18, 18);
		alarmas.add(SalaProfesores_1);

		JButton Aula003_1 = new JButton("");
		Aula003_1.setName("Aula003");
		Aula003_1.setBackground(mapa.get("Aula003")[1] ? Color.GREEN : Color.RED);
		Aula003_1.addActionListener(this);
		Aula003_1.setBounds(898, 660, 18, 18);
		alarmas.add(Aula003_1);

		JButton DPTInformatica_1 = new JButton("");
		DPTInformatica_1.setName("DPTInformatica");
		DPTInformatica_1.setBackground(mapa.get("DPTInformatica")[1] ? Color.GREEN : Color.RED);
		DPTInformatica_1.addActionListener(this);
		DPTInformatica_1.setBounds(898, 579, 18, 18);
		alarmas.add(DPTInformatica_1);

		JButton DPTFOL_1 = new JButton("");
		DPTFOL_1.setName("DPTFOL");
		DPTFOL_1.setBackground(mapa.get("DPTFOL")[1] ? Color.GREEN : Color.RED);
		DPTFOL_1.addActionListener(this);
		DPTFOL_1.setBounds(811, 579, 18, 18);
		alarmas.add(DPTFOL_1);

		JButton Aula005B_1 = new JButton("");
		Aula005B_1.setName("Aula005B");
		Aula005B_1.setBackground(mapa.get("Aula005B")[1] ? Color.GREEN : Color.RED);
		Aula005B_1.addActionListener(this);
		Aula005B_1.setBounds(768, 579, 18, 18);
		alarmas.add(Aula005B_1);

		JButton VestuarioLimpieza_1 = new JButton("");
		VestuarioLimpieza_1.setName("VestuarioLimpieza");
		VestuarioLimpieza_1.setBackground(mapa.get("VestuarioLimpieza")[1] ? Color.GREEN : Color.RED);
		VestuarioLimpieza_1.addActionListener(this);
		VestuarioLimpieza_1.setBounds(157, 579, 18, 18);
		alarmas.add(VestuarioLimpieza_1);

		JButton AseoFem_1 = new JButton("");
		AseoFem_1.setName("AseoFem");
		AseoFem_1.setBackground(mapa.get("AseoFem")[1] ? Color.GREEN : Color.RED);
		AseoFem_1.addActionListener(this);
		AseoFem_1.setBounds(219, 596, 18, 18);
		alarmas.add(AseoFem_1);

		JButton AseoMasc_1 = new JButton("");
		AseoMasc_1.setName("AseoMasc");
		AseoMasc_1.setBackground(mapa.get("AseoMasc")[1] ? Color.GREEN : Color.RED);
		AseoMasc_1.addActionListener(this);
		AseoMasc_1.setBounds(273, 596, 18, 18);
		alarmas.add(AseoMasc_1);

		JButton Conserjeria_1 = new JButton("");
		Conserjeria_1.setName("Conserjeria");
		Conserjeria_1.setBackground(mapa.get("Conserjeria")[1] ? Color.GREEN : Color.RED);
		Conserjeria_1.addActionListener(this);
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
		String nombreContenedor = boton.getParent().getName();
		switch (nombreContenedor) {
			case "Calefacciones":
				Sala salaActualizada = new Sala(nombre, !mapa.get(nombre)[0], mapa.get(nombre)[1]);
				if (ConexionDB.updateSala(salaActualizada)) {
					mapa = ConexionDB.getSalas();
				}
				else {
					JOptionPane.showMessageDialog(null, "Error al actualizar la sala", "Error", JOptionPane.ERROR_MESSAGE);
				}
				break;
			case "Alarmas":
				if (!mapa.get(nombre)[1]) {
					ConexionDB.updateSala(new Sala(nombre, mapa.get(nombre)[0], true));
					mapa = ConexionDB.getSalas();
				} else {
					JOptionPane.showMessageDialog(null, "No puedes hacer saltar las alarmas!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				break;
			default:
				break;
		}
		boton.setBackground(mapa.get(nombre)[0] ? Color.GREEN : Color.RED);

	}
}
