using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            int value1 = 10;
            int value2 = 9;
            String cadena = "", cadena2 = "";
            cadena = "Hola CaRacoLa";
            cadena2 = Reverse(cadena);

            cadena.PadRight(1);
            //con salto de linea
            Console.WriteLine("args1: {0} args2: {1}", cadena.ToLower(), cadena2.ToUpper());

            Console.WriteLine("args1: {0} args2: {1}", cadena , cadena2.ToUpper());

            RightMove("hola");
            Console.WriteLine();
            LeftMove("hola");
            
            Console.WriteLine();
            //sin salto de linea
            Console.Write("Hola mundo"); 
            Console.WriteLine("Press any key to exit.");
            Console.ReadKey();
            
        }

        public static string Reverse(string str){            
            char[] arr = str.ToCharArray();
            Array.Reverse(arr);
            return new string(arr);
        }
        //TODO hacer un arr y sacar el "Last" y guardarlo en otro arr y hacer un remove
        /*public static string RightMove(string str) {
            char[] arr = str.ToCharArray();
            char[] arrCopy = null;
            var arrAndCopy = arr.Zip(arrCopy, (a, c) => new { Arr = a, Copy = c });
            foreach (var ac in arrAndCopy) {
                arrCopy. = s.Arr.Last();
            }            
            return ;
        }*/
        public static void RightMove(string str)
        {
            var arr = str.ToCharArray(); //new[] { "h", "o", "l", "a" };
            char[] arrCopy = new char[50];

            for (int i = 0; i < arr.Length; i++)
            {
                if (i != 0)
                    arrCopy[i] = arr[i-1];
                else
                    arrCopy[i] = arr[arr.Length - 1];
                Console.Write(arrCopy[i]);
            }

            /*
            var numbersAndWords = numbers.Zip(words, (n, w) => new { Number = n, Word = w });
            foreach (var nw in numbersAndWords)
            {
                nw.Word. = nw.Number.Last();
                Console.WriteLine(nw.Number + nw.Word);
            }*/

        }
        public static void LeftMove(string str)
        {
            var arr = str.ToCharArray(); //new[] { "h", "o", "l", "a" }; o l a h
                                         //         0    1    2    3     0 1 2 3
            char[] arrCopy = new char[50];

            
            for (int i = 0; i < arr.Length; i++)
                {
                if (i != 0)
                    arrCopy[i-1] = arr[i];
                else
                    arrCopy[arr.Length-1] = arr[i];//i = 0  -- h -> 3
                
            }
            foreach(char c in arrCopy)
                Console.Write(c);
        }
        public static void ReverseLine(string str)
        {
            var arr = str.ToCharArray(); //new[] { "h", "o", "l", "a" };
            char[] arrCopy = new char[50];

            for (int i = arr.Length - 1; i > 0; i--)
            {
                if (i != 0)
                    arrCopy[i] = arr[i - 1];
                else
                    arrCopy[i] = arr[arr.Length - 1];
                Console.Write(arrCopy[i]);
            }

            /*
            var numbersAndWords = numbers.Zip(words, (n, w) => new { Number = n, Word = w });
            foreach (var nw in numbersAndWords)
            {
                nw.Word. = nw.Number.Last();
                Console.WriteLine(nw.Number + nw.Word);
            }*/

        }
    }
}
