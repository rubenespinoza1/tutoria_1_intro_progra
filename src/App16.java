import java.util.InputMismatchException;
import java.util.Scanner;

public class App16 {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numeroUser = 0;
        try{
            numeroUser = intro.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Ingrese un numero");
        }



        System.out.println(numeroUser);
    }

}
