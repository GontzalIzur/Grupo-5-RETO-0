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
		setIconImage(new ImageIcon(getClass().getResource("Media/ICON.png")).getImage());
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

		//PRINCIPIO BOTONES CALEFACCIÓN
		JButton tallerMantenimientoCalefaccion = new JButton("");
		tallerMantenimientoCalefaccion.setName("TallerMantenimiento");
		tallerMantenimientoCalefaccion.setBackground(mapa.get("TallerMantenimiento")[0] ? Color.GREEN : Color.RED);
		tallerMantenimientoCalefaccion.addActionListener(this);
		tallerMantenimientoCalefaccion.setBounds(354, 135, 18, 18);
		calefacciones.add(tallerMantenimientoCalefaccion);

		JButton aula014Calefaccion = new JButton("");
		aula014Calefaccion.setName("Aula014");
		aula014Calefaccion.setBackground(mapa.get("Aula014")[0] ? Color.GREEN : Color.RED);
		aula014Calefaccion.addActionListener(this);
		aula014Calefaccion.setBounds(260, 316, 18, 18);
		calefacciones.add(aula014Calefaccion);

		JButton aula012Calefaccion = new JButton("");
		aula012Calefaccion.setName("Aula012");
		aula012Calefaccion.setBackground(mapa.get("Aula012")[0] ? Color.GREEN : Color.RED);
		aula012Calefaccion.addActionListener(this);
		aula012Calefaccion.setBounds(423, 304, 18, 18);
		calefacciones.add(aula012Calefaccion);

		JButton aula013Calefaccion = new JButton("");
		aula013Calefaccion.setName("Aula013");
		aula013Calefaccion.setBackground(mapa.get("Aula013")[0] ? Color.GREEN : Color.RED);
		aula013Calefaccion.addActionListener(this);
		aula013Calefaccion.setBounds(342, 304, 18, 18);
		calefacciones.add(aula013Calefaccion);

		JButton pasoAula013Calefaccion = new JButton("");
		pasoAula013Calefaccion.setName("PasoAula013");
		pasoAula013Calefaccion.setBackground(mapa.get("PasoAula013")[0] ? Color.GREEN : Color.RED);
		pasoAula013Calefaccion.addActionListener(this);
		pasoAula013Calefaccion.setBounds(402, 347, 18, 18);
		calefacciones.add(pasoAula013Calefaccion);

		JButton hallCalefaccion = new JButton("");
		hallCalefaccion.setName("Hall");
		hallCalefaccion.setBackground(mapa.get("Hall")[0] ? Color.GREEN : Color.RED);
		hallCalefaccion.addActionListener(this);
		hallCalefaccion.setBounds(454, 374, 18, 18);
		calefacciones.add(hallCalefaccion);

		JButton almacen1Calefaccion = new JButton("");
		almacen1Calefaccion.setName("Almacen1");
		almacen1Calefaccion.setBackground(mapa.get("Almacen1")[0] ? Color.GREEN : Color.RED);
		almacen1Calefaccion.addActionListener(this);
		almacen1Calefaccion.setBounds(532, 374, 18, 18);
		calefacciones.add(almacen1Calefaccion);

		JButton almacen2Calefaccion = new JButton("");
		almacen2Calefaccion.setName("Almacen2");
		almacen2Calefaccion.setBackground(mapa.get("Almacen2")[0] ? Color.GREEN : Color.RED);
		almacen2Calefaccion.addActionListener(this);
		almacen2Calefaccion.setBounds(585, 374, 18, 18);
		calefacciones.add(almacen2Calefaccion);

		JButton almacen3Calefaccion = new JButton("");
		almacen3Calefaccion.setName("Almacen3");
		almacen3Calefaccion.setBackground(mapa.get("Almacen3")[0] ? Color.GREEN : Color.RED);
		almacen3Calefaccion.addActionListener(this);
		almacen3Calefaccion.setBounds(847, 374, 18, 18);
		calefacciones.add(almacen3Calefaccion);

		JButton aula015Calefaccion = new JButton("");
		aula015Calefaccion.setName("Aula015");
		aula015Calefaccion.setBackground(mapa.get("Aula015")[0] ? Color.GREEN : Color.RED);
		aula015Calefaccion.addActionListener(this);
		aula015Calefaccion.setBounds(433, 485, 18, 18);
		calefacciones.add(aula015Calefaccion);

		JButton aula010Calefaccion = new JButton("");
		aula010Calefaccion.setName("Aula010");
		aula010Calefaccion.setBackground(mapa.get("Aula010")[0] ? Color.GREEN : Color.RED);
		aula010Calefaccion.addActionListener(this);
		aula010Calefaccion.setBounds(532, 472, 18, 18);
		calefacciones.add(aula010Calefaccion);

		JButton aula016Calefaccion = new JButton("");
		aula016Calefaccion.setName("Aula016");
		aula016Calefaccion.setBackground(mapa.get("Aula016")[0] ? Color.GREEN : Color.RED);
		aula016Calefaccion.addActionListener(this);
		aula016Calefaccion.setBounds(433, 562, 18, 18);
		calefacciones.add(aula016Calefaccion);

		JButton archivoCalefaccion = new JButton("");
		archivoCalefaccion.setName("Archivo");
		archivoCalefaccion.setBackground(mapa.get("Archivo")[0] ? Color.GREEN : Color.RED);
		archivoCalefaccion.addActionListener(this);
		archivoCalefaccion.setBounds(520, 543, 18, 18);
		calefacciones.add(archivoCalefaccion);

		JButton pasoAula016Calefaccion = new JButton("");
		pasoAula016Calefaccion.setName("PasoAula016");
		pasoAula016Calefaccion.setBackground(mapa.get("PasoAula016")[0] ? Color.GREEN : Color.RED);
		pasoAula016Calefaccion.addActionListener(this);
		pasoAula016Calefaccion.setBounds(489, 500, 18, 18);
		calefacciones.add(pasoAula016Calefaccion);

		JButton aseoMinusvalCalefaccion = new JButton("");
		aseoMinusvalCalefaccion.setName("AseoMinusval");
		aseoMinusvalCalefaccion.setBackground(mapa.get("AseoMinusval")[0] ? Color.GREEN : Color.RED);
		aseoMinusvalCalefaccion.addActionListener(this);
		aseoMinusvalCalefaccion.setBounds(532, 511, 18, 18);
		calefacciones.add(aseoMinusvalCalefaccion);

		JButton aula007Calefaccion = new JButton("");
		aula007Calefaccion.setName("Aula007");
		aula007Calefaccion.setBackground(mapa.get("Aula007")[0] ? Color.GREEN : Color.RED);
		aula007Calefaccion.addActionListener(this);
		aula007Calefaccion.setBounds(585, 579, 18, 18);
		calefacciones.add(aula007Calefaccion);

		JButton aula006Calefaccion = new JButton("");
		aula006Calefaccion.setName("Aula006");
		aula006Calefaccion.setBackground(mapa.get("Aula006")[0] ? Color.GREEN : Color.RED);
		aula006Calefaccion.addActionListener(this);
		aula006Calefaccion.setBounds(683, 579, 18, 18);
		calefacciones.add(aula006Calefaccion);

		JButton vestibuloCalefaccion = new JButton("");
		vestibuloCalefaccion.setName("Vestibulo");
		vestibuloCalefaccion.setBackground(mapa.get("Vestibulo")[0] ? Color.GREEN : Color.RED);
		vestibuloCalefaccion.addActionListener(this);
		vestibuloCalefaccion.setBounds(671, 648, 18, 18);
		calefacciones.add(vestibuloCalefaccion);

		JButton pasoVestibuloCalefaccion = new JButton("");
		pasoVestibuloCalefaccion.setName("PasoVestibulo");
		pasoVestibuloCalefaccion.setBackground(mapa.get("PasoVestibulo")[0] ? Color.GREEN : Color.RED);
		pasoVestibuloCalefaccion.addActionListener(this);
		pasoVestibuloCalefaccion.setBounds(561, 613, 18, 18);
		calefacciones.add(pasoVestibuloCalefaccion);

		JButton salaAlumnosCalefaccion = new JButton("");
		salaAlumnosCalefaccion.setName("SalaAlumnos");
		salaAlumnosCalefaccion.setBackground(mapa.get("SalaAlumnos")[0] ? Color.GREEN : Color.RED);
		salaAlumnosCalefaccion.addActionListener(this);
		salaAlumnosCalefaccion.setBounds(768, 660, 18, 18);
		calefacciones.add(salaAlumnosCalefaccion);

		JButton salaProfesoresCalefaccion = new JButton("");
		salaProfesoresCalefaccion.setName("SalaProfesores");
		salaProfesoresCalefaccion.setBackground(mapa.get("SalaProfesores")[0] ? Color.GREEN : Color.RED);
		salaProfesoresCalefaccion.addActionListener(this);
		salaProfesoresCalefaccion.setBounds(847, 660, 18, 18);
		calefacciones.add(salaProfesoresCalefaccion);

		JButton aula003Calefaccion = new JButton("");
		aula003Calefaccion.setName("Aula003");
		aula003Calefaccion.setBackground(mapa.get("Aula003")[0] ? Color.GREEN : Color.RED);
		aula003Calefaccion.addActionListener(this);
		aula003Calefaccion.setBounds(898, 660, 18, 18);
		calefacciones.add(aula003Calefaccion);

		JButton dptInformaticaCalefaccion = new JButton("");
		dptInformaticaCalefaccion.setName("DPTInformatica");
		dptInformaticaCalefaccion.setBackground(mapa.get("DPTInformatica")[0] ? Color.GREEN : Color.RED);
		dptInformaticaCalefaccion.addActionListener(this);
		dptInformaticaCalefaccion.setBounds(898, 579, 18, 18);
		calefacciones.add(dptInformaticaCalefaccion);

		JButton dptFOLCalefaccion = new JButton("");
		dptFOLCalefaccion.setName("DPTFOL");
		dptFOLCalefaccion.setBackground(mapa.get("DPTFOL")[0] ? Color.GREEN : Color.RED);
		dptFOLCalefaccion.addActionListener(this);
		dptFOLCalefaccion.setBounds(811, 579, 18, 18);
		calefacciones.add(dptFOLCalefaccion);

		JButton aula005BCalefaccion = new JButton("");
		aula005BCalefaccion.setName("Aula005B");
		aula005BCalefaccion.setBackground(mapa.get("Aula005B")[0] ? Color.GREEN : Color.RED);
		aula005BCalefaccion.addActionListener(this);
		aula005BCalefaccion.setBounds(768, 579, 18, 18);
		calefacciones.add(aula005BCalefaccion);

		JButton vestuarioLimpiezaCalefaccion = new JButton("");
		vestuarioLimpiezaCalefaccion.setName("VestuarioLimpieza");
		vestuarioLimpiezaCalefaccion.setBackground(mapa.get("VestuarioLimpieza")[0] ? Color.GREEN : Color.RED);
		vestuarioLimpiezaCalefaccion.addActionListener(this);
		vestuarioLimpiezaCalefaccion.setBounds(157, 579, 18, 18);
		calefacciones.add(vestuarioLimpiezaCalefaccion);

		JButton aseoFemCalefaccion = new JButton("");
		aseoFemCalefaccion.setName("AseoFem");
		aseoFemCalefaccion.setBackground(mapa.get("AseoFem")[0] ? Color.GREEN : Color.RED);
		aseoFemCalefaccion.addActionListener(this);
		aseoFemCalefaccion.setBounds(219, 596, 18, 18);
		calefacciones.add(aseoFemCalefaccion);

		JButton aseoMascCalefaccion = new JButton("");
		aseoMascCalefaccion.setName("AseoMasc");
		aseoMascCalefaccion.setBackground(mapa.get("AseoMasc")[0] ? Color.GREEN : Color.RED);
		aseoMascCalefaccion.addActionListener(this);
		aseoMascCalefaccion.setBounds(273, 596, 18, 18);
		calefacciones.add(aseoMascCalefaccion);

		JButton conserjeriaCalefaccion = new JButton("");
		conserjeriaCalefaccion.setName("Conserjeria");
		conserjeriaCalefaccion.setBackground(mapa.get("Conserjeria")[0] ? Color.GREEN : Color.RED);
		conserjeriaCalefaccion.addActionListener(this);
		conserjeriaCalefaccion.setBounds(608, 667, 18, 18);
		calefacciones.add(conserjeriaCalefaccion);
		//FINAL BOTONES CALEFACCIÓN

		JLabel mapaCalefacciones = new JLabel("");
		mapaCalefacciones.setBounds(0, 0, 1009, 701);
		mapaCalefacciones.setIcon(new ImageIcon(GUI.class.getResource("/Media/PlanoEditado (Mediana).png")));
		calefacciones.add(mapaCalefacciones);

		JPanel alarmas = new JPanel();
		alarmas.setName("Alarmas");
		tabbedPane.addTab("Alarmas", null, alarmas, null);
		alarmas.setLayout(null);

		//PRINCIPIO BOTONES ALARMA
		JButton tallerMantenimientoAlarma = new JButton("");
		tallerMantenimientoAlarma.setName("TallerMantenimiento");
		tallerMantenimientoAlarma.setBackground(mapa.get("TallerMantenimiento")[1] ? Color.GREEN : Color.RED);
		tallerMantenimientoAlarma.addActionListener(this);
		tallerMantenimientoAlarma.setBounds(354, 135, 18, 18);
		alarmas.add(tallerMantenimientoAlarma);

		JButton aula014Alarma = new JButton("");
		aula014Alarma.setName("Aula014");
		aula014Alarma.setBackground(mapa.get("Aula014")[1] ? Color.GREEN : Color.RED);
		aula014Alarma.addActionListener(this);
		aula014Alarma.setBounds(260, 316, 18, 18);
		alarmas.add(aula014Alarma);

		JButton aula012Alarma = new JButton("");
		aula012Alarma.setName("Aula012");
		aula012Alarma.setBackground(mapa.get("Aula012")[1] ? Color.GREEN : Color.RED);
		aula012Alarma.addActionListener(this);
		aula012Alarma.setBounds(423, 304, 18, 18);
		alarmas.add(aula012Alarma);

		JButton aula013Alarma = new JButton("");
		aula013Alarma.setName("Aula013");
		aula013Alarma.setBackground(mapa.get("Aula013")[1] ? Color.GREEN : Color.RED);
		aula013Alarma.addActionListener(this);
		aula013Alarma.setBounds(342, 304, 18, 18);
		alarmas.add(aula013Alarma);

		JButton pasoAula013Alarma = new JButton("");
		pasoAula013Alarma.setName("PasoAula013");
		pasoAula013Alarma.setBackground(mapa.get("PasoAula013")[1] ? Color.GREEN : Color.RED);
		pasoAula013Alarma.addActionListener(this);
		pasoAula013Alarma.setBounds(402, 347, 18, 18);
		alarmas.add(pasoAula013Alarma);

		JButton hallAlarma = new JButton("");
		hallAlarma.setName("Hall");
		hallAlarma.setBackground(mapa.get("Hall")[1] ? Color.GREEN : Color.RED);
		hallAlarma.addActionListener(this);
		hallAlarma.setBounds(454, 374, 18, 18);
		alarmas.add(hallAlarma);

		JButton almacen1Alarma = new JButton("");
		almacen1Alarma.setName("Almacen1");
		almacen1Alarma.setBackground(mapa.get("Almacen1")[1] ? Color.GREEN : Color.RED);
		almacen1Alarma.addActionListener(this);
		almacen1Alarma.setBounds(532, 374, 18, 18);
		alarmas.add(almacen1Alarma);

		JButton almacen2Alarma = new JButton("");
		almacen2Alarma.setName("Almacen2");
		almacen2Alarma.setBackground(mapa.get("Almacen2")[1] ? Color.GREEN : Color.RED);
		almacen2Alarma.addActionListener(this);
		almacen2Alarma.setBounds(585, 374, 18, 18);
		alarmas.add(almacen2Alarma);

		JButton almacen3Alarma = new JButton("");
		almacen3Alarma.setName("Almacen3");
		almacen3Alarma.setBackground(mapa.get("Almacen3")[1] ? Color.GREEN : Color.RED);
		almacen3Alarma.addActionListener(this);
		almacen3Alarma.setBounds(847, 374, 18, 18);
		alarmas.add(almacen3Alarma);

		JButton aula015Alarma = new JButton("");
		aula015Alarma.setName("Aula015");
		aula015Alarma.setBackground(mapa.get("Aula015")[1] ? Color.GREEN : Color.RED);
		aula015Alarma.addActionListener(this);
		aula015Alarma.setBounds(433, 485, 18, 18);
		alarmas.add(aula015Alarma);

		JButton aula010Alarma = new JButton("");
		aula010Alarma.setName("Aula010");
		aula010Alarma.setBackground(mapa.get("Aula010")[1] ? Color.GREEN : Color.RED);
		aula010Alarma.addActionListener(this);
		aula010Alarma.setBounds(532, 472, 18, 18);
		alarmas.add(aula010Alarma);

		JButton aula016Alarma = new JButton("");
		aula016Alarma.setName("Aula016");
		aula016Alarma.setBackground(mapa.get("Aula016")[1] ? Color.GREEN : Color.RED);
		aula016Alarma.addActionListener(this);
		aula016Alarma.setBounds(433, 562, 18, 18);
		alarmas.add(aula016Alarma);

		JButton archivoAlarma = new JButton("");
		archivoAlarma.setName("Archivo");
		archivoAlarma.setBackground(mapa.get("Archivo")[1] ? Color.GREEN : Color.RED);
		archivoAlarma.addActionListener(this);
		archivoAlarma.setBounds(520, 543, 18, 18);
		alarmas.add(archivoAlarma);

		JButton pasoAula016Alarma = new JButton("");
		pasoAula016Alarma.setName("PasoAula016");
		pasoAula016Alarma.setBackground(mapa.get("PasoAula016")[1] ? Color.GREEN : Color.RED);
		pasoAula016Alarma.addActionListener(this);
		pasoAula016Alarma.setBounds(489, 500, 18, 18);
		alarmas.add(pasoAula016Alarma);

		JButton aseoMinusvalAlarma = new JButton("");
		aseoMinusvalAlarma.setName("AseoMinusval");
		aseoMinusvalAlarma.setBackground(mapa.get("AseoMinusval")[1] ? Color.GREEN : Color.RED);
		aseoMinusvalAlarma.addActionListener(this);
		aseoMinusvalAlarma.setBounds(532, 511, 18, 18);
		alarmas.add(aseoMinusvalAlarma);

		JButton aula007Alarma = new JButton("");
		aula007Alarma.setName("Aula007");
		aula007Alarma.setBackground(mapa.get("Aula007")[1] ? Color.GREEN : Color.RED);
		aula007Alarma.addActionListener(this);
		aula007Alarma.setBounds(585, 579, 18, 18);
		alarmas.add(aula007Alarma);

		JButton aula006Alarma = new JButton("");
		aula006Alarma.setName("Aula006");
		aula006Alarma.setBackground(mapa.get("Aula006")[1] ? Color.GREEN : Color.RED);
		aula006Alarma.addActionListener(this);
		aula006Alarma.setBounds(683, 579, 18, 18);
		alarmas.add(aula006Alarma);

		JButton vestibuloAlarma = new JButton("");
		vestibuloAlarma.setName("Vestibulo");
		vestibuloAlarma.setBackground(mapa.get("Vestibulo")[1] ? Color.GREEN : Color.RED);
		vestibuloAlarma.addActionListener(this);
		vestibuloAlarma.setBounds(671, 648, 18, 18);
		alarmas.add(vestibuloAlarma);

		JButton pasoVestibuloAlarma = new JButton("");
		pasoVestibuloAlarma.setName("PasoVestibulo");
		pasoVestibuloAlarma.setBackground(mapa.get("PasoVestibulo")[1] ? Color.GREEN : Color.RED);
		pasoVestibuloAlarma.addActionListener(this);
		pasoVestibuloAlarma.setBounds(561, 613, 18, 18);
		alarmas.add(pasoVestibuloAlarma);

		JButton salaAlumnosAlarma = new JButton("");
		salaAlumnosAlarma.setName("SalaAlumnos");
		salaAlumnosAlarma.setBackground(mapa.get("SalaAlumnos")[1] ? Color.GREEN : Color.RED);
		salaAlumnosAlarma.addActionListener(this);
		salaAlumnosAlarma.setBounds(768, 660, 18, 18);
		alarmas.add(salaAlumnosAlarma);

		JButton salaProfesoresAlarma = new JButton("");
		salaProfesoresAlarma.setName("SalaProfesores");
		salaProfesoresAlarma.setBackground(mapa.get("SalaProfesores")[1] ? Color.GREEN : Color.RED);
		salaProfesoresAlarma.addActionListener(this);
		salaProfesoresAlarma.setBounds(847, 660, 18, 18);
		alarmas.add(salaProfesoresAlarma);

		JButton aula003Alarma = new JButton("");
		aula003Alarma.setName("Aula003");
		aula003Alarma.setBackground(mapa.get("Aula003")[1] ? Color.GREEN : Color.RED);
		aula003Alarma.addActionListener(this);
		aula003Alarma.setBounds(898, 660, 18, 18);
		alarmas.add(aula003Alarma);

		JButton dptInformaticaAlarma = new JButton("");
		dptInformaticaAlarma.setName("DPTInformatica");
		dptInformaticaAlarma.setBackground(mapa.get("DPTInformatica")[1] ? Color.GREEN : Color.RED);
		dptInformaticaAlarma.addActionListener(this);
		dptInformaticaAlarma.setBounds(898, 579, 18, 18);
		alarmas.add(dptInformaticaAlarma);

		JButton dptFOLAlarma = new JButton("");
		dptFOLAlarma.setName("DPTFOL");
		dptFOLAlarma.setBackground(mapa.get("DPTFOL")[1] ? Color.GREEN : Color.RED);
		dptFOLAlarma.addActionListener(this);
		dptFOLAlarma.setBounds(811, 579, 18, 18);
		alarmas.add(dptFOLAlarma);

		JButton aula005BAlarma = new JButton("");
		aula005BAlarma.setName("Aula005B");
		aula005BAlarma.setBackground(mapa.get("Aula005B")[1] ? Color.GREEN : Color.RED);
		aula005BAlarma.addActionListener(this);
		aula005BAlarma.setBounds(768, 579, 18, 18);
		alarmas.add(aula005BAlarma);

		JButton vestuarioLimpiezaAlarma = new JButton("");
		vestuarioLimpiezaAlarma.setName("VestuarioLimpieza");
		vestuarioLimpiezaAlarma.setBackground(mapa.get("VestuarioLimpieza")[1] ? Color.GREEN : Color.RED);
		vestuarioLimpiezaAlarma.addActionListener(this);
		vestuarioLimpiezaAlarma.setBounds(157, 579, 18, 18);
		alarmas.add(vestuarioLimpiezaAlarma);

		JButton aseoFemAlarma = new JButton("");
		aseoFemAlarma.setName("AseoFem");
		aseoFemAlarma.setBackground(mapa.get("AseoFem")[1] ? Color.GREEN : Color.RED);
		aseoFemAlarma.addActionListener(this);
		aseoFemAlarma.setBounds(219, 596, 18, 18);
		alarmas.add(aseoFemAlarma);

		JButton aseoMascAlarma = new JButton("");
		aseoMascAlarma.setName("AseoMasc");
		aseoMascAlarma.setBackground(mapa.get("AseoMasc")[1] ? Color.GREEN : Color.RED);
		aseoMascAlarma.addActionListener(this);
		aseoMascAlarma.setBounds(273, 596, 18, 18);
		alarmas.add(aseoMascAlarma);

		JButton conserjeriaAlarma = new JButton("");
		conserjeriaAlarma.setName("Conserjeria");
		conserjeriaAlarma.setBackground(mapa.get("Conserjeria")[1] ? Color.GREEN : Color.RED);
		conserjeriaAlarma.addActionListener(this);
		conserjeriaAlarma.setBounds(608, 667, 18, 18);
		alarmas.add(conserjeriaAlarma);
		//FINAL BOTONES ALARMA

		JLabel mapaAlarmas = new JLabel("");
		mapaAlarmas.setBounds(0, 0, 996, 701);
		mapaAlarmas.setIcon(new ImageIcon(GUI.class.getResource("/Media/PlanoEditado (Mediana).png")));
		alarmas.add(mapaAlarmas);
	}

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
					boton.setBackground(mapa.get(nombre)[0] ? Color.GREEN : Color.RED);
				}
				else {
					JOptionPane.showMessageDialog(null, "Error al actualizar la sala", "Error", JOptionPane.ERROR_MESSAGE);
				}
				break;
			case "Alarmas":
				if (!mapa.get(nombre)[1]) {
					ConexionDB.updateSala(new Sala(nombre, mapa.get(nombre)[0], true));
					mapa = ConexionDB.getSalas();
					boton.setBackground(mapa.get(nombre)[1] ? Color.GREEN : Color.RED);
				} else {
					JOptionPane.showMessageDialog(null, "No puedes hacer saltar las alarmas!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				break;
			default:
				break;
		}

	}
}
