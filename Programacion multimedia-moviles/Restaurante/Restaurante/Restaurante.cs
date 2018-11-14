using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Restaurante
{
    class Restaurante
    {
        public double caja { get; private set; } = 0; // Conocer la caja actual
        public Mesa[] mesas { get; private set; } = new Mesa[4];

        public Restaurante()
        {
            mesas[0] = new Mesa(4, 0, 0);
            mesas[1] = new Mesa(4, 0, 0);
            mesas[2] = new Mesa(4, 0, 0);
            mesas[3] = new Mesa(4, 0, 0);
        }
        public void reservarMesa(int nMesa, int personas, DateTime horaReserva)
        {
            mesas[nMesa].reservar(personas, horaReserva);
        }
        public void cobrarMesa(int nMesa)
        {
            caja = mesas[nMesa].cobrar("Tarjeta");         
        }        
        // Listado por mesa

    }
}
