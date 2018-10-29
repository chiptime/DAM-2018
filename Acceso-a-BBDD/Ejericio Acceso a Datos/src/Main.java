import java.util.Arrays;

public class Main {
    /*
    Crear programa que cree ficheros de texto con una lista de 10 numero enteros.
    * */
    public static void main(String[] args) {


        Ficheros fichero = new Ficheros("Numeros.txt");

        ////
       // Menu menu = new Menu("Bruno");
       // menu.imprimirMenu();


        ////

        fichero.escribirFichero();
        //fichero.escribirPorConsola();
        fichero.modificarArray();
        fichero.leerFichero();
        fichero.actualizarFichero();
    }
}
