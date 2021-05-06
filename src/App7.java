import java.util.Scanner;

public class App7 {
    
    public static void main(String[] args){

        Scanner intro = new Scanner(System.in);

        System.out.println("Ingrese un numero");

        int numeroUser = intro.nextInt();
        int factorial = 0;

        for (int i = 1; i <= numeroUser; i++) {

            if (i == 1){
                factorial = i;
            }else{
                //factorial = factorial * i;
                factorial *= i;
            }

        }


        System.out.println("factorial " + factorial);

    }

}
