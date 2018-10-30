import java.util.Scanner;

public class Menu {
    private Scanner scan;
    private Ficheros ficheros;
    public Menu() {
        scan = new Scanner(System.in);
        System.out.println("Dime como quieres que se llame tu fichero...");
        ficheros = new Ficheros(scan.nextLine());
    }

    public void imprimirMenu(){
        System.out.println("Elige una de la siguientes opciones:");
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
        while(scan.hasNext()){
        opcion = scan.nextInt();
        switch (opcion) {
            case 1:
                ficheros.escribirFichero();
                break;
            case 2:
                ficheros.leerFichero();
                break;
            case 3:
                ficheros.escribirPorConsola();
                break;
            case 4:
                ficheros.modificarArray();
                break;
            case 5:
                ficheros.actualizarFichero();
                break;
            case 6:
                System.out.println("Hasta luego");
                return;
            default:
                System.out.println("La opcion elegida es incorrecta");
                break;
        }
        }

    }
}
