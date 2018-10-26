import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String rutaUsuario = "";

        System.out.println("Hola dime la ruta que quieres crear...");

        while(scan.hasNext()) {
            rutaUsuario = scan.nextLine();
            if(rutaUsuario.equals("exitr"))
                return;
            Carpeta carpeta = new Carpeta(rutaUsuario);
            carpeta.crearCarpeta();
        }
        System.out.println("Hasta luego");
    }
}
