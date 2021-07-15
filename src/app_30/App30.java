package app_30;

import app_30.entidades.Cliente;

public class App30 {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ruben", "Espinoza");
        Cliente cliente2 = new Cliente("Rodrigo", "Gonzales");


        cliente1.transferirDinero(cliente2, 10000, "Fecha de hoy");
        cliente2.transferirDinero(cliente1, 50990, "Fecha de Mañana");


        System.out.println("Los movimientos fueron: ");
        cliente1.getLibretaDeMovimientos().mostrarMovimientos();
        System.out.println("/////////////////////////");
        cliente2.getLibretaDeMovimientos().mostrarMovimientos();

    }

}
