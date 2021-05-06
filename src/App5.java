import java.util.Scanner;

public class App5 {

    public static void main(String[] args){



        int contador = 0;

        do{

            Scanner intro = new Scanner(System.in);

            System.out.println("Ingrese un numero");

            int numeroIngresado = intro.nextInt();

            boolean esPar = numeroIngresado % 2 == 0;

            System.out.println("El numero " + numeroIngresado + " Es par? " + esPar);

            contador++;

        }while(contador < 10);//Se valida al final entonces entra por lo menos una ves al ciclo

    }
    
}
