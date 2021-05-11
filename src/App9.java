import java.util.Random;

public class App9 {
    
    public static void main(String[] args){
        Random rand = new Random();
        int nroRandom = rand.nextInt(31)+60; // numeroMaximoAObtener=numero_en_parentesis + numero_exterior
        System.out.println(nroRandom);
        int[] numeros = new int[10];

        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(91)+1;
        }

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }

}
