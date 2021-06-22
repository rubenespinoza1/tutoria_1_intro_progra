import java.util.Random;

public class PruebaBuenasPracticas {

    public static void main(String[] args) {
        //programa para pasar lista mensual de un curso de 25 personas
        Random numero = new Random();
        int[] x = new int[30];
        boolean[] y = new boolean[25];
        int z = 0, a = 0;

        while (a < x.length){
            y[z] = numero.nextBoolean();//asiste estudiante numero z (si/no)

            if (z == (25 - 1)){//cuando se llega al ultimo estudiante numero z
                int c = 0;
                for (int b = 0; b < y.length; b++){//Cuenta los asistentes
                    if (y[b]){//Esto es exactamente lo mismo que escribir y[b] == true
                        c++;
                    }
                }
                x[a] = c;//la cantidad de asistentes en el dia a fueron c estudiantes
                a++;
                z = 0;
            }
            z++;
        }
        for (int i = 0; i < x.length; i++) {
            System.out.println("asistieron: " + x[i]);
        }
    }

}
