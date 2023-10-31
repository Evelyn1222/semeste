
using System;

class Program19u3
{
    static void Main()
    {
        Console.Write("Ingrese la cantidad de números (N): ");
        int N = int.Parse(Console.ReadLine());

        int ceroCount = 0;
        int mayorCeroCount = 0;
        int menorCeroCount = 0;

        for (int i = 0; i < N; i++)
        {
            Console.Write("Ingrese el número " + (i + 1) + ": ");
            int numero = int.Parse(Console.ReadLine());

            if (numero == 0)
            {
                ceroCount++;
            }
            else if (numero > 0)
            {
                mayorCeroCount++;
            }
            else
            {
                menorCeroCount++;
            }
        }

        Console.WriteLine("Cantidad de ceros: " + ceroCount);
        Console.WriteLine("Cantidad de números mayores a cero: " + mayorCeroCount);
        Console.WriteLine("Cantidad de números menores a cero: " + menorCeroCount);
    }
}
