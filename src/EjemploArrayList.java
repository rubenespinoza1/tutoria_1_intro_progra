import java.util.ArrayList;

public class EjemploArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        numeros.add(7);
        numeros.add(-1);
        numeros.add(4);

        System.out.println(numeros.get(2));//System.out.println(numero[2]);(-1)
    }

}
