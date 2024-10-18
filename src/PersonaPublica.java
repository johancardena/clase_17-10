public class PersonaPublica {
    public String direccion;
    public String telefono;
    public String email;

    public PersonaPublica(String direccion, String telefono, String email) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    private void mostrarDireccion(String direccion) {
        this.direccion = direccion;
    }

    private void mostrarTelefono() {
        System.out.println("Teléfono: " + telefono);
    }

    public void probarMetodosPrivados(String direccion) {
        mostrarDireccion(direccion);
        mostrarTelefono();
    }
}
