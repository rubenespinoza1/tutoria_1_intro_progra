import java.util.Scanner;

public class App21 {

    private static int ultimoNumeroIngresado;
    private static int sumaNumeros = 0;

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);

        do{
            System.out.println("Ingrese un numero, si desea finalizar el programa digite 0");
            int numeroUsuario = intro.nextInt();
            if (numeroUsuario == 0){
                break;
            }
            ultimoNumeroIngresado = numeroUsuario;
            sumarNumeros(numeroUsuario);
        }while (true);

        mostrarResultados();
    }

    public static void mostrarResultados(){
        System.out.println("El ultimo numero ingresado fue: " + ultimoNumeroIngresado);
        System.out.println("La suma de los numeros fue: " + sumaNumeros);
    }

    public static void sumarNumeros(int numero){
        sumaNumeros += numero;
        //sumaNumeros = sumaNumeros + numero
    }

}
