import java.util.Scanner;

public class App13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gananciasDiarias = 0;

        int valorBebidaChica = 500;
        int valorBebidaMediana = 750;
        int valorBebidaGrande = 1000;

        int tomate = 150;
        int extraQueso = 100;
        int champinion = 50;
        int pepinillo = 50;
        int jamon = 200;

        int baseChica = 1000;
        int baseMediana = 1500;
        int baseGrande = 1750;

        boolean repetir = true;

        while (repetir) {
            int valorFinalOrden = 0;
            boolean datosCorrectos = false;
            do {
                System.out.println("Que tamanio de base desea");
                System.out.println("1: Pequenia \n2: Mediana \n3: Grande");
                int opcionUser = scanner.nextInt();
                switch (opcionUser) {
                    case 1:
                        valorFinalOrden += baseChica;
                        datosCorrectos = true;
                        break;
                    case 2:
                        valorFinalOrden += baseMediana;
                        datosCorrectos = true;
                        break;
                    case 3:
                        valorFinalOrden += baseGrande;
                        datosCorrectos = true;
                        break;
                    default:
                        datosCorrectos = false;
                        break;
                }
            } while (!datosCorrectos);

            datosCorrectos = false;

            do{
                System.out.println("Desea poner algun agregado a su pizza?");
                System.out.println("1: No \nOtro Numero: Si");
                int opcionAgregado = scanner.nextInt();
                
                if (opcionAgregado == 1){
                    break;
                }else{
                    boolean sePuedeAgregarTomate = true;
                    boolean sePuedeAgregarQueso = true;
                    boolean sePuedeAgregarChampinion = true;
                    boolean sePuedeAgregarPepinillo = true;
                    boolean sePuedeAgregarJamon = true;
                    int otroAgregado = 0;
                    do{
                        System.out.println("Que agregado desea?");
                        System.out.println("1: Tomate \n2: Queso \n3: Champinion \n4: Pepinillo \n5: Jamon");
                        int agregado = scanner.nextInt();
                        switch(agregado){
                            case 1:
                                if (sePuedeAgregarTomate){
                                    valorFinalOrden += tomate;
                                    sePuedeAgregarTomate = false;
                                }else{
                                    System.out.println("Ya habia agregado tomate");
                                }
                                break;
                            case 2:
                                if (sePuedeAgregarQueso){
                                    valorFinalOrden += extraQueso;
                                    sePuedeAgregarQueso = false;
                                }else{
                                    System.out.println("Ya habia agregado Extra Queso");
                                }
                                break;
                            case 3:
                                if (sePuedeAgregarChampinion){
                                    valorFinalOrden += champinion;
                                    sePuedeAgregarChampinion = false;
                                }else{
                                    System.out.println("Ya habia agregado champinion");
                                }
                                break;
                            case 4:
                                if (sePuedeAgregarPepinillo){
                                    //valorFinalOrden = valorFinalOrden + pepinillo
                                    valorFinalOrden += pepinillo;
                                    sePuedeAgregarPepinillo = false;
                                }else{
                                    System.out.println("Ya habia agregado pepinillo");
                                }
                                break;
                            case 5:
                                if (sePuedeAgregarJamon){
                                    valorFinalOrden += jamon;
                                    sePuedeAgregarJamon = false;
                                }else{
                                    System.out.println("Ya habia agregado jamon");
                                }
                                break;
                            default:
                                System.out.println("No se sumo ningun agregado");
                                break;
                        }
                        System.out.println("Desea agrega otro agregado?");
                        System.out.println("1: Si \nOtro Numero: No");
                        otroAgregado = scanner.nextInt();
                    }while(otroAgregado == 1);
                }

            }while (datosCorrectos);
            System.out.println("Quiere una bebida?");
            System.out.println("1: Si \nOtro Numero: No");
            int opcionBebida = scanner.nextInt();
            if (opcionBebida == 1){
                System.out.println("Que tamanio de bebida desea");
                System.out.println("1: Pequenia \n2: Mediana \n3: Grande");
                int bebida = scanner.nextInt();
                switch(bebida){
                    case 1:
                        valorFinalOrden += valorBebidaChica;
                        break;
                    case 2:
                        valorFinalOrden += valorBebidaMediana;
                        break;
                    case 3:
                        valorFinalOrden += valorBebidaGrande;
                        break;
                    default:
                        System.out.println("No se agrego ninguna bebida");
                        break;
                }
            }
            System.out.println("Su orden tiene un valor final de: " + valorFinalOrden);
            gananciasDiarias += valorFinalOrden;
            System.out.println("Desea registrar otra orden?");
            System.out.println("1: Si \nOtro Numero: No");
            int otraOrden = scanner.nextInt();
            if (otraOrden != 1){
                repetir = false;
            }
        }
        System.out.println("Las ganancias diarias fueron: " + gananciasDiarias);
    }

}
