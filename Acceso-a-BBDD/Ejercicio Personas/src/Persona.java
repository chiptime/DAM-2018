public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;

    public Persona(String nombre, String apellido, int edad, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerEdad() {
        return edad;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public boolean mayorEdad() {
        return edad >= 18;
    }

    public String escribirNombre() {
        return nombre + apellido + direccion + String.valueOf(edad);
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String escribirApellidos() {
        return apellido + nombre  + direccion + String.valueOf(edad);
    }
}
