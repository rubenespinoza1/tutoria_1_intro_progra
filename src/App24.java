import java.util.ArrayList;
import java.util.Random;

public class App24 {

    private static Random r = new Random();

    public static void main(String[] args) {
        /**Object[] data = devolverNumeroEn2Formatos();

        int numero = (int) data[0];
        String nroString = (String) data[1];

        System.out.println((numero + numero));
        System.out.println(nroString.toUpperCase());
        char letra = nroString.charAt(0);
        */

        ArrayList<Integer> numeros = new ArrayList<>();
        int j = 0;
        while (j < 100){
            numeros.add(r.nextInt(100)+1);
            j++;
        }

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        Object[] objectsArray = numeros.toArray();
        int[] numerosArray = new int[objectsArray.length];
        for (int i = 0; i < objectsArray.length; i++) {
            numerosArray[i] = (int) objectsArray[i];
        }
        System.out.println("\n\n\n"+numerosArray[objectsArray.length - 1]);
    }

    public static Object[] devolverNumeroEn2Formatos(){
        Object[] numerosEnDistintosFormatos = new Object[2];
        int numero = r.nextInt(10);
        String nroString = "";
        switch (numero){
            case 0:
                nroString = "cero";
                break;
            case 1:
                nroString = "uno";
                break;
            case 2:
                nroString = "dos";
                break;
            case 3:
                nroString = "tres";
                break;
            case 4:
                nroString = "cuatro";
                break;
            case 5:
                nroString = "cinco";
                break;
            case 6:
                nroString = "seis";
                break;
            case 7:
                nroString = "siete";
                break;
            case 8:
                nroString = "ocho";
                break;
            case 9:
                nroString = "nueve";
                break;
            default:

                break;
        }
        numerosEnDistintosFormatos[0] = numero;
        numerosEnDistintosFormatos[1] = nroString;
        return numerosEnDistintosFormatos;
    }

}
