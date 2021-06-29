import java.util.InputMismatchException;
import java.util.Scanner;
public class ResolucionPruebaBuenasPracticas {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        iniciarPrograma();
    }

    private static  double obtenerGananciaTotal(int[] cantidadUnidadesProductos, double[] valoresProductos){
        double ganancias = 0;
        for (int i = 0; i < cantidadUnidadesProductos.length; i++) {
            ganancias += cantidadUnidadesProductos[i] * valoresProductos[i];
        }
        return ganancias;
    }

    private static double obtenerBeneficioTotal(int[] cantidadUnidadesProductos, double[] valoresProductos, double[] costosProductos){
        double beneficio = 0;
        for (int i = 0; i < cantidadUnidadesProductos.length; i++) {
            beneficio += (valoresProductos[i] - costosProductos[i]) * cantidadUnidadesProductos[i];
        }
        return beneficio;
    }

    private static void iniciarPrograma(){
        int cantidadDeProductos = ingresarCantidadProductos();
        int[] cantidadUnidadesProductos = new int[cantidadDeProductos];
        double[] valoresProductos = new double[cantidadDeProductos];
        double[] costosProductos = new double[cantidadDeProductos];
        for (int i = 0; i < cantidadDeProductos; i++) {
            cantidadUnidadesProductos[i] = ingresarCantidadUnidadesProducto((i + 1));
            valoresProductos[i] = ingresarPrecioProducto( false, (i + 1));
            costosProductos[i] = ingresarPrecioProducto(true, (i + 1));
            if (costosProductos[i] > valoresProductos[i]){
                System.out.println("El valor del producto no puede ser menor al costo de produccion");
                i--;
            }
        }
        System.out.println("La ganancia total de los productos es: " + obtenerGananciaTotal(cantidadUnidadesProductos, valoresProductos));
        System.out.println("El beneficio total obteneido luego de vender todo es: " + obtenerBeneficioTotal(cantidadUnidadesProductos, valoresProductos, costosProductos));
    }

    private static double ingresarPrecioProducto(boolean costo, int nroProducto){
        String valorProducto;
        do{
            if (!costo){
                System.out.println("Ingrese el valor unitario del producto: " + nroProducto);
            }else {
                System.out.println("Ingrese el costo unitario del producto: " + nroProducto);
            }
            valorProducto = teclado.next();
        }while (!validarEntrada(valorProducto, false));
        return  Double.parseDouble(valorProducto);
    }

    private static int ingresarCantidadProductos(){
        String cantidadDeProductos;
        do{
            System.out.println("Indique cuantos productos desea procesar");
            cantidadDeProductos = teclado.next();
        }while (!validarEntrada(cantidadDeProductos, true));

        return Integer.parseInt(cantidadDeProductos);
    }

    private static int ingresarCantidadUnidadesProducto(int nroProducto){
        String cantidadUnidades;
        do{
            System.out.println("ingrese la cantidad de unidades del producto numero: " + nroProducto);
            cantidadUnidades = teclado.next();
        }while (!validarEntrada(cantidadUnidades, true));

        return  Integer.parseInt(cantidadUnidades);
    }

    private static boolean validarEntrada(String entrada, boolean esInteger){

        try{
            if (esInteger){
                Integer.parseInt(entrada);
            }else {
                Double.parseDouble(entrada);
            }
            return true;
        }catch (NumberFormatException ex){
            System.out.println("Fallo el parseo de entrada");
        }
        return  false;
    }
}
