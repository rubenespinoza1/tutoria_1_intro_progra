import java.util.Scanner;

public class App6 {

    public static void main(String[] args){

        for (int contador = 0; contador < 10; contador++){//cracion del contador; condicion de finalizacion; el paso del contador
            Scanner intro = new Scanner(System.in);

            System.out.println("Ingrese un numero");

            int numeroIngresado = intro.nextInt();

            boolean esPar = numeroIngresado % 2 == 0;

            System.out.println("El numero " + numeroIngresado + " Es par? " + esPar);
        }

    }
    
}
