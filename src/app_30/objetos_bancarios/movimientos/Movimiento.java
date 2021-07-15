package app_30.objetos_bancarios.movimientos;

import app_28.Persona;
import app_30.entidades.Cliente;

public class Movimiento {

    private String fechaRealizado;
    private Cliente emisor;
    private Cliente destinatario;
    private int monto;
    private String tipo;

    public Movimiento(String fechaRealizado, Cliente emisor, Cliente destinatario, int monto, String tipo) {
        this.fechaRealizado = fechaRealizado;
        this.emisor = emisor;
        this.destinatario = destinatario;
        this.monto = monto;
        this.tipo = tipo;
    }

    public String getFechaRealizado() {
        return fechaRealizado;
    }

    public void setFechaRealizado(String fechaRealizado) {
        this.fechaRealizado = fechaRealizado;
    }

    public Cliente getEmisor() {
        return emisor;
    }

    public void setEmisor(Cliente emisor) {
        this.emisor = emisor;
    }

    public Cliente getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Cliente destinatario) {
        this.destinatario = destinatario;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Movimiento{" +
                "fechaRealizado='" + fechaRealizado + '\'' +
                ", emisor=" + emisor +
                ", destinatario=" + destinatario +
                ", monto=" + monto +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
