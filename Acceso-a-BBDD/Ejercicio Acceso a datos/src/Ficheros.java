import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;

public class Ficheros {
    private String pathname;
    private File fichero;
    private int numero[] = {1,2,3,4,5,6,7,8,9,10};
    //Escribir fichero: escribir los datos contenidos en una tabla y guardarlos en un fichero.

    public Ficheros(String pathname) {
        this.pathname = pathname;
         fichero = new File(pathname);
    }

    public void escribirFichero(){

        try{
            FileWriter fwriter = new FileWriter(fichero);

            for (int i = 0; i < numero.length; i++)
                fwriter.write(String.valueOf(numero[i] + ((i == numero.length-1) ? "": "-")));

            fwriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void leerFichero(){
        try {
            FileReader freader = new FileReader(fichero);

            char[] numeros_diez = new char[50];
            int resultado = freader.read(numeros_diez);
            int comprobante = 0;
            while (resultado != -1) {
                comprobante += resultado;
                resultado = freader.read(numeros_diez);
            }
            String loDelArray = "";
            int tablaRecoger[] = new int[10];
            String[] otro;

            for(int i = 0; i < comprobante; i++) {
                //numero[i] = numeros_diez[i];
                loDelArray += String.valueOf(numeros_diez[i]);
            }
            otro = loDelArray.split("-");


            for (int i = 0; i < otro.length; i++) {
                tablaRecoger[i] = Integer.parseInt(otro[i]);

            }
            System.out.print(tablaRecoger[9]);


            freader.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
