import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {
        System.out.println("Hello, World!");//Escribir "Hello, World!";
        Scanner intro = new Scanner(System.in);
        int numero1 = intro.nextInt();//numero1 = 1;
        int numero2 = intro.nextInt();//numero2 = 3;


        if (numero1 < numero2){// Si (numero1 < numero2)
            System.out.println("numero1 es menor");
        }else if (numero1 > numero2){//sino(numero2 < numero1)
            System.out.println("numero2 es menor");
        }else{//EnOtroCaso -> ==
            System.out.println("numero1 es igual a numero 2");
        }


    }
    
}
