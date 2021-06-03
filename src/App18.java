public class App18 {

    public static void main(String[] args) {
        int num1 = Integer.parseInt("19");
        int num2 = Integer.parseInt("18");
        int num3 = Integer.parseInt("17");

        int resultado = num1 + num2 + num3;

        System.out.println(resultado);

        try{
            double resultadoDivision = resultado / 0;
            System.out.println(resultadoDivision);
        }catch (ArithmeticException e){
            System.out.println("No se puede dividir por 0");
        }


    }

}
