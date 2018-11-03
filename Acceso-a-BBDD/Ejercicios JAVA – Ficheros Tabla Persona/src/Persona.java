public class Persona {
    public String nombre;
    private String apellido;
    private int    edad;
    private String direccion;

    public Persona(String nombre, String apellido, int edad, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public boolean mayorEdad(){
        if(edad >= 18)
            return true;
        else
            return false;
    }

    public  String escribirNombre(){
        return nombre + apellido + direccion + edad;
    }

    public  String escribirApellido(){
        return nombre + apellido + direccion + edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }
}
