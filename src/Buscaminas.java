import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Buscaminas {

    private static Scanner intro = new Scanner(System.in);
    private static Random random = new Random();
    private static String[][] gridMinas;

    public static void main(String[] args) {
        iniciarPrograma();
    }

    private static void iniciarPrograma(){

    }

    private static void elegirDificultad(){
        System.out.println("Elija la dificultad de la partida");
        System.out.println("1. Facil\n2. Medio\n3. Dificil");
        int dificultad = intro.nextInt();

        switch (dificultad){
            case 1:
                gridMinas = new String[7][7];
                break;
            case 2:
                gridMinas = new String[10][10];
                break;
            case 3:
                gridMinas = new String[15][15];
                break;
        }
    }


}

