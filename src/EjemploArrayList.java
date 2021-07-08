import java.util.ArrayList;
import java.util.Random;

public class EjemploArrayList {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ruben");
        nombres.add("Jorge");
        nombres.add("Fernanda");

        System.out.println(nombres.get(2));//System.out.println(nombres[2]);('Fernanda')

        ArrayList<Integer> numeros = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            numeros.add(r.nextInt(1000)+1);
        }

        System.out.println(numeros.get(77));

    }

}
