public class App22 {

    public static void main(String[] args) {
        iniciarPrograma();
    }

    private static void iniciarPrograma(){
        //System.out.println(esEntero("3"));
        int[] notas = {3,5,7,2,4};
        int[] notas1 = {3,5,7,2,4,5,3,2,6,7};
        //notas[2] = 6;
        //System.out.println(notas[2]);
        //System.out.println(calcularPromedio(notas));
        double promedio = calcularPromedio(notas1);
        System.out.println(promedio);
    }

    private static double calcularPromedio(int[] notas){
        int largo = notas.length;
        double suma = 0;
        for(int i=0; i < largo; i++){
            //suma = suma + notas[i];
            suma += notas[i];
        }
        double promedio = suma / largo;
        return promedio;
    }

    private static boolean esEntero(String aux) {
        boolean exito;
        int num;
        try {
            num = Integer.parseInt(aux);
            exito = true;
        } catch (Exception ex) {
            exito = false;
        }
        return (exito);
    }



}
