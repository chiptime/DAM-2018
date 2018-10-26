import java.io.File;

public class Carpeta {

    private String ruta;

    public Carpeta(String ruta) {
        this.ruta = ruta;
    }

    public void preguntarCrearCarpetas(){

    }

    public void crearCarpeta(){

        String[] nombreRuta = ruta.split("/\\");

        String nombrePadre = "";
        File carpeta[] = new File[50];
        for(int i = 0; i < nombreRuta.length; i++){
            if(!nombrePadre.equals("")) {
                carpeta[i] = new File(nombrePadre, nombreRuta[i]);
                isViva(carpeta[i]);
            }
            else {
                carpeta[i] = new File(nombreRuta[i]);
                isViva(carpeta[i]);
            }
            nombrePadre = carpeta[i].getPath();

            isCreada(carpeta[i].mkdir(), carpeta[i]);
        }

    }

    public boolean isCreada(boolean comprobacion, File file){
        if(comprobacion) {
            System.out.println("La carpeta \"" + file.getName() + "\" ha sido creada con exito");
            return true;
        }
        else {
            System.out.println("La carpeta \"" + file.getName() + "\" no ha podido ser creada");
            return false;
        }
    }
    public boolean isViva(File file){
        if(file.exists()){
            System.out.println("La carpeta ya existe.");
            return true;
        }else{
            System.out.println("La carpeta no existe.");
            return false;
        }

    }
}
