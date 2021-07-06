import java.util.Random;

public class App26 {
    private static Random r = new Random();
    public static void main(String[] args) {
        //int[][] matriz = new int[10][10];
        //String[][] matriz = {{"Ruben", "Carlo", "Javier"},{"Espinoza","Negroni","Ortega"},{"Osses", "Alvarez", "Zepeda"}};

        int[][] matriz = llenarMatriz(new int[3][3]);
        mostrarMatriz(matriz);
        System.out.println("////////////////////");
        mostrarMatriz(transponerMatriz(matriz));

    }

    private static int[][] transponerMatriz(int[][] matriz){

        int[][] matriz_aux = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz_aux[j][i] = matriz[i][j];
            }
        }
        return matriz_aux;
    }

    private static int[][] llenarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(91)+10;
            }
        }
        return matriz;
    }

    private static void mostrarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+matriz[i][j]+"]" +"");
            }
            System.out.println("\n");
        }
    }

}
