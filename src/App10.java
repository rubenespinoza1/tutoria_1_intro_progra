import java.util.Scanner;

public class App10 {

    public static void main(String[] args){
        Scanner intro = new Scanner(System.in);
        String[] listaDeCurso = new String[15];

        for(int i = 0; i < listaDeCurso.length; i++){
            System.out.println("Ingrese nombre alumno");
            listaDeCurso[i] = intro.nextLine();
        }

        for(int i = 0; i < listaDeCurso.length; i++){
            System.out.println("El alumno numero "+(i+1)+" es "+listaDeCurso[i]);
        }
    }
    
}
