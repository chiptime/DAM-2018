<<<<<<< HEAD
import java.net.*;
import java.io.*;

public class URLReader {
    public static void main(String[] args) throws Exception {

    	//URL direccion = new URL("http://www.spanishdict.com/traductor/"+palabra);
        //String html = obtenerHTML (direccion);
        //System.out.println(html);


    }

    public static String obtenerHTML (URL direccionWeb) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(direccionWeb.openStream()));
        String inputLine, codigo="";

        while ((inputLine = in.readLine()) != null)
            codigo+=inputLine;

        in.close();

        return codigo;
    }
=======
import java.net.*;
import java.io.*;

public class URLReader {
    public static void main(String[] args) throws Exception {

    	//URL direccion = new URL("http://www.spanishdict.com/traductor/"+palabra);
        //String html = obtenerHTML (direccion);
        //System.out.println(html);


    }

    public static String obtenerHTML (URL direccionWeb) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(direccionWeb.openStream()));
        String inputLine, codigo="";

        while ((inputLine = in.readLine()) != null)
            codigo+=inputLine;

        in.close();

        return codigo;
    }
>>>>>>> origin/master
}