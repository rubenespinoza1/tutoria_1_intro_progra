package app_28;

public class App28 {

    public static void main(String[] args) {
        Rut rut = new Rut("20106191", "k");
        Persona persona = new Persona("Ruben Espinoza Osses", "08/07/1999",
                rut);
        System.out.println(persona);
    }

}
