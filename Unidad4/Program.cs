

using System;
namespace U3program5
{
    internal class program2U4
    {
        static void Main(string[] args)
        {
            int[] C = new int[] { 70, 69, 34, 70, 78, 90, 100, 21, 69, 100 };
            int S = 0, promedio = 0;
            int i;

            for (i = 0; i < C.Length; i++)
            {

                S += C[i];

                promedio = S / C.Length;
            }
            Console.WriteLine("EL PROMEDIO DE LAS CALIFICACIONES ES:  " + promedio);
        }
    }
}