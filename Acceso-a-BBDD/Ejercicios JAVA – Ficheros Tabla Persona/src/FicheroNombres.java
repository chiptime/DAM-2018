import java.io.*;

public class FicheroNombres {
    private FileWriter fwriter;
    private FileReader freader;
    private String[] losNombres = new String[50];

    public FicheroNombres() {
    }

    public void abrir(String modo, String nombre) {
        File fichero = new File(nombre);

        if (modo.equals("E")) {
            try {
                fwriter = new FileWriter(fichero);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (modo.equals("L")) {
            try {
                freader = new FileReader(fichero);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void escribir(Persona persona) {
        try {
            personaToArray(persona,"nombre");
            personaToArray(persona,"apellido");
            personaToArray(persona,"edad");
            personaToArray(persona,"direccion");
            fwriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void personaToArray(Persona persona, String campo){
        String paraArr[] = new String[50];
        switch (campo){
            case "nombre":
                paraArr = persona.getNombre().split(", |/:;");
                break;
            case "apellido":
                paraArr = persona.getApellido().split(", |/:;");
                break;
            case "edad":
                paraArr = String.valueOf(persona.getEdad()).split(", |/:;");
                break;
            case "direccion":
                paraArr = persona.getDireccion().split(", |/:;");
                break;
        }
        escribirStrings(paraArr,campo);
    }

    public void escribirStrings(String[] nombres, String campo) {
        try {
            campo = seleccionarCampo(campo);
            for (int i = 0; i < nombres.length; i++)
                if(nombres[i] != null)
                    fwriter.write(nombres[i] + (!(i == nombres.length - 1) ? "" : "-"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String seleccionarCampo(String campo){
        switch (campo){
            case "nombre":
                campo = "-";
                break;
            case "apellido":
                campo = "_";
                break;
            case "edad":
                campo = "|";
                break;
            case "direccion":
                campo = "!";
                break;
        }
        return campo;
    }


    public Persona leer() {
        //Persona persona = new Persona("hola","como" ,11 ,"estas" );
        Persona persona;

        try {
            char[] numeros_diez = new char[600];
            String loDelArray = "";


            int resultado = freader.read(numeros_diez);
            int comprobante = 0;

            while (resultado != -1) {
                comprobante += resultado;
                resultado = freader.read(numeros_diez);
            }

            loDelArray = charToStrings(loDelArray, numeros_diez, comprobante);
            stringToArrayString(loDelArray, losNombres);


            escribirTabla("tabla", losNombres);

            freader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        persona = new Persona(losNombres[0],losNombres[1] , Integer.parseInt(losNombres[2]) ,losNombres[3] );
        return persona;
    }

    public void escribirTabla(String str, String[] nombre) {
        if (str.equals("tabla"))
            System.out.println("Estado actual de la tabla: \n");
        if (str.equals("fichero"))
            System.out.println("En el fichero estan los siguientes numeros: ");
        System.out.println("Campos\t\t\t |\t Datos"
                        + "\n---------------------------------");
        for (int i = 0; i < nombre.length; i++)
            if (nombre[i] != null)
                switch (i){
                    case 0:
                        System.out.println("Nombre" + "\t\t\t |\t " + nombre[i]);
                        break;
                    case 1:
                        System.out.println("Apellido" + "\t\t |\t " + nombre[i]);
                        break;
                    case 2:
                        System.out.println("Edad" + "\t\t\t |\t " + nombre[i]);
                        break;
                    case 3:
                        System.out.println("Direccion" + "\t\t |\t " + nombre[i]);
                        break;
                }

        System.out.println();
    }

    private void stringToArrayString(String str, String[] tabla) {
        String[] otro;
        otro = str.split("[-,|;:/]");

        for (int i = 0; i < otro.length; i++)
            tabla[i] = otro[i];
    }

    private String charToStrings(String str, char[] numeros, int comprobanteLectura) {
        for (int i = 0; i < comprobanteLectura; i++)
            str += numeros[i];
        return str;
    }


}
