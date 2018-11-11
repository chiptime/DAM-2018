import java.util.Scanner;

public class Menu {
    private Scanner scan;

    public Menu() {
        scan = new Scanner(System.in);
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
        //elegirOpcion();
    }
    public String elegirRuta(){
        String pathname = "";
        scan.nextLine();
        pathname = scan.nextLine();
        return pathname;
    }
    public void elegirOpcion(){
        Manejador manejador = new Manejador();
        int opcion = 0;
        while(opcion != 8){
            imprimirMenu();
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    manejador.leerFicheroPersonas();
                    break;
                case 2:
                    manejador.escribirFicheroPersonas();
                    break;
                case 3:
                    manejador.escribirNombrePersonas();
                    break;
                case 4:
                    manejador.escribirApellidoPersonas();
                    break;
                case 5:
                    manejador.escribirNombrePersonasMayores();
                    break;
                case 6:
                    manejador.ordenarFicheroNombre();
                    break;
                case 7:
                    manejador.ordenarFicheroEdad();
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
}
