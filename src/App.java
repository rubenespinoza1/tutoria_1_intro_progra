import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");//Escribir "Hello, World!";
        Scanner intro = new Scanner(System.in);
        int numero1;//Defirnir numero1 como entero
        numero1 = intro.nextInt();//numero1 = 1;
        int numero2;
        numero2 = intro.nextInt();//numero2 = 3;

        do{
            System.out.println("El numero 1 es: " + numero1 + " y el numero2 es: " + numero2);
            //numero1++ == (numero1 = numero1 + 1)
        }while(numero1 != numero2);

        while(numero1 != numero2){
            System.out.println("El numero 1 es: " + numero1--);
        }


        if (numero1 < numero2){// Si (numero1 < numero2)
            System.out.println("numero1 es menor");
        }else if (numero1 > numero2){//sino(numero2 < numero1)
            System.out.println("numero2 es menor");
        }else{//EnOtroCaso -> ==
            System.out.println("numero1 es igual a numero 2");
        }


    }
}
