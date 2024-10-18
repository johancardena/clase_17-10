import java.util.Scanner;

public static void main(String[] args) {
    Jugador jugador1 = new Jugador();
    jugador1.mostrarInformacion();
    jugador1.patear();
    jugador1.correr();
    jugador1.saltar();
    System.out.println();

    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa el avatar del jugador 2: ");
    String avatar2 = scanner.nextLine();

    System.out.print("Ingresa la edad del jugador 2: ");
    int edad2 = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Ingresa el país del jugador 2: ");
    String pais2 = scanner.nextLine();

    Jugador jugador2 = new Jugador(avatar2, edad2, pais2);
    jugador2.mostrarInformacion();
    jugador2.patear();
    jugador2.correr();
    jugador2.saltar();
//
    scanner.close();
}