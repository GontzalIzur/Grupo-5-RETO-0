package src.obj;

import javax.swing.JOptionPane;

import src.ConexionDB;

/**
 * Objeto de la clase sala
 */
public class Sala {
    /**
     * Id de la sala
     */
    private String idSala;
    /**
     * Estado de la calefaccion en la sala
     */
    private boolean calefaccion;
    /**
     * estado de la alarma en la sala
     */
    private boolean alarma;

    /**
     * Constructor de la clase sala
     * 
     * @param idSala id de la sala
     * @param calefaccion estado de la calefaccion
     * @param alarma estado de la alarma
     */
    public Sala(String idAula, boolean calefaccion, boolean alarma) {
        this.idSala = idAula;
        this.calefaccion = calefaccion;
        this.alarma = alarma;
    }

    /**
     * Metodo que devuelve el id de la sala
     * 
     * @return id de la sala
     */
    public String getIdSala() {
        return idSala;
    }

    /**
     * Metodo que cambia el id de la sala
     * 
     * @param idSala nuevo estado de la sala
     */
    public void setIdSala(String idSala) {
        this.idSala = idSala;
    }

    /**
     * Metodo que devuelve el estado de la calefaccion
     * 
     * @return estado de la calefaccion
     */
    public boolean isCalefaccion() {
        return calefaccion;
    }

    /**
     * Metodo que cambia el estado de la calefaccion
     * 
     * @param calefaccion nuevo estado de la calefaccion
     */
    public void setCalefaccion(boolean calefaccion) {
        this.calefaccion = calefaccion;
    }

    /**
     * Metodo que alterna el estado de la calefaccion y lo actualiza en la base de datos
     * 
     * @return true si se ha actualizado correctamente, false si no
     */
    public boolean toggleCalefaccion() {
        this.calefaccion = !this.calefaccion;
        if (ConexionDB.updateSala(this)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar la base de datos", "Error",
							JOptionPane.ERROR_MESSAGE);
            this.calefaccion = !this.calefaccion;
            return false;
        }
    }

    /**
     * Metodo que devuelve el estado de la alarma
     * 
     * @return estado de la alarma
     */
    public boolean isAlarma() {
        return alarma;
    }

    /**
     * Metodo que cambia el estado de la alarma
     * 
     * @param alarma nuevo estado de la alarma
     */
    public void setAlarma(boolean alarma) {
        this.alarma = alarma;
    }

    /**
     * Metodo que alterna el estado de la alarma y lo actualiza en la base de datos
     * 
     * @return true si se ha actualizado correctamente, false si no
     */
    public boolean toggleAlarma() {
        if (this.alarma){
            JOptionPane.showMessageDialog(null, "No puedes hacer saltar las alarmas!", "Error",
							JOptionPane.ERROR_MESSAGE);
        } else{
            this.alarma = !this.alarma;
            if (ConexionDB.updateSala(this)) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar la base de datos", "Error",
							JOptionPane.ERROR_MESSAGE);
                this.alarma = !this.alarma;
            }
        }
        return false;
    }

}
