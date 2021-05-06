
public class App3{

    public static void main(String[] args){

        //la condicion para que un numero sea par es que sea divisible por 2, lo que quiere decir que el resto debe ser 0
        int num1 = 3;
        int num2 = 6;
        // el 2 en 3 cabe: 1 y sobra "1"(es el resto)

        boolean esPar1 = num1 % 2 == 0;
        boolean esPar2 = num2 % 2 == 0;

        System.out.println("El numero 1 es par? " + esPar1);
        System.out.println("El numero 2 es par? " + esPar2);


    }


}

