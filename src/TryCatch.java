import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);

        try {
            System.out.println("Ingrese un numero");
            int nro = intro.nextInt();

            int[] nros = new int[2];
            nros[2] = nro;
        }catch (InputMismatchException e){
            System.out.println("Ingrese un numero valido");
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Se debe ingresar un indice valido para el arreglo");
        }
    }

}
