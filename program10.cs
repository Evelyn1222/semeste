﻿using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string nombre = "evelyn", apellidos = "hernandez avila", completo;
            completo = nombre + apellidos;
            Console.WriteLine("sumar dos numeros");

            int a = 50, b = 3, suma;
            suma = a + b;
            Console.WriteLine("* * bienvenidos * *" + completo + "* *");
            Console.WriteLine("la operacion suma de A=" + a + "B=" + b);
            Console.WriteLine($"tu resultado es {suma}");
            Console.WriteLine("_GRACIAS UWU");
        }
    }
}