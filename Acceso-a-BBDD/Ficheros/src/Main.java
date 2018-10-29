import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultado;
		System.out.println("hola");
		try {
			File fichero = new File("Primero.txt");
			FileReader freader = new FileReader(fichero);
			
			char[] letras = new char[4];
			resultado = freader.read(letras);
			while(resultado != -1)
			{
				for(int i = 0; i < resultado; i++)
					System.out.print(letras[i]);
				resultado = freader.read(letras," ",4444444);
				
			}
			freader.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)		
		{
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
