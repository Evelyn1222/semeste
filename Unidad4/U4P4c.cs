using System;

namespace P4U4
{
    class Program4U4
    {
        static void Main(string[] args)
        {
            double N = 0;
            int tam;

            Console.WriteLine("Ingresa la cantidad de numeros a procesar:");
            tam = Convert.ToInt32(Console.ReadLine());

            int[] Numeros = new int[tam];

            for (int i = 0; i < Numeros.Length; i++)
            {
                Console.WriteLine("Ingrese cualquier numero: " + i + " :");
                N = Convert.ToInt32(Console.ReadLine());
                if (N < 0)
                {
                    i++;
                }
                
            }

            Console.WriteLine(" los Números negativos: " +N);
            
        }
    }
    }