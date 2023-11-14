using System;

namespace P5U4
{
    class Program5U4
    {
        static void Main(string[] args)
        {
            string[] frutas = { "sandia", "platano", "mandarina", "manzana", "melon", "naranja" };

            
            string[] frutasAlReves = new string[frutas.Length];

            
            for (int i = 0; i < frutas.Length; i++)
            {
                frutasAlReves[i] = frutas[frutas.Length - 1 - i];
            }

           
            Console.WriteLine("Arreglo Original:");
            ImprimirArreglo(frutas);

            
            Console.WriteLine("Arreglo al Revés:");
            ImprimirArreglo(frutasAlReves);
        }

       
        static void ImprimirArreglo(string[] arreglo)
        {
            foreach (var elemento in arreglo)
            {
                Console.Write(elemento + " ");
            }
            Console.WriteLine();
        }
    }


}