import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nombreRuta;
        while(scan.hasNext()) {
            nombreRuta = scan.nextLine();
            if(nombreRuta.equals("exit"))
                return;
            Carpeta carpeta = new Carpeta(nombreRuta);
            carpeta.preguntarNombre();
        }
    }
}
