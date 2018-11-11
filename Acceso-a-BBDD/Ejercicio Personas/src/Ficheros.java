import java.io.*;

public class Ficheros {
    public BufferedReader breader;
    public BufferedWriter bwriter;

    public Ficheros() {
    }

    public void abrir(String modo, String nombre){
        try {
            if (modo == "L")
                breader = new BufferedReader(new FileReader(nombre));
            if (modo == "E")
                bwriter = new BufferedWriter(new FileWriter(nombre));
        }catch (FileNotFoundException e){
            System.out.println("El fichero no existe");
        } catch (IOException e) {
            System.out.println("Ha saltado una IOException");
        }
    }

    public Persona leer() {
        String nombre = "";
        String apellido = "";
        int edad;
        String direccion = "";
        Persona p = new Persona("", "", -100, "");
        try {
            nombre = breader.readLine();
            apellido = breader.readLine();
            String edadString = breader.readLine();
            edad = Integer.parseInt((edadString == null)? "0" : edadString);
            direccion = breader.readLine();
            p = new Persona(nombre, apellido, edad, direccion);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //System.out.println(p.escribirNombre());
        return p;
    }

    public void escribir(Persona persona) {
        try {
            bwriter.write(persona.obtenerNombre());
            bwriter.newLine();
            bwriter.write(persona.obtenerApellido());
            bwriter.newLine();
            bwriter.write(Integer.toString(persona.obtenerEdad()));
            bwriter.newLine();
            bwriter.write(persona.obtenerDireccion());
            bwriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cerrar() {
        try {
            if (breader != null)
                breader.close();
            else
                bwriter.close();

        }catch(IOException e){
                e.printStackTrace();
        }
    }
}
