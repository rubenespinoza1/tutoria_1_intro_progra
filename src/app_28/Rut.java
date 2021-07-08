package app_28;

public class Rut {

    String cuerpoRut;
    String digitoVerificador;
    String cuerpoInvertido;

    public Rut(String cuerpoRut, String digitoVerificador) {
        this.cuerpoRut = cuerpoRut;
        this.digitoVerificador = digitoVerificador;

        StringBuilder cuerpoInv = new StringBuilder(cuerpoRut);
        this.cuerpoInvertido = cuerpoInv.reverse().toString();
    }

    public boolean esRutValido(){
        return this.digitoVerificador.equals(String.valueOf(obtenerDigitoVerificador()));
    }

    private int multiplicarPorIndices(){
        int sumaProductos = 0;
        int[] indices = {2, 3, 4, 5, 6, 7};
        int j = 0;
        for (int i = 0; i < this.cuerpoInvertido.length(); i++) {
            sumaProductos += Integer.parseInt((this.cuerpoInvertido.charAt(i) + "")) * indices[j];
            j++;
            if (j == indices.length){
                j = 0;
            }
        }
        return sumaProductos;
    }


    private int aplicarModulo11(){
        int resultadoProductos = multiplicarPorIndices();
        int modulo11 = resultadoProductos % 11;
        return modulo11;
    }

    public int obtenerDigitoVerificador(){
        return 11 - aplicarModulo11();
    }




}
