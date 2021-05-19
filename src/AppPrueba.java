import java.util.Random;

public class AppPrueba {

    public static void main(String[] args) {

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            boolean accionista1Voto = false;
            boolean accionista2Voto = false;
            boolean accionista3Voto = false;

            int proyecto1Riesgo = rand.nextInt(100) + 1;
            int proyecto2Riesgo = rand.nextInt(100) + 1;

            int proyecto1Rentabilidad = rand.nextInt(100) + 1;
            int proyecto2Rentabilidad = rand.nextInt(100) + 1;

            int preferenciaAccionista1 = 0;
            int preferenciaAccionista2 = 0;
            int preferenciaAccionista3 = 0;

            if (proyecto1Rentabilidad > proyecto2Rentabilidad && proyecto1Riesgo < 60) {
                // el accionista 1 prefiere el proyecto 1;
                preferenciaAccionista1 = 1;
                accionista1Voto = true;
            } else if (proyecto1Rentabilidad < proyecto2Rentabilidad && proyecto1Riesgo < 60) {
                // el accionista 1 prefiere el proyecto 2;
                preferenciaAccionista1 = 2;
                accionista1Voto = true;
            }

            if (proyecto1Rentabilidad > proyecto2Rentabilidad && proyecto1Riesgo < 30) {
                // el accionista 2 prefiere el proyecto 1;
                preferenciaAccionista2 = 1;
                accionista2Voto = true;
            } else if (proyecto1Rentabilidad < proyecto2Rentabilidad && proyecto1Riesgo < 30) {
                // el accionista 2 prefiere el proyecto 2
                preferenciaAccionista2 = 2;
                accionista2Voto = true;
            }

            if (proyecto1Riesgo < 10 && proyecto2Riesgo < 10) {
                if (proyecto1Rentabilidad > proyecto2Rentabilidad) {
                    // accionista 3 elige proyecto 1;
                    preferenciaAccionista3 = 1;
                    accionista3Voto = true;
                } else {
                    // accionista 3 elige proyecto 2
                    preferenciaAccionista3 = 2;
                    accionista3Voto = true;
                }
            } else if (proyecto1Riesgo >= 60 && proyecto1Rentabilidad >= 50) {
                // accionista 3 elige proyecto 1
                preferenciaAccionista3 = 1;
                accionista3Voto = true;
            } else if (proyecto2Riesgo >= 60 && proyecto2Rentabilidad >= 50) {
                // accionista 3 elige proyecto 2
                preferenciaAccionista3 = 2;
                accionista3Voto = true;
            }


            String resultadosA1 = accionista1Voto ? "El accionista 1 voto por el proyecto: " + preferenciaAccionista1 : "El accionista 1 no voto en esta ronda";
            String resultadosA2 = accionista2Voto ? "El accionista 2 voto por el proyecto: " + preferenciaAccionista2 : "El accionista 2 no voto en esta ronda";;
            String resultadosA3 = accionista3Voto ? "El accionista 3 voto por el proyecto: " + preferenciaAccionista3 : "El accionista 3 no voto en esta ronda";;
            String datosP1= "El riesgo del proyecto1 fue: " + proyecto1Riesgo + " y  su rentabilidad fue: " + proyecto1Rentabilidad;
            String datosP2= "El riesgo del proyecto2 fue: " + proyecto2Riesgo + " y  su rentabilidad fue: " + proyecto2Rentabilidad;
        

            System.out.println("-----------------------------------------------------");
            System.out.println(datosP1);
            System.out.println(datosP2);
            System.out.println("-----------------------------------------------------");
            System.out.println("Los resultados de la ronda de votaciones: " + (i+1) + " fue:" );
            System.out.println(resultadosA1);
            System.out.println(resultadosA2);
            System.out.println(resultadosA3);
            System.out.println("----------------------------------------------------");


        }

    }

}
