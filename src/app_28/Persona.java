package app_28;

public class Persona {

    private String nombreCompleto;
    private String fechaNacimiento;
    private Rut rut;

    public Persona(String nombreCompleto, String fechaNacimiento, Rut rut) {
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", rut=" + rut +
                '}';
    }
}
