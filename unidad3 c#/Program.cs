<<<<<<< HEAD
﻿// See https://aka.ms/new-console-template for more information
Console.WriteLine("Hello, World!");
=======
﻿using System;

namespace Programa8u3
{
    class Programa8u3
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Ingresa el primer número: ");
            int num1 = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Ingresa el segundo número: ");
            int num2 = Convert.ToInt32(Console.ReadLine());

            if (num1 > num2)
            {
                Console.WriteLine("El número menor es: " + num2);
            }
            else if (num1 < num2)
            {
                Console.WriteLine("El número mayor es: " + num1);
            }
        }
    }
}

>>>>>>> fe10cea32785960efb61954072686b63cd5290ed
