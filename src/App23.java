public class App23 {

    public static void main(String[] args) {
        String nombre = "-s Ruben";
        String[] split = nombre.split("b");
        //String aValidar = "usuario123";
        //boolean valido = aValidar.matches("[a-z1-3]{7,12}");
        //System.out.println(valido);
        //[0-9a-z]{1,4}
        System.out.println(nombre.charAt(2));//b
        System.out.println(nombre.length());
        String nombreSString = nombre.substring(2);
        System.out.println(nombreSString);
        System.out.println(nombre.startsWith("-s "));
        System.out.println(nombre.replace("-s ",""));
        System.out.println(nombre.contains("bon"));
        String palabra = "reconocer";
        System.out.println(esPalindromo(palabra));

        String operacion = "3 + 4.5";

        System.out.println(resolverEcuacion(operacion));
        //reconocer
    }

    private static boolean esPalindromo(String palabra){
        //char[]
        //int coincidencias = 0;
        palabra = palabra.replace(" ", "");
        for(int i = 0; i < palabra.length(); i++){
            System.out.println("Confirmando si la letra " + palabra.charAt(i) + " es igual a la letra " + (palabra.charAt(palabra.length() - 1 - i) + ", el resultado fue: " + (palabra.charAt(i) == palabra.charAt(palabra.length() - 1 - i))));
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

    private static double resolverEcuacion(String ecuacion){
        String[] parsedEcuation = ecuacion.split(" ");
        double resultado;
        switch (parsedEcuation[1]){
            case "+":
                resultado = Double.parseDouble(parsedEcuation[0]) + Double.parseDouble(parsedEcuation[2]);
                break;
            case "-":
                resultado = Double.parseDouble(parsedEcuation[0]) - Double.parseDouble(parsedEcuation[2]);
                break;
            case "*":
                resultado = Double.parseDouble(parsedEcuation[0]) * Double.parseDouble(parsedEcuation[2]);
                break;
            case "/":
                if (parsedEcuation[2] == "0"){
                    System.out.println("No se puede dividir por 0");
                    return 0;
                }
                resultado = Double.parseDouble(parsedEcuation[0]) / Double.parseDouble(parsedEcuation[2]);
                break;
            default:
                resultado = 0;
                break;
        }

        return resultado;
    }


}
