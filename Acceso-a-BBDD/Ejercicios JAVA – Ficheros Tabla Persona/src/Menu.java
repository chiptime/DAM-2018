import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    private Scanner scan;
    private FicheroNombres ficheros;
    private String ruta = "";
    private Persona personas[] = new Persona[2];//TODO mejorar el maximo de personas a leer para poder ordenarlas
    public Menu() {
        scan = new Scanner(System.in);
        System.out.println("Dime como quieres que se llame tu fichero...");
        ficheros = new FicheroNombres();
    }

    public void imprimirMenu(){

        System.out.println("Elige una de la siguientes opciones:");
        System.out.println();
        System.out.println("1. Leer fichero personas");
        System.out.println("2. Escribir fichero personas");
        System.out.println("3. Escribir solo nombre de las personas");
        System.out.println("4. Escribir solo apellido de las personas");
        System.out.println("5. Escribir nombre mayores de edad");
        System.out.println("6. Ordenar fichero nombres");
        System.out.println("7. Ordenar fichero edad");
        System.out.println("8. Salir");
        elegirOpcion();
    }
    public String elegirRuta(){
        String pathname = "";
        scan.nextLine();
        pathname = scan.nextLine();
        return pathname;
    }
    public void elegirOpcion(){
        int opcion = 0;
        int contadorPersonas = 0;
        while(opcion != 8){
        opcion = scan.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Antes de empezar elija la ruta a usar");
                ruta = elegirRuta();
                ficheros.abrir("L", ruta);
                personas = ficheros.leer();
                ficheros.escribirPersonas(personas);
                break;
            case 2:
                System.out.println("Antes de empezar elija la ruta a usar");
                ruta = elegirRuta();
                ficheros.abrir("E",ruta);
                for (int i = 0 ; i < personas.length; i++)
                    personas[i] = crearPersonaNueva();
                ficheros.escribir(personas);
                break;
            case 3:
                escribirNombres();
                break;
            case 4:
                escribirApellidos();
                break;
            case 5:
                escribirNombresMayores();
                break;
            case 6:
                personas = ordenarPorNombre(personas);
                escribirEnElFichero(ruta,ficheros,personas);
                break;
            case 7:
                personas = ordenarPorEdad(personas);
                escribirEnElFichero(ruta,ficheros,personas);
                break;
            case 8:
                System.out.println("Hasta luego");
                return;
            default:
                System.out.println("La opcion elegida es incorrecta");
                break;
        }
        }

    }
    public void escribirEnElFichero(String ruta, FicheroNombres ficheros, Persona personas[]){
        System.out.println("Antes de empezar elija la ruta a usar");
        ruta = elegirRuta();
        ficheros.abrir("E",ruta);
        ficheros.escribir(personas);
    }
    public Persona crearPersonaNueva(){
        String nombre    = "";
        String apellido  = "";
        int    edad      = 0 ;
        String direccion = "";
        int i = 0;
        while(i < 5){
            switch (i){
                case 0:
                    System.out.println("Escribe el nombre");
                    nombre = scan.nextLine();
                    break;
                case 1:
                    System.out.println("Escribe el apellido");
                    apellido = scan.nextLine();
                    break;
                case 2:
                    System.out.println("Escribe la edad");
                    edad = scan.nextInt();
                    scan.nextLine();
                    break;
                case 3:
                    System.out.println("Escribe la direccion");
                    direccion = scan.nextLine();
                    break;
            }
            i++;
        }
        Persona persona = new Persona(nombre, apellido, edad, direccion);
        return persona;
    }
    public void escribirNombres(){
        for (Persona p: personas)
            System.out.println(p.getNombre() + " " + p.getApellido() + "\n");
    }
    public void escribirApellidos(){
        for (Persona p: personas)
            System.out.println(p.getApellido() + " " + p.getNombre() + "\n");
    }
    public void escribirNombresMayores(){
        for (Persona p: personas)
            if(p.getEdad() >= 18)
                System.out.println(p.getNombre() + " " + p.getApellido() + "\n");
    }

    //Ordenar fichero nombre: Al seleccionar esta opción, se almacenarán los datos de las personas
    //sobre el fichero ordenados según el nombre de la persona en orden ascendente.
    public Persona[] ordenarPorNombre(Persona persona[]){
        Persona personaNoNull[] = personasNoNull(persona);
        Arrays.sort(personaNoNull, (a, b) -> a.nombre.toLowerCase().compareTo(b.nombre.toLowerCase()));
        return personaNoNull;
    }
    //o Ordenar fichero edad: Al seleccionar esta opción, se almacenarán los datos de las personas sobre
    //el fichero ordenados según la edad de la persona en orden ascendente.
    public Persona[] ordenarPorEdad(Persona persona[]){
        Persona personaNoNull[] = personasNoNull(persona);
        Arrays.sort(personaNoNull, (a, b) -> String.valueOf(a.getEdad()).compareTo(String.valueOf(b.getEdad())));
        return personaNoNull;
    }
    public Persona[] personasNoNull(Persona persona[]){
        int i = 0;
        while (persona[i] != null)
            i++;
        Persona personasNoNull[] = new Persona[i];

        int p = 0;
        while(personasNoNull.length > p) {
            personasNoNull[p] = persona[p];
            p++;
        }
        return personasNoNull;
    }
}
