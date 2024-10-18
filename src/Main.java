public class Main {
    public static void main(String[] args) {
        // Instancia de PersonaPrivada
        PersonaPrivada persona1 = new PersonaPrivada("Juan", 17, 1.75);
        System.out.println("----------------------- PERSONA PRIVADA -----------------------------" );
        persona1.mostrarDatos();
        System.out.println("Es mayor de edad: " + persona1.esMayorDeEdad());


        // Instancia de PersonaPublica
        PersonaPublica persona2 = new PersonaPublica("12 DE OCTUBRE",  "0979971783" ,"juan.PEREZ@gmail.com");
        System.out.println("----------------------- PERSONA PUBLICA -----------------------------" );
        System.out.println("Dirección: " + persona2.direccion);
        System.out.println("Email: " + persona2.email);
        persona2.probarMetodosPrivados("Nueva Dirección 456");
    }
}
