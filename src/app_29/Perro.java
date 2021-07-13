package app_29;

import javax.swing.*;

public class Perro extends Animal{

    private String colorDePelaje;
    private String raza;
    private int edad;
    private String nombre;

    public Perro(int numeroDePatas, String nombreCientifico, int esperanzaDeVida, boolean esDomestico, String sexo,
                 String colorDePelaje, String raza, int edad, String nombre) {
        super(numeroDePatas, nombreCientifico, esperanzaDeVida, esDomestico, sexo);
        this.colorDePelaje = colorDePelaje;
        this.raza = raza;
        this.edad = edad;
        this.nombre = nombre;
    }

    public void emitirSonido(){
        JOptionPane.showMessageDialog(null, "Guau");
    }

    public String getColorDePelaje() {
        return colorDePelaje;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "numeroDePatas=" + numeroDePatas +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                ", esperanzaDeVida=" + esperanzaDeVida +
                ", esDomestico=" + esDomestico +
                ", sexo='" + sexo + '\'' +
                ", colorDePelaje='" + colorDePelaje + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
