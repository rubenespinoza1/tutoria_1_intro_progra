package app_27;

public class App27 {

    public static void main(String[] args) {
        Punto punto_1 = new Punto();
        Punto punto_2 = new Punto(10.6, 8.5);

        Punto.getMensajeDeBienvenida();

        System.out.println(punto_1.calcularDistancia(punto_2));
        System.out.println(punto_1.obtenerPuntoMedio(punto_2));
    }

}
