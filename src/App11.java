import java.util.Scanner;

public class App11 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int limit = scanner.nextInt();

        for (int nroActual = 1; nroActual <= limit; nroActual++){
            int divisionesPerfectas = 0;
            for (int contador = 1; contador <= nroActual; contador++){
                if (nroActual % contador == 0){
                    divisionesPerfectas++;
                }
            }
            System.out.println(divisionesPerfectas == 2 ? "El numero " + nroActual + " es un numero primo" : "El numero " + nroActual + " no es un numero primo");
            
        }

    }
    
}
