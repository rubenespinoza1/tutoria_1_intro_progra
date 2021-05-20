import java.util.Scanner;

public class EjemploPC {

    public static void main(String[] args) {
        boolean[] PCs = new boolean[10];

        // true ocupado, false disponible
        Scanner intro = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            for (int i = 0; i < PCs.length; i++) {
                // System.out.println("El PC " + i + " esta disponible?: " + !PCs[i]);
                System.out.println("El PC " + i + " esta disponible?: " + (!PCs[i] ? "Si" : "No"));
            }
            int opcionUser = 0;
            System.out.println("Escoja un opcion\n1: Ocupar PC\n2: Liberar PC\n3: Salir");
            opcionUser = intro.nextInt();
            switch (opcionUser) {
                case 1:
                    System.out.println("Elija que PC desea ocupar:");
                    int pcAOcupar = intro.nextInt();
                    if (!PCs[pcAOcupar]) {
                        PCs[pcAOcupar] = true;
                        System.out.println("El pc fue ocupado correctamente".toUpperCase() + "\n");
                    } else {
                        System.out.println("Ese pc esta ocupado");
                    }
                    break;
                case 2:
                    System.out.println("Elija que PC desea liberar:");
                    int pcALiberar = intro.nextInt();
                    if (PCs[pcALiberar]) {
                        PCs[pcALiberar] = false;
                        System.out.println("El pc fue liberado correctamente".toUpperCase() + "\n");
                    } else {
                        System.out.println("Ese PC no esta ocupado");
                    }
                    break;
                case 3:
                    salir = true;
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        }
    }

}
