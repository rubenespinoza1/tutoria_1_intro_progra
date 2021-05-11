import java.util.Random;

public class App9 {
    
    public static void main(String[] args){
        Random rand = new Random();
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(91)+1;
        }

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

    }

}
