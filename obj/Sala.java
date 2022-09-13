package obj;

public class Sala {
    private String idAula;
    private boolean Calefaccion;
    private boolean Alarma;

    public Sala(String idAula, boolean Calefaccion, boolean Alarma) {
        this.idAula = idAula;
        this.Calefaccion = Calefaccion;
        this.Alarma = Alarma;
    }

    public String getidAula() {
        return idAula;
    }

    public void setidAula(String idAula) {
        this.idAula = idAula;
    }

    public boolean isEncendido() {
        return Calefaccion;
    }

    public void setEncendido(boolean encendido) {
        this.Calefaccion = encendido;
    }

    public boolean isAlarma() {
        return Alarma;
    }

    public void setAlarma(boolean Alarma) {
        this.Alarma = Alarma;
    }
}
