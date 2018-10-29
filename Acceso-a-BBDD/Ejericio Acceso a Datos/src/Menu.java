import java.util.Scanner;

public class Menu {

    private String usuario;

    public Menu(String usuario) {
        this.usuario = usuario;
    }

    public void imprimirMenu(){
        System.out.println(usuario.toUpperCase() + " elige una de la siguientes opciones:");
        System.out.println();
        System.out.println("1. Escribir un fichero");
        System.out.println("2. Leer un fichero");
        System.out.println("3. Insertar datos a la tabla");
        System.out.println("4. Modificar datos de la tabla");
        System.out.println("5. Actualizar fichero con datos desde la tabla");
        System.out.println("6. Salir");
        elegirOpcion();
    }
    public void elegirOpcion(){
        int opcion = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime como quieres que se llame tu fichero...");
        String nombreFichero = scan.nextLine();
        Ficheros ficheros = new Ficheros(nombreFichero);

        opcion = scan.nextInt();
        switch (opcion){
            case 1:
                ficheros.escribirFichero();
                break;
            case 2:
                ficheros.leerFichero();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;
        }

    }
}
