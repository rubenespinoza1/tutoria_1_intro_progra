import java.util.Scanner;

public class App12 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int nroIngresado = scanner.nextInt();
        int cantNroPar = 0;
        int cantNroImpar = 0;

        for (int nroActual = 1; nroActual <= nroIngresado; nroActual++){

            if (nroActual % 2 == 0){
                System.out.println("El numero " + nroActual + " es par");
                cantNroPar++;
            }else{
                System.out.println("El numero " + nroActual + " es impar");
                cantNroImpar++;
            }

        }

        System.out.println("La cantidad de numero pares fue: " + cantNroPar + "\nLa cantidad de numeros impares fue: " + cantNroImpar);
        
    }
    
}
