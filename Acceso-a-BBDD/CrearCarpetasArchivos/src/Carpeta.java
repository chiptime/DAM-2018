import java.io.File;
import java.util.Scanner;

public class Carpeta {
    String ruta;

    public Carpeta(String ruta) {
        this.ruta = ruta;
    }

    public void preguntarNombre(){
        File carpeta[] = new File[50];
        String arr[] = ruta.split("/");
        String nombrePadre = "";
        for (int i = 0; i < arr.length; i++) {
            if(nombrePadre.equals(""))
                carpeta[i] = new File(arr[i]);
            else
                carpeta[i] = new File(nombrePadre,arr[i]);
            nombrePadre = carpeta[i].getPath();
            carpeta[i].mkdir();
        }
    }
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
