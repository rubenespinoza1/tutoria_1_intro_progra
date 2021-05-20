import java.util.Random;
import java.util.Scanner;

public class App14 {
    
    public static void main(String[] args){

        Random rand = new Random();

        int[] numeros = new int[10];
        //int[] numeros = {1,3,5,7,9,6,9};

        //System.out.println(numeros[7]);

        

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100)+1;
        }
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

    }

}
