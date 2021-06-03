public class App17 {

    public static void main(String[] args) {
        int numero = 19;
        String numeroString = String.valueOf(numero);
        System.out.println(numeroString);

        String numeroStr = "90";
        int numeroStringAInt = Integer.parseInt(numeroStr);

        System.out.println((numeroStringAInt + 10));


        String numeroStr2 = "13";// era "*"
        int numeroAInt;
        try{
            numeroAInt = Integer.parseInt(numeroStr2);
            System.out.println(numeroAInt);
        }catch (NumberFormatException e){
            System.out.println("No se pudo transformar el string " + numeroStr2 + " a un numero");
        }

        //para identificar errores y evitar la caida del programa con try catch seguir los pasos

        //1. Correr el programa e obtener el nombre del error
        //2. hacer un try catch donde en la seccion del try se debe poner el comando que tiro error
        //3. En la seccion del catch poner el nombre del error y asignarselo a una variable (en este caso 'e')


    }

}
