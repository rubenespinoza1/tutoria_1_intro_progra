package app_27;

public class Punto {

    private double x;
    private double y;

    public Punto(){
        this.x = 0;
        this.y = 0;
    }

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double calcularDistancia(Punto punto){
        double x1 = this.x;
        double x2 = punto.getX();

        double y1 = this.y;
        double y2 = punto.getY();

        double distancia = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));

        return distancia;
    }

    public static void getMensajeDeBienvenida(){
        System.out.println("Hola");
    }

    public Punto obtenerPuntoMedio(Punto punto){
        double x1 = this.x;
        double x2 = punto.getX();

        double y1 = this.y;
        double y2 = punto.getY();

        Punto puntoMedio = new Punto((x1 + x2) / 2,(y1 + y2) / 2);
        return puntoMedio;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
