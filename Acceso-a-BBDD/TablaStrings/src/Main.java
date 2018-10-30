import java.util.Scanner;

public class Main {
    /*
    * Crear un programa en Java que escriba una lista de nombres existentes en un tabla de Strings. Se
realizarán dos métodos:*/
    public static void main(String[] args) {

        System.out.println("Porfavor introduzca los nombres que quieras separados con espacios");
        Scanner scan = new Scanner(System.in);
        String nombresEscaneados = scan.nextLine();
        String[] nombres = nombresEscaneados.split("[-,.| ;:/]");

        Ficheros ficheros = new Ficheros("Nombres.txt");
        ficheros.escribirFichero(nombres);
        ficheros.leerFichero();
    }
}
