import java.util.Scanner;

public class CRUD {

    private static String[] database = new String[10];
    private static Scanner intro = new Scanner(System.in);

    public static void main(String[] args) {
        iniciarPrograma();
    }

    private static void iniciarPrograma(){
        fillDatabase();
        boolean salir = false;
        while (!salir){
            displayUserOptions();
            int userOption = intro.nextInt();
            switch (userOption){
                case 1:
                    create();
                    break;
                case 2:
                    read();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                default:
                    salir = true;
                    break;

            }
        }

    }

    private static void displayUserOptions(){
        System.out.println("1. create");
        System.out.println("2. Read");
        System.out.println("3. update");
        System.out.println("4. delete");
        System.out.println("otro. Salir");
    }

    public static void  fillDatabase(){
        for (int i = 0; i < database.length; i++) {
            System.out.println("Por favor ingrese un nombre para la entrada numero " + (i+1));
            database[i] = intro.nextLine();
        }
    }

    public static boolean create(){
        boolean canCreate = false;
        int canCreateIndex = -1;
        for (int i = 0; i < database.length; i++) {
            if (database[i] == null){
                canCreateIndex = i;
                canCreate = true;
            }
        }
        if (canCreate){
            System.out.println("Escriba el nombre para llenar en la posicion " + (canCreateIndex + 1));
            database[canCreateIndex] = intro.nextLine();
            return true;
        }else{
            System.out.println("No se puede crear por que no hay espacios disponibles");
            return false;
        }

    }

    public static String read(){

    }

    public static boolean update(){

    }

    public static boolean delete(){
        System.out.println("Digite cual posicion desea borrar");
        int userOption = intro.nextInt();

        if (database[userOption] != null){
            database[userOption] = null;
            return true;
        }else {
            System.out.println("No se puede borrar la entrada ya que esa posicion no esta ocupada");
            return false;
        }
    }

}
