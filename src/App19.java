public class App19 {

    public static void main(String[] args) {
        System.out.println(esPrimo(90));
    }

    public static boolean esPrimo(int numero){
        int divPerfectas = 0;
        for (int i = 1; i <= numero; i++){
            if (numero % i == 0){
                divPerfectas++;
            }
        }
        /*if (divPerfectas == 2){
            return true;
        }
        return false;*/

        return divPerfectas == 2;
    }



}
