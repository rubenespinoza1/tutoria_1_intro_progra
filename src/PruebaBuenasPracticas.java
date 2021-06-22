import java.util.Random;

public class PruebaBuenasPracticas {

    private static int[] asistentesMensuales = new int[30];
    private static Random random = new Random();

    public static void main(String[] args) {
        iniciarPrograma();
    }

    private static void iniciarPrograma(){
        for (int diaDelMes = 0; diaDelMes < asistentesMensuales.length; diaDelMes++) {
            boolean[] lista = pasarListaDiaria();
            //int cantidadAsistentes = obtenerAsistentesSegunLista(lista);
            registrarAsistentesDiarios(obtenerAsistentesSegunLista(lista), diaDelMes);
        }
        mostrarAsistentesMesuales();
    }

    private static void registrarAsistentesDiarios(int asistentes, int diaMes){
        asistentesMensuales[diaMes] = asistentes;
    }

    private static boolean[] pasarListaDiaria(){
        boolean[] listaDeAlumnos = new boolean[25];
        for (int numeroEstudiante = 0; numeroEstudiante < listaDeAlumnos.length; numeroEstudiante++) {
            listaDeAlumnos[numeroEstudiante] = random.nextBoolean();
        }
        return listaDeAlumnos;
    }

    private static int obtenerAsistentesSegunLista(boolean[] lista){
        int cantidadDeAsistentes = 0;
        for (int nroEstudiante = 0; nroEstudiante < lista.length; nroEstudiante++) {
            if (lista[nroEstudiante]){
                cantidadDeAsistentes++;
            }
        }
        return cantidadDeAsistentes;
    }

    private static void mostrarAsistentesMesuales(){
        for (int i = 0; i < asistentesMensuales.length; i++) {
            System.out.println("Asistieron: " + asistentesMensuales[i] + " estudiantes en el dia " + (i + 1) + " del mes.");
        }
    }


}
