

using System;
namespace program2U4
{
    internal class program2U4
    {
        static void Main(string[] args)
        {

            int S = 0;
            int promedio = 0;
            int C;
            int tamaño;
            Console.WriteLine("escribe las calificaciones al procesar:");
            tamaño = Convert.ToInt32(Console.ReadLine());
            int[] Calf= new int[tamaño];


            for (C= 0; C < Calf.Length; C++)
            {
                Console.WriteLine("escribe la calificacion:");
                Calf[C] = Convert.ToInt32(Console.ReadLine());
                S = Calf[C];



            }
               
                promedio = S / Calf.Length;


            Console.WriteLine("EL PROMEDIO DE LAS CALIFICACIONES ES:  " + promedio );
        }
    }
}