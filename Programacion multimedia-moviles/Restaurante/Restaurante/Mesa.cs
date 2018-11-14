using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Restaurante
{
    class Mesa
    {
        private int nOcupantesMax;
        public int nOcupantesAct { get; private set; } // Conocer el número de plazas ocupadas
        public int estado { private set;  get; }//0 libre, 1 reservado, 2 ocupado
        public DateTime hora { private set; get; }
        public double cuenta { get; private set; } // Conocer cantidad pendiente por cobrar


        public Mesa(int nOcupantesMax, int nOcupantesAct, int estado)
        {
            this.nOcupantesMax = nOcupantesMax;
            this.nOcupantesAct = nOcupantesAct;
            this.estado = estado;
        }

        public void ocupar(int personasOcu, DateTime horaOcu)
        {
            if (nOcupantesMax >= personasOcu && estado == 0  )
            {
                nOcupantesAct = personasOcu;
                hora = horaOcu;
                estado = 2;
            }

        }
        public void reservar(int personasOcu, DateTime horaOcu)
        {
            if (nOcupantesMax >= personasOcu && estado != 2)
            {
                estado = 1;
                hora = horaOcu;
            }
        }
        public double cobrar(String metodoPago)
        {
            double importe;
            if (estado == 2)
            {
                nOcupantesAct = 0;
                importe = cuenta;
                cuenta = 0;
                estado = 0;
            }
            else {
                return -1;
            }
            return importe;            
        }
        public void aumentarCuenta(double pedido)
        {
            cuenta += pedido;
        }
        // Conocer el número de plazas libres
        public int plazasLibres()
        {
            return nOcupantesMax - nOcupantesAct;
        }
    }
}
