import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class Ficheros {
    private String pathname;
    private File fichero;
    private int numero[] = {1,2,3,4,5,6,7,8,9,10};
    private int tablaRecoger[] = new int[10];

    //Escribir fichero: escribir los datos contenidos en una tabla y guardarlos en un fichero.
    public Ficheros(String pathname) {
        this.pathname = pathname;
         fichero = new File(pathname);
    }
    //1. Escribir fichero: escribir los datos contenidos en una tabla y guardarlos en un fichero.
    public void escribirFichero(){
        System.out.println("Esta opcion solo te llenara el fichero con numeros del 1 al 10");
        volcarAFichero(numero);
    }
    //2. Leer fichero: abrir un fichero con 10 números y guardarlos en una tabla.
    public void leerFichero(){
        try {
            FileReader freader = new FileReader(fichero);
            String loDelArray = "";
            char[] numeros_diez = new char[50];
            int resultado = freader.read(numeros_diez);
            int comprobante = 0;

            while (resultado != -1) {
                comprobante += resultado;
                resultado = freader.read(numeros_diez);
            }
            loDelArray = inToString(loDelArray, numeros_diez, comprobante);
            stringToInt(loDelArray, tablaRecoger);

            escribirTabla("fichero");

            freader.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    //3. Escribir: escribir por la consola los datos de la tabla.
    public void escribirPorConsola(){
        escribirTabla("tabla");
        System.out.println("Porfavor escribe los numeros que deseas guardar en la memoria (no en el fichero)");
        Scanner scan = new Scanner(System.in);
        stringToInt(scan.nextLine(), tablaRecoger);

    }
    //4. Modificar tabla: Indicar la posición que se quiere modificar de la tabla y modificar los datos.
    public void modificarArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime que dato quieres modificar (dame el numero de su posicion)");
        int posicion = scan.nextInt() - 1;
        System.out.println("Dime el nuevo valor de la posicion: " + (posicion+1));
        scan.nextLine();
        String valor = scan.nextLine();

        int[] tablaDeUsuario_Comprobar = new int[50];

        stringToInt(valor,tablaDeUsuario_Comprobar);
        if(tablaDeUsuario_Comprobar[1] != '\0')
            System.out.println("Creo que te has pasado metiendo numero, solo se leera el primer numero");
        //leerFichero();
        tablaRecoger[posicion] =  tablaDeUsuario_Comprobar[0];

        escribirTabla("tabla");
    }
    //5. Actualizar tabla fichero: Guardar los datos existentes en la tabla sobre el fichero asociado.
    public void actualizarFichero(){
        volcarAFichero(tablaRecoger);
    }
    private void volcarAFichero(int[] numero) {
        try{
            FileWriter fwriter = new FileWriter(fichero);

            for (int i = 0; i < numero.length; i++)
                fwriter.write(String.valueOf(numero[i] + ((i == numero.length-1) ? "": "-")));

            fwriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void stringToInt(String str, int[] tabla){
        String[] otro;
        otro = str.split("[-,.| ;:/]");

        for (int i = 0; i < otro.length; i++)
            tabla[i] = Integer.parseInt(otro[i]);
    }
    private String inToString(String str, char[] numeros, int comprobanteLectura){
        for(int i = 0; i < comprobanteLectura; i++)
              str += String.valueOf(numeros[i]);
        return str;
    }
    public void escribirTabla(String str){
        if(str.equals("tabla"))
            System.out.println("Estado actual de la tabla: ");
        if(str.equals("fichero"))
            System.out.println("En el fichero estan los siguientes numeros: ");
        System.out.print("Posicion \t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\n" +
                         "Numero\t\t");
        for (int i: tablaRecoger)
            System.out.print(i+"\t");
        System.out.println();
    }
}
