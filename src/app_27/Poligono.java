package app_27;

import java.util.ArrayList;

public class Poligono {


    private ArrayList<Punto> vertices;


    public Poligono(ArrayList<Punto> vertices) {
        this.vertices = vertices;
    }

    public double calcularPerimetro(){

        if (this.vertices.size() < 3){
            return 0;
        }
        Punto ultimoPunto = this.vertices.get(this.vertices.size() - 1);
        Punto primerPunto = this.vertices.get(0);
        double perimetro = ultimoPunto.calcularDistancia(primerPunto);

        for (int i = 0; i < this.vertices.size() - 1; i++) {
            Punto punto1 = this.vertices.get(i);
            Punto puntoSiguienteAPunto1 = this.vertices.get(i + 1);
            perimetro += punto1.calcularDistancia(puntoSiguienteAPunto1);
        }

        return perimetro;
    }

    public void agregarPunto(Punto punto) {
        this.vertices.add(punto);
    }

    public ArrayList<Punto> getVertices() {
        return vertices;
    }

    public void setVertices(ArrayList<Punto> vertices) {
        this.vertices = vertices;
    }
}
