using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Restaurante
{
    class Program
    {
        static void Main(string[] args)
        {
            Menu menu = new Menu();
            menu.elegirOpcion();
           /* Restaurante restaurante = new Restaurante();
            Console.WriteLine(restaurante.caja);
            restaurante.mesas[1].ocupar(2, new DateTime(1,1,1,1,1,1));
            restaurante.mesas[1].aumentarCuenta(53);
            restaurante.mesas[1].aumentarCuenta(30.58);
            Console.WriteLine(restaurante.mesas[1].cuenta);
            restaurante.mesas[1].cobrar("Tarjeta");
            Console.WriteLine(restaurante.mesas[1].cuenta);
            Console.WriteLine(restaurante.caja);
            Console.ReadKey();
            */
        }
    }
}
