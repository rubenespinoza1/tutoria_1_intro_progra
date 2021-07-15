package app_30.entidades;

import app_30.objetos_bancarios.LibretaDeMovimientos;
import app_30.objetos_bancarios.TarjetaDeTrasferencias;

import java.util.Random;

public class Cliente extends Persona{


    private LibretaDeMovimientos libretaDeMovimientos;
    private TarjetaDeTrasferencias tarjetaDeTrasferencias;

    public Cliente(String nombre, String apellido) {
        super(nombre, apellido);
        Random r = new Random();
        this.libretaDeMovimientos = new LibretaDeMovimientos(r.nextInt(10000)+30000, this, "fecha", r.nextInt(500000) + 1);
        mostrarDineroRestante();
    }

    public void mostrarDineroRestante(){
        System.out.println("El dinero restante es del usuario "+super.getNombre() + " "+ super.getApellido() +": " + this.libretaDeMovimientos.getMontoCuenta());
    }

    public void transferirDinero(Cliente destinatario, int montoATrasferir, String fecha){
        this.libretaDeMovimientos.transferirDinero(destinatario, montoATrasferir, fecha);
        mostrarDineroRestante();
    }

    public LibretaDeMovimientos getLibretaDeMovimientos() {
        return libretaDeMovimientos;
    }

    public void setLibretaDeMovimientos(LibretaDeMovimientos libretaDeMovimientos) {
        this.libretaDeMovimientos = libretaDeMovimientos;
    }

    public TarjetaDeTrasferencias getTarjetaDeTrasferencias() {
        return tarjetaDeTrasferencias;
    }

    public void setTarjetaDeTrasferencias(TarjetaDeTrasferencias tarjetaDeTrasferencias) {
        this.tarjetaDeTrasferencias = tarjetaDeTrasferencias;
    }
}
