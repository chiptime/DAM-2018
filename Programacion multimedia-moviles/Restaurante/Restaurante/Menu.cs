using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Restaurante
{
    class Menu
    {
        Restaurante restaurante = new Restaurante();
        public Menu() { }
        
        public void escribirMenu()
        {
            Console.WriteLine("Porfavor elige una opción");
            Console.WriteLine("1. Ocupar         Mesa");
            Console.WriteLine("2. Reservar       Mesa");
            Console.WriteLine("3. Cobrar/Limpiar Mesa");
            Console.WriteLine("4. Plazas Libres  Mesa");
            Console.WriteLine("5. Pedir comida   Mesa");
            Console.WriteLine("5. Pedir comida  Mesa");
        }
        public void elegirOpcion()
        {            
            int opcion = 0;
            while (opcion != 6)
            {
                escribirMenu();
                opcion = int.Parse(Console.ReadLine());
                switch (opcion)
                {
                    case 1:
                        restaurante.mesas[elegirMesa()].ocupar(elegirNumeroPersona(), elegirHora());
                        escribirDatos();
                        break;
                    case 2:
                        restaurante.reservarMesa(elegirMesa(), elegirNumeroPersona(), elegirHora());
                        escribirDatos();
                        break;
                    case 3:
                        restaurante.cobrarMesa(elegirMesa());
                        escribirDatos();
                        break;
                    case 4:
                        restaurante.mesas[elegirMesa()].plazasLibres();
                        escribirDatos();
                        break;
                    case 5:
                        restaurante.mesas[elegirMesa()].aumentarCuenta(elegirComida());
                        escribirDatos();
                        break;
                    case 6:
                        Console.WriteLine("Hasta luego");
                        break;
                    default:
                        Console.WriteLine("Creo que te has equivocado de opcion");
                        break;
                }
            }
        }
        public int elegirMesa()
        {
            int mesa;
            Console.WriteLine("Porfavor elige una mesa una de las 4 mesas (1,2,3 o 4)");
            mesa = int.Parse(Console.ReadLine());
            if (mesa < 5 || mesa > 0)
                return mesa - 1;
            else
                return -1;
        }
        public int elegirNumeroPersona()
        {
            Console.WriteLine("Escribe el numero de personas para la reserva");
            int personas;
            personas = int.Parse(Console.ReadLine());
            return personas;
        }
        public DateTime elegirHora()
        {
            int año, mes, dia, hora, minuto, segundo;
            Console.WriteLine("Escribe la fecha de la reserva");
            Console.WriteLine("Año: ");
            año = Convert.ToInt32( Console.ReadLine());
            Console.WriteLine("Mes: ");
            mes = Convert.ToInt32( Console.ReadLine());
            Console.WriteLine("Dia: ");
            dia = Convert.ToInt32( Console.ReadLine());
            Console.WriteLine("Hora: ");
            hora = Convert.ToInt32( Console.ReadLine());
            Console.WriteLine("Minutos");
            minuto = Convert.ToInt32( Console.ReadLine());
            Console.WriteLine("Segundos");
            segundo = Convert.ToInt32( Console.ReadLine());
            return new DateTime(año,mes,dia,hora,minuto,segundo);
        }
        public double elegirComida()
        {
            Console.WriteLine("Dime el precio de tu pedido");
            return Convert.ToDouble(Console.ReadLine());
        }
        public void escribirDatos()
        {
            for(int i = 0; i < restaurante.mesas.Length; i++)
                Console.WriteLine("Mesa " + i + "\n" +
                     "Numero de ocupantes: " + restaurante.mesas[i].nOcupantesAct + "\t" +
                     "Estado: " + restaurante.mesas[i].estado + "\t" +
                     "Cuenta: " + restaurante.mesas[i].cuenta + "\t" +
                     "Hora: " + restaurante.mesas[i].hora);
        }
    }
}
