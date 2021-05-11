import java.util.Scanner;

public class App8 {

    public static void main(String[] args) {

        Scanner intro = new Scanner(System.in);

        int numeroUser = -99999999;
        int numeroAnterior;
        int cantNumeros = 0;

        do {
            numeroAnterior = numeroUser;
            System.out.println("Ingrese un numero");
            numeroUser = intro.nextInt();
            cantNumeros++;

        } while (numeroUser > numeroAnterior);

        System.out.println("CantNumeros: " + cantNumeros);

    }

}
