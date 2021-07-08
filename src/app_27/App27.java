package app_27;

import java.util.ArrayList;

public class App27 {

    public static void main(String[] args) {
        Punto punto_1 = new Punto();
        Punto punto_2 = new Punto(10.6, 8.5);
        Punto punto_3 = new Punto(-3.5, -10);
        Punto punto_4 = new Punto(-3.4, 10);



        Punto.getMensajeDeBienvenida();

        System.out.println(punto_1.calcularDistancia(punto_2));
        System.out.println(punto_1.obtenerPuntoMedio(punto_2));

        ArrayList<Punto> vertices = new ArrayList<>();
        vertices.add(punto_1);
        vertices.add(punto_2);
        vertices.add(punto_3);

        Poligono poligono = new Poligono(vertices);
        poligono.agregarPunto(punto_4);
        System.out.println(poligono.calcularPerimetro());

    }



}
