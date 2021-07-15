package app_30.objetos_bancarios;

import app_30.entidades.Cliente;

public class ObjetoBancario {

    protected int serial;
    protected Cliente titular;
    protected String fechaVencimiento;

    public ObjetoBancario(int serial, Cliente titular, String fechaVencimiento) {
        this.serial = serial;
        this.titular = titular;
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "ObjetoBancario{" +
                "serial=" + serial +
                ", titular='" + titular + '\'' +
                ", fechaVencimiento='" + fechaVencimiento + '\'' +
                '}';
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
