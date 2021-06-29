package app_25;

public class Calculadora {

    private Boton[] botonesCalculadora;
    private String pantallaCalculadora;

    public Calculadora(){
        this.botonesCalculadora = new Boton[47];
        this.botonesCalculadora[0] = new Boton("0");
        this.pantallaCalculadora = "";
    }

    public Boton[] getBotonesCalculadora() {
        return botonesCalculadora;
    }

    public String getPantallaCalculadora() {
        return pantallaCalculadora;
    }
}
