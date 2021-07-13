package app_28;

import java.util.Locale;

public class Rut {

    String cuerpoRut;
    String digitoVerificador;
    String cuerpoInvertido;

    public Rut(String cuerpoRut, String digitoVerificador) {
        this.cuerpoRut = cuerpoRut;
        this.digitoVerificador = digitoVerificador.toLowerCase();

        StringBuilder cuerpoInv = new StringBuilder(cuerpoRut);
        this.cuerpoInvertido = cuerpoInv.reverse().toString();
    }

    public boolean esRutValido(){
        return this.digitoVerificador.equals(obtenerDigitoVerificador());
    }

    private int multiplicarPorIndices(){
        if (!this.cuerpoRut.matches("[0-9]{1,8}")){
            return 0;
        }
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
        return resultadoProductos % 11;
    }

    public String obtenerDigitoVerificador(){
        int dvObtenido = 11 - aplicarModulo11();
        if (dvObtenido == 11){
            return "0";
        }else if (dvObtenido == 10){
            return "k";
        }else {
            return String.valueOf(dvObtenido);
        }

    }

    @Override
    public String toString() {
        return "Rut{" +
                "cuerpoRut='" + cuerpoRut + '\'' +
                ", digitoVerificador='" + digitoVerificador + '\'' +
                ", esRutValido=" + esRutValido() +
                '}';
    }
}
