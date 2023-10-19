using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program1unidad3
    {
        static void Main(string[] args)
        {


            int edad;
            Console.WriteLine("ingresa tu edad:");
            edad = Convert.ToInt32(Console.ReadLine());
            if (edad >= 18)
                Console.WriteLine("eres mayor de edad! uwu"); 
            else
                Console.WriteLine("eres menor de edad UnU");
        }
    }
}



    