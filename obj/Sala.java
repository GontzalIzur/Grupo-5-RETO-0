package obj;

public class Sala {
    private int id;
    private boolean Calefaccion;
    private boolean Alarma;

    public Sala(int id, boolean Calefaccion, boolean Alarma) {
        this.id = id;
        this.Calefaccion = Calefaccion;
        this.Alarma = Alarma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
