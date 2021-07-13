package app_29;

public class App29 {

    public static void main(String[] args) {
        Perro p = new Perro(4, "Canis Lupus Familiaris", 15, true, "Masculino", "Negro", "Pastor Aleman", 10, "Nombre Generico");
        Gato g = new Gato(4, "Felis Catus", 16, true, "Femenino", "Blanco", 4, "Nombre Generico 2");
        Animal animal = p;
        System.out.println(animal);
    }


}
