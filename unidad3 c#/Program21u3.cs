using System;

class Program21u3
{
    static void Main()
    {
        Console.Write("Ingrese la cantidad de números a procesar: ");
        int cantidadNumeros = int.Parse(Console.ReadLine());

        for (int i = 1; i <= cantidadNumeros; i++)
        {
            Console.Write("Ingrese el número " + i + ": ");
            int numero = int.Parse(Console.ReadLine());
            int cubo = numero * numero * numero;
            Console.WriteLine("El cubo de " + numero + " es: " + cubo);
        }
    }
}
