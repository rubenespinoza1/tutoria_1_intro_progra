import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {
        System.out.println("Hello, World!");//Escribir "Hello, World!";
        Scanner intro = new Scanner(System.in);
        int numeroMayor = 0;
        int contador = 0;

        while(contador < 10){
            System.out.println("Ingrese un numero porfavor");
            int numeroUsuario = intro.nextInt();
            if (numeroUsuario >= numeroMayor){
                numeroMayor = numeroUsuario;
            }
            contador++;
        }

        System.out.println("El numero mayor es: " + numeroMayor);

    }
    
}
