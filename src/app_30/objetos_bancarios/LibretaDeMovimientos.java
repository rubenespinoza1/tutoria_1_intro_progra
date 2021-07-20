package app_30.objetos_bancarios;

import app_30.entidades.Cliente;
import app_30.objetos_bancarios.movimientos.Movimiento;

import java.util.ArrayList;

public class LibretaDeMovimientos extends ObjetoBancario{

    private ArrayList<Movimiento> movimientos;
    private int montoCuenta;

    public LibretaDeMovimientos(int serial, Cliente titular, String fechaVencimiento, int montoCuenta) {
        super(serial, titular, fechaVencimiento);
        this.movimientos = new ArrayList<>();
        this.montoCuenta = montoCuenta;
    }

    public int getMontoCuenta() {
        return montoCuenta;
    }

    public void setMontoCuenta(int montoCuenta) {
        this.montoCuenta = montoCuenta;
    }

    public void mostrarMovimientos(){
        for (int i = 0; i < this.movimientos.size(); i++) {
            System.out.println((i+1)+". "+this.movimientos.get(i));
        }
    }

    public void recibirDinero(Cliente emisor, int montoTransferido, String fecha){
        Movimiento movimiento = new Movimiento(fecha, emisor, super.titular, montoTransferido, "Transferencia desde " + emisor.getNombre());
        this.movimientos.add(movimiento);
        this.montoCuenta += montoTransferido;
        super.titular.mostrarDineroRestante();
    }

    public void transferirDinero(Cliente destinatario, int montoATransferir, String fecha){
        Movimiento movimiento = new Movimiento(fecha, super.titular, destinatario, montoATransferir, "Transferencia a " + destinatario.getNombre());
        this.movimientos.add(movimiento);
        destinatario.getLibretaDeMovimientos().recibirDinero(super.titular, montoATransferir, fecha);
        this.montoCuenta -= montoATransferir;//this.montoCuenta = this.montoCuenta - montoATransferir;
    }
}
