import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Manejador {
    private ArrayList<Persona> tablaPersonas = new ArrayList<Persona>();
    private String nombre = "";

    public Manejador() {
    }

//Leer fichero personas: Al seleccionar esta opción, deberá abrir el fichero con el nombre indicado,
//leer la información existente en el fichero y guardarla sobre la tabla de personas.
    void leerFicheroPersonas() {
        Ficheros ficheros = new Ficheros();

        Scanner scan = new Scanner(System.in);
        System.out.println("Porfavor escribe el nombre del archivo");
        nombre = scan.nextLine();

        ficheros.abrir("L", nombre);
        int i = 0;
        Persona persona = new Persona("a","a",-200, "a");
        while (persona.obtenerNombre() != null) {
            persona = ficheros.leer();
            if(persona.obtenerNombre() != null) {
                tablaPersonas.add(persona);
                escribirTabla("tabla", tablaPersonas.get(i), i);
                i++;
            }
        }
        ficheros.cerrar();
    }

    public void escribirTabla(String str, Persona p, int contador) {
        if (contador < 1) {
            if (str.equals("tabla"))
                System.out.println("Estado actual de la tabla: \n");
            if (str.equals("fichero"))
                System.out.println("En el fichero estan los siguientes numeros: ");
            System.out.println("Campos\t\t\t |\t Datos"
                    + "\n---------------------------------");
        }
        System.out.println("Nombre" + "\t\t\t |\t " + p.obtenerNombre());
        System.out.println("Apellido" + "\t\t |\t " + p.obtenerApellido());
        System.out.println("Edad" + "\t\t\t |\t " + Integer.toString(p.obtenerEdad()));
        System.out.println("Direccion" + "\t\t |\t " + p.obtenerDireccion());
        System.out.println();
    }

    //Escribir fichero personas: Al seleccionar esta opción, deberá abrir el fichero con el nombre indicado
//y guardar los datos de la tabla de personas sobre el fichero con el nombre indicado.
    void escribirFicheroPersonas() {
        Scanner scan = new Scanner(System.in);
       /* Ficheros ficheros = new Ficheros();
        System.out.println("Porfavor escribe el nombre del archivo");
        nombre = scan.nextLine();
        ficheros.abrir("E", nombre);
        int i = 0;*/
        System.out.println("¿Deseas escribir nuevas personas o usar las que estan en la tabla? (Nuevas / Tabla)");
        String palabra = "";
        palabra = scan.nextLine();
        if(palabra.toLowerCase().equals("nuevas")) {

            String continuar = "";
            while (!continuar.toLowerCase().equals("no")) {
                String nombre = "";
                String apellido = "";
                int edad = 0;
                String direccion = "";
                System.out.println("Nombre: ");
                nombre = scan.nextLine();
                System.out.println("Apellido: ");
                apellido = scan.nextLine();
                System.out.println("Edad: ");
                edad = scan.nextInt();
                scan.nextLine();
                System.out.println("Dirección: ");
                direccion = scan.nextLine();

                tablaPersonas.add(new Persona(nombre, apellido, edad, direccion));
                System.out.println("¿Deseas continuar introducciendo personas a la tabla?\n Si/No");
                continuar = scan.nextLine();
            }
            escribirEnFichero(tablaPersonas);
        }else
            escribirEnFichero(tablaPersonas);
        /*
        while (tablaPersonas.size() > i) {
            ficheros.escribir(tablaPersonas.get(i));
            escribirTabla("tabla", tablaPersonas.get(i), i);
            i++;
        }
        ficheros.cerrar();*/
    }
//Escribir personas nombre: Al seleccionar esta opción, deberá mostrar por pantalla las personas
//escribiendo únicamente nombre y apellidos
    void escribirNombrePersonas() {
        if (tablaPersonas.size() > 0)
            for (Persona p : tablaPersonas)
                System.out.println(p.escribirNombre() + " " + p.obtenerApellido());
        else
            System.out.println("No existe ninguna persona");
    }
//Escribir personas apellido: Al seleccionar esta opción, deberá mostrar por pantalla las personas
//escribiendo únicamente apellidos y nombre.
    void escribirApellidoPersonas() {
        if (tablaPersonas.size() > 0)
            for (Persona p : tablaPersonas)
                System.out.println(p.obtenerApellido() + " " + p.escribirNombre() );
        else
            System.out.println("No existe ninguna persona");
    }
//Escribir personas nombre: Al seleccionar esta opción, deberá mostrar sólo por pantalla las personas
//mayores de edad.
    void escribirNombrePersonasMayores() {

        if (tablaPersonas.size() > 0)
            for (Persona p : tablaPersonas)
                if(p.mayorEdad())
                    System.out.println(p.obtenerApellido() + " " + p.escribirNombre() );
                else
                    System.out.println("No existe ninguna persona");
    }
//Ordenar fichero nombre: Al seleccionar esta opción, se almacenarán los datos de las personas
//sobre el fichero ordenados según el nombre de la persona en orden ascendente.
    void ordenarFicheroNombre() {
        //tablaPersonas.sort((p,b) -> p.obtenerNombre().toLowerCase().compareTo(b.escribirNombre().toLowerCase()));
        tablaPersonas.sort(Comparator.comparing(p -> p.obtenerNombre().toLowerCase()));
        escribirEnFichero(tablaPersonas);
    }
    //Ordenar fichero edad: Al seleccionar esta opción, se almacenarán los datos de las personas sobre
//el fichero ordenados según la edad de la persona en orden ascendente.
    void ordenarFicheroEdad() {
        tablaPersonas.sort(Comparator.comparing(p -> Integer.toString(p.obtenerEdad())));
        escribirEnFichero(tablaPersonas);
    }
    private void escribirEnFichero(List<Persona> tabla) {
        Ficheros ficheros = new Ficheros();
        Scanner scan = new Scanner(System.in);
        System.out.println("Porfavor escribe el nombre del archivo");
        nombre = scan.nextLine();

        ficheros.abrir("E", nombre);
        int i = 0;
        while (tabla.size() > i) {
            ficheros.escribir(tabla.get(i));
            escribirTabla("tabla", tabla.get(i), i);
            i++;
        }
        ficheros.cerrar();
    }
}
