import java.util.Scanner;

public class App7 {
    
    public static void main(String[] args){
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numeroUsuario = intro.nextInt();

        int factorial = 1;

        for (int i = 1; i <= numeroUsuario; i++){

            //factorial = factorial * i;
            factorial *= i;
            
        }

        System.out.println("El factorial es: " + factorial);

        

    }

}
