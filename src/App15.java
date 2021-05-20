import java.util.Random;

public class App15 {
    
    public static void main(String[] args){
        Random rand = new Random();
        boolean[] respuestas = new boolean[10];

        for (int i = 0; i < respuestas.length; i++) {
            respuestas[i] = rand.nextBoolean();
        }

        for (int i = 0; i < respuestas.length; i++) {
            System.out.println("La respuesta numero " + (i+1) + " estuvo correcta? " + respuestas[i]);
        }

    }

}
