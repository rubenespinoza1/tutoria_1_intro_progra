package app_29;

import javax.swing.*;

public class Gato extends Animal{

    private String colorPelaje;
    private int edad;
    private String nombre;

    public Gato(int numeroDePatas, String nombreCientifico, int esperanzaDeVida, boolean esDomestico, String sexo, String colorPelaje, int edad, String nombre) {
        super(numeroDePatas, nombreCientifico, esperanzaDeVida, esDomestico, sexo);
        this.colorPelaje = colorPelaje;
        this.edad = edad;
        this.nombre = nombre;
    }

    public void emitirSonido(){
        JOptionPane.showMessageDialog(null, "Miau");
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "numeroDePatas=" + numeroDePatas +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                ", esperanzaDeVida=" + esperanzaDeVida +
                ", esDomestico=" + esDomestico +
                ", sexo='" + sexo + '\'' +
                ", colorPelaje='" + colorPelaje + '\'' +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
