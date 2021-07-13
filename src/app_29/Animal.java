package app_29;

public class Animal {

    protected int numeroDePatas;
    protected String nombreCientifico;
    protected int esperanzaDeVida;
    protected boolean esDomestico;
    protected String sexo;

    public Animal(int numeroDePatas, String nombreCientifico, int esperanzaDeVida, boolean esDomestico, String sexo) {
        this.numeroDePatas = numeroDePatas;
        this.nombreCientifico = nombreCientifico;
        this.esperanzaDeVida = esperanzaDeVida;
        this.esDomestico = esDomestico;
        this.sexo = sexo;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public int getEsperanzaDeVida() {
        return esperanzaDeVida;
    }

    public void setEsperanzaDeVida(int esperanzaDeVida) {
        this.esperanzaDeVida = esperanzaDeVida;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
