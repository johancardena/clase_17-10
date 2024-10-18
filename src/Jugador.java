

import java.util.Scanner; // Importar la clase Scanner

// Clase Jugador con atributos y métodos
public class Jugador {
    // Atributos
    private String avatar;
    private int edad;
    private String pais;

    // Constructor vacío para Jugador 1 (datos quemados)
    public Jugador() {
        this.avatar = "Avatar1";
        this.edad = 25;
        this.pais = "España";
    }

    // Constructor con parámetros para Jugador 2
    public Jugador(String avatar, int edad, String pais) {
        this.avatar = avatar;
        this.edad = edad;
        this.pais = pais;
    }

    public void patear() {
        System.out.println(avatar + " está pateando el balón.");
    }

    public void correr() {
        System.out.println(avatar + " está corriendo.");
    }

    public void saltar() {
        System.out.println(avatar + " está saltando.");
    }

    public void mostrarInformacion() {
        System.out.println("Avatar: " + avatar);
        System.out.println("Edad: " + edad);
        System.out.println("País: " + pais);
    }


}
