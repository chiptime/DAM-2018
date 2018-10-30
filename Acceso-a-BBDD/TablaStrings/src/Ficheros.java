import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ficheros {
    private File fichero;
    private String pathname;

    public Ficheros(String pathname) {
        this.pathname = pathname;
        fichero = new File(pathname);
    }

    //1. escribirFichero: Recibe como parámetro una tabla de Strings rellena con nombres y escribe
//sobre un fichero de texto el contenido de la tabla.
    public void escribirFichero(String[] nombres) {
        try {
            FileWriter fwriter = new FileWriter(fichero);
            for (int i = 0; i < nombres.length; i++)
                fwriter.write(nombres[i] + ((i == nombres.length - 1) ? "" : "-"));
            fwriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //2. leerFichero: Recibe como parámetro una tabla de Strings vacía y lee de un fichero los datos
// existentes en el mismo y los almacena en la tabla pasado como parámetro.
    public void leerFichero() {
        try {
            FileReader freader = new FileReader(fichero);

            char[] numeros_diez = new char[100];
            String loDelArray = "";
            String[] losNombres = new String[50];

            int resultado = freader.read(numeros_diez);
            int comprobante = 0;

            while (resultado != -1) {
                comprobante += resultado;
                resultado = freader.read(numeros_diez);
            }

            loDelArray = charToStrings(loDelArray, numeros_diez, comprobante);
            stringToArrayString(loDelArray,losNombres);

        escribirTabla("tabla",losNombres);

            freader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escribirTabla(String str, String[] nombre) {
        if (str.equals("tabla"))
            System.out.println("Estado actual de la tabla: ");
        if (str.equals("fichero"))
            System.out.println("En el fichero estan los siguientes numeros: ");
        System.out.println("Posicion |\t Numero");
        for (int i = 0; i < nombre.length; i++)
            if(nombre[i] != null)
                System.out.println( (i+1) +"\t\t |\t " + nombre[i]);
        System.out.println();
    }
    private void stringToArrayString(String str, String[] tabla){
        String[] otro;
        otro = str.split("[-,.| ;:/]");

        for (int i = 0; i < otro.length; i++)
            tabla[i] = otro[i];
    }
    private String charToStrings(String str, char[] numeros, int comprobanteLectura){
        for(int i = 0; i < comprobanteLectura; i++)
            str += numeros[i];
        return str;
    }
}
