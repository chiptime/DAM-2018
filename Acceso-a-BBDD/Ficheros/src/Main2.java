import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        try
        {
            File fichero = new File("Segundo.txt");
            FileWriter fwriter = new FileWriter(fichero, true);

            String letras = "Y ANA TAMBIEN";
            fwriter.write(letras);
            fwriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
