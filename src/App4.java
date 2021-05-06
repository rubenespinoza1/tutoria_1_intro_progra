import java.util.Scanner;

public class App4 {

    public static void main(String[] args){

        int contador = 0;

        while(contador < 10){
            Scanner intro = new Scanner(System.in);

            System.out.println("Ingrese un numero");

            int numeroIngresado = intro.nextInt();

            boolean esPar = numeroIngresado % 2 == 0;

            System.out.println("El numero " + numeroIngresado + " Es par? " + esPar);

            contador++;
        }

    }

}