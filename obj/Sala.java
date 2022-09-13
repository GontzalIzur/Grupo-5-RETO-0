package obj;

public class Sala {
    private String idSala;
    private boolean Calefaccion;
    private boolean Alarma;

    public Sala(String idAula, boolean Calefaccion, boolean Alarma) {
        this.idSala = idAula;
        this.Calefaccion = Calefaccion;
        this.Alarma = Alarma;
    }

    public String getIdSala() {
        return idSala;
    }

    public void setIdSala(String idSala) {
        this.idSala = idSala;
    }

    public boolean isCalefaccion() {
        return Calefaccion;
    }

    public void setCalefaccion(boolean Calefaccion) {
        this.Calefaccion = Calefaccion;
    }

    public boolean isAlarma() {
        return Alarma;
    }

    public void setAlarma(boolean Alarma) {
        this.Alarma = Alarma;
    }
}
