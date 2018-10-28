using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication2
{
    class Program
    {
        static void Main(string[] args)
        {
            double numeroReal = 764.783;
            Console.WriteLine(numeroReal);
            Console.WriteLine( Truncar( ref numeroReal,2) );
            Console.WriteLine( numeroReal);
            Console.WriteLine("Press any key to exit.");
            Console.ReadKey();
        }

        /*
Realizar un programa que contenga un método llamado Truncar con las siguientes
versiones:
a.Un parámetro de tipo real y devuelve el número tras truncar la parte decimal a 0 decimales.
  Ej. 764.783  764*/
        public static double Truncar(double d)
        {
            string[] str = d.ToString().Split('.');
            double a = Convert.ToInt32(str[0]);
            return a;
        }
        /*
b. Un  parámetro  de  tipo real y  otro  parámetro  de  tipo  entero.  El  método 
almacena  sobre  el  segundo  parámetro  el  número  tras  truncar  la  parte 
decimal a 0 decimales. 
Ej. 764.783  764*/

        public static void Truncar(double d, ref int decimales)
        {
            string[] str = d.ToString().Split('.');
            decimales = Convert.ToInt32(str[0]);
        }

        /*
c.Un parámetro de tipo real. El método almacena sobre el primer parámetro el 
número tras truncar la parte decimal a 0 decimales.
Ej. 764.783  764*/
        public static void Truncar(ref double d)
        {
            string[] str = d.ToString().Split('.');
            double a = Convert.ToInt32(str[0]);            
        }


        /*
d.Un  parámetro  de  tipo real y  otro  parámetro  de  tipo  entero  y  devuelve  el 
número tras truncar la parte decimal a los decimales indicado por el segundo 
parámetro.
Ej. 764.783  y 2  764.78 */
        public static double Truncar(double d, int num)
        {
            string[] str = d.ToString().Split('.');
            
            char[] b = str[1].ToCharArray();
            string decimales = "";
            for (int i = 0; i < num; i++)
                decimales += b[i];
            double a = Convert.ToDouble(str[0]+"."+decimales);
            return a;
        }


        /*
e. Un parámetro de tipo real, otro parámetro de tipo entero y otro parámetro de tipo real. 
El  método  almacena  sobre  el  tercer  parámetro el  número  tras 
truncar la parte decimal a los decimales indicado por el segundo parámetro. 
Ej. 764.783  y 2  764.78 */

        public static void Truncar(double d, int num, out double doblementeReal)
        {
            string[] str = d.ToString().Split('.');

            char[] b = str[1].ToCharArray();
            string decimales = "";
            for (int i = 0; i < num; i++)
                decimales += b[i];
            doblementeReal = Convert.ToDouble(str[0] + "." + decimales);
        }
        /*
f.Un parámetro de tipo real y otro parámetro de tipo entero. Almacena sobre el primer  parámetro 
el  número  tras  truncar  la  parte  decimal  a  los  decimales indicado por el segundo parámetro. 
Ej. 764.783  y 2  764.78 */
        public static double Truncar(ref double d, int num)
        {
            string[] str = d.ToString().Split('.');

            char[] b = str[1].ToCharArray();
            string decimales = "";
            for (int i = 0; i < num; i++)
                decimales += b[i];
            d = Convert.ToDouble(str[0] + "." + decimales);
            return d;
        }

    }
}
